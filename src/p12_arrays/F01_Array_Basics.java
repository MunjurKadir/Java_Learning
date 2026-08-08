package p12_arrays;

public class F01_Array_Basics {
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Mazda", "Ford"};
        System.out.println(cars[0]);
        cars[0] = "Ferrary";
        System.out.println(cars[0]);

        int[] num = {10, 20, 30, 40, 50};
        System.out.println(cars.length);
        System.out.println(num.length);

        // new --> to create an empty array with size
        String[] car = new String[4];
        car[0] = "Lamborghini";
        car[1] = "Benz";
        car[2] = "Audi";
        car[3] = "Honda";
        System.out.println(car[2]);
    }
}