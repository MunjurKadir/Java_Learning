package p11_break_continue;

public class F02_Real_Life_Example {
    public static void main(String[] args){
        // A list of numbers where you want to skip negative values, but stop completely if you find a zero
        int[] numbers = {3, 4, 6, -1, 8, -2, 0, 7};
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0){
                continue;
            }
            if (numbers[i] == 0){
                break;
            }
            System.out.println(numbers[i]);
        }
        System.out.println();

        for (int n: numbers){
            if (n < 0){
                continue;
            }
            if(n == 0){
                break;
            }
            System.out.println(n);
        }
    }
}
