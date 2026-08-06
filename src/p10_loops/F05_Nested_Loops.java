package p10_loops;

public class F05_Nested_Loops {
    public static void main(String[] args){
        for (int i = 1; i <= 2; i++){
            System.out.println("outer: " + i);
            for (int j = 1; j <= 3; j++){
                System.out.println("inner: " +j);
            }
        }
        System.out.println();

        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 10; j ++){
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
