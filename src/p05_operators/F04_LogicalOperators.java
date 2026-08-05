package p05_operators;

public class F04_LogicalOperators {
    public static void main(String[] args){
        int x = 10;
        System.out.println(x == 10); // Outputs true, because the value of x is equal to 10

        System.out.println(10 == 15); // Outputs false, because 10 is not equal to 15

        System.out.println(10 > 9); // Outputs true, because 10 is greater than 9

        int a = 10;
        int b = 9;
        boolean isGreater = a > b; // Storing the result in a boolean variable can make code easier to read, especially if you want to reuse it.
        System.out.println(isGreater); // Outputs true

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        System.out.println("Regular user: " +(isLoggedIn && !isAdmin));
        System.out.println("Has access: " +(isLoggedIn || isAdmin));
        System.out.println("Not Logged in: " + !isLoggedIn);
    }
}
//        && 	Logical and 	Returns true if both statements are true.
//        || 	Logical or	    Returns true if one of the statements is true.
//        !	    Logical not	    Reverse the result, returns false if the result is true.