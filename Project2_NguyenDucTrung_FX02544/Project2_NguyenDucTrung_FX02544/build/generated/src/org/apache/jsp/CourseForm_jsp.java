package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CourseForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Student Information</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Dynamic Website</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">About</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <br><br><br>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"starter-template\">\n");
      out.write("                <h1>Person Form</h1>                \n");
      out.write("                ");

                    String getError1 = (String) request.getAttribute("error1");
                    String getError2 = (String) request.getAttribute("error2");
                    String getError3 = (String) request.getAttribute("error3");
                    String getError4 = (String) request.getAttribute("error4");
                    if (getError1 != null) {
                
      out.write("\n");
      out.write("                <div class=\"alert alert-danger alert-dismissible fade in\">\n");
      out.write("                    ");
      out.print(getError1);
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                } else if (getError2 != null) {
                
      out.write("\n");
      out.write("                <div class=\"alert alert-danger alert-dismissible fade in\">\n");
      out.write("                    ");
      out.print(getError2);
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                } else if (getError3 != null) {
                
      out.write("\n");
      out.write("                <div class=\"alert alert-danger alert-dismissible fade in\">\n");
      out.write("                    ");
      out.print(getError3);
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                } else if(getError4 != null) {
                
      out.write("\n");
      out.write("                <div class=\"alert alert-danger alert-dismissible fade in\">\n");
      out.write("                    ");
      out.print(getError4);
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <form action=\"CourseValidationServlet\" method=\"GET\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <label>Full Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"fullname\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <label>Age</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"age\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"form-group col-sm-2\">\n");
      out.write("                            <label>Country</label>\n");
      out.write("                            <select name=\"country\" class=\"form-control\">\n");
      out.write("                                <option value=\"Vietnam\" selected>Vietnam</option>\n");
      out.write("                                <option value=\"US\">US</option>\n");
      out.write("                                <option value=\"UK\">UK</option>\n");
      out.write("                                <option value=\"China\">China</option>\n");
      out.write("                                <option value=\"France\">France</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"form-group col-sm-5\">\n");
      out.write("                            <label>Courses</label>\n");
      out.write("                            <select name=\"course\" class=\"form-control\" multiple>\n");
      out.write("                                <option value=\"C#\">C#</option>\n");
      out.write("                                <option value=\"Java\">Java</option>\n");
      out.write("                                <option value=\"C++\">C++</option>\n");
      out.write("                                <option value=\"Python\">Python</option>\n");
      out.write("                                <option value=\"Ruby on Rail\">Ruby on Rail</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <label>Choose language during studying:</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label><input type=\"checkbox\" name=\"lang\" value=\"Vietnamese\"> Vietnamese</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label><input type=\"checkbox\" name=\"lang\" value=\"English\"> English</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label><input type=\"checkbox\" name=\"lang\" value=\"French\"> French</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label><input type=\"checkbox\" name=\"lang\" value=\"American\"> American</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <div class=\"checkbox\">\n");
      out.write("                                <label><input type=\"checkbox\" name=\"lang\" value=\"Chinese\"> Chinese</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary\" name=\"submit\" value=\"Submit\">\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary\" name=\"cancel\" value=\"Cancel\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
