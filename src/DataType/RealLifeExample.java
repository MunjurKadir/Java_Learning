package DataType;

public class RealLifeExample {
    public static void main (String[] args){
        int item = 50;
        double costPerItem = 9.99;
        double totalCost = item * costPerItem;
        char currency = '$';

        System.out.println("Number of item " + item);
        System.out.println("Cost per item " + costPerItem);
        System.out.println("Total cost = " + totalCost + currency);

    }
}
