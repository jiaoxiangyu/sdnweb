<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sdn水下传感器网络初始化最大权值路由系统</title>
<link rel="stylesheet" href="css/bootstrap.css">

</head>
<body>
	<div style="width: 50%;height:800px;float: left;">
		<div id="main" style="width: 100%;height:500px;"></div>
		<div  style="width: 100%;height:300px;background-color: #F8F8F8;">
			
			节点数：<input type="text" id="num" >
			<input type="button" value="生成节点" onclick="generateNodes();">
			
			<br>
			<br>
			 
			开始节点：<input type="text" id="start">
			结束节点：<input type="text" id="end">
			<input type="button" value="开始" onclick="_getRoutes();">
			<input type="button" value="下一步" onclick="_nextRoutes();">
			<input type="button" value="重置节点" onclick="resetNodes();" >
			<br>
			<br>
			<div id="maxWeight" ></div>			
			<br>
			<br>
			<div id="msg" style="color: red;"></div>
		</div>
	</div>
	
	<div style="width:  50%;height:800px;background-color:#DDDDFF;float: left;">
	   <table id="myTable" class="table table-striped table-hover " >	  
		  <thead>
		    <tr>	      
		      <th>编号</th>
		      <th>路径</th>
		      <th>权值</th>	  
		      <th>长度</th>	     
		    </tr>
		  </thead>	  
		  <tbody id="myTbody" >	  	
		  </tbody>
	  </table>
	</div>
	
	<!-- 引入 ECharts 文件 -->
    <script src="js/echarts.min.js"></script>
    
<script type="text/javascript">
 /* window.onload=function(){ 
	
	 _getNodes("5");
	
} */
/*
 * 生成节点
 */
function generateNodes(){
	 var num=document.getElementById("num").value;  
	 _deleteMsg();
	 _deleteMaxWeight();
	 if(num>=2 && num<=9){
		 _getNodes(num);
		 removeRoutes();
	 }else{		 
		 _setMsg("节点数应该在2~9范围内");
	 }
	
}
 
 
 
/**
 * 刷新页面
 */
function _flush(){
	location.reload(true);
}

/*
 * 生成提示信息
 */
function _setMsg(msg){
	document.getElementById("msg").innerHTML=msg;
}

/**
 * 删除提示信息
 */
function _deleteMsg(){
	document.getElementById("msg").innerHTML="";
} 
/**
 * 显示上次最大权值
 */
function _setMaxWeight(_maxNodes){
	var max="该轮次最大权值：";
	for(var i=0;i<_maxNodes.length;i++){
		max+=(_maxNodes[i].node_A+_maxNodes[i].node_B+"="+_maxNodes[i].weight);
	}
	document.getElementById("maxWeight").innerHTML=max;
} 
/**
 * 删除旧的最大权值
 */
function _deleteMaxWeight(){
	document.getElementById("maxWeight").innerHTML="";
} 
/* 
 *获得路径 
 */
function _getRoutes(){ 
		_deleteMsg();
		_deleteMaxWeight();
		var start=document.getElementById("start").value; 
		var end=document.getElementById("end").value;
		
	    var xmlhttp;  
		if (window.XMLHttpRequest) {
			// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
			xmlhttp = new XMLHttpRequest();
		} else {
			// IE6, IE5 浏览器执行代码
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {		
				var result =xmlhttp.responseText;
				if(result!=null && result!="" && result!=[]){
					var json = eval("(" + result + ")");
					if(json!=null && json!="" && json!=[]){
						//生成路径表
						var _routess=new Array();
						_routess=json[0];
						if(_routess!=null && _routess!="" && _routess!=[]){
							generaterRoutes(_routess);
						}
						
						//画图
						var _nodes=new Array();
						_nodes=json[1];
						
						var _relations=new Array();
						_relations=json[2];
						
						if(_nodes!=null && _nodes!="" && _relations!=null && _relations!="" ){
							_draw(_nodes,_relations);
						}
						
					}else{
						_deleteMsg();
						_setMsg("请输入正确的节点名称");
					}
				}
			}
		}
		xmlhttp.open("POST", "getRoutes", true);
		xmlhttp.setRequestHeader("Content-type",
				"application/x-www-form-urlencoded");
		xmlhttp.send("start="+start+"&end="+end);
} 

