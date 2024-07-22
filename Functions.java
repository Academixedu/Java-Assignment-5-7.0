public class Functions{
// prepare a void function
public void name(){
  System.out.println("prepare void function");
}
  // prepare a function with parameters 
  public void name(String na){
  }
  // prepare a function using paramater and returntype
  public int name(int id){
    return id;
  }
  // 3 methods should contain same name
  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
  f.name();
  System.out.println("goutham");
  System.out.println(f.name(123));
  }
}
