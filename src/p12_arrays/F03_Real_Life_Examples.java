package p12_arrays;

public class F03_Real_Life_Examples {
    public static void main(String[] args){
        // create a program that calculates the average of different ages:
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        int sum = 0;
        double avg;
        for (int i = 0; i < ages.length; i++){
            sum = sum + ages[i];
        }
        avg = (double) sum / ages.length;
        System.out.println("Average = " + avg);

        // create a program that finds the lowest age among different ages:
        int lowest = ages[0];
        for (int i = 0; i < ages.length; i++){
            if (ages[i] < lowest){
                lowest = ages[i];
            }
        }
        System.out.println("Lowest age is " + lowest);

        // Create a program with a list of numbers where you want to skip negative values, but stop completely if you find a zero:
        int[] numbers = {3, -1, 7, 0, 9};
        for (int num : numbers){
            if (num < 0){
                continue;
            }
            if (num == 0){
                break;
            }
            System.out.println(num);
        }

        // Create a program that keeps track of the highest and lowest values in an array:
        int[] number = {45, 12, 98, 33, 27};
        int max = number[0];
        int min = number[0];
        for (int nmb : number){
            if (nmb > max){
                max = nmb;
            }
            if(nmb < min){
                min = nmb;
            }
        }
            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
    }
}
