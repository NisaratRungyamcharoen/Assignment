/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.88
 * Generated at: 2561-06-20 16:55:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showCost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    table{\r\n");
      out.write("    \tborder-radius: 5px;\r\n");
      out.write("  \t\tborder-collapse: separate;\r\n");
      out.write("  \t\twidth:100%;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    tbody tr:nth-child(odd){\r\n");
      out.write("\t\tbackground-color: #BBD2FA;\r\n");
      out.write("\t}\r\n");
      out.write("    \r\n");
      out.write("    #head-box{\r\n");
      out.write("    \twidth: 102%;\r\n");
      out.write("    \theight: 350px;\r\n");
      out.write("    \tbackground-color: #E6E7E8;\r\n");
      out.write("    \tmargin-top: -22px;\r\n");
      out.write("    \tmargin-left: -20px;\r\n");
      out.write("    \tpadding-top:40px !important;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #content-box{\r\n");
      out.write("    \twidth: 70%;\r\n");
      out.write("    \theight: auto;\r\n");
      out.write("    \tmax-height: 500px;\r\n");
      out.write("    \tbackground-color: white;\r\n");
      out.write("    \tborder-radius: 5px;\r\n");
      out.write("    \toverflow-x: hidden;\r\n");
      out.write("    \tmargin-top:50px !important;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("</style>\r\n");
      out.write("<title>Show cost each number</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"head-box\" align=\"center\">\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<span style=\"font-size:40px; font-weight:bold\">Show Cost</span>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"content-box\" align=\"center\">\r\n");
      out.write("\t\t\t<table id=\"show-detail\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr style=\"background-color: #508EF6; height: 50px !important; font-size:20px; color:white\">\r\n");
      out.write("\t\t\t\t\t\t<th>No</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"background-color: #3980F9;\">Number</th>\r\n");
      out.write("\t\t\t\t\t    <th>Start Time</th>\r\n");
      out.write("\t\t\t\t\t    <th>End Time</th>\r\n");
      out.write("\t\t\t\t\t    <th>take time</th>\r\n");
      out.write("\t\t\t\t\t    <th>Price</th>\r\n");
      out.write("\t\t\t\t  \t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function () {\r\n");
      out.write("\t    $.ajax({ \r\n");
      out.write("\t        type: 'GET', \r\n");
      out.write("\t        url: 'http://localhost:8080/Assignment/showPrice.json', \r\n");
      out.write("\t        data: { get_param: 'value' }, \r\n");
      out.write("\t        dataType: 'json',\r\n");
      out.write("\t        success: function (data) { \r\n");
      out.write("\t            var keyLength = Object.keys(data).length;\r\n");
      out.write("\t            var table = document.getElementById('show-detail');\r\n");
      out.write("\t            var tbody = document.createElement('tbody');\r\n");
      out.write("\t            for(var i=0; i< keyLength; i++){\r\n");
      out.write("\t            \tvar tr = document.createElement('tr');\r\n");
      out.write("\t            \ttr.setAttribute(\"style\", \"height:35px\")\r\n");
      out.write("\t            \t\r\n");
      out.write("\t            \tvar num = document.createElement('td');\r\n");
      out.write("\t            \tnum.setAttribute(\"align\", \"center\");\r\n");
      out.write("\t            \tnum.setAttribute(\"style\", \"background-color:\");\r\n");
      out.write("\t            \tnum.innerHTML = i+1;\r\n");
      out.write("\t            \ttr.appendChild(num);\r\n");
      out.write("\t            \tfor(var j=0; j<data[i].length; j++){\r\n");
      out.write("\t            \t\tvar td = document.createElement('td');\r\n");
      out.write("\t            \t\ttd.setAttribute(\"align\", \"center\");\r\n");
      out.write("\t            \t\ttd.setAttribute(\"style\", \"background-color:\");\r\n");
      out.write("            \t\t\tvar split = data[i][j].split(/:(.+)/)[1];\r\n");
      out.write("\t            \t\tconsole.log(split);\r\n");
      out.write("\t            \t\ttd.innerHTML = split;\r\n");
      out.write("\t            \t\ttr.appendChild(td)\r\n");
      out.write("\t            \t}\r\n");
      out.write("\t            \ttbody.appendChild(tr);\r\n");
      out.write("\t            }\r\n");
      out.write("\t            table.appendChild(tbody);\r\n");
      out.write("\t        }\r\n");
      out.write("\t    });\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
