package Pract_Week1.Pack2;

import javax.swing.JOptionPane;

public class FacultyCalc {
    public static void main(String[] args) {
        int userNum = Integer.parseInt(JOptionPane.showInputDialog("Give me a Number between 0 and 10:"));
        int result = 1;
        if (userNum <=10 && userNum >0){
            for (int i = 1; i <= userNum; i++){
                result = result*i;
            }
            JOptionPane.showMessageDialog(null, userNum+"! = "+result, null, 1);
        }else if(userNum == 0){
            JOptionPane.showMessageDialog(null, userNum+"! = "+result, null, 1);
            
        }else JOptionPane.showMessageDialog(null, "False Input", "ERROR_OUT_OFF_AREA", 0);
        
        
    }
}
