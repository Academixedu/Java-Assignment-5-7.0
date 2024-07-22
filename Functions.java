public class Functions{
// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public void m1(){
    System.out.println("This is m1");
  }
  public void m1(int a){
    System.out.println(a);
  }
  public static int m1(int a,int b){
    return a+b;

  }
  
  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
  f.m1();
  f.m1(1);
  System.out.println(f.m1(2,3));


}
  }

