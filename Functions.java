public class Functions {
  public void myFunction() {
    System.out.println("Hello from Karthik!");
  }

  public void myFunction(int x, int y) {
    System.out.println("Function with parameters! x = " + x + ", y = " + y);
  }
  public int myFunction(int x, int y, int z) {
    return x + y + z;
  }

  public static void main(String[] args) {
    Functions f = new Functions();
    f.myFunction(); 
    f.myFunction(2, 3); 
    int result = f.myFunction(2, 3, 4);
    System.out.println("Result: " + result);
  }
}
