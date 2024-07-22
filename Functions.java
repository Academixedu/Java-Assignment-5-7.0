public class Functions{
// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public void name()
  {
    System.out.println("SUBRAHMANYA");
  }
  public void name(int no)
  {
    System.out.println("no is "+no);
  }
  public String name(String address)
  {
    return address;
  }

  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
  f.name();
  f.name(1);
  String add=f.name("HYD");
  System.out.println("address is "+add);
  }
}
