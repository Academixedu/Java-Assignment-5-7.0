// Scanner Implementations

import java.util.Scanner;

public class Main
{
    public void method8()
    {
        Scanner aobj=new Scanner(System.in);
       
        System.out.println("Enter your int number = ");
         int a=aobj.nextInt();

         System.out.println("Enter Your String Value = ");
        Float b=aobj.nextFloat();

        aobj.nextLine();
        System.out.println("Enter your String value = ");
        String c=aobj.nextLine();
        
        System.out.println("Enter your int number = "+a);
        System.out.println("Enter Your String Value = "+b);
        System.out.println("Enter your String value = "+c);
       


    }
    public static void main(String[] args) {
        new Main().method8(); 
    }
    
}