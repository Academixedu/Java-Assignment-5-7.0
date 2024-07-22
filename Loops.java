public class Loops{
    public static void For(){
        int a=20;
        for(a=0;a<=20;a++){
            System.err.println(a);
        }
    }
    public static void While(){
        int age=30;
        while(age>=0){
            System.out.println(age);
            age--;
        }
    }
// Prepare a For Loop and While  in each Function

public static void main(String args[]){
    Loops.For();
    Loops.While();

}
}