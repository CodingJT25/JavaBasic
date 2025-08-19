package Pract_Week1.Pack2;

import javax.swing.JOptionPane;

public class DataCalc {
    public static void main(String[] args) {
        double userNum = Double.parseDouble(JOptionPane.showInputDialog("Gib die Größe in Kilobyte ein:"));
        double calcByte = userNum*1024.0;
        double calcMb = userNum/1024.0;
        if (userNum > 0){
            JOptionPane.showMessageDialog(null,userNum+" Kilobyte sind:\n"+
            String.format("Megabyte: %.2f\nByte: %.2f", calcMb,calcByte), "Datengröße berechnen", 1);
        }
        else if(userNum<0){
            JOptionPane.showMessageDialog(null, "FEHLER: Die Zahl ist Negativ!", "ERROR", 0);
        }
    }
}
