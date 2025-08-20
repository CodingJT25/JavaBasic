package Pract_Week1.Pack2;

import javax.swing.JOptionPane;

public class AgeCatalog {
    public static void main(String[] args) {
        int userAge = Integer.parseInt(JOptionPane.showInputDialog("Give us your Age:"));

        if (userAge <= 12 && userAge >= 0){
            JOptionPane.showMessageDialog(null, "You are a Child", "Agecatalog", 1);
        }
        else if(userAge <= 19 && userAge > 12){
            JOptionPane.showMessageDialog(null, "You are a Teenager", "Agecatalog", 1);
        }
        else if(userAge <= 64 && userAge > 19){
            JOptionPane.showMessageDialog(null, "You are a Adult", "Agecatalog", 1);
        }
        else if(userAge > 65 && userAge <= 120){
            JOptionPane.showMessageDialog(null, "You are a Senior", "Agecatalog", 1);
        }
        else{
            JOptionPane.showMessageDialog(null, "False Input", "ERROR", 0);
        }
    }
}
