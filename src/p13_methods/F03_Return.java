package p13_methods;

public class F03_Return {
    public static void main(String[] args){
        System.out.println(myMethod(7));

        int sum = add(5, 8); // store the result in a variable (recommended, as it is easier to read and maintain)
        System.out.println("Sum = " + sum);

        for (int i = 1; i <= 5; i++){
            System.out.println("Double of " + i + " is " + myDouble(i));
        }
    }
    static int add(int x, int y){
        return x + y;
    }
    static int myMethod(int x) {
        return 5 + x;
    }
    // "game example" using a method that returns a value, to show the double of the numbers 1 through 5 (using a for loop)
    static int myDouble(int x){
        return x * 2;
    }
}


