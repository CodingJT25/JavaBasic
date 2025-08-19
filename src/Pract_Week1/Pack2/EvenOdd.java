package Pract_Week1.Pack2;

import javax.swing.JOptionPane;

public class EvenOdd {
    public static void main(String[] args) {
        //Der User Input wird in userNum abgespeichert
        int userNum = Integer.parseInt(JOptionPane.showInputDialog("Gibt mir eine Zahl zum prüfen"));

        //Es wird auf Gerade oder Ungerade Zahl geprüft
        if (userNum%2 == 0){
            JOptionPane.showMessageDialog(null, "Deine Zahl "+userNum+" ist eine gerade Zahl", "Gerade oder ungerade", 1);
        }
        else {
            JOptionPane.showMessageDialog(null, "Deine Zahl "+userNum+" ist eine ungerade Zahl", "Gerade oder ungerade", 1);
        }
    }
}
