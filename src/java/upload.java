import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class upload extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println(" <html>\n" +
                "<head>\n" +
                "<title>File Uploading Form</title>\n"+
                " </head>\n"  +
                "<body>\n" +
                "<h3>File Upload:</h3>"  +
                "Select a file to upload: <br/>"+ "\n" +
                "<form action=\"ServletImage\"   method=\"Get>\n"  +
                "Choose the file:<input type=\"file\" name=\"choose_file>" +
                "<br />\n" +" <tr>\n" +

                "<input type=\"submit\" value=\"Upload File\"/>\n" +

                "</form>\n" +
                "</body>\n" +
                "</html>");

    }
}
