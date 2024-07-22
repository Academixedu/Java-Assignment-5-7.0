
import java.util.Scanner;

public class IfElse

{
  public static void method()
  {
  Scanner s=new Scanner(System.in);
  System.out.println("enter a");
  int a=s.nextInt();
  System.out.println("enter b");
  int b=s.nextInt();
 

  if(a>b){
    System.out.println("A is Gretter the b");
  }else if(a==b) {
    System.out.println("A & B have same value");
  }else{

    System.out.println("B is Gretter the A");
  
  }


  }
 
}
