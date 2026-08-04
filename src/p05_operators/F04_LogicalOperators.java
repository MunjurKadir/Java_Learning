package p05_operators;

public class F04_LogicalOperators {
    public static void main(String[] args){
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