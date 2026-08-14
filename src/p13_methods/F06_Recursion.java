package p13_methods;

public class F06_Recursion {
    public static void main(String[] args){
        int result = sum(10);
        System.out.println("sum is " + result);

        int adds = add (5, 10);
        System.out.println(adds);

        countdown(5);
        countdown1(5);

        int fact = factorial(6);
        System.out.println("Factorial of 6 is " + fact);
    }
    static int sum(int x){
        if(x > 0){
            return x + sum(x - 1);
        }
        else{
            return 0;
        }
    }
    static int add (int start, int end){
        if (end > start){
        return end + add (start, end - 1);
        }
        else {
            return end;
        }
    }
    // Countdown
    static void countdown(int n){
        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }
    }
    // Countdown
    static void countdown1(int n){
        if (n > 0){
            countdown1(n - 1);
            System.out.println(n);
        }
        else {
            return;
        }
    }
    // Factorial
    static int factorial(int a){
        if (a > 0) {
            return a * factorial(a - 1);
        }
        else {
            return 1;
        }
    }
}
