import java.util.Scanner;

public class No1 {
    static int linearSearch(int[] dataArray, int key) {
        for (int i = 0; i < dataArray.length; i++) {
            if(dataArray[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dataArray = {2, 4, 5, 7, 8, 10, 9, 5, 6, 13};
        int key;

        System.out.println("Data Array = {2, 4, 5, 7, 8, 10, 9, 5, 6, 13}");
        System.out.print("Masukkan nomor yang ingin dicari : ");
        key = input.nextInt();

        int hasil = linearSearch(dataArray, key);
            if(hasil == -1){
                System.out.println("Angka yang dicari tidak ditemukan");
            }else{
                System.out.println("Angka " + key + " berada pada index ke - " + hasil);
            }
        }
    }
