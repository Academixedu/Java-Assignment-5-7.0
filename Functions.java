public class Functions{
// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public void function01(){
    System.out.println("HI function01");

  }
  public static void function01(String name){
    System.out.println("Hi function01 " + name);

  }
  public static int function01(int age){
    return age;
    
    

  }
  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
  f.function01();
  f.function01();
  f.function01();

  }
}
