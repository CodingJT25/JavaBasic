package Pract_Week1.Pack1;
import javax.swing.JOptionPane;

public class Modulo {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Gib mir die Erste Zahl:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Gib mir die Zweite Zahl:"));
        int calcNum = num1 % num2;
        JOptionPane.showMessageDialog(null, "Der Rest bei der Division aus "+num1+" und "+num2+" ist: "+calcNum, "Ergebnis", 1);
    }
}
