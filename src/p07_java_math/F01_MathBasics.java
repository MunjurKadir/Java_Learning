package p07_java_math;

public class F01_MathBasics {
    public static void main(String[] args){
        int x = 5, y = 10;
        System.out.println(Math.max(x, y)); // Math.max(x,y) --> to find the highest value of x and y
        System.out.println(Math.min(x, y)); // Math.min(x,Y) --> to find the lowest value of x and y

        System.out.println(Math.sqrt(64)); // Math.sqrt(x) --> returns the square root of x & Math.sqrt() always returns a double

        System.out.println(Math.abs(-4.7)); // Math.abs(x) --> returns the absolute (positive) value of x

        System.out.println(Math.pow(2, 4)); // Math.pow(x, y) --> returns the value of x raised to the power of y & Math.pow(x, y) always returns a double

        // Rounding Methods
        System.out.println(Math.round(4.6)); // Math.round(x) --> rounds to the nearest integer
        System.out.println(Math.round(4.4));
        System.out.println(Math.ceil(4.6));  // Math.ceil --> rounds up (returns the smallest integer greater than or equal to x)
        System.out.println(Math.floor(4.6)); //Math.floor --> rounds down (returns the largest integer less than or equal to x)

        System.out.println(Math.random()); // Math.random() --> returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random() * 101); // for 0 to 100 random numbers
                                                 // Math.random() returns a double. To get an integer, need to cast it with (int).
    }
}
