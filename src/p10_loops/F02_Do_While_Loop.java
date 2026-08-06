package p10_loops;

public class F02_Do_While_Loop {
    public static void main(String[] args){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i < 5);

        int j = 10;
        do {
            System.out.println("j is " + j);
            j++;
        }
        while (j < 5); // The do/while loop will always run the code block at least once, even if the condition is false from the start.
    }

}
