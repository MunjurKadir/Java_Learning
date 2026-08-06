package p10_loops;

public class F07_Real_Life_Examples {
    public static void main(String[] args){
        // To demonstrate a practical example of the for loop, let's create a program that counts to 100 by tens
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i);
        }
        System.out.println();

        // Print the multiplication table for the number 2
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();

        //Use a loop to calculate the factorial of a given number
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
