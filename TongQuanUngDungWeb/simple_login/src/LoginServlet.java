import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        login(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        login(request, response);
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");



//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//
        if ("admin".equals(username) && "admin".equals(password)) {
            request.setAttribute("userConvert", username);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("user.jsp");
            requestDispatcher.forward(request, response); //?
        } else {
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            response.sendRedirect("index.jsp");
        }

//        writer.println("</html>");
    }
}
// xu ly chuyen page tai controller, co 2 view jsp: 1 cho login, 2 cho error login. khong phai dung PrintWriter