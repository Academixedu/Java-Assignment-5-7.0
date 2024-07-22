public class Functions{
// prepare a void function
public void sum(){
  System.out.println("sum of two integers");
}
  // prepare a function with parameters
  public void sum(int a,int b)
  {
    int c=a+b;
    System.out.println("sum="+c);
  } 
  public String sum(String name)
  {
    return name;
  }
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
  f.sum();
  f.sum(2,3);
  System.out.println(f.sum("gani"));
  }
}
