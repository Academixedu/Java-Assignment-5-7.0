import java.util.Scanner;
public class Main{

    // Void function
    public void mFunction()
     {
        System.out.println("Void function called");
    }
    // Function with parameters and return type
    public int mFunction(int a, int b) {
        int sum = a + b;
        System.out.println("Function with parameters and return type called. Sum: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);

        // Call the void function
        m.mFunction();

        // Call the function with parameters and return type
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int result=m.mFunction(a,b);
        System.out.println(" sum is: " + result);
    }
}