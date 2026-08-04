package p04_type_casting;

public class F03_RealLifeExample {
    public static void main(String[] args){
        // Set the maximum possible score in the game to 500
        int maxScore = 500;
        // The actual score of the user
        int userScore = 423;
        /* Calculate the percentage of the user's score in relation to the maximum available score.
        Convert userScore to double to make sure that the division is accurate */

        double percentage = (double) userScore / maxScore * 100;
        System.out.println("Answer = " + percentage);
    }
}
