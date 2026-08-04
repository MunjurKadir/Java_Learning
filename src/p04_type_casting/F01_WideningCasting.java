package p04_type_casting;

// Widening Casting (automatic) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double
public class F01_WideningCasting {
    public static void main(String[] args){
        int myInt = 10;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        char ch = 'A';
        int num = ch;
        System.out.println(ch);
        System.out.println(num);
    }
}
