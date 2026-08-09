package p13_methods;

public class F02_Parameters {
    public static void main(String[] args){
        firstName("John");
        firstName("Tom");
        firstName("Liam");
        System.out.println(mul(5));
        myMethod("Shawon", 22);
        myMethod("Mim", 23);
        checkAge(20);
        checkAge(16);
        checkAge(18);
        checkAge(-23);
    }
    static void firstName(String name){
        System.out.println(name + " Refsnes");
    }
    static double mul(int x){
        return x * 5;
    }
    static void myMethod(String name, int age){
        System.out.println(name + " is " + age +" years old");
    }

    static void checkAge(int age){
        if (age<0){
            System.out.println("Invalid age!");
        }
        else if (age < 18){
            System.out.println("You are not old enough to vote");
        }
        else {
            System.out.println("You can vote");
        }
    }
}
