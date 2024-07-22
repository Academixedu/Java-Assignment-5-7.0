
import java.util.function.Function;

public class Functions{
// prepare a void function
  // prepare a function with papublicrameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public static void name(){
    System.out.println("name");
  }
  public static int name(int a){
    return a;
  }
  public static String name(String name){
    return name;
  }
  
  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
  f.name();
  System.out.println(f.name(1));
  System.out.println(f.name("nayeem"));
  }
}
