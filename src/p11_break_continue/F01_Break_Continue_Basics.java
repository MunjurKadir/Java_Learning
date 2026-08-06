package p11_break_continue;

public class F01_Break_Continue_Basics {
    public static void main(String[] args){
        // break --> stop the loop completely.
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        // continue --> skip this round, but keep looping.
        for (int i = 1; i <= 10; i++){
            if (i == 5){
            continue;
            }
            System.out.println(i);
        }
        System.out.println();
        // Combining Break and Continue
        for (int i = 1; i <= 10; i++){
            if (i == 2){
                continue;
            }
            if (i == 6){
                break;
            }
            System.out.println(i);
        }
        System.out.println();

        // Break and Continue in While Loop
        int i = 1;
        while (i <= 10){
            if (i == 5){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println();
        int j = 1;
        while (j <= 10){
            if (j == 5){
            j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}