/* 生成路径表 */
function generaterRoutes(_routes){
	
	if (_routes != null || _routes != "") {
		
		removeRoutes();
		
		var tabNode = document.getElementById("myTbody");
		for(var i=0;i<_routes.length;i++){
			var trNode = tabNode.insertRow(); 			
			for(var j=0;j<4;j++){
				 var tdNode=trNode.insertCell(); 
				 var text="";
				 if(j==0){
					 text=i+1;
				 }else if(j==1){
					 text=_routes[i].route;
				 }else if(j==2){
					 text=_routes[i].weights;
				 }else if(j==3){
					 text=_routes[i].length;
				 }
			     tdNode.innerHTML=text; 
			}
			
		}				    
	} 
} 

/* 删除路径表 */
function removeRoutes(){
	var tb = document.getElementById("myTable");
	//var tb = document.getElementById('attAchments');
    var rowNum=tb.rows.length;
    for (i=1;i<rowNum;i++)
    {
        tb.deleteRow(i);
        rowNum=rowNum-1;
        i=i-1;
    }
}

/*
 * 下一步
 */
function _nextRoutes(){
	 _deleteMsg();
	 var xmlhttp;  
		if (window.XMLHttpRequest) {
			// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
			xmlhttp = new XMLHttpRequest();
		} else {
			// IE6, IE5 浏览器执行代码
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {		
				 
				 var result =xmlhttp.responseText;
				if(result!=null && result!=""){
					var json = eval("(" + result + ")");
					
					//最大权值
					var _maxNodes=new Array();
					_maxNodes=json[0];
					if(_maxNodes!=null && _maxNodes!=""){
						_deleteMaxWeight();
						_setMaxWeight(_maxNodes);
					}
						
					//节点
					var _nodes=new Array();
					_nodes=json[1];
									
					//节点关系
					var _relations=new Array();
					_relations=json[2];
					
					//画图
					if(_nodes!=null && _nodes!="" && _relations!=null && _relations!=""){
						_draw(_nodes,_relations); 
					}
					
					
					//路径
					var _routess=new Array();
					_routess=json[3];
					if(_routess!=null && _routess!=""){						
						for(var i=0;i<_routess.length;i++){
							if(_routess[i].length==_maxNodes[0].weight){
								_deleteMsg();
								_setMsg("生成最终路径");
							}
						}
					}
					
					generaterRoutes(_routess);
				}else{
					_deleteMsg();
					_setMsg("请选择节点生成路径");
				}
				
			}
		}
		xmlhttp.open("GET", "nextRoutes", true);
		//xmlhttp.setRequestHeader("Content-type",
				//"application/x-www-form-urlencoded");
		xmlhttp.send();
}
/*
 * 获得节点和关系数据
  */
function _getNodes(num){ 
	
	    var xmlhttp;  
		if (window.XMLHttpRequest) {
			// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
			xmlhttp = new XMLHttpRequest();
		} else {
			// IE6, IE5 浏览器执行代码
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {		
				var result = xmlhttp.responseText;
				if(result!=null && result!=[] && result!=""){
					var json = eval("(" + result + ")");
					
					//节点
					var _nodes=new Array(); 
					_nodes=json[0];
	    	
			    	//节点权值
			    	var _relations=new Array(); 
					_relations=json[1];
	   				
					//画图
					if(_nodes!=null && _nodes!="" && _relations!=null && _relations!=""){
						_draw(_nodes,_relations); 
					}
			    	
				}
	 	
			}
		}
		xmlhttp.open("POST", "generateNodes", true);
		xmlhttp.setRequestHeader("Content-type",
				"application/x-www-form-urlencoded");
		xmlhttp.send("num="+num);
} 

/*
 * 画图
 */
