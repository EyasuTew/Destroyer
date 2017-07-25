/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Jean
 */
public class Teste {

    public static void main(String[] argv) {
        voce.SpeechInterface.init("C:\\Users\\Jean\\Documents\\NetBeansProjects\\voce-0.9.1\\lib", true, false, "", "");

        voce.SpeechInterface.synthesize("This is a speech synthesis test.");
        voce.SpeechInterface.synthesize("Type a message to hear it spoken "
                + "aloud.");

        System.out.println("This is a speech synthesis test.  "
                + "Type a message to hear it spoken aloud.");
        System.out.println("Type 's' + 'enter' to make the "
                + "synthesizer stop speaking.  Type 'q' + 'enter' to quit.");

        BufferedReader console
                = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = "";
            while (!s.equals("q")) {
                // Read a line from keyboard.
                s = console.readLine();

                if (s.equals("s")) {
                    voce.SpeechInterface.stopSynthesizing();
                } else {
                    // Speak what was typed.
                    voce.SpeechInterface.synthesize(s);
                }
            }
        } catch (java.io.IOException ioe) {
            System.out.println("IO error:" + ioe);
        }

        voce.SpeechInterface.destroy();
        System.exit(0);
    }

}
