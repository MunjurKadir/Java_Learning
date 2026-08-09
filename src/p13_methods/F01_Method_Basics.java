package p13_methods;

public class F01_Method_Basics {
    public static void main(String[] args){
        greetings();
        greetings();
        System.out.println(add(20, 30));
    }
    static void greetings(){
        System.out.println("Good Morning");
    }
    static int add(int a, int b){
        return a + b;
    }
}
