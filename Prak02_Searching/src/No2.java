public class No2 {
    static int binary(char[] data, char key, int indexAwal, int indexAkhir) {
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
        char[] data = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char key = 'w';

        int hasil = binary(data, key,0 , data.length - 1);
        if(hasil == -1){
            System.out.println("Huruf W tidak ditemukan");
        }else{
            System.out.println("Huruf W berada di urutan ke - " + (hasil + 1));
        }
    }
}
