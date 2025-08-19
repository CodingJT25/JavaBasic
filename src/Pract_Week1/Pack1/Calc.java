package Pract_Week1.Pack1;
import javax.swing.JOptionPane;

public class Calc {
    public static void main(String[] args) {
        
        int num1 = 16;
        int num2 = 4;
        final double piNum = 3.14;
        
        //Verschiedene Berechnungen
        int add = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        double mult_pi = piNum * num1;
        
        //Ausgabe der Ergebnise in einer UI
        JOptionPane.showMessageDialog(null,"Ergebnise der Berechnungen:\n - Addition:"+add+ 
                                                      "\n - Subtraktion:"+sub+
                                                      "\n - Multiplikation:"+mult+
                                                      "\n - Division:"+div+
                                                      "\n - Multiplikation mit PI:"+mult_pi);
    
    }
}
