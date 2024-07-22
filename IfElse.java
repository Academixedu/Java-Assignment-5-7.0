import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    if (num > 10) {
      System.out.println("The number is greater than 10");
    } else if (num == 10) {
      System.out.println("The number is equal to 10");
    } else {
      System.out.println("The number is less than 10");
    }
  }
}
