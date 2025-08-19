package Pract_Week1.Pack1;
import javax.swing.JOptionPane;

public class Geometri {
    public static void main(String[] args) {
        double hight = Double.parseDouble(JOptionPane.showInputDialog("Länge:"));
        double length = Double.parseDouble(JOptionPane.showInputDialog("Breite:"));
        String unitMes = JOptionPane.showInputDialog("Masseinheit:");
        double calcU = 2*hight+2*length;
        double calcS = hight*length;
        JOptionPane.showMessageDialog(null, "Länge "+hight+unitMes+
                                                            "\nBreite " +length+unitMes+
                                                            "\n\nUmfang "+calcU+unitMes+
                                                            "\nFläche"+calcS+unitMes, "Umfang und Fläche berechnen", 1);
    }
}
