/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-01-10 06:47:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.ProcessBuilder.Redirect;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.lang.*;

public final class InsertUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.lang");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.swing");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.lang.ProcessBuilder.Redirect");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>User Sign UP</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/favicon.ico\">\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<!-- Fontawesome CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.9/css/all.css\">\r\n");
      out.write("<!-- Reset CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("<!-- Style CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<!-- Responsive  CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"night\">\r\n");
      out.write("			<div class=\"star\"></div>\r\n");
      out.write("			<div class=\"star\"></div>\r\n");
      out.write("			<div class=\"star\"></div>\r\n");
      out.write("			<div class=\"star\"></div>\r\n");
      out.write("			<div class=\"star\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("<div class=\"popup-bg\"></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header-title\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h1 class=\"text-white\">Login / Signup Modal Popup</h1>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"popup-login-signup\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-lg-12 text-center\">\r\n");
      out.write("				<button type=\"button\" class=\"btn-tip\" data-toggle=\"modal\" data-target=\"#exampleModalCenter\">\r\n");
      out.write("					Login / Signup\r\n");
      out.write("				</button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- Modal -->\r\n");
      out.write("			<div class=\"modal fade\" id=\"exampleModalCenter\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\r\n");
      out.write("				<div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("					<div class=\"modal-content\">\r\n");
      out.write("						<nav class=\"tab-bar-top\">\r\n");
      out.write("							<div class=\"nav nav-tabs nav-fill\" id=\"nav-tab\" role=\"tablist\">\r\n");
      out.write("								<a class=\"nav-item nav-link active\" id=\"nav-login-tab\" data-toggle=\"tab\" href=\"#nav-login\" role=\"tab\" aria-controls=\"nav-login\" aria-selected=\"true\">Login</a>\r\n");
      out.write("								<a class=\"nav-item nav-link\" id=\"nav-signup-tab\" data-toggle=\"tab\" href=\"#nav-signup\" role=\"tab\" aria-controls=\"nav-signup\" aria-selected=\"false\">Signup</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</nav>\r\n");
      out.write("						<div class=\"tab-content py-3 px-3 px-sm-0\" id=\"nav-tabContent\">\r\n");
      out.write("							<div class=\"tab-pane fade show active\" id=\"nav-login\" role=\"tabpanel\" aria-labelledby=\"nav-login-tab\">\r\n");
      out.write("								<form class=\"form-login-signup\" action=\"loginuser\" method=\"get\">\r\n");
      out.write("									<div class=\"form-label-group\">\r\n");
      out.write("										<input type=\"text\" id=\"inputEmail\" name=\"uname\" class=\"form-control\" placeholder=\"Youe Name\" required autofocus>\r\n");
      out.write("										<label for=\"inputEmail\">Your Name</label>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"form-label-group\">\r\n");
      out.write("										<input type=\"text\" id=\"inputEmail\" name=\"u_id\" class=\"form-control\" placeholder=\"Email address\" required autofocus>\r\n");
      out.write("										<label for=\"inputEmail\">Enter ID</label>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<div class=\"form-label-group\">\r\n");
      out.write("										<input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required name=\"pass\">\r\n");
      out.write("										<label for=\"inputPassword\">Password</label>\r\n");
      out.write("									</div>\r\n");
      out.write("									<!-- <div class=\"custom-control custom-checkbox mb-3\">\r\n");
      out.write("										<input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck1\">\r\n");
      out.write("										\r\n");
      out.write("									</div> -->\r\n");
      out.write("									<button class=\"btn btn-lg btn-primary btn-color-hover btn-block text-uppercase\" type=\"submit\">Login</button>\r\n");
      out.write("									<hr class=\"my-4\">\r\n");
      out.write("									\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"tab-pane fade\" id=\"nav-signup\" role=\"tabpanel\" aria-labelledby=\"nav-signup-tab\">\r\n");
      out.write("								<form class=\"form-login-signup\" action=\"InsertUser\" method=\"get\">\r\n");
      out.write("									<div class=\"form-label-group\">\r\n");
      out.write("										<input type=\"text\" id=\"inputUserame\" name=\"uname\" class=\"form-control\" placeholder=\"Username\" required autofocus>\r\n");
      out.write("										<label for=\"inputUserame\">Username</label>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<div class=\"form-label-group\">\r\n");
      out.write("										<input type=\"email\" id=\"inputEmail-1\" name=\"uemail\" class=\"form-control\" placeholder=\"Email address\" required>\r\n");
      out.write("										<label for=\"inputEmail-1\">Email address</label>\r\n");
      out.write("									</div>									\r\n");
      out.write("									<div class=\"form-label-group\">\r\n");
      out.write("										<input type=\"text\" id=\"inputEmail-1\" name=\"uphone\" class=\"form-control\" placeholder=\"Email address\" required>\r\n");
      out.write("										<label for=\"inputEmail-1\">Phone Number</label>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"form-label-group\">\r\n");
      out.write("										<input type=\"text\" id=\"inputEmail-1\" name=\"uexam\" class=\"form-control\" placeholder=\"Email address\" required>\r\n");
      out.write("										<label for=\"inputEmail-1\">Exam ID</label>\r\n");
      out.write("									</div>\r\n");
      out.write("									<hr>\r\n");
      out.write("									<div class=\"form-label-group\">\r\n");
      out.write("										<input type=\"password\" id=\"inputPassword-1\" name=\"upass\" class=\"form-control\" placeholder=\"Password\" required>\r\n");
      out.write("										<label for=\"inputPassword-1\">Password</label>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"form-label-group\">\r\n");
      out.write("										<input type=\"password\" id=\"inputConfirmPassword\" name=\"ucpass\" class=\"form-control\" placeholder=\"Password\" required>\r\n");
      out.write("										<label for=\"inputConfirmPassword\">Confirm password</label>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"custom-control custom-checkbox mb-3\">\r\n");
      out.write("										<input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck2\">\r\n");
      out.write("										<label class=\"custom-control-label\" for=\"customCheck2\">I Agree To The Terms & Conditions</label>\r\n");
      out.write("									</div>\r\n");
      out.write("									<button class=\"btn btn-lg btn-primary btn-block btn-color-hover text-uppercase\" type=\"submit\">Register</button>									\r\n");
      out.write("									<hr class=\"my-4\">	\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jquery latest version -->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<!-- popper.min.js -->\r\n");
      out.write("<script src=\"js/popper.min.js\"></script>    \r\n");
      out.write("<!-- bootstrap js -->\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
