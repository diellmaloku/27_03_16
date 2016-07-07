import javax.swing.*;
public class Detyra5_d  {
   public long factorial(int m) {
      long fact=0;
      if (m>=0&&m<20)
      { int count = 0; 
         fact = 1;
         while ( count != m )
         // fact == 1*2*...deri te...*count
         { count = count + 1;
            fact = fact * count;
            
         }
      // fact == factorial(n)
      }
      return fact;
   }

   public double sinus(double x)
   { double sin = x;
      int count = 3;
      while ( count <= 19 )
      // sin == x - (x^3/3!) +...deri te...(x^(count-2)/(count-2)!)
      { double d = Math.pow(x, count) / factorial(count);
         if ( (count % 4) == 3 )
         { sin = sin - d;
            System.out.println("Sinusi eshte "+sin); }
         else { sin = sin + d; }
         count = count + 2;
      }
      return sin;
   }
   public double cosinus(double x)
   { double cos = x;
      int count = 2;
      while ( count <= 19 )
      // sin == x - (x^2/2!) +...deri te...(x^(count-1)/(count-1)!)
      { double c = Math.pow(x, count) / factorial(count);
         if ( (count % 4) == 2 )
         { cos = cos - c;
            System.out.println("Kosinusi eshte "+cos); }
         else { cos = cos + c; }
         count = count + 2;
      }
      return cos;
   }
   
   
   
   public static void main(String[]args)  {
      double a = new Double(JOptionPane.showInputDialog("shkruaje numrin")).doubleValue();
      {new Detyra5_d().sinus(a);
         new Detyra5_d().cosinus(a);}
   }
   
}