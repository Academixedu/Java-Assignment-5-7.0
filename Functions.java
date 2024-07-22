public class Functions{
// prepare a void function
public static void mul(){
  System.out.println("mul of two numbers");
}
  // prepare a function with parameters 
  public static void mul(int a,int b){
    int c=a*b;
    System.out.println("mul is"+c);

  }
  // prepare a function using paramater and returntype
  public int mul(int c){
    return c;
  }
    

  
  // 3 methods should contain same name
  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
  Functions.mul();
  Functions.mul(12,13);
  System.out.println(f.mul(30));


  }
}
