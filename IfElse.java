import java.util.Scanner;

public class IfElse{
//Take a variable and scan value using Scanner
  // Make Conditions using if else
  public static void main(String []args){
    int a;
    int b;

  Scanner s= new Scanner(System.in);
  System.out.println("Enter value");
  a=s.nextInt();
  System.out.println("Enter value");
  b=s.nextInt();
  if(a>b){
    System.out.println("a is greater than b");
  }else{
    System.out.println("a is less than b");
  }

  }
}
