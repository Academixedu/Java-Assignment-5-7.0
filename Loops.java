public class Loops {
    public void forLoop() {
        System.out.println("For loop example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }

    public void whileLoop() {
        System.out.println("While loop example:");
        int j = 1
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;
        }
    }

    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.forLoop();
        loops.whileLoop();
    }
}
