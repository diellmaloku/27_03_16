import javax.swing.*;
public class Detyra5_c  {
// factorial e llogarit n!

   public long factorial(int m) {
      long fact=0;
      if (m>=0)
      { int count = 0; 
         fact = 1;
         while ( count != m )
         // fact == 1*2*...deri te...*numeruesi
         { count = count + 1;
            fact = fact * count;
            System.out.println(fact);
         }
      // fact == factorial(n)
      }
      return fact;
   }
   public static void main(String[]args)  {
      int a = new Integer(JOptionPane.showInputDialog("shkruaje numrin")).intValue();
      {new Detyra5_c().factorial(a);}
   }
}