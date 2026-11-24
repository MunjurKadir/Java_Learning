package x1_java_advanced.p06_Java_Lambda;

import java.util.ArrayList;
public class F01_Lambda_Expression {
    public  static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(5);
        numbers.add(6);
        numbers.add(1);

        numbers.forEach((n) -> {
            System.out.println(n);
        });
    }
}
