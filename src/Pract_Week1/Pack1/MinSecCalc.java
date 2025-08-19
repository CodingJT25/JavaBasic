package Pract_Week1.Pack1;
import javax.swing.JOptionPane;
public class MinSecCalc {
    public static void main(String[] args) {
        int minNum = Integer.parseInt(JOptionPane.showInputDialog("Anzahl der Minuten:"));
        int calcSec = minNum * 60;
        JOptionPane.showMessageDialog(null, "Das sind "+calcSec+" Sekunden", null, 1);
    }
    
    
}
