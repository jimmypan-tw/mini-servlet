import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/myAnnotationServlet")
public class AnnotationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("AnnotationServlet 在處理 get 請求...");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html; charset=utf-8");
        out.println("<strong>Annotation Servlet!</strong><br>");
    }

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("AnnotationServlet 在處理 post 請求...");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html; charset=utf-8");
        out.println("<strong>Annotation Servlet!</strong><br>");
    }
}