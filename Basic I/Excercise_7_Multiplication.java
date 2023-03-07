import java.util.Scanner;

public class Excercise_7_Multiplication{
    public static void main(String[] args){
         Scanner multi = new Scanner (System.in);
         System.out.print("Input a number: ");
            int num = multi.nextInt();
            
            // System.out.println(num + "x" + 2 + "=" + num*2);
            
            for(int i = 1 ; i<=10; i++ ){
                System.out.println(num + " x " + i + " = " + num*i);
                
            }
    }
}