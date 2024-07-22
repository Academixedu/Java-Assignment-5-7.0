public class Functions
{
// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public void meth1()
  {
    System.out.println("this is a void method");
    System.out.println("--------------------------------------");
  }
  public void meth1(int a, int b)
  {
    System.out.println("This is parameterized method : "+"a= "+a +" b= "+b);
    System.out.println("--------------------------------------");
  }
 
  public String meth1 (String s)
  {
    System.out.println("this is parametrized and return method of string s: "+s);
      return "abhi";
  }
 
  public static void main(String[] args)
  {
  Functions f=new Functions();
  f.meth1();
  f.meth1(2, 3);
  f.meth1("Ratan");
  
  }
 
 
  
}
