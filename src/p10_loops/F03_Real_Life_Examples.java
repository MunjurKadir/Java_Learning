package p10_loops;

public class F03_Real_Life_Examples {
    public static void main(String[] args){
        // Print "Yatzy!" If the dice number is 6
        int dice = 1;
        while (dice <= 6){
            if (dice < 6){
                System.out.println("No Yatzy!");
            }
            else{
                System.out.println("Yatzy!");
            }
            dice++;
        }
    }
}
