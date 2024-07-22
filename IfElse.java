import java.util.Scanner;

public class IfElse{
//Take a variable and scan value using Scanner
  // Make Conditions using if else
  public static void main(String[] args) {
  int aa;
  int bb;
  Scanner sc =new Scanner(System.in);
  System.out.println("enter aa value");
  aa=sc.nextInt();
  System.out.println("enter bb value");
  bb=sc.nextInt();
  if(aa<bb){
    System.out.println("aa is lessthan bb");
  }else{
    System.out.println("bb is lessthan aa");
  }
  

  }
}
