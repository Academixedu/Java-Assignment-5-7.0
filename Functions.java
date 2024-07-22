public class Functions{
// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  void m(){
    System.out.println("empty function");
  }
  int m(int age){
    return age;
    }

  int m(int a,int b){
    return a*b;
  }
  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
 
  f.m();
  System.out.println(f.m(21));
  System.out.println(f.m(1,2));

}
}
