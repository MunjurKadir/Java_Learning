package p12_arrays;

public class F04_Multi_Dimensional_Array {
    public static void main(String[] args){
        int myNum[][] = {{1, 4, 2}, {3, 6, 8}};
        System.out.println(myNum[1][2]);
        System.out.println(myNum[0][1]);

        // You can overwrite an existing element using the same two-index notation (row, then column):
        myNum[1][2] = 9;
        System.out.println(myNum[1][2]);

        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };
        System.out.println("Rows: " + myNumbers.length);
        System.out.println("Columns in Row 0: " + myNumbers[0].length);
        System.out.println("Columns in Row 1: " + myNumbers[1].length);

        for (int row = 0; row < myNumbers.length; row++){
            for (int col = 0; col < myNumbers[row].length; col++){
                System.out.println("myNumbers[" + row + "]" + "[" + col + "] = " + myNumbers[row][col]);
            }
        }
        // Using For Each Loop When we don't need index
        for (int[] row : myNumbers){
            for (int num : row){
                System.out.println(num);
            }
        }
    }
}
