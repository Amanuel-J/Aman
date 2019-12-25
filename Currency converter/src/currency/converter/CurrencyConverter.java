
package currency.converter;

import java.util.Scanner;

public class CurrencyConverter {
public double convertBirr(double amount)
{
     double birr;
   birr= (int) (amount * 30);
   System.out.println (birr + " BIRR");
   return birr;
}
public double convertYen(double amount)
{
     double yen;
   yen= (int) (amount * 4);
   System.out.println (yen + " BIRR");
   return yen;
}
public double convertEuro(double amount)
{
    double euro;
      euro= (int) (amount * 1.5);
   System.out.println (euro + " BIRR");
   return euro;
}
    public static void main(String[] args) {
        CurrencyConverter cc=new CurrencyConverter();
   Scanner scan = new Scanner (System.in);  
   double OriginalAmount;
   System.out.print("Enter the dollar amount: ");
   OriginalAmount= scan.nextDouble();
   System.out.println("That's Equivalent to: ");
   cc.convertEuro(OriginalAmount);
   cc.convertBirr(OriginalAmount);
   cc.convertYen(OriginalAmount);
    }
    
}