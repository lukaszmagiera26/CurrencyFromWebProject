package pl.parser.nbp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlToText {

    public String urlToText(String URL) throws IOException {
        URL url = new URL( URL );
        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        String text = null;
        while ((line = br.readLine()) != null) {
            text = line;
        }
return text;
    }
}
