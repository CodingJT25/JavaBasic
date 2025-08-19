package Pract_Week1.Pack1;
import javax.swing.JOptionPane;

public class Durchschnitt {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Niederschlagsmenge für April:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Niederschlagsmenge für Mai:"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Niederschlagsmenge für Juni:"));
        final int numOfnum = 3;
        double divNum = (num1 + num2 + num3) / numOfnum ;
        String calcNum = String.format("%.2f", divNum);
        JOptionPane.showMessageDialog(null, "Niederschlagsmenge für Apri: " +num1+"l/qm"+
                                                            "\nNiederschlagsmenge für Mai: " +num2+"l/qm"+
                                                            "\nNiederschlagsmenge für Juni: " +num3+"l/qm"+
                                                            "\n\n Der durchschnittliche Niederschlag beträgt: "+calcNum+"l/qm", "Niederschlag", 1);
    }
}
