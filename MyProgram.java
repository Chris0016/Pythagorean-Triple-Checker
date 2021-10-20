import java.lang.*;
import java.util.Scanner;
import java.lang.Math;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("       Pythagorean Triple check");
        while(true)
        {
        System.out.print("Enter \"a\" number: ");
        double num1;
        while (true){
            try{
             num1 = input.nextDouble();
             break;
            }
            catch( Exception e){
                System.out.println("Not a number");
                System.out.print("Enter \"a\" number: ");
            }
            input.nextLine();
        }
        
        System.out.print("Enter \"b\" number: ");
        double num2;
        while (true){
            try{
             num2 = input.nextDouble();
             break;
            }
            catch( Exception e){
                System.out.println("Not a number");
                System.out.print("Enter \"b\" number: ");
            }
            input.nextLine();
        }
        
        
        
        System.out.print("Enter \"c\" number ");
       double num3;
        while (true){
            try{
             num3 = input.nextDouble();
             break;
            }
            catch( Exception e){
                System.out.println("Not a number");
                System.out.print("Enter \"c\" number: ");
            }
            input.nextLine();
        }
        
        
        if (check(num1, num2, num3)){
            System.out.println("The values a = "+ num1 + " b = " + num2 + " c = " + num3 +" create a pythagorean triple!!");
            System.out.println( Math.pow(num1,2) + " + " + Math.pow(num2,2) +  "  =  "+ Math.pow(num3,2));
        }
        else{
            System.out.println("Not a pythagorean triple");
            
        }
         System.out.print("Try again?(n to quit) ");
        char cont = input.next().charAt(0);
        
        if (cont== 'n'){
            break;
        }
        
    }
        
    }
    public static boolean check(double a, double b , double c){
        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) )  {
            return true;
        }
        return false;
    }
}

/* 
Pythgoran triple: a^2 + b^2 = c^2 
This program is a very simple mathematical code used to check if a set of numbers form a pythagorean triple

*/