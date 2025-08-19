package Pract_Week1.Pack1;
import javax.swing.JOptionPane;

public class Zeit {
    public static void main(String[] args) {
        final long milSec = Long.parseLong(JOptionPane.showInputDialog("Millisekunden:"));
        final double sec = milSec/1000.0;
        final double min = sec/60.0;
        final double hour = min/60.0;
        final double day = hour/24.0;
        final double year = day/365.2425;
        
        double day_Mod = day % 365.2425;
        double hour_Mod = (day_Mod%1)*24;
        double min_Mod = (hour_Mod%1)*60;
        double sec_Mod = (min_Mod%1)*60;
        double mil_Mod = (sec_Mod%1)*1000;
        
        System.out.println(milSec+" Milisekunden sind:");        
        System.out.println((int)year+" Jahre,");
        System.out.println((int)day_Mod+" Tage,");
        System.out.println((int)hour_Mod+" Stunden,");
        System.out.println((int)min_Mod+" Minuten,");
        System.out.println((int)sec_Mod+" Sekunden,");
        System.out.println((int)mil_Mod+" Milisekunden,");
    }
}
