package Pract_Week1.Pack2;

import javax.swing.JOptionPane;

public class Club {
    public static void main(String[] args) {    
        String ageConfirm = JOptionPane.showInputDialog("Are you 18 or older?").toLowerCase();        
        if (ageConfirm.equals("yes")){            
            String vipConfirm = JOptionPane.showInputDialog("Are you an VIP?").toLowerCase();
            String genderConfirm = JOptionPane.showInputDialog("Are you a Women?").toLowerCase();
            if (vipConfirm.equals("yes") && genderConfirm.equals("yes")) {
                JOptionPane.showMessageDialog(null, "You are getting VIP-Access and a 15% discount on Drinks",
                    "Access", 1);     
            }
            else if(vipConfirm.equals("yes") && genderConfirm.equals("no")){
                JOptionPane.showMessageDialog(null, "You are getting VIP-Access",
                "VIP",1);
            }
            else if(vipConfirm.equals("no") && genderConfirm.equals("yes")){
                JOptionPane.showMessageDialog(null, "You are getting Access and a 15% discount on Drinks", 
                "Access discount", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "You are getting Access", "Access", 1);
            }            
        }
        else if(ageConfirm.equals("no")){
            JOptionPane.showMessageDialog(null, "You cant come in!", "Denide", 0);
        }
    }
}
