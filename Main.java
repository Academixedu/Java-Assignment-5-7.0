public class Main{
    public static void main(String [] args){
        Person n = new Person("fayaz",245,21,"Berhampur");
        System.out.println("name is "+n.getName());
        System.out.println("id is "+n.getId());
        System.out.println("age is "+n.getAge());
        System.out.println(" role is "+n.getAddress());
        Child pc = new Child();
        pc.name("Ritesh");
        pc.surname("Behera");
    }
}