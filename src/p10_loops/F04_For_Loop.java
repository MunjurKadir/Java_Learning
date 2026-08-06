package p10_loops;

public class F04_For_Loop {
    public static void main (String[] args){
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println();
        for (int i = 2; i < 10; i+=2){
            System.out.println(i);
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i <= 5; i++){
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
        System.out.println();

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = 10; i < 5; i++) { // If the condition is false right from the start, the code inside the loop will be skipped entirely
            System.out.println("This will never be printed");
        }
    }
}
