
// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;
public class Exercise_6{
    public static void main (String[] args){
         Scanner all = new Scanner(System.in);
         System.out.print("Enter your First Number : ");
         int num1 =all.nextInt();
         System.out.print("Enter Your Second Number : ");
         int num2 =all.nextInt();
         int sum = num1 + num2;
         System.out.println(num1 + " + " +  num2 + " = "+ sum);
         int sub = num1 - num2;
         System.out.println(num1 + " - " +  num2 + " = "+ sub);
         int mul = num1 * num2;
         System.out.println(num1 + " * " +  num2 + " = "+ mul);
         int div = num1 / num2;
         System.out.println(num1 + " / " +  num2 + " = "+ div);
         int mod = num1 % num2;
         System.out.println(num1 + " % " +  num2 + " = "+ mod);

    }
}