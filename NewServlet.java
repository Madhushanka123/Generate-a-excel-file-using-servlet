import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Madhushanka Chithrananda
 */
public class NewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition",
                "attachment; filename=sampleName.xls");

        PrintWriter out = response.getWriter();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                int x = 1 + (int) (Math.random() * 100);
                out.print(x + "\t");
            }
            out.println("");
        }

    }

}
