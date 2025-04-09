package org.example;

//import java.io.*;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.io.IOException;
import javax.swing.JOptionPane;


public class Dialog {
    Dialog(){
        System.out.println("dialog constructed");
    }
    public void test(){
        Object[] options = {"Option 1", "Option 2", "Cancel"};
        int choice = JOptionPane.showOptionDialog(null, "Choose one", "Custom Dialog", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        Object[] possibilities = {"ham", "spam", "yam"};
        String s = (String)JOptionPane.showInputDialog(
                    null,//frame,
                    "Complete the sentence:\n"
                    + "\"Green eggs and...\"",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    null,//icon,
                    possibilities,
                    "ham");

        JOptionPane.showMessageDialog(null, String.format("User chose %d and %s", choice, s), "Title", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("User chose: " + choice);
    }
    public void annoying(){
        while(true){
            Object[] options = {"Not sure", "No", "Yes"};
            Object[] options2 = {"Not sure", "No", "Yes"};
            int choice = JOptionPane.showOptionDialog(null, "Have you donated", "Dialog", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            if(choice==2){
                int choice2 = JOptionPane.showOptionDialog(null, "Are you sure", "Dialog", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options2, options2[0]);
                if(choice2==2)break;
            };
        };
        JOptionPane.showMessageDialog(null, "Thanks for donating", "Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
}
