
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestCrawl {
    public static void main(String[] args) {
        try {
            URL jav = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(jav.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            System.out.println(content);
            System.out.println("----------------------");
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("a href=\"/the-gioi/(.*?)\\.htm\"> [^a-z](.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println("----------------");
                System.out.println("/the-gioi/"+m.group(1)+".htm");
                System.out.println("----------------");
                System.out.println(m.group(2));
                System.out.println("----------------");
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}
