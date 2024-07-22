public class Functions
{
  public void f1()
  {
    System.out.println("This is void function");

  }
  public int f1(int a, int b)
  {
    return a+b;
  }
  public int f1(int c)
  {
    return c;
  }
// prepare a void function
  // prepare a function with parameters
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public static void main(String[]args)
  {
  Functions f=new Functions();
  // Call three Functions here
  f.f1();
  System.out.println("the name is"+f.f1(2,5));
  System.out.println(f.f1(12));

  }
}
