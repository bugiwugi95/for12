import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task10 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("ListHtml");
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.println("<ul>");
        for (int i = 1; i <= 100; i++) {
            writer.println("<li> " + i + "element </li>");
        }
        writer.println("</ul>");
        writer.close();
    }
}