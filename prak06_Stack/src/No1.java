public class No1 {
    private int[] arr;
    private int atas;
    private int kapasitas;

    No1(int ukuran) {
        arr = new int[ukuran];
        kapasitas = ukuran;
        atas = -1;
    }

    public void push(int x) {
        if (penuh()) {
            System.out.println("Stack penuh / Stack Overflow");
            System.exit(1);
        } else {
            System.out.println("Push Elemen : " + x);
            arr[++atas] = x;
        }
    }

    public Boolean penuh() {
        return atas == kapasitas - 1;
    }

    public void cetak() {
        for (int i = atas; i > -1; i--) {
            System.out.println(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        No1 stack = new No1(10);
        stack.push(2);
        stack.push(1);
        stack.push(1);
        stack.push(3);
        stack.push(0);
        stack.push(2);
        stack.push(0);
        stack.push(0);
        stack.push(0);
        stack.push(8);
        System.out.println("\n Daftar Stack : ");
        stack.cetak();
    }

}
