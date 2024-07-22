public class Functions{
// prepare a void function
public void ritu() {
  System.out.println("This is a void function");
}

 // prepare a function with parameters 
 public void ritu(String name){
  System.out.println("function with parameters ");
  System.out.println("Name: "+name);
 }

  // prepare a function using paramater and returntype
  public int ritu(int a, int b){
    System.out.println("function using paramater and returntype");
  return a+b;
   }

  // 3 methods should contain same name
  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
  f.ritu();
  f.ritu("Ritesh");
  f.ritu(1, 2);
  }
}
