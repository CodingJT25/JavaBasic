package Pract_Week1.Pack2;

import javax.swing.JOptionPane;

public class ASCIIabc {
    public static void main(String[] args) {
        String result = "";
        for (int i = 65; i <= 90; i++ ){
            char asciiCode = (char)i;
            result += asciiCode;
            result += "\n"; 
        }
        JOptionPane.showMessageDialog(null, result, "Result", 1);
    }
}
