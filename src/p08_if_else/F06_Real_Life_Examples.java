package p08_if_else;

public class F06_Real_Life_Examples {
    public static void main(String[] args){
        // This example shows how you can use if..else to "open a door" if the user enters the correct code:
        int doorCode = 1337;
        if(doorCode == 1337){
            System.out.println("Correct code! The door is open.");
        }
        else{
            System.out.println("Wrong code! The door remains closed.");
        }

        // This example shows how you can use if..else to find out if a number is positive or negative:
        int value = 10;
        if(value > 0){
            System.out.println("The value is positive.");
        }
        else if(value < 0){
            System.out.println("The value is negative.");
        }
        else{
            System.out.println("The value is 0.");
        }

        // Find out if a number is even or odd:
        int number = 8;
        if(number % 2 == 0){
            System.out.println(number + " is Even.");
        }
        else{
            System.out.println(number + " is Odd.");
        }
    }
}