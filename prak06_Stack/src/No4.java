import java.util.Stack;

public class No4 {
    public static void main(String[] args) {
        Stack<Integer> Npm = new Stack<>();
        // tambah elemen ke Stack
        Npm.push(2);
        Npm.push(1);
        Npm.push(1);
        Npm.push(3);
        Npm.push(0);
        Npm.push(2);
        Npm.push(0);
        Npm.push(0);
        Npm.push(0);
        Npm.push(8);

        System.out.println("Daftar Stack: " + Npm);

        Integer elemen = Npm.pop();
        System.out.println("Angka yang dihapus : " + elemen);

        Npm.peek();
        System.out.println("Angka yang paling atas : " + elemen);

        int posisi = Npm.search(0);
        System.out.println("Posisi angka 0 : " + posisi);

        boolean hasil = Npm.empty();
        System.out.println("Stack kosong? (false/true) :  " + hasil);
    }

}
