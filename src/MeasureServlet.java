import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MeasureServlet", value = "/measureCalculator")
public class MeasureServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double[] measure = Calculator.convertToM(request.getParameter("metry"), request.getParameter("centymetry"),request.getParameter("milimetry"));


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        if(measure == null){
            writer.println("Wpisz wartość: " + "<br>" + "<br>");
        } else {
            writer.println("Podana wartość w przeliczeniu na" + "<br>" + "<br>");
            writer.println("metry: " + measure[0] + "<br>");
            writer.println("centymetry: " + measure[1] + "<br>");
            writer.println("milimetry: " + measure[2] + "<br>");
        }
    }
}
