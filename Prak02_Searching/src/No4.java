import java.util.Scanner;

public class No4 {
    static int binary(String[] data, String key, int indexAwal, int indexAkhir) {
        int elemenTengah;
        while (indexAwal <= indexAkhir) {
            elemenTengah = (indexAwal + indexAkhir)/2;
            if (key.compareTo(data[elemenTengah]) == 0) {
                return elemenTengah;
            } else if (key.compareTo(data[elemenTengah]) < 0) {
                indexAkhir = elemenTengah - 1;
            } else {
                indexAwal = elemenTengah + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] data = {"Agus", "Budi", "Bukhori", "Cahyo", "Mat Solar", "Messi", "Poniran", "Ronaldo", "Sholihin", "Supri", "Suraji", "Tehyung", "Waluyo"};
        String key;

        System.out.print("Masukkan nama yang dicari : ");
        key = input.next();

        int hasil = binary(data, key, 0, data.length - 1);
        if (hasil == -1) {
            System.out.println("Nama tidak ditemukan");
        } else {
            System.out.println("Nama " + key + " berada di urutan ke - " + (hasil + 1));
        }
    }
}
