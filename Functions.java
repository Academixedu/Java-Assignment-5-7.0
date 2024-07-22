

public class Functions{
  public void f1(){
    System.out.println("Iam Swarupa");
  }
  public static int f1(int s,int r){
   int a=s+r;
    return a;
  }
  public void  f1(String name){
   System.out.println(name);
  
  }
   
// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public static void main(String[]args){
  Functions f=new Functions();
  f.f1();
  f.f1("Swarupa Rani");
  System.out.println(f.f1(4, 6));
  // Call three Functions here
  }
}
