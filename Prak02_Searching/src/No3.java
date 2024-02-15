public class No3 {
    static int binary(double[] data, double key, int indexAwal, int indexAkhir) {
        int elemenTengah;
        while (indexAwal <= indexAkhir) {
            elemenTengah = (indexAwal + indexAkhir) / 2;
            if (key == data[elemenTengah]) {
                return elemenTengah;
            } else if (data[elemenTengah] > key) {
                indexAkhir = elemenTengah - 1;
            } else {
                indexAwal = elemenTengah + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        double[] data = {1.0, 1.1, 1.2, 1.3, 1.4, 5.0, 6.0};
        double key = 6.0;

        System.out.println("versi java yang dirilis sebelum diakuisisi Oracle  : " + key);

        int hasil = binary(data, key,0 , data.length - 1);
        if(hasil == -1){
            System.out.println("versi tidak ditemukan");
        }else{
            System.out.println("Berada pada index ke - " + hasil);
        }
        System.out.println("Jumlah versi yang dirilis sebelum diakuisisi Oracle : " + data.length);
    }
}
