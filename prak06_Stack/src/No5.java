public class No5 {
    private String arr[];
    private int atas;
    private int kapasitas;

    No5(int size) {
        arr = new String[size];
        kapasitas = size;
        atas = -1;
    }

    public void push(String x) {
        if (Penuh()) {
            System.out.println("Stack penuh/Stack Overflow");
            System.exit(1);
        } else {
            System.out.println("Push Elemen: " + x);
            arr[++atas] = x;
        }
    }

    public String pop() {
        if (Kosong()) {
            System.out.println("Stack kosong/Stack Underflow");
            System.exit(1);
        }
        return arr[atas--];
    }

    public String peek() {
        return arr[atas];
    }

    public int size() {
        return arr.length;
    }

    public Boolean Penuh() {
        return atas == kapasitas - 1;
    }

    public Boolean Kosong() {
        return atas == -1;
    }

    public void Cetak() {
        for (int i = atas; i > -1; i--) {
            System.out.println(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        No5 stack = new No5(5);
        stack.push("Bumi Manusia");
        stack.push("Ayat-ayat Cinta");
        stack.push("Laskar Pelangi");
        stack.push("Harry Poter");
        stack.push("The Hobbit");
        System.out.println("\nDaftar Stack: ");
        stack.Cetak();
        stack.pop();
        stack.pop();
        System.out.println("\nDaftar Stack setelah dihapus: ");
        stack.Cetak();
        System.out.println();
        stack.push("Tentang Kamu");
        stack.push("Garis Waktu");
        System.out.println("\nDaftar Stack Baru: ");
        stack.Cetak();
    }
}
