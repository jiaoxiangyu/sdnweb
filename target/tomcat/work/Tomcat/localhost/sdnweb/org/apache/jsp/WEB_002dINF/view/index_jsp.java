/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-01 10:26:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>sdn水下传感器网络初始化最大权值路由系统</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"width: 50%;height:800px;float: left;\">\r\n");
      out.write("\t\t<div id=\"main\" style=\"width: 100%;height:500px;\"></div>\r\n");
      out.write("\t\t<div  style=\"width: 100%;height:300px;background-color: #F8F8F8;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t节点数：<input type=\"number\" id=\"num\" >\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"生成节点\" onclick=\"generateNodes();\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t开始节点：<input type=\"text\" id=\"start\">\r\n");
      out.write("\t\t\t结束节点：<input type=\"text\" id=\"end\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"开始\" onclick=\"_getRoutes();\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"下一步\" onclick=\"_nextRoutes();\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"重置节点\" onclick=\"resetNodes();\" >\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div id=\"maxWeight\" ></div>\t\t\t\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div id=\"msg\" style=\"color: red;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"width:  50%;height:800px;background-color:#DDDDFF;float: left;\">\r\n");
      out.write("\t   <table id=\"myTable\" class=\"table table-striped table-hover \" >\t  \r\n");
      out.write("\t\t  <thead>\r\n");
      out.write("\t\t    <tr>\t      \r\n");
      out.write("\t\t      <th>编号</th>\r\n");
      out.write("\t\t      <th>路径</th>\r\n");
      out.write("\t\t      <th>权值</th>\t  \r\n");
      out.write("\t\t      <th>长度</th>\t     \r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t  </thead>\t  \r\n");
      out.write("\t\t  <tbody id=\"myTbody\" >\t  \t\r\n");
      out.write("\t\t  </tbody>\r\n");
      out.write("\t  </table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 引入 ECharts 文件 -->\r\n");
      out.write("    <script src=\"js/echarts.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" /* window.onload=function(){ \r\n");
      out.write("\t\r\n");
      out.write("\t _getNodes(\"5\");\r\n");
      out.write("\t\r\n");
      out.write("} */\r\n");
      out.write("/*\r\n");
      out.write(" * 生成节点\r\n");
      out.write(" */\r\n");
      out.write("function generateNodes(){\r\n");
      out.write("\t var num=document.getElementById(\"num\").value;  \r\n");
      out.write("\t _deleteMsg();\r\n");
      out.write("\t _deleteMaxWeight();\r\n");
      out.write("\t if(num>=2 && num<=9){\r\n");
      out.write("\t\t _getNodes(num);\r\n");
      out.write("\t\t removeRoutes();\r\n");
      out.write("\t }else{\t\t \r\n");
      out.write("\t\t _setMsg(\"节点数应该在2~9范围内\");\r\n");
      out.write("\t }\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("/**\r\n");
      out.write(" * 刷新页面\r\n");
      out.write(" */\r\n");
      out.write("function _flush(){\r\n");
      out.write("\tlocation.reload(true);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write(" * 生成提示信息\r\n");
      out.write(" */\r\n");
      out.write("function _setMsg(msg){\r\n");
      out.write("\tdocument.getElementById(\"msg\").innerHTML=msg;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/**\r\n");
      out.write(" * 删除提示信息\r\n");
      out.write(" */\r\n");
      out.write("function _deleteMsg(){\r\n");
      out.write("\tdocument.getElementById(\"msg\").innerHTML=\"\";\r\n");
      out.write("} \r\n");
      out.write("/**\r\n");
      out.write(" * 显示上次最大权值\r\n");
      out.write(" */\r\n");
      out.write("function _setMaxWeight(_maxNodes){\r\n");
      out.write("\tvar max=\"该轮次最大权值：\";\r\n");
      out.write("\tfor(var i=0;i<_maxNodes.length;i++){\r\n");
      out.write("\t\tmax+=(_maxNodes[i].node_A+_maxNodes[i].node_B+\"=\"+_maxNodes[i].weight);\r\n");
      out.write("\t}\r\n");
      out.write("\tdocument.getElementById(\"maxWeight\").innerHTML=max;\r\n");
      out.write("} \r\n");
      out.write("/**\r\n");
      out.write(" * 删除旧的最大权值\r\n");
      out.write(" */\r\n");
      out.write("function _deleteMaxWeight(){\r\n");
      out.write("\tdocument.getElementById(\"maxWeight\").innerHTML=\"\";\r\n");
      out.write("} \r\n");
      out.write("/* \r\n");
      out.write(" *获得路径 \r\n");
      out.write(" */\r\n");
      out.write("function _getRoutes(){ \r\n");
      out.write("\t\t_deleteMsg();\r\n");
      out.write("\t\t_deleteMaxWeight();\r\n");
      out.write("\t\tvar start=document.getElementById(\"start\").value; \r\n");
      out.write("\t\tvar end=document.getElementById(\"end\").value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t    var xmlhttp;  \r\n");
      out.write("\t\tif (window.XMLHttpRequest) {\r\n");
      out.write("\t\t\t// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码\r\n");
      out.write("\t\t\txmlhttp = new XMLHttpRequest();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t// IE6, IE5 浏览器执行代码\r\n");
      out.write("\t\t\txmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\txmlhttp.onreadystatechange = function() {\r\n");
      out.write("\t\t\tif (xmlhttp.readyState == 4 && xmlhttp.status == 200) {\t\t\r\n");
      out.write("\t\t\t\tvar result =xmlhttp.responseText;\r\n");
      out.write("\t\t\t\tif(result!=null && result!=\"\" && result!=[]){\r\n");
      out.write("\t\t\t\t\tvar json = eval(\"(\" + result + \")\");\r\n");
      out.write("\t\t\t\t\tif(json!=null && json!=\"\" && json!=[]){\r\n");
      out.write("\t\t\t\t\t\t//生成路径表\r\n");
      out.write("\t\t\t\t\t\tvar _routess=new Array();\r\n");
      out.write("\t\t\t\t\t\t_routess=json[0];\r\n");
      out.write("\t\t\t\t\t\tif(_routess!=null && _routess!=\"\" && _routess!=[]){\r\n");
      out.write("\t\t\t\t\t\t\tgeneraterRoutes(_routess);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t//画图\r\n");
      out.write("\t\t\t\t\t\tvar _nodes=new Array();\r\n");
      out.write("\t\t\t\t\t\t_nodes=json[1];\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar _relations=new Array();\r\n");
      out.write("\t\t\t\t\t\t_relations=json[2];\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(_nodes!=null && _nodes!=\"\" && _relations!=null && _relations!=\"\" ){\r\n");
      out.write("\t\t\t\t\t\t\t_draw(_nodes,_relations);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t_deleteMsg();\r\n");
      out.write("\t\t\t\t\t\t_setMsg(\"请输入正确的节点名称\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\txmlhttp.open(\"POST\", \"getRoutes\", true);\r\n");
      out.write("\t\txmlhttp.setRequestHeader(\"Content-type\",\r\n");
      out.write("\t\t\t\t\"application/x-www-form-urlencoded\");\r\n");
      out.write("\t\txmlhttp.send(\"start=\"+start+\"&end=\"+end);\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("/* 生成路径表 */\r\n");
      out.write("function generaterRoutes(_routes){\r\n");
      out.write("\t\r\n");
      out.write("\tif (_routes != null || _routes != \"\") {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tremoveRoutes();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar tabNode = document.getElementById(\"myTbody\");\r\n");
      out.write("\t\tfor(var i=0;i<_routes.length;i++){\r\n");
      out.write("\t\t\tvar trNode = tabNode.insertRow(); \t\t\t\r\n");
      out.write("\t\t\tfor(var j=0;j<4;j++){\r\n");
      out.write("\t\t\t\t var tdNode=trNode.insertCell(); \r\n");
      out.write("\t\t\t\t var text=\"\";\r\n");
      out.write("\t\t\t\t if(j==0){\r\n");
      out.write("\t\t\t\t\t text=i+1;\r\n");
      out.write("\t\t\t\t }else if(j==1){\r\n");
      out.write("\t\t\t\t\t text=_routes[i].route;\r\n");
      out.write("\t\t\t\t }else if(j==2){\r\n");
      out.write("\t\t\t\t\t text=_routes[i].weights;\r\n");
      out.write("\t\t\t\t }else if(j==3){\r\n");
      out.write("\t\t\t\t\t text=_routes[i].length;\r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t     tdNode.innerHTML=text; \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\t\t\t\t    \r\n");
      out.write("\t} \r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("/* 删除路径表 */\r\n");
      out.write("function removeRoutes(){\r\n");
      out.write("\tvar tb = document.getElementById(\"myTable\");\r\n");
      out.write("\t//var tb = document.getElementById('attAchments');\r\n");
      out.write("    var rowNum=tb.rows.length;\r\n");
      out.write("    for (i=1;i<rowNum;i++)\r\n");
      out.write("    {\r\n");
      out.write("        tb.deleteRow(i);\r\n");
      out.write("        rowNum=rowNum-1;\r\n");
      out.write("        i=i-1;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write(" * 下一步\r\n");
      out.write(" */\r\n");
      out.write("function _nextRoutes(){\r\n");
      out.write("\t _deleteMsg();\r\n");
      out.write("\t var xmlhttp;  \r\n");
      out.write("\t\tif (window.XMLHttpRequest) {\r\n");
      out.write("\t\t\t// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码\r\n");
      out.write("\t\t\txmlhttp = new XMLHttpRequest();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t// IE6, IE5 浏览器执行代码\r\n");
      out.write("\t\t\txmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\txmlhttp.onreadystatechange = function() {\r\n");
      out.write("\t\t\tif (xmlhttp.readyState == 4 && xmlhttp.status == 200) {\t\t\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t var result =xmlhttp.responseText;\r\n");
      out.write("\t\t\t\tif(result!=null && result!=\"\"){\r\n");
      out.write("\t\t\t\t\tvar json = eval(\"(\" + result + \")\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//最大权值\r\n");
      out.write("\t\t\t\t\tvar _maxNodes=new Array();\r\n");
      out.write("\t\t\t\t\t_maxNodes=json[0];\r\n");
      out.write("\t\t\t\t\tif(_maxNodes!=null && _maxNodes!=\"\"){\r\n");
      out.write("\t\t\t\t\t\t_deleteMaxWeight();\r\n");
      out.write("\t\t\t\t\t\t_setMaxWeight(_maxNodes);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//节点\r\n");
      out.write("\t\t\t\t\tvar _nodes=new Array();\r\n");
      out.write("\t\t\t\t\t_nodes=json[1];\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//节点关系\r\n");
      out.write("\t\t\t\t\tvar _relations=new Array();\r\n");
      out.write("\t\t\t\t\t_relations=json[2];\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//画图\r\n");
      out.write("\t\t\t\t\tif(_nodes!=null && _nodes!=\"\" && _relations!=null && _relations!=\"\"){\r\n");
      out.write("\t\t\t\t\t\t_draw(_nodes,_relations); \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//路径\r\n");
      out.write("\t\t\t\t\tvar _routess=new Array();\r\n");
      out.write("\t\t\t\t\t_routess=json[3];\r\n");
      out.write("\t\t\t\t\tif(_routess!=null && _routess!=\"\"){\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tfor(var i=0;i<_routess.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\tif(_routess[i].length==_maxNodes[0].weight){\r\n");
      out.write("\t\t\t\t\t\t\t\t_deleteMsg();\r\n");
      out.write("\t\t\t\t\t\t\t\t_setMsg(\"生成最终路径\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tgeneraterRoutes(_routess);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t_deleteMsg();\r\n");
      out.write("\t\t\t\t\t_setMsg(\"请选择节点生成路径\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\txmlhttp.open(\"GET\", \"nextRoutes\", true);\r\n");
      out.write("\t\t//xmlhttp.setRequestHeader(\"Content-type\",\r\n");
      out.write("\t\t\t\t//\"application/x-www-form-urlencoded\");\r\n");
      out.write("\t\txmlhttp.send();\r\n");
      out.write("}\r\n");
      out.write("/*\r\n");
      out.write(" * 获得节点和关系数据\r\n");
      out.write("  */\r\n");
      out.write("function _getNodes(num){ \r\n");
      out.write("\t\r\n");
      out.write("\t    var xmlhttp;  \r\n");
      out.write("\t\tif (window.XMLHttpRequest) {\r\n");
      out.write("\t\t\t// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码\r\n");
      out.write("\t\t\txmlhttp = new XMLHttpRequest();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t// IE6, IE5 浏览器执行代码\r\n");
      out.write("\t\t\txmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\txmlhttp.onreadystatechange = function() {\r\n");
      out.write("\t\t\tif (xmlhttp.readyState == 4 && xmlhttp.status == 200) {\t\t\r\n");
      out.write("\t\t\t\tvar result = xmlhttp.responseText;\r\n");
      out.write("\t\t\t\tif(result!=null && result!=[] && result!=\"\"){\r\n");
      out.write("\t\t\t\t\tvar json = eval(\"(\" + result + \")\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//节点\r\n");
      out.write("\t\t\t\t\tvar _nodes=new Array(); \r\n");
      out.write("\t\t\t\t\t_nodes=json[0];\r\n");
      out.write("\t    \t\r\n");
      out.write("\t\t\t    \t//节点权值\r\n");
      out.write("\t\t\t    \tvar _relations=new Array(); \r\n");
      out.write("\t\t\t\t\t_relations=json[1];\r\n");
      out.write("\t   \t\t\t\t\r\n");
      out.write("\t\t\t\t\t//画图\r\n");
      out.write("\t\t\t\t\tif(_nodes!=null && _nodes!=\"\" && _relations!=null && _relations!=\"\"){\r\n");
      out.write("\t\t\t\t\t\t_draw(_nodes,_relations); \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t    \t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t \t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\txmlhttp.open(\"POST\", \"generateNodes\", true);\r\n");
      out.write("\t\txmlhttp.setRequestHeader(\"Content-type\",\r\n");
      out.write("\t\t\t\t\"application/x-www-form-urlencoded\");\r\n");
      out.write("\t\txmlhttp.send(\"num=\"+num);\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write(" * 画图\r\n");
      out.write(" */\r\n");
      out.write("function _draw(_nodes,_relations) {\r\n");
      out.write("\t\r\n");
      out.write("\t//节点\r\n");
      out.write("\tvar _nodesSwitch=new Array();   \t\t\t\t\r\n");
      out.write("\tfor(var i = 0;i < _nodes.length;i++){\t   \t     \r\n");
      out.write("\t\t_nodesSwitch.push({\r\n");
      out.write("\t\t\t\"name\":_nodes[i].name,\r\n");
      out.write("\t\t\t \"ip\":_nodes[i].name+\"(\"+_nodes[i].x+\",\"+_nodes[i].y+\")\",\r\n");
      out.write("\t\t\t\"isnode\":true,\r\n");
      out.write("\t\t\t\"x\":_nodes[i].x,\r\n");
      out.write("\t\t\t\"y\":_nodes[i].y\r\n");
      out.write("\t\t});\t\t    \t\t\r\n");
      out.write("\t} \r\n");
      out.write("\r\n");
      out.write("\t//节点关系\r\n");
      out.write("\tvar _relationsSwitch=new Array();  \r\n");
      out.write("\tfor(var i = 0;i <_relations.length;i++){\t   \t     \r\n");
      out.write("\t\t_relationsSwitch.push({\r\n");
      out.write("\t\t\t 'source':_relations[i].node_A,\r\n");
      out.write("             'target':_relations[i].node_B,\r\n");
      out.write("             'islink':true,\r\n");
      out.write("             'weight':_relations[i].weight,\t\t\t             \r\n");
      out.write("\t\t\t});\t\t    \t\t\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//基于准备好的dom，初始化echarts实例\r\n");
      out.write("\tvar myChart = echarts.init(document.getElementById('main'));\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tvar  option = {\r\n");
      out.write("\t backgroundColor: '#F0F0F0',\r\n");
      out.write("\t title: {\r\n");
      out.write("\t     text: 'sdn水下传感器网络',\r\n");
      out.write("\t },\r\n");
      out.write("\t tooltip:{},\r\n");
      out.write("\t animationDurationUpdate: 1500,\r\n");
      out.write("\t animationEasingUpdate: 'quinticInOut',\r\n");
      out.write("\t series : [\r\n");
      out.write("\t     {\r\n");
      out.write("\t         type: 'graph',\r\n");
      out.write("\t         layout: 'none',\r\n");
      out.write("\t         symbolSize: 20,//图形的大小（示例中的圆的大小）\r\n");
      out.write("\t         roam: true,//鼠标缩放及平移\r\n");
      out.write("\t         focusNodeAdjacency:true,//是否在鼠标移到节点上的时候突出显示节点以及节点的边和邻接节点\r\n");
      out.write("\t         label: {\r\n");
      out.write("\t             normal: {\r\n");
      out.write("\t                 show: true ,  //控制非高亮时节点名称是否显示\r\n");
      out.write("\t                 position:'top',\r\n");
      out.write("\t                 fontSize:20\r\n");
      out.write("\t             }\r\n");
      out.write("\t         },\r\n");
      out.write("\r\n");
      out.write("\t         edgeSymbol: ['circle', 'arrow'],\r\n");
      out.write("\t         edgeSymbolSize: [0, 0],    //箭头的大小\r\n");
      out.write("\t         edgeLabel: {\r\n");
      out.write("\t             normal:{\r\n");
      out.write("\t                 show:false\r\n");
      out.write("\t             },\r\n");
      out.write("\t             emphasis: {\r\n");
      out.write("\t                 textStyle: {\r\n");
      out.write("\t                     fontSize: 20  //边节点显示的字体大小\r\n");
      out.write("\t                 }\r\n");
      out.write("\t             }\r\n");
      out.write("\t         },\r\n");
      out.write("\r\n");
      out.write("\t//节点信息\r\n");
      out.write("\r\n");
      out.write("\t data:_nodesSwitch,\r\n");
      out.write("\r\n");
      out.write("\t links:_relationsSwitch,\r\n");
      out.write("\t         lineStyle: {\r\n");
      out.write("\t             normal: {\r\n");
      out.write("\t                 show:true,\r\n");
      out.write("\t                 color:\r\n");
      out.write("\t                 {       \r\n");
      out.write("\t                         type: 'linear',\r\n");
      out.write("\t                         x: 0,\r\n");
      out.write("\t                         y: 0,\r\n");
      out.write("\t                         x2: 0,\r\n");
      out.write("\t                         y2: 1,\r\n");
      out.write("\t                         colorStops: [\r\n");
      out.write("\t                         {\r\n");
      out.write("\t                             offset: 0, color: 'red' // 0% 处的颜色\r\n");
      out.write("\t                         }\r\n");
      out.write("\t                         ,{\r\n");
      out.write("\t                             offset: 1, color: 'blue' // 100% 处的颜色\r\n");
      out.write("\t                         }],\r\n");
      out.write("\t                         globalCoord: false // 缺省为 false\r\n");
      out.write("\t                     },\r\n");
      out.write("\t               \r\n");
      out.write("\t              // curveness: 0.2\r\n");
      out.write("\t                   \r\n");
      out.write("\t             },\r\n");
      out.write("\t             emphasis:{\r\n");
      out.write("\t                 color:'red',\r\n");
      out.write("\t                 width:3,\r\n");
      out.write("\t                 type:'dashed',//虚线\r\n");
      out.write("\r\n");
      out.write("\t             }\r\n");
      out.write("\t         },\r\n");
      out.write("\t        \r\n");
      out.write("\t         tooltip:\r\n");
      out.write("\t         {\r\n");
      out.write("\t         position:'bottom',//悬浮时显示的位置\r\n");
      out.write("\t         backgroundColor:'green',\r\n");
      out.write("\t         textStyle:{fontSize:18,\r\n");
      out.write("\r\n");
      out.write("\t         },\r\n");
      out.write("\r\n");
      out.write("\t         formatter:function(params){//悬浮提示框显示的内容\r\n");
      out.write("\t            if (params.data.islink) {\r\n");
      out.write("\t            \treturn '节点'+params.data.target+params.data.source+'权值：'+params.data.weight;\r\n");
      out.write("\t            }\r\n");
      out.write("\t            else if (params.data.isnode){return params.data.ip;}\r\n");
      out.write("\t         }\r\n");
      out.write("\t         },//悬浮时的提示框，不设置时是随鼠标移动\r\n");
      out.write("\r\n");
      out.write("\t     }\r\n");
      out.write("\t ]\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t// 使用刚指定的配置项和数据显示图表。\r\n");
      out.write("\tmyChart.setOption(option);\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//重置节点\r\n");
      out.write("function resetNodes() {\r\n");
      out.write("\t_deleteMsg();\r\n");
      out.write("\t_deleteMaxWeight();\r\n");
      out.write("\tremoveRoutes();\r\n");
      out.write("\tvar xmlhttp;  \r\n");
      out.write("\tif (window.XMLHttpRequest) {\r\n");
      out.write("\t\t// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码\r\n");
      out.write("\t\txmlhttp = new XMLHttpRequest();\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\t// IE6, IE5 浏览器执行代码\r\n");
      out.write("\t\txmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t}\r\n");
      out.write("\txmlhttp.onreadystatechange = function() {\r\n");
      out.write("\t\tif (xmlhttp.readyState == 4 && xmlhttp.status == 200) {\t\t\r\n");
      out.write("\t\t\tvar result = xmlhttp.responseText;\r\n");
      out.write("\t\t\tif(result!=null && result!=[] && result!=\"\"){\r\n");
      out.write("\t\t\t\tvar json = eval(\"(\" + result + \")\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//节点\r\n");
      out.write("\t\t\t\tvar _nodes=new Array(); \r\n");
      out.write("\t\t\t\t_nodes=json[0];\r\n");
      out.write("    \t\r\n");
      out.write("\t\t    \t//节点权值\r\n");
      out.write("\t\t    \tvar _relations=new Array(); \r\n");
      out.write("\t\t\t\t_relations=json[1];\r\n");
      out.write("   \t\t\t\t\r\n");
      out.write("\t\t\t\t//画图\r\n");
      out.write("\t\t\t\tif(_nodes!=null && _nodes!=\"\" && _relations!=null && _relations!=\"\"){\r\n");
      out.write("\t\t\t\t\t_draw(_nodes,_relations); \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t    \t\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t_setMsg(\"请先输入节点数初始化拓补图\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write(" \t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\txmlhttp.open(\"GET\", \"resetNodes\", true);\r\n");
      out.write("\t/* xmlhttp.setRequestHeader(\"Content-type\",\r\n");
      out.write("\t\t\t\"application/x-www-form-urlencoded\"); */\r\n");
      out.write("\txmlhttp.send();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}