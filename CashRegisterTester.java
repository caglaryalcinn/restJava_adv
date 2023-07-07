import javax.swing.*;

public class CashRegisterTester {
    
    public static void q2() {
      double fiyat2 =Integer.parseInt( JOptionPane.showInputDialog(null,"penprice:"));
      double fiyat = Integer.parseInt(JOptionPane.showInputDialog(null,"notebookprice:"));
      double para = Integer.parseInt(JOptionPane.showInputDialog(null,"ı gave this amaount of TL to the casshier:"));
      
      double GG = para - (fiyat +fiyat2);
      
      //call cash class their funciton
      Cash n = new Cash();
      //construcy if else condition for situation of less money
      if(GG<0){  
            JOptionPane.showMessageDialog(null,"your money is unsufficien");
}else{  
        JOptionPane.showMessageDialog(null,"the casshier gave "+"GG"+"as change");

}  
      
      
      
    }
}