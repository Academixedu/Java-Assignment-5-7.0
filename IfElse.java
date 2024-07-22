import java.util.Scanner;

public class IfElse{
  //static int a;
  //static int b;
  public static void main(String[] args) {
    int a;
    int b;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter number A");
    a=scan.nextInt();
    System.out.println("Enter number B");
    b=scan.nextInt();
    if(a<b)
    {
      System.out.println("a is grater thab b");
    }
    else{
      System.out.println("b is grater thab a");
    }
      
  }
//Take a variable and scan value using Scanner
  // Make Conditions using if else
}
