package cn.jxy.sdnweb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.jxy.sdnweb.base.BaseController;
import cn.jxy.sdnweb.entity.NodeRelation;
import cn.jxy.sdnweb.util.NodesUtil;
import cn.jxy.sdnweb.util.NextRoutesUtil;
import cn.jxy.sdnweb.util.Node;
import cn.jxy.sdnweb.util.Routes;
import cn.jxy.sdnweb.util.RoutesUtil;

@Controller
@RequestMapping("/")
public class NodeController extends BaseController {
	
	private ModelAndView mv;
	
	 
	//进入首页
	@RequestMapping(value = "toIndex", method = RequestMethod.GET)
	public String toLogin() {
		return "index";
	}
	
	//随机生成节点
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "generateNodes", method = RequestMethod.POST)
	public @ResponseBody List generateNodes(String num,HttpSession session){
		
		/**
		 * 清空所有数据
		 */
		deleteSession(session, "start","end","nodes","relations","routess");
		
		//生成节点
		List<Node> nodes=NodesUtil.randomNodes(Integer.valueOf(num));
		session.setAttribute("nodes",  nodes);
		
		//生成节点权值关系
		List<NodeRelation> relations=NodesUtil.getAllWeight(nodes);
		session.setAttribute("relations", relations);
		
		//转json传给js
		List list=new ArrayList() ;
		list.add(nodes);
		list.add(relations);
		return list;	
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "getRoutes", method = RequestMethod.POST)
	public @ResponseBody List getRoutes(String start,String end,HttpSession session){
		/**
		 * 清空所有数据
		 */
		deleteSession(session, "start","end","relations","routess");
		
		//存储开始和结束节点
		session.setAttribute("start", start);
		session.setAttribute("end", end);
		
		//获得节点
		List<Node> nodes=(List<Node>) session.getAttribute("nodes");		
		//清空节点关系
		for(int i=0;i<nodes.size();i++) {
			nodes.get(i).getRelationNodes().clear();
		}
		
		//重新生成节点权值关系
		List<NodeRelation> relations=NodesUtil.getAllWeight(nodes);
		
		session.setAttribute("nodes",  nodes);
		session.setAttribute("relations", relations);
		
		//生成路径
		List<Routes> routess=RoutesUtil.getRoutes(start,end,nodes,relations);
		session.setAttribute("routess", routess);
		
		//转json传给js
		List list=new ArrayList();
		list.add(routess);
		list.add(nodes);
		list.add(relations);		
		return list;
	}
	
	//下一步
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "nextRoutes", method = RequestMethod.GET)
	public @ResponseBody List nextRoutes(HttpSession session){
		//获得开始和结束节点、上一轮次节点、节点关系、路径
		String start=(String)session.getAttribute("start");
		String end=(String)session.getAttribute("end");			
		List<Node> oldNodes=(List<Node>) session.getAttribute("nodes");
		List<Routes> oldRoutess=(List<Routes>) session.getAttribute("routess");
		List<NodeRelation> oldRelations=(List<NodeRelation>)session.getAttribute("relations");
		
		if(start!=null && end!=null && oldNodes!=null && oldRoutess!=null && oldRelations!=null) {
			//获得最大权值			
			double maxWeight=NextRoutesUtil.getMaxWeight(oldRelations);
			//获得最大权值的节点关系
			List<NodeRelation> maxNodesRelation=NextRoutesUtil.getNodes(maxWeight, oldRelations);
			
			//删除所有权值的最大权值，直到开始节点到结束节点权值最大时，不再删除权值
			double startEndWeight=NodesUtil.getWeight(NodesUtil.getNodeByName(start, oldNodes),
					NodesUtil.getNodeByName(end, oldNodes), oldRelations);
			List<NodeRelation> relations=null;
			if(startEndWeight!=maxWeight) {
				relations=NextRoutesUtil.deleteMaxWeight(maxWeight, oldRelations);		
				session.setAttribute("relations", relations);			
			}else {
				relations=oldRelations;
			}
			
			//重新设置节点的关系集合
			List<Node> nodes=NextRoutesUtil.resetNodes(maxWeight, oldNodes, maxNodesRelation,start,end);
			session.setAttribute("nodes", nodes);
			
			//重新生成路径
			List<Routes> routess=null;
			boolean bool=true;//判断是否是最后路径
			for(int k=0;k<oldRoutess.size();k++) {
				if(oldRoutess.get(k).getLength()==maxWeight) {
					routess=oldRoutess;
					bool=false;
					break;
				}
			}			
			if(bool==true) {
				routess=RoutesUtil.getRoutes(start, end,nodes, relations);
			}
			session.setAttribute("routess", routess);
	
			
			//转换为json传给js
			List list=new ArrayList<>();
			list.add(maxNodesRelation);
			list.add(nodes);
			list.add(relations);
			list.add(routess);
			return list;
		}else {
			return null;
		}
		
		
	}
	
	//恢复节点关系
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "resetNodes", method = RequestMethod.GET)
	public @ResponseBody List resetNodes(HttpSession session){
		//清空部分session数据
		deleteSession(session, "start","end","relations","routess");
		
		//获得节点
		List<Node> nodes=(List<Node>) session.getAttribute("nodes");
		if(nodes!=null) {
			//清空节点关系
			for(int i=0;i<nodes.size();i++) {
				nodes.get(i).getRelationNodes().clear();
			}
			//生成节点权值关系
			List<NodeRelation> relations=NodesUtil.getAllWeight(nodes);
			
			session.setAttribute("nodes",  nodes);
			session.setAttribute("relations", relations);
			
			//转json传给js
			List list=new ArrayList();
			list.add(nodes);
			list.add(relations);			
			return list;
		}else {
			return null;
		}
		
	}
	
	//清空部分session
	public void deleteSession(HttpSession session,String...strings) {
		for(int i=0;i<strings.length;i++) {
			if(session.getAttribute(strings[i])!=null) {
				session.removeAttribute(strings[i]);
			}
		}
	}

}
