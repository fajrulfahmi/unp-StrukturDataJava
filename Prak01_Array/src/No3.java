public class No3 {
    public static void main(String[] args) {
        int[][] array1 = {
                {2, 3},
                {8, 1}
        };
        int[][] array2 = {
                 {6, 5},
                 {7, 9}
        };
        int[][] array3 = new int[2][2];

        for(int i = 0; i < array1.length; i ++){
            for (int j = 0; j < array1.length; j++){
                array3[i][j] = array1[i][j] - array2[i][j];
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
