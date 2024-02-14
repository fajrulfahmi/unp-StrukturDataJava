public class No4 {
    public static void main(String[] args) {
        int[][] A = {
                {2, 4, 3},
                {1, 2, 8},
                {3, 4, 7}
        };
        int[][] B = {
                {1, 5, 2},
                {8, 12, 4},
                {11, 6, 6}
        };
        int[][] C = new int [3][3];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                C[i][j] = 0;
                for(int k = 0; k <= 2; k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}