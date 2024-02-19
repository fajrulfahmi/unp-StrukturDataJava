import java.util.Scanner;

public class No3 {
    private int arr[];
    private int atas;
    private int kapasitas;

    No3(int size) {
        arr = new int[size];
        kapasitas = size;
        atas = -1;
    }

    public void push(int x) {
        if (penuh()) {
            System.out.println("Stack penuh/Stack Overflow");
            System.exit(1);
        } else {
            System.out.println("Push Elemen: " + x);
            arr[++atas] = x;
        }
    }

    public int pop() {
        if (kosong()) {
            System.out.println("Stack kosong/Stack Underflow");
            System.exit(1);
        }
        return arr[atas--];
    }

    public int peek() {
        return arr[atas];
    }

    public int size() {
        return arr.length;
    }

    public Boolean penuh() {
        return atas == kapasitas - 1;
    }

    public Boolean kosong() {
        return atas == -1;
    }

    public void printStack() {
        for (int i = atas; i > -1; i--) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        No3 stack = new No3(10);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        String angkaString = Integer.toString(angka);
        for (int i = angkaString.length() - 1; i >= 0; i--) {

            stack.push(Integer.parseInt(String.valueOf(angkaString.charAt(i))));
        }
        System.out.println("Urutan Angka yang paling atas stack : " + stack.peek());
        System.out.println("Jumlah angka dalam stack : " + stack.size());
    }
}
