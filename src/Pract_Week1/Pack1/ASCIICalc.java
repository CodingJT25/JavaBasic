package Pract_Week1.Pack1;
import javax.swing.JOptionPane;

public class ASCIICalc {
    public static void main(String[] args) {
        String uInput = JOptionPane.showInputDialog("Welcher Zeichen soll umgewandelt werden"); 
        int ascii = (int)uInput.charAt(0);
        JOptionPane.showMessageDialog(null, uInput+" ist in ASCII " +ascii, "Umwandler", 1);
    }
}
