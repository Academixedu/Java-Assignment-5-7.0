import java.util.Scanner;

public class IfElse
{
//Take a variable and scan value using Scanner
  // Make Conditions using if else

  Scanner sc= new Scanner(System.in);
   void meth1()
   {
       System.out.print("Enter the value of a :");
       int a=sc.nextInt();

       System.out.print("Enter the value of b :");
       int b=sc.nextInt();

       if (a<b)
       {
        System.out.println("The Value of b is greater : "+b);
       }
       else if(a>b)
       {
        System.out.println("The value of a is greater : "+a);
       }
       else
       {
        System.out.println("Both the Values of a & b is equal : a="+a+" b="+b);
       }
    
   }
  public static void main(String[] args) 
  {
     IfElse obj=new IfElse();
     obj.meth1();
  }
}
