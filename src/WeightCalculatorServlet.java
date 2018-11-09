import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WeightCalculatorServlet",value = "/weightCalculator")
public class WeightCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double[] weight = Calculator.convertToW(request.getParameter("kilogramy"), request.getParameter("gramy"), request.getParameter("miligramy") );

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        if(weight == null) {
            writer.println("Wpisz wartość:" + "<br>" + "<br>");
        } else {
            writer.println("Podana wartość w przeliczeniu na" + "<br>" + "<br>");
            writer.println("kilogramy: " + weight[0] + "<br>");
            writer.println("gramy: " + weight[1] + "<br>");
            writer.println("miligramy: " + weight[2] + "<br>");
        }
    }
}
