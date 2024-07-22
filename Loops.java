public class Loops{
// Prepare a For Loop and While  in each Function

    public void function1(){

     int a = 10;
     
     for (int i=0; i<a; i++){
        System.out.println(a);
     }}
     public void function2(){
      int b = 7;
     int count = 0;
     while (count < b){
        System.out.println(b);
        count++;
     }}
     public static void main(String[] args) {
      Loops fun = new Loops();
      fun.function1();
      fun.function2();
     
     }


}
