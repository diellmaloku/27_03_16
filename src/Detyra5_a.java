import javax.swing.*;
public class Detyra5_a {
   public int summation(int i)
   { int total = 0;
      int count = 0; // numeron deri ne i
      while ( count != i )
      // totali == 0+1+...deri te...+count
      { count = count + 1;
         total = total + count;  
         System.out.println(total);
      }
   // totali == 0+1+...deri ne...+i
      return total;
   }
   public static void main(String[]args)
   {int a = new Integer(JOptionPane.showInputDialog("shkruaje numrin e pare")).intValue();
      {new Detyra5_a().summation(a);}
   }  
}