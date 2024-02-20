import java.util.Scanner;

public class No3 {
    public int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public No3(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public int deQueue() {
        if (Kosong()) {
            System.err.println("Underflow, Program Berhenti");
            System.exit(1);
        }
        int x = arr[front];
        System.out.println("Menghapus " + x);
        count--;
        for (int i = 0; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = Integer.parseInt(null);
        rear--;
        return x;
    }

    public int enQueue(int item) {
        if (Penuh()) {
            System.err.println("Overflow, Program Berhenti");
            System.exit(1);
        }
        System.out.println("Antrian " + item);
        rear++;
        arr[rear] = item;
        count++;
        return item;
    }

    public int peek() {
        if (Kosong()) {
            System.err.println("Underflow, Program Berhenti");
            System.exit(-1);
        }
        return arr[front];
    }

    public int bottom() {
        if (Kosong()) {
            System.err.println("Underflow, Program Berhenti");
            System.exit(-1);
        }
        return arr[rear];
    }

    public int sizeElement() {
        return count;
    }

    public int sizeQueue() {
        return capacity;
    }

    public boolean Kosong() {
        return (sizeElement() == 0);
    }

    public boolean Penuh() {
        return (sizeElement() == capacity);
    }

    public String toString() {
        String str = "[";
        for (int i = front; i <= rear; i++) {
            str += arr[i] + ", ";
        }
        str += "\b\b]";

        if (front > rear) {
            str = "Kosong []";
        }
        return str;
    }

    public static void main(String[] args) {
        No3 queue = new No3(8);
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan NPM : ");
            String npm = input.nextLine();
            String split[] = new String[npm.length()];
            split = npm.split("");
            for (int i = split.length - 1; i >= 0; i--) {
                queue.enQueue(Integer.parseInt(split[i]));
            }
        } catch (Exception e) {
            queue.peek();
        }
    }
}