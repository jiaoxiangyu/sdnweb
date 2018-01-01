package cn.jxy.sdnweb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.jxy.sdnweb.dao.INodeDao;
import cn.jxy.sdnweb.entity.NodeRelation;
import cn.jxy.sdnweb.service.INodeService;
import cn.jxy.sdnweb.util.PageCut;
@Service
public class NodeServiceImpl implements INodeService {

	@Resource
	private INodeDao nodeDao;
	
	@Override
	public boolean add(NodeRelation nodeRelation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(NodeRelation nodeRelation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NodeRelation findOne(String condition, Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageCut<NodeRelation> finds(int curr, int size, String condition, Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	public INodeDao getNodeDao() {
		return nodeDao;
	}

	public void setNodeDao(INodeDao nodeDao) {
		this.nodeDao = nodeDao;
	}
	
	
}
