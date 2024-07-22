public class Functions{
  public void name(){
    System.out.println("fayaz");
  }
  public static void name(int roll){
    System.out.println("number is"+roll);
  }
  public static String name(String name){
    System.out.println(name);
    return name;
  }
  
// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
  f.name();
  f.name(2);
  f.name("sai");
  }
}
