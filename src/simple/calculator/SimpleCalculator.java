package simple.calculator;
import java.util.Scanner;

public class SimpleCalculator {


    public static void main(String[] args) {
        int a, b, sum;
        Scanner add = new
            Scanner(System.in);
        System.out.print("Enter first num: ");
        a = add.nextInt();
        
        System.out.print("Enter second num: ");
        b = add.nextInt();
        
        sum = a + b;
        
        System.out.println("the sum is: " + sum);
            

    }
    
}
