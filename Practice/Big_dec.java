import java.math.BigDecimal;
// the BigInteger class allows representation of and calculations on arbitrarily large integers 
// (whole numbers);
// the BigDecimal class allows precise representation of any real number that can be represented
//  precisely in decimal notation, and allows calculations on non-integers with arbitrary precision.
// It's important to note that "arbitrary" precision or number of digits does not mean "unlimited": 
// t means that the number of digits in a number or number of digits of precision in a calculation is
//  limited by memory and/or defined limits
//  to precision that we specify. In simple cases, we use BigInteger and BigDecimal was follows:
import java.math.BigInteger;

public class Big_dec {
    public static void main(String[] args) {

      BigDecimal m;
      BigInteger x;

      BigDecimal bd1 =  
               new BigDecimal("124567890.0987654321"); 
        BigDecimal bd2 =  
               new BigDecimal("987654321.123456789"); 
          
        // Addition of two BigDecimals 
        bd1 = bd1.add(bd2); 
        System.out.println("BigDecimal1 = " + bd1); 

         // Division of two BigDecimals 
         bd1 = bd1.divide(bd2); 
         System.out.println("BigDecimal1 = " + bd1); 
         //Non-terminating decimal expansion; no exact representable decimal result.
   


    }
}