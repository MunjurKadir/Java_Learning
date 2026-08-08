package p12_arrays;

public class F02_Loop_Through_an_Array {
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++){
            System.out.print(cars[i] + " ");
        }
        System.out.println();
        int[] num = {10, 20, 30, 40};
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        int[] numbers = {1, 5, 10, 25};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);
        String[] bikes = {"BMW", "KTM", "Honda", "Kawasaki"};
        for (String bike: bikes){
            System.out.println(bike);
        }
        String[] seats = {"Jenny", "Liam", "Angie", "Bony"};
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat number " + (i+1) + " is taken by " + seats[i]);
        }
    }
}
