package p10_loops;

public class F06_For_Each_Loop {
    public static void main(String[] args){
        String[] fruits = {"apple", "banana", "mango"};
        for (String fruit: fruits){
            System.out.println(fruit);
        }
        int[] numbers = {2, 4, 6, 8, 7};
        for(int num: numbers){
            System.out.println(num);
        }
    }
}
