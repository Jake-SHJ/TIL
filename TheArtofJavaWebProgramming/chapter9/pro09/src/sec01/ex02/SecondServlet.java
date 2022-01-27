package sec01.ex02;

import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        System.out.println("init 메서드 호출");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String user_id = request.getParameter("user_id");
        String user_pw = request.getParameter("user_pw");
        String user_address = request.getParameter("user_address");

        out.println("<html><body>");
        if (user_id != null && user_id.length() != 0) {
            out.println("이미 로그인 상태입니다!<br><br>");
            out.println("첫 번째 서블릿에서 넘겨준 아이디: " + user_id + "<br>");
            out.println("첫 번째 서블릿에서 넘겨준 비밀번호: " + user_pw + "<br>");
            out.println("첫 번째 서블릿에서 넘겨준 주소: " + user_address + "<br>");
            out.println("</body></html>");
        } else {
            out.println("로그인 하지 않았습니다.<br><br>");
            out.println("다시 로그인하세요!!<br>");
            out.println("<a href='/login.html'>로그인창으로 이동하기 </>");
        }
    }

    public void destroy() {
        System.out.println("destroy 메서드 호출");
    }
}
