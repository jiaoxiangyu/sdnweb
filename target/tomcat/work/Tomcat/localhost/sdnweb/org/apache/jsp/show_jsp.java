/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-04 14:14:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("      \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>sdn水下传感器网络初始化最大权值路由系统</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("css/bootstrap.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("css/bootstrap-responsive.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("css/theme.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("images/icons/css/font-awesome.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("css/index.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("css/introduce.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\t          <div class=\"navbar-inner\">\r\n");
      out.write("\t              <div class=\"container-fluid\">\r\n");
      out.write("\t                  <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".navbar-inverse-collapse\">\r\n");
      out.write("\t                      <i class=\"icon-reorder shaded\"></i></a><a class=\"brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("weight/toIndex\">sdn水下传感器网络初始化最大权值路由系统</a>\r\n");
      out.write("\t                  <div class=\"nav-collapse collapse navbar-inverse-collapse\">\r\n");
      out.write("\t                      <ul class=\"nav pull-left\">\r\n");
      out.write("\t                      \t<ul class=\"nav nvabar-nav\">\r\n");
      out.write("\t                                  <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("weight/toIndex\">首页</a></li>\r\n");
      out.write("\t                                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("node/find\">节点管理</a></li>\r\n");
      out.write("                                \t<li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("weight/find\">权值管理</a></li>\r\n");
      out.write("                                \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                \t<li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("show.jsp\">说明书</a></li>\r\n");
      out.write("\t\t                            <li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("welcome.jsp\">关于我们</a></li>\r\n");
      out.write("\t                        </ul>\r\n");
      out.write("\t                          \r\n");
      out.write("\t                      </ul>\r\n");
      out.write("\t                      \r\n");
      out.write("\t                <ul class=\"nav pull-right\">\r\n");
      out.write("                    \t\t<ul class=\"nav nvabar-nav\">\r\n");
      out.write("                                \r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("user/toUpdate?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><span><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("images/user.png\" width=\"20px\" height=\"28px\"/><span style=\"padding-top:5px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></span></a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("logout\"><span><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("images/logout.png\" width=\"20px\" height=\"28px\"/></span></a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\t                  </div>\r\n");
      out.write("\t                  <!-- /.nav-collapse -->\r\n");
      out.write("\t              </div>\r\n");
      out.write("\t          </div>\r\n");
      out.write("\t          <!-- /navbar-inner -->\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t<div class=\"wrapper\"> \r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">\r\n");
      out.write("           \t\t \t<h2 class=\"head\">sdn水下传感器网络最大权值路由系统说明书</h2>\r\n");
      out.write("           \t\t </div>\r\n");
      out.write("           \t\t <div class=\"introduce\">\r\n");
      out.write("           \t\t \t<h4>欢迎您阅读说明书，本项目模拟的水下的传感器网络,进行网络的模拟，由于浏览器无法承受10万条路径，所以本次选取5个节点来进行数据的说明，如果你输入的点数太多，可能需要很多时间</h4>\r\n");
      out.write("           \t\t \t<img src=\"images/map2.png\" alt=\"散点图\" width=\"720px\" height=\"331px\"/>\r\n");
      out.write("           \t\t \t<h4>1.在下拉框选择2-9的数字，点击生成节点按钮，上图将自动生成散点图</h4>\r\n");
      out.write("           \t\t \t<h4>2.在开始的节点和结束的节点有两个下拉框，可以根据你的意愿，进行点的选取</h4>\r\n");
      out.write("           \t\t \t<h4>3.选后点后，点击开始按钮，路由表就会出现，就如上图所示</h4>\r\n");
      out.write("           \t\t \t<h4>4.点击下一步，系统会找到最大权值，进行减操作，直到生成最大权值的路径为止</h4>\r\n");
      out.write("           \t\t \t<img src=\"images/map3.png\" alt=\"权值减操作\" width=\"720px\" height=\"331px\"/>\r\n");
      out.write("           \t\t \t<img src=\"images/map4.png\" alt=\"权值减操作\" width=\"720px\" height=\"331px\"/>\r\n");
      out.write("           \t\t \t<img src=\"images/map5.png\" alt=\"权值减操作\" width=\"720px\" height=\"331px\"/>\r\n");
      out.write("           \t\t \t<img src=\"images/map6.png\" alt=\"权值减操作\" width=\"720px\" height=\"331px\"/>\r\n");
      out.write("           \t\t \t<h4 style=\"margin-top: 40px;\">最后的结果是：</h4>\r\n");
      out.write("           \t\t \t<img src=\"images/map7.png\" alt=\"最后的结果\" width=\"720px\" height=\"331px\"/>\r\n");
      out.write("           \t\t </div>\r\n");
      out.write("        \t</div>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <p>本项目由河南科技学院提供技术支持，版权所有</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("js/jquery.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /show.jsp(29,33) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.type=='管理员'}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                \t\t<li ><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("user/find\">用户管理</a></li>\r\n");
        out.write("                                \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
