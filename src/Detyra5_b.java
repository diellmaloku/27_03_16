import javax.swing.*;
public class Detyra5_b {
/** product e llogarit prodhimin e a*(a+1)*(a+2)*...*b
* paramenti a - numri i plote fillues i prodhimit
* parametri b - numri i plote mbarues i prodhimit */
   public int product(int a, int b)
   { int total = 1;
      if ( a <= b )
      { total = a;
         int count = a;
         while ( count != b )
         // totali == a * (a+1) * ...deri ne... * i
         { count = count + 1;
            total = total * count;
            System.out.println(total);
         }
      // totali == a * (a+1) * (a+2) * ... * b == product(a, b)
      }
      return total;
   }
   public static void main(String[]args)  {
      int a = new Integer(JOptionPane.showInputDialog("shkruaje numrin e pare")).intValue();
      int b = new Integer(JOptionPane.showInputDialog("shkruaje numrin e dyte")).intValue();
      {new Detyra5_b().product(a,b);}
   }
}
