package org.apache.jsp.lessons.CrossSiteScripting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.owasp.webgoat.session.*;
import org.owasp.webgoat.lessons.CrossSiteScripting.CrossSiteScripting;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t<div id=\"lesson_login\">\r\n");
      out.write("\t\t<div id=\"lesson_login_txt\">\r\n");
      out.write("\t\t\t");
 
			WebSession webSession = ((WebSession)session.getAttribute("websession"));
			
      out.write("\r\n");
      out.write("\t\t\t<form id=\"form1\" name=\"form1\" method=\"post\" action=\"");
      out.print(webSession.getCurrentLesson().getFormAction());
      out.write("\">\r\n");
      out.write("\t\t\t    \t<label>\r\n");
      out.write("\t\t\t      \t<select name=\"");
      out.print(CrossSiteScripting.EMPLOYEE_ID);
      out.write("\">\r\n");
      out.write("\t\t\t      \t");

			      	//System.out.println("Retrieving employees list");
			      	List employees = (List) session.getAttribute("CrossSiteScripting." + CrossSiteScripting.STAFF_ATTRIBUTE_KEY);
			      	Iterator i = employees.iterator();
					while (i.hasNext())
					{
						EmployeeStub stub = (EmployeeStub) i.next();
					
      out.write("\r\n");
      out.write("\t\t\t      \t<option value=\"");
      out.print(Integer.toString(stub.getId()));
      out.write('"');
      out.write('>');
      out.print(stub.getFirstName() + " " + stub.getLastName() + " (" + stub.getRole() + ")");
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t                </select>\r\n");
      out.write("\t\t        </label>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t    \t<label>Password\r\n");
      out.write("\t\t\t    \t\t<input name=\"password\" type=\"password\" size=\"10\" maxlength=\"8\" />\r\n");
      out.write("\t\t\t    </label>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"action\" value=\"");
      out.print(CrossSiteScripting.LOGIN_ACTION);
      out.write("\"/>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
