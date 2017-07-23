package First;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Mandeep on 6/26/2017.
 */
public class Form extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("REGISTATION FORM");
        response.setContentType("text/html");

        PrintWriter set= response.getWriter();

        out.println("<html>\n <title>Registation First.Form </title> <body>\n <form action = \"MainForm\" method = \"GET\">\n" +

                "First name: <input type = \"text\" name = \"first_name\">\n" +
                "<br /><br/>\n" +
                 "Middle name: <input type=\"text\" name=\"middle_word\">\n" + "<br/><br/>\n" +
                "last name: <input type = \"text\" name = \"last_word\">\n" + "<br/><br/>\n" +
                "Address: <input type = \"text\" name = \"address\">\n" +
                "<br /> <br/>\n" +
                "Gender: <input type = \"text\" name= \"gender\">\n" + "<br /><br/>\n" +
                "email id: <input type = \"text\" name = \"email_id\">\n"+ "<br /><br/>\n" +
                "<br />\n" +
                "phone no: <input type = \"Integer\" name= \"number\">\n" +
                "<br /><br/>\n" +
                "<input type = \"submit\" value = \"Signup\"/>\n" +
                "</form>\n"+
                "</body>\n"+
                "</html>");

    }
}
