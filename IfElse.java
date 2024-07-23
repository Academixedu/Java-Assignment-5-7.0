import java.util.Scanner;

public class IfElse{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = scan.nextLine();
    System.out.println("Enter your age: ");
    int age=scan.nextInt();
    if( age>18){
      System.out.println("You can enter this site: "+name+age);
    }
    else{
      System.out.println("You cannot enter this site: "+name+age);
    }
  }
//Take a variable and scan value using Scanner
  // Make Conditions using if else
}
