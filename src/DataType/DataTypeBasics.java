package DataType;

public class DataTypeBasics {
    public static void main(String[] args){
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        String myText = "Hello";     // String

        // Scientific Numbers or Power of 10
        float f1 = 35e3f;
        double d1 = 12E4d;
        double xy = 16e2;
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(xy);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        char A = 65, z = 122;
        System.out.println(A);
        System.out.println(z);
        System.out.println(A + " " + z);
    }
}
