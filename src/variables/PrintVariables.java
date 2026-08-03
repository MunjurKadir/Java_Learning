package variables;

public class PrintVariables {
    public static void main(String[] args){
        String firstName = "Rakib ";
        String lastName = "Hassan";
        String fullName = firstName + lastName;
        System.out.println(firstName + lastName);
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        int sum = x+y;
        System.out.println(x+y);
        System.out.println("sum is " + sum + ".");
        System.out.println("sum is " + (x + y) +".");

        // Multiple variables
        int a = 5, b = 6, c = 7;
        System.out.println("The sum is " + (a+b+c) + ".");
    }
}
