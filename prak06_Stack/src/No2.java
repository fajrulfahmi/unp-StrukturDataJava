import java.util.Scanner;

public class No2 {
    private int arr[];
    private int atas;
    private int kapasitas;

    No2(int size) {
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
        No2 stack = new No2(8);
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan Angka : ");
            String npm = input.nextLine();
            String split[] = new String[npm.length()];
            split = npm.split("");
            for (int i = split.length - 1; i >= 0; i--) {
                stack.push(Integer.parseInt(split[i]));
            }
            System.out.println("\nDaftar Stack: ");
            stack.printStack();
            stack.pop();
            System.out.println("\nDaftar Stack setelah dihapus: ");
            stack.printStack();
        } catch (Exception e) {
            stack.pop();
        }
    }
}
