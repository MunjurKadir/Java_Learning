package p04_type_casting;

public class F02_NarrowingCasting {
    public static void main(String[] args){
        double myDouble = 24.44;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);

        int num = 65;
        char ch = (char) num;
        System.out.println(num);
        System.out.println(ch);
    }
}