function _draw(_nodes,_relations) {
	
	//节点
	var _nodesSwitch=new Array();   				
	for(var i = 0;i < _nodes.length;i++){	   	     
		_nodesSwitch.push({
			"name":_nodes[i].name,
			 "ip":_nodes[i].name+"("+_nodes[i].x+","+_nodes[i].y+")",
			"isnode":true,
			"x":_nodes[i].x,
			"y":_nodes[i].y
		});		    		
	} 

	//节点关系
	var _relationsSwitch=new Array();  
	for(var i = 0;i <_relations.length;i++){	   	     
		_relationsSwitch.push({
			 'source':_relations[i].node_A,
             'target':_relations[i].node_B,
             'islink':true,
             'weight':_relations[i].weight,			             
			});		    		
		} 
	
	
	
	//基于准备好的dom，初始化echarts实例
	var myChart = echarts.init(document.getElementById('main'));


	var  option = {
	 backgroundColor: '#F0F0F0',
	 title: {
	     text: 'sdn水下传感器网络',
	 },
	 tooltip:{},
	 animationDurationUpdate: 1500,
	 animationEasingUpdate: 'quinticInOut',
	 series : [
	     {
	         type: 'graph',
	         layout: 'none',
	         symbolSize: 20,//图形的大小（示例中的圆的大小）
	         roam: true,//鼠标缩放及平移
	         focusNodeAdjacency:true,//是否在鼠标移到节点上的时候突出显示节点以及节点的边和邻接节点
	         label: {
	             normal: {
	                 show: true ,  //控制非高亮时节点名称是否显示
	                 position:'top',
	                 fontSize:20
	             }
	         },

	         edgeSymbol: ['circle', 'arrow'],
	         edgeSymbolSize: [0, 0],    //箭头的大小
	         edgeLabel: {
	             normal:{
	                 show:false
	             },
	             emphasis: {
	                 textStyle: {
	                     fontSize: 20  //边节点显示的字体大小
	                 }
	             }
	         },

	//节点信息

	 data:_nodesSwitch,

	 links:_relationsSwitch,
	         lineStyle: {
	             normal: {
	                 show:true,
	                 color:
	                 {       
	                         type: 'linear',
	                         x: 0,
	                         y: 0,
	                         x2: 0,
	                         y2: 1,
	                         colorStops: [
	                         {
	                             offset: 0, color: 'red' // 0% 处的颜色
	                         }
	                         ,{
	                             offset: 1, color: 'blue' // 100% 处的颜色
	                         }],
	                         globalCoord: false // 缺省为 false
	                     },
	               
	              // curveness: 0.2
	                   
	             },
	             emphasis:{
	                 color:'red',
	                 width:3,
	                 type:'dashed',//虚线

	             }
	         },
	        
	         tooltip:
	         {
	         position:'bottom',//悬浮时显示的位置
	         backgroundColor:'green',
	         textStyle:{fontSize:18,

	         },

	         formatter:function(params){//悬浮提示框显示的内容
	            if (params.data.islink) {
	            	return '节点'+params.data.target+params.data.source+'权值：'+params.data.weight;
	            }
	            else if (params.data.isnode){return params.data.ip;}
	         }
	         },//悬浮时的提示框，不设置时是随鼠标移动

	     }
	 ]
	};


	// 使用刚指定的配置项和数据显示图表。
	myChart.setOption(option);

	
}

//重置节点
function resetNodes() {
	_deleteMsg();
	_deleteMaxWeight();
	removeRoutes();
	var xmlhttp;  
	if (window.XMLHttpRequest) {
		// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
		xmlhttp = new XMLHttpRequest();
	} else {
		// IE6, IE5 浏览器执行代码
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange = function() {
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {		
			var result = xmlhttp.responseText;
			if(result!=null && result!=[] && result!=""){
				var json = eval("(" + result + ")");
				
				//节点
				var _nodes=new Array(); 
				_nodes=json[0];
    	
		    	//节点权值
		    	var _relations=new Array(); 
				_relations=json[1];
   				
				//画图
				if(_nodes!=null && _nodes!="" && _relations!=null && _relations!=""){
					_draw(_nodes,_relations); 
				}
		    	
			}else{
				_setMsg("请先输入节点数初始化拓补图");
			}
 	
		}
	}
	xmlhttp.open("GET", "resetNodes", true);
	/* xmlhttp.setRequestHeader("Content-type",
			"application/x-www-form-urlencoded"); */
	xmlhttp.send();
}


</script>
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>	
</body>
</html>