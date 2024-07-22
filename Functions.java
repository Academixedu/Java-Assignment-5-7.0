public class Functions{
// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
public void m1(){
  System.out.println("void function");
}
public void m1(int a,int b){
  System.out.println(a+b);
}
public String m1(String name)
{
  return name;
}


  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
  f.m1();
  f.m1(5,10);
  System.out.println(f.m1("sri"));
  }
}
