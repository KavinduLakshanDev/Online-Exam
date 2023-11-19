/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-11-05 15:08:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("            <title>Online Exam | Home</title>\r\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/headfoot.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/home.css\">\r\n");
      out.write("            <script type=\"text/javascript\" src=\"js/index.js\"></script>\r\n");
      out.write("    <!--Bootstrap website link to get social media icons(use.fontawesome.com)-->\r\n");
      out.write("            <link\r\n");
      out.write("            rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://use.fontawesome.com/releases/v5.13.0/css/all.css\"\r\n");
      out.write("            integrity=\"sha384-Bfad6CLCknfcloXFOyFnlgtENryhrpZCe29RTifKEixXQZ38WheV+i/6YWSzkz3V\"\r\n");
      out.write("            crossorigin=\"anonymous\"/> \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("    <!--navigation bar-->\r\n");
      out.write("        <nav>\r\n");
      out.write("            <a href=\"home.html\"><img src=\"Images/logo.jpeg\" class=\"logo\"></a>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("                <li><a href=\"about-us.jsp\">About Us</a></li>\r\n");
      out.write("                <li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("                <li><a href=\"results.jsp\">Results</a></li>\r\n");
      out.write("                <li><a href=\"exams.jsp\">Exams</a></li>\r\n");
      out.write("                <div class=\"dropdown\">\r\n");
      out.write("                    <button class=\"dropbtn\">Profile\r\n");
      out.write("                    <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <div class=\"dropdown-content\">\r\n");
      out.write("                    <!-- <a href=\"PHP/employee.php\" href=\"login.html\">Sign In</a> -->\r\n");
      out.write("                        <a href=\"login.jsp\">Sign In</a>\r\n");
      out.write("                        <a href=\"register.jsp\">Sign up</a>  \r\n");
      out.write("                    </div>		\r\n");
      out.write("                </div>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--Content of the page-->\r\n");
      out.write("        <div class=\"cover\" id=\"top\">\r\n");
      out.write("            <video autoplay muted loop id=\"bg-video\">\r\n");
      out.write("                <source src=\"Images/Studying.mp4\" type=\"video/mp4\" />\r\n");
      out.write("            </video>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"video\">\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <div class=\"search\">\r\n");
      out.write("                        <input type=\"text\" class=\"srch\" placeholder=\"What are you Looking For ? \"><button type=\"submit\" class=\"sub1\"><i class=\"fas fa-search\"></i></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <h6>work harder, be prepared</h6>\r\n");
      out.write("                    <h3 data-text=\"super..\"> stay focused & Never give up</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("         <!-- container 1 -->\r\n");
      out.write("        <div class=\"cover\" id=\"top\">\r\n");
      out.write("            <video autoplay muted loop id=\"bg-video\">\r\n");
      out.write("                <source src=\"Images/Write.mp4\" type=\"video/mp4\" />\r\n");
      out.write("            </video>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"video\">\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"item item-1\">\r\n");
      out.write("                            <h2>Course</h2>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <img src=\"Images/course.png\" width=\"110px\" height=\"110px\" class=\"dumb\">		\r\n");
      out.write("                            <p>We offer you the best exercise and more than 100 courses, Professional Certificates, and degrees from world-class universities and companies.</p><br><br>\r\n");
      out.write("                            <div class=\"expobtn\">\r\n");
      out.write("                                <a href=\"about-us.html\"><input type=\"button\" class=\"btn\" name=\"btn\" value=\"Explore More\" ></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"item item-2\">\r\n");
      out.write("                            <h2>Easy and Interactive </h2>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <img src=\"Images/easy.png\" width=\"142px\" height=\"142px\" class=\"gall\">\r\n");
      out.write("                            <p>We can create exams in an easy and interactive way. It helps the examiner to create exams within a few clicks. Examiner can set all of their exam criteria at once.</p>\r\n");
      out.write("                            <div class=\"expobtn\">\r\n");
      out.write("                                <a href=\"contact.html\"><input type=\"button\" class=\"btn\" name=\"btn\" value=\"Explore More\" ></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                \r\n");
      out.write("                        <div class=\"item item-3\">\r\n");
      out.write("                            <h2>About Us</h2>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <img src=\"Images/about.png\" width=\"140px\" height=\"140px\" class=\"prof\">\r\n");
      out.write("                            <p>This is an brief description about us, What we do and Our mission is to design and implement an easy-to-use online examination system</p><br>\r\n");
      out.write("                            <div class=\"expobtn\">\r\n");
      out.write("                                <a href=\"about-us.html\"><input type=\"button\" class=\"btn\" name=\"btn\" value=\"Explore More\" ></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br><br>	 \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- container 2 -->\r\n");
      out.write("            <div class=\"cover\" id=\"top\">\r\n");
      out.write("                <video autoplay muted loop id=\"bg-video\">\r\n");
      out.write("                    <source src=\"Images/Typying.mp4\" type=\"video/mp4\" />\r\n");
      out.write("                </video>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"video\">\r\n");
      out.write("                    <div class=\"caption\">\r\n");
      out.write("                        <h1>Why Choose Online Exams</h1><br>\r\n");
      out.write("                    <div class=\"container2\">	\r\n");
      out.write("                        <div class=\"items items-1\">	\r\n");
      out.write("                            <h5>Easy Scheduling And Allocation</h5>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <img src=\"Images/clock.png\" width=\"150px\" height=\"150px\" class=\"ain\">\r\n");
      out.write("                            <p>Scheduling exams are very easy here. Schedule exams in just a few clicks, no need of extra efforts.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"items items-2\">\r\n");
      out.write("                            <h5>Live Coverage of Exams</h5>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <img src=\"Images/live.png\" width=\"150px\" height=\"150px\" class=\"cost\">\r\n");
      out.write("                            <p>Live coverage helps the examiner to track every activity done by the employee.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"items items-3\">\r\n");
      out.write("                            <h5>Safe and Secure</h5>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <img src=\"Images/secu.png\" width=\"150px\" height=\"150px\" class=\"coach\">\r\n");
      out.write("                            <p>Security and Safety is one of our key feature. We track student activity through camera recording and catch all of his browser activity.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"items items-4\">\r\n");
      out.write("                            <h5>Smart Question Bank</h5>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <img src=\"Images/smart.png\" width=\"150px\" height=\"150px\" class=\"vid\">\r\n");
      out.write("                            <p>Question Bank is very useful feature for all examiners. It helps you to reuse all of the questions again and again.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("        <!--Footer-->   \r\n");
      out.write("        <hr class = \"line-before-footer\">\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"footer_content\">\r\n");
      out.write("                <div class=\"center_details\">\r\n");
      out.write("                    <ul class=\"details\">\r\n");
      out.write("                        <li>Contact : 071-1234567</li>\r\n");
      out.write("                        <li>Email : onlineexam@gmail.com</li>\r\n");
      out.write("                        <li>Address : No,20 Queens Road, Colombo 02</li>\r\n");
      out.write("                        <li>Branches : Malabe</li> \r\n");
      out.write("                    </ul>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"left_col\">\r\n");
      out.write("                    <h7>About Online Exams</h7>\r\n");
      out.write("                    <div class=\"border\"></div>\r\n");
      out.write("                    <h5>Enter your Email to get News and Updates</h5>\r\n");
      out.write("                    <form action=\"\" class=\"newsletter_form\">\r\n");
      out.write("                        <input type=\"Email\" class=\"txt\" placeholder=\"Enter Email\" name=\"\">\r\n");
      out.write("                        <input type=\"submit\" class=\"btn\" value=\"Submit\" name=\"\">\r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer_links\">\r\n");
      out.write("                    <h4>Quick Links</h4>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"about-us.jsp\">About Us</a></li>\r\n");
      out.write("                        <li><a href=\"contact.jsp\">Contact Us</a></li>\r\n");
      out.write("                        <li><a href=\"exams.jsp\">Exams</a></li>\r\n");
      out.write("                        <li><a href=\"faq.jsp\">FAQ</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>	\r\n");
      out.write("            </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"social\">\r\n");
      out.write("                    <a href=\"https://www.facebook.com\" target=\"_blank\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                    <a href=\"https://www.instagram.com\" target=\"_blank\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    <a href=\"https://www.youtube.com\" target=\"_blank\"><i class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("                    <a href=\"https://www.twitter.com\" target=\"_blank\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            <div class=\"footer_bottom\">\r\n");
      out.write("                <h8>All right reserved<br/>Copyright &copy;2022 Online Exam</h8>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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