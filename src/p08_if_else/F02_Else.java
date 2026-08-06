package p08_if_else;

public class F02_Else {
    public static void main(String[] args){
        boolean isRaining = false;
        if(isRaining){
            System.out.println("Bring an umbrella.");
        }
        else{
            System.out.println("It is not raining, do not need to bring umbrella.");
        }
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        }
        else {
            System.out.println("Good evening.");
        }
    }
}
