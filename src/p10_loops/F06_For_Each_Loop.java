package p10_loops;

public class F06_For_Each_Loop {
    public static void main(String[] args){
        String[] fruits = {"apple", "banana", "mango"};
        for (String fruit: fruits){
            System.out.println(fruit);
        }
        // The for-each loop is great when you only need to read elements.
        // If you want to change the elements later, or keep track of their index, use a regular for loop instead.
        int[] numbers = {2, 4, 6, 8, 7};
        for(int num: numbers){
            System.out.println(num);
        }
    }
}
