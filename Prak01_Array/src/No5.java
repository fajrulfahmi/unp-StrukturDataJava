public class No5 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 4, 3},
                {7, 5, 8},
                {9, 2, 3}
        };
        for(int baris = 0; baris < array.length; baris++) {
            for (int kolom = 0; kolom < array.length; kolom++) {
                if (array[baris][kolom] == 8){
                    System.out.println("Baris = " + (baris += 1));
                    System.out.println("Kolom = " + (kolom += 1));
                }
            }
        }
    }
}
