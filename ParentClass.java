public class ParentClass{
    public String name(String name) {
        return name;
    }

    public static void main(String[] args) {
        ParentClass pc = new ParentClass();
        
        String returnedName = pc.name("Bipasa");
        System.out.println("The name is: " + returnedName);
    }
}// prepare a method Name with name as parameter and return it by using String return type
