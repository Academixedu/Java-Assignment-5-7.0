public class Functions{
// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name
  public void name()
  {
    System.out.println("sai");
  }
  public void name(int no){
    System.out.println("number is"+no);
  }
  public String name(String name){
    return name;
  }


  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
  f.name();
  f.name(525);
  f.name("mani");
  System.out.println( f.name("mani"));
  }
}
