package destroyer;

import com.lotontech.speech.Converter;
import com.lotontech.speech.Talker;

/**
 *
 * @author Mateus
 */
public class Destroyer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        Talker talker = new Talker();
        Converter c = new Converter();
        talker.sayPhoneWord(c.getPhoneWord("mateus de paula"));
        talker.sayPhoneWord("m|a|t|e|u|s| |d|e| |P|a|u|l|a");
    }

}
