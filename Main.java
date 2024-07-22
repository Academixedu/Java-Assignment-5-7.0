import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integerInput = sc.nextInt();
        System.out.println("Entered integer: " + integerInput);

        System.out.print("Enter a float number: ");
        float floatInput = sc.nextFloat();
        System.out.println("Entered float: " + floatInput);
      
        System.out.print("Enter a double number: ");
        double doubleInput = sc.nextDouble();
        System.out.println("Entered double: " + doubleInput);

        sc.nextLine(); 
        System.out.print("Enter a string: ");
        String stringInput = sc.nextLine();
        System.out.println("Entered string: " + stringInput);

        System.out.print("Enter true or false: ");
        boolean booleanInput = sc.nextBoolean();
        System.out.println("Entered boolean: " + booleanInput);
    }
}
