package p13_methods;

public class F04_Method_Overloading {
    public static void main(String[] args){
        System.out.println(add(5, 6));
        System.out.println(add(6.0, 7.0));
    }
    // With method overloading, multiple methods can have the same name with different parameters
    static int add(int x, int y){
        return x + y;
    }
    static double add(double a, double b){
        return a + b;
    }
}