package variables;
//A variable declared with final becomes a constant, which means unchangeable and read-only
public class Final {
    public static void main(String[] args){
    final float PI_VALUE = 3.1416f;
    final int BIRTH_YEAR = 2004;
    System.out.println("Value of pi is " + PI_VALUE);
    System.out.println("I was born in " + BIRTH_YEAR);
    }
}
