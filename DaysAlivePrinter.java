import javax.swing.*;
public class DaysAlivePrinter
{
   public static void q1()
   {
      int year =Integer.parseInt( JOptionPane.showInputDialog(null,"mybirthyear:"));
      int day = Integer.parseInt(JOptionPane.showInputDialog(null,"mybirthDay:"));
      int month = Integer.parseInt(JOptionPane.showInputDialog(null,"mybirthMonth:"));
      
      Day GG = new Day(year,month,day);
      //call day class and their function
      Day n = new Day();
      
      JOptionPane.showMessageDialog(null, "today=" +"\n"+ n.getYear() +"\n"+ n.getMonth() +"\n"+ n.getDate());
      JOptionPane.showMessageDialog(null,"ı have live"+ n.daysFrom(GG)+" days until this today");
      
   }
}
