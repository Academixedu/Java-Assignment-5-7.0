public class IfElse{
//Take a variable and scan value using Scanner
  // Make Conditions using if else
}
import  java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Enter number a");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        System.out.println("Enter number b");
        b=in.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }

    }
}
