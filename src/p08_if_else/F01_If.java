package p08_if_else;

public class F01_If {
    public static void main(String[] args){
        boolean isRaining = true;
        if(isRaining){
            System.out.println("Bring an umbrella");
        }
        if(20 > 18) {
            System.out.println("20 is greater than 18");
        }
        int x = 8;
        int y = 6;
        if(x > y){
            System.out.println("x is greater than y");
        }
        if (20 > 18) // If an if statement has only one line of code, you can write it without curly braces { }
            System.out.println("20 is greater than 18");

    }
}
