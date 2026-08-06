package p08_if_else;

public class F06_Logical_Operators {
    public static void main(String[] args){
        int a = 200;
        int b = 33;
        int c = 500;
        if (a > b && c > a) { // Use AND (&&) when both conditions must be true
            System.out.println("Both conditions are true");
        }
        if (a > b || a > c) { // Use OR (||) when at least one of the conditions can be true
            System.out.println("At least one condition is true");
        }
        if (!(b > a)) { // Use NOT (!) to reverse a condition
            System.out.println("b is NOT greater than a");
        }

        // Example: You must be logged in, and then you either need to be an admin, or have a high security clearance (level 1 or 2)
        boolean isAdmin = false;
        boolean isLoggedIn = true;
        int sequrityLevel = 3;
        if(isLoggedIn && (isAdmin || sequrityLevel <= 2)){
            System.out.println("Access Granted!");
        }
        else {
            System.out.println("Access Denied!");
        }
    }
}
