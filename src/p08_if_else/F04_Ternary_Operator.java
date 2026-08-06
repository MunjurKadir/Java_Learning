package p08_if_else;
  // Ternary Operator = Java Short Hand If...Else
public class F04_Ternary_Operator {
    public static void main(String[] args){
        int time = 20;
        String result = (time < 18) ? "Good Morning" : "Good Evening";
        System.out.println(result);

        int t = 20;
        System.out.println((t > 18) ? "Good day." : "Good evening.");

        // Nested Ternary
        int time1 = 22;
        String message = (time1 < 12) ? "Good morning."
                : (time1 < 19) ? "Good afternoon."
                : "Good evening.";
        System.out.println(message);
    }
}
