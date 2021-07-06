import sun.plugin.com.Dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ConverterServlet", urlPatterns = "/convert")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        convert(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

}

    public void  convert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        if(request.getParameter("usd") == "" | request.getParameter("rate")==""){
            response.sendRedirect("index.jsp");
        } else {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("converter.jsp");
            requestDispatcher.forward(request,response);
        }

    }
}
