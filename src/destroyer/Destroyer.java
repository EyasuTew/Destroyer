package destroyer;

import com.lotontech.speech.Converter;
import com.lotontech.speech.Talker;
import destroyer.nucleo.Central;
import destroyer.nucleo.transmisores.Neuronio;
import destroyer.nucleo.transmisores.TipoNeuronio;
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
        Neuronio n = new Neuronio(TipoNeuronio.SENSITIVO, "Quem é Mateus Veloso");
        Central central = new Central(n);
        central.iniciar();
        Neuronio resultado = central.getResultado();
        System.out.println("R : " + resultado.getResposta());
        
//        System.out.println("Hello World");
//        Talker talker = new Talker();
//        Converter c = new Converter();
//        talker.sayPhoneWord(c.getPhoneWord("mateus de paula"));
//        talker.sayPhoneWord("m|a|t|e|u|s| |d|e| |P|a|u|l|a");
    }
    

}
