package org.apache.jsp.filexweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.sampath.filex.web.actions.Employee;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/filexweb/Up.jsp");
    _jspx_dependants.add("/filexweb/Down.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Home</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\r\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href=\"css/style1.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\" >\r\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/modernizr.custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/metisMenu.min.js\"></script>\r\n");
      out.write("        <script src=\"js/custom.js\"></script>\r\n");
      out.write("        <link href=\"css/custom.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        ");

            session = request.getSession(false);

            Employee e = Employee.getEmployee((String) session.getAttribute("eid"));
            String url;

            if(e.getPicurl()==null){
                url = "images/user/user.png";
            }
            else{
                url = e.getPicurl();
            }


        
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head> \r\n");
      out.write("    <body class=\"cbp-spmenu-push\">\r\n");
      out.write("        <div class=\"main-content\">\r\n");
      out.write("\r\n");
      out.write("            <!-- header-starts -->\r\n");
      out.write("            <div class=\"sticky-header header-section \">\r\n");
      out.write("                <div class=\"header-left\">\r\n");
      out.write("                    <!--logo -->\r\n");
      out.write("                    <div class=\"logo\">\r\n");
      out.write("                        <img id=\"logo\" src=\"images/fileXlogo.png\" alt=\"Logo\" width=\"100\"/> \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--//logo-->\r\n");
      out.write("                    <div class=\"user-right\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"header-right\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"profile_medile\"><!--notifications of menu start -->\r\n");
      out.write("\r\n");
      out.write("                        <div ><!--notifications of menu start -->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"profile_details\">\t\r\n");
      out.write("\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li class=\"dropdown profile_details_drop\">\r\n");
      out.write("                                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                                            <div class=\"profile_img\">\t\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"prfil-imge\"><div class=\"user-name\"><p style=\"color:#FFA500; font-weight: bold;\">");
 out.print(e.getEmployeename()); 
      out.write("</p><span>");
 out.print(e.getPosition()); 
      out.write("</span></div><img width=\"50\" height=\"50\" style=\"border-radius: 50%;\" src=\"");
 out.print(url); 
      out.write("\" alt=\"\">\t\t       \r\n");
      out.write("                                                </div> \r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div>\t\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                        <ul class=\"dropdown-menu drp-mnu\">\r\n");
      out.write("                                            <li> <a href=\"#\"><i class=\"fa fa-cog\"></i> Settings</a> </li> \r\n");
      out.write("                                            <li> <a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a> </li> \r\n");
      out.write("                                            <li> <a href=\"#\"><i class=\"fa fa-sign-out\"></i> Logout</a> </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"nofitications-dropdown\">\r\n");
      out.write("                        <li class=\"dropdown head-dpdn\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><img src=\"images/msg.png\" width=\"30px\"><span class=\"badge\">3</span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu anti-dropdown-menu\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"notification_header\">\r\n");
      out.write("                                        <h3>You have 3 new messages</h3>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"#\">\r\n");
      out.write("                                        <div class=\"user_img\"><img src=\"images/1.png\" alt=\"\"></div>\r\n");
      out.write("                                        <div class=\"notification_desc\">\r\n");
      out.write("                                            <p>Erandi Atapattu </p>\r\n");
      out.write("                                            <p><span>1 hour ago</span></p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"clearfix\"></div>\t\r\n");
      out.write("                                    </a></li>\r\n");
      out.write("                                <li class=\"odd\"><a href=\"#\">\r\n");
      out.write("                                        <div class=\"user_img\"><img src=\"images/2.png\" alt=\"\"></div>\r\n");
      out.write("                                        <div class=\"notification_desc\">\r\n");
      out.write("                                            <p>Reshani Mihirika </p>\r\n");
      out.write("                                            <p><span>1 hour ago</span></p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"clearfix\"></div>\t\r\n");
      out.write("                                    </a></li>\r\n");
      out.write("                                <li><a href=\"#\">\r\n");
      out.write("                                        <div class=\"user_img\"><img src=\"images/3.png\" alt=\"\"></div>\r\n");
      out.write("                                        <div class=\"notification_desc\">\r\n");
      out.write("                                            <p>Nishani Abeysinghe </p>\r\n");
      out.write("                                            <p><span>1 hour ago</span></p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"clearfix\"></div>\t\r\n");
      out.write("                                    </a></li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"notification_bottom\">\r\n");
      out.write("                                        <a href=\"#\">See all messages</a>\r\n");
      out.write("                                    </div> \r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown head-dpdn\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\"><img src=\"images/bell.png\" width=\"30px\"><span class=\"badge blue\">3</span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu anti-dropdown-menu\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"notification_header\">\r\n");
      out.write("                                        <h3>You have 3 new notification</h3>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"#\">\r\n");
      out.write("                                        <div class=\"user_img\"><img src=\"images/2.png\" alt=\"\"></div>\r\n");
      out.write("                                        <div class=\"notification_desc\">\r\n");
      out.write("                                            <p>Erandi Atapattu </p>\r\n");
      out.write("                                            <p><span>1 hour ago</span></p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"clearfix\"></div>\t\r\n");
      out.write("                                    </a></li>\r\n");
      out.write("                                <li class=\"odd\"><a href=\"#\">\r\n");
      out.write("                                        <div class=\"user_img\"><img src=\"images/1.png\" alt=\"\"></div>\r\n");
      out.write("                                        <div class=\"notification_desc\">\r\n");
      out.write("                                            <p>Reshani Mihirika </p>\r\n");
      out.write("                                            <p><span>1 hour ago</span></p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"clearfix\"></div>\t\r\n");
      out.write("                                    </a></li>\r\n");
      out.write("                                <li><a href=\"#\">\r\n");
      out.write("                                        <div class=\"user_img\"><img src=\"images/3.png\" alt=\"\"></div>\r\n");
      out.write("                                        <div class=\"notification_desc\">\r\n");
      out.write("                                            <p>Nishani Abeysinghe </p>\r\n");
      out.write("                                            <p><span>1 hour ago</span></p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"clearfix\"></div>\t\r\n");
      out.write("                                    </a></li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"notification_bottom\">\r\n");
      out.write("                                        <a href=\"#\">See all notifications</a>\r\n");
      out.write("                                    </div> \r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\t\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"clearfix\"> </div>\t\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- //header-ends -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div id=\"page-wrapper\">\r\n");
      out.write("\t\t\t<div class=\"main-page\">\r\n");
      out.write("\t\t\t\t<div class=\"login-form\">\r\n");
      out.write("\t\t\t\t\t<h4>Edit Your Profile</h4>\r\n");
      out.write("\t\t\t\t\t<h5><strong></strong></h5>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display:block; margin:auto; width:30%;\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/logo.png\" id=\"output\" width=\"130\" height=\"130\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display:block; margin:auto; width:45%;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"file\" accept=\"image/*\" onchange=\"loadFile(event)\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t  var loadFile = function(event) {\r\n");
      out.write("\t\t\t\t\t\t    var output = document.getElementById('output');\r\n");
      out.write("\t\t\t\t\t\t    output.src = URL.createObjectURL(event.target.files[0]);\r\n");
      out.write("\t\t\t\t\t\t  };\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t    <br/><br/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"newname\" placeholder=\"Enter your name here\" required>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<br/><br/><br/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t<button style=\"background-color:#FF9D26; border:none;\" class=\"btn btn-info btn-block\" type=\"submit\"><strong>Set</strong></button>\r\n");
      out.write("\t\t\t\t\t\t<input style=\"background-color:FFC682; border:none;\" class=\"btn btn-info btn-block\" type=\"reset\" id=\"reset\">\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"copy-section\">\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t<!-- Classie -->\r\n");
      out.write("\t\t\t\t<script src=\"js/classie.js\"></script>\r\n");
      out.write("\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\tvar menuLeft = document.getElementById( 'cbp-spmenu-s1' ),\r\n");
      out.write("\t\t\t\t\t\tshowLeftPush = document.getElementById( 'showLeftPush' ),\r\n");
      out.write("\t\t\t\t\t\tbody = document.body;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tshowLeftPush.onclick = function() {\r\n");
      out.write("\t\t\t\t\t\tclassie.toggle( this, 'active' );\r\n");
      out.write("\t\t\t\t\t\tclassie.toggle( body, 'cbp-spmenu-push-toright' );\r\n");
      out.write("\t\t\t\t\t\tclassie.toggle( menuLeft, 'cbp-spmenu-open' );\r\n");
      out.write("\t\t\t\t\t\tdisableOther( 'showLeftPush' );\r\n");
      out.write("\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tfunction disableOther( button ) {\r\n");
      out.write("\t\t\t\t\t\tif( button !== 'showLeftPush' ) {\r\n");
      out.write("\t\t\t\t\t\t\tclassie.toggle( showLeftPush, 'disabled' );\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t<!-- Bootstrap Core JavaScript --> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t\t\t<!--scrolling js-->\r\n");
      out.write("\t\t\t\t<script src=\"js/jquery.nicescroll.js\"></script>\r\n");
      out.write("\t\t\t\t<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\t\t\t\t<!--//scrolling js-->\r\n");
      out.write("</body>\r\n");
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
