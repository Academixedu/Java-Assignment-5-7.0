import java.util.Scanner;

public class IfElse{
  public static void main(String[] args) {
    
  
//Take a variable and scan value using Scanner
  // Make Conditions using if else
  int a ;
  int b ;
  System.out.println("Enter a value of a");{
  Scanner sc = new Scanner(System.in);
  a = sc.nextInt();
  System.out.println("Enter a value of B");
  b = sc.nextInt();
  if (a<=b){
    System.out.println("IS A greater than B");

  }
  else{
    System.out.println("is B greater than A");
  }
  
}
}}