/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-01-12 16:13:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admindash_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write(" <!-- Favicon -->\r\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Web Fonts -->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Icon Font Stylesheet -->\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Libraries Stylesheet -->\r\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("    <link href=\"asset/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Stylesheet -->\r\n");
      out.write("    <link href=\"asset/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- <div class=\"container-xxl position-relative bg-white d-flex p-0\">\r\n");
      out.write("        <!-- Spinner Start -->\r\n");
      out.write("        <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\r\n");
      out.write("            <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem;\" role=\"status\">\r\n");
      out.write("                <span class=\"sr-only\">Loading...</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Spinner End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Sidebar Start -->\r\n");
      out.write("        <div class=\"sidebar pe-4 pb-3\">\r\n");
      out.write("            <nav class=\"navbar bg-light navbar-light\">\r\n");
      out.write("                <a href=\"afterlogin.jsp\" class=\"navbar-brand mx-4 mb-3\">\r\n");
      out.write("                    <h3 class=\"text-primary\"><i class=\"fa fa-hashtag me-2\"></i>Home</h3>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"d-flex align-items-center ms-4 mb-4\">\r\n");
      out.write("                    <div class=\"position-relative\">\r\n");
      out.write("                        <img class=\"rounded-circle\" src=\"img/ronak.jpg\" alt=\"\" style=\"width: 40px; height: 40px;\">\r\n");
      out.write("                        <div class=\"bg-success rounded-circle border border-2 border-white position-absolute end-0 bottom-0 p-1\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"ms-3\">\r\n");
      out.write("                        <h6 class=\"mb-0\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h6>\r\n");
      out.write("                        <span>Admin</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"navbar-nav w-100\">\r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\"><i class=\"fa fa-laptop me-2\"></i>My Profile</a>\r\n");
      out.write("                        <div class=\"dropdown-menu bg-transparent border-0\">\r\n");
      out.write("                           \r\n");
      out.write("                            <a href=\"users.jsp\" rel=\"sponsored\" class=\"external\"> Insert Profile</a>\r\n");
      out.write("                            <a href=\"usersupdate.jsp\" class=\"dropdown-item\">Update Profile</a>\r\n");
      out.write("                            <a href=\"usersdelete.jsp\" class=\"dropdown-item\">Delete Profile</a>\r\n");
      out.write("                           <!--  <a href=\"element.html\" class=\"dropdown-item\">Update Profile</a> -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\"><i class=\"fa fa-laptop me-2\"></i>Add Subject</a>\r\n");
      out.write("                        <div class=\"dropdown-menu bg-transparent border-0\">\r\n");
      out.write("                            <a href=\"insertsubject.jsp\" class=\"dropdown-item\">Insert Subject</a>\r\n");
      out.write("                            <a href=\"findsubject.jsp\" class=\"dropdown-item\">Update Subject</a>\r\n");
      out.write("                            <a href=\"deletesubject.jsp\" class=\"dropdown-item\">Delete Subject</a>\r\n");
      out.write("                             <a href=\"viewsubject.jsp\" class=\"dropdown-item\">View Subject</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\"><i class=\"fa fa-laptop me-2\"></i>Add Exam Ques</a>\r\n");
      out.write("                        <div class=\"dropdown-menu bg-transparent border-0\">\r\n");
      out.write("                            <a href=\"exam.jsp\" class=\"dropdown-item\" name=\"ones\">Java Questions</a>\r\n");
      out.write("                            <a href=\"exam.jsp\" class=\"dropdown-item\" name=\"ones\">Python Questions</a>\r\n");
      out.write("                            <a href=\"exam.jsp\" class=\"dropdown-item\" name=\"ones\">Node.js Questions</a>\r\n");
      out.write("                            <a href=\"exam.jsp\" class=\"dropdown-item\" name=\"ones\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" Questions</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                     <div class=\"nav-item dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\"><i class=\"fa fa-laptop me-2\"></i>Result</a>\r\n");
      out.write("                        <div class=\"dropdown-menu bg-transparent border-0\">\r\n");
      out.write("                            <a href=\"users.html\" class=\"dropdown-item\">See Result</a>\r\n");
      out.write("                            <a href=\"addusers.html\" class=\"dropdown-item\">Send Student Result Pdf</a>\r\n");
      out.write("                            <a href=\"deletesuers.html\" class=\"dropdown-item\">Remove Student Result </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Sidebar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Content Start -->\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <!-- Navbar Start -->\r\n");
      out.write("\r\n");
      out.write("            <nav class=\"navbar navbar-expand bg-light navbar-light sticky-top px-4 py-0\">\r\n");
      out.write("                <a href=\"index.html\" class=\"navbar-brand d-flex d-lg-none me-4\">\r\n");
      out.write("                    <h2 class=\"text-primary mb-0\"><i class=\"fa fa-hashtag\"></i></h2>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"#\" class=\"sidebar-toggler flex-shrink-0\">\r\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"navbar-nav align-items-center ms-auto\">\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("                    <div class=\"nav-item nav-link\">\r\n");
      out.write("                    <a href=\"addadmin.jsp\" class=\"nav-item nav-link\"><i class=\"fa fa-tachometer-alt me-2\"></i>Add Admin</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"nav-item nav-link\">\r\n");
      out.write("                    <a href=\"adduser.jsp\" class=\"nav-item nav-link\"><i class=\"fa fa-tachometer-alt me-2\"></i>Add User</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <div class=\"nav-item nav-link\">\r\n");
      out.write("                    <a href=\"aboutus.jsp\"class=\"nav-item nav-link\"><i class=\"fa fa-tachometer-alt me-2\"></i>About Us</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <div class=\"nav-item nav-link\">\r\n");
      out.write("                    <a href=\"contact_us.jsp\" class=\"nav-item nav-link\"><i class=\"fa fa-tachometer-alt me-2\"></i>Contact Us</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- <div class=\"nav-item nav-link\">\r\n");
      out.write("                    <a href=\"index.html\" class=\"nav-item nav-link\"><i class=\"fa fa-tachometer-alt me-2\"></i>Logout</a>\r\n");
      out.write("                        </div> -->\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!-- Navbar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Content End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Back to Top -->\r\n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- JavaScript Libraries -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/chart/chart.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/tempusdominus/js/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/tempusdominus/js/moment-timezone.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Javascript -->\r\n");
      out.write("    <script src=\"asset/js/main.js\"></script>\r\n");
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
