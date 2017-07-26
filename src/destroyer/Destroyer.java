package destroyer;

import com.lotontech.speech.Converter;
import com.lotontech.speech.Talker;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Mateus
 */
public class Destroyer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        InputStream is = Destroyer.class.getResourceAsStream("sites.properties");
        Properties prop = new Properties();
        prop.load(is);
        String url = prop.getProperty("nome_proprio");
        
        Document page = Jsoup.parse(new URL(url + "mateus").openStream(), "UTF-8", url);
        String significado = page.getElementById("significado").getElementsByTag("p").get(0).text();
        System.out.println(significado);
        
        
//        System.out.println("Hello World");
//        Talker talker = new Talker();
//        Converter c = new Converter();
//        talker.sayPhoneWord(c.getPhoneWord("mateus de paula"));
//        talker.sayPhoneWord("m|a|t|e|u|s| |d|e| |P|a|u|l|a");
    }
    

}
