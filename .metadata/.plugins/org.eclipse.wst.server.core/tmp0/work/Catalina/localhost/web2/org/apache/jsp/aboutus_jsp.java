/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-01-20 12:41:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;
import java.lang.ProcessBuilder.Redirect;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.lang.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 Connection con;
      PreparedStatement st;
      ResultSet rs;
      String s1=" ";
      
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
    _jspx_imports_classes.add("com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry");
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"min.css\">\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-2.2.0.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\r\n");
      out.write("<script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("      ");
try {
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
	// String sql="select * from questions where name=?";
	String sql = "select details from  details where d_id='d001'";
	st = con.prepareStatement(sql);
	rs = st.executeQuery();
	while(rs.next())
	{
		s1=rs.getString(1);
	}
	  con.close();
}
	catch (Exception e2) {
		System.out.println(e2.toString());
	}


      
      out.write("\r\n");
      out.write("<div class=\"ct-pageWrapper\" id=\"ct-js-wrapper\">\r\n");
      out.write("  <section class=\"company-heading intro-type\" id=\"parallax-one\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row product-title-info\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("          <h1>About Us</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"parallax\" id=\"parallax-cta\" style=\"background-image:url(https://www.solodev.com/assets/hero/hero.jpg);\"></div>\r\n");
      out.write("  </section>\r\n");
      out.write("  <section class=\"story-section company-sections ct-u-paddingBoth100 paddingBothHalf noTopMobilePadding\" id=\"section\">\r\n");
      out.write("    <div class=\"container text-center\">\r\n");
      out.write("      <h2>Brief Introduction About online Examination</h2>\r\n");
      out.write("      <p style=\"font-size:20px \">An online exam (also called eExam) is a great way of conducting tests and other important exams with help of the internet. An online exam needs a device capable of accessing the internet such as a computer or a smartphone.\r\n");
      out.write("\r\n");
      out.write("This can be either done at an examination center or at home. It can be useful as a remote learning system where candidates can appear in an exam from their own device by sitting in the comfort of their homes. They do not have to invest their valuable time in traveling to and from <br>the center.\r\n");
      out.write("\r\n");
      out.write("This is the best way to conduct exams as schools, universities, and other institutions donât have to invest in examination centers, invigilators, and security. A microphone and a webcam are sufficient for this process. \r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("      <div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("        <div class=\"none\"></div>\r\n");
      out.write("        <!--<p class=\"ct-u-size22 ct-u-fontWeight300 marginTop40\"></p>-->\r\n");
      out.write("        <!-- <a class=\"ct-u-marginTop60 btn btn-solodev-red btn-fullWidth-sm ct-u-size19\" href=\"#\">Learn More</a> -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("  <section class=\"culture-section company-sections ct-u-paddingBoth100 paddingBothHalf noTopMobilePadding\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("          <h2>Various Exam Conduct in our portal</h2>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row ct-u-paddingBoth20\">\r\n");
      out.write("        <div class=\"col-xs-6 col-md-4\">\r\n");
      out.write("          <div class=\"company-icons-white\">\r\n");
      out.write("            <ion-icon name=\"logo-python\" class=\"one\"></ion-icon>\r\n");
      out.write("            <p class=\"ones\">PYTHON</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-xs-6 col-md-4\">\r\n");
      out.write("          <div class=\"company-icons-white\">\r\n");
      out.write("            <ion-icon name=\"logo-javascript\" class=\"one\"></ion-icon>\r\n");
      out.write("            <p class=\"ones\">JAVASCRIPT</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-xs-6 col-md-4\">\r\n");
      out.write("          <div class=\"company-icons-white\">\r\n");
      out.write("            <ion-icon name=\"logo-nodejs\" class=\"one\"></ion-icon>\r\n");
      out.write("            <p class=\"ones\">NODE.JS</p>\r\n");
      out.write("         </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("  </section>\r\n");
      out.write("  <form class=\"three\">\r\n");
      out.write("  <label>\r\n");
      out.write("  ");
      out.print( s1 );
      out.write("\r\n");
      out.write("  </label>\r\n");
      out.write("  </form>\r\n");
      out.write("  <section class=\"customers-section company-sections ct-u-paddingBoth100 paddingBothHalf noTopMobilePadding\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("           <form class=\"twos\" action=\"edit\" method=\"get\">\r\n");
      out.write("            <div >\r\n");
      out.write("            <label>Enter Details</label>\r\n");
      out.write("            <input type=\"text\" name=\"tname\" >\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"submit\" name=\"btn1\" value=\"edit\">\r\n");
      out.write("            </form> \r\n");
      out.write("           </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </section>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>	\r\n");
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