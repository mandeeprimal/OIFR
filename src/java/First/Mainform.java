package First;

import ioe.dao.impl.IOEDAOIMPL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import oifr.DAO.ioeDAO;

/**
 * Created by Mandeep on 6/26/2017.
 */
public class Mainform extends HttpServlet {
    
    private ioeDAO ioedao = new IOEDAOIMPL();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>\n" +
                "<body bgcolor=\"#ffffff\">\n" +
                "<ul>\n" +
                "  <li><b>Email id</b>: "
                + request.getParameter("email_id") + "\n" +
                "  <li><b>password</b>: "
                + request.getParameter("pass_word") + "\n" +
                "</ul>\n" +
                "</body></html>");



    }

    
    
}
