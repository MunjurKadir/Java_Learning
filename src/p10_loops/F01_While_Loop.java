package p10_loops;

public class F01_While_Loop {
    public static void main(String[] args){
        int i = 0;
        while (i<5){
            System.out.println(i);
            i++;
        }
        int countDown = 3;
        while (countDown > 0){
            System.out.println(countDown);
            countDown--;
        }
        System.out.println("Happy New Year!!");

        int j = 10;
        while (j < 5) { // The condition is false at the beginning, so the code inside the loop will never run
            System.out.println("This will never be printed");
            i++;
        }
    }
}
