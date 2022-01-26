package sec06.ex01;

import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

// initParam은 web.xml에서 설정이 가능은 함
@WebServlet(name = "InitParamServlet", urlPatterns = {"/sInit", "/sInit2"}, initParams = {
    @WebInitParam(name = "email", value = "admin@jweb.com"),
    @WebInitParam(name = "tel", value = "010-1111-2222")})
public class InitParamServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        String email = getInitParameter("email");
        String tel = getInitParameter("tel");

        out.print("<html><body>");
        out.print("<table><tr>");
        out.print("<td>email: </td><td>" + email + "</td></tr>");
        out.print("<tr><td>휴대전화: </td><td>" + tel + "</td>");
        out.print("</tr></table></body></html>");
    }
}
