public class No5 {
    int size = 5;
    String item[] = new String[size];
    int front, rear;

    No5() {
        front = -1;
        rear = -1;
    }

    boolean penuh() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }

    boolean kosong() {

        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(String elemen) {
        if (penuh()) {
            System.out.println("Maaf " + elemen + " antrian sudah penuh");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            item[rear] = elemen;
            System.out.println(elemen + " masuk ke dalam antrian");
        }
    }

    void deQueue() {
        String elemen;
        if (kosong()) {
            System.out.println("Antrian Kosong");
        } else {
            elemen = item[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("***" + elemen + " keluar dari antrian***");
        }
    }

    void tampilkanData() {
        int i;
        if (kosong()) {
            System.out.println("Daftar Antrian Sekarang Kosong");
        } else {
            System.out.println("Daftar antrian : ");
            for (i = front; i <= rear; i++) {
                System.out.println(item[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        No5 queue = new No5();
        System.out.println("======= Simulasi Queue =======");
        queue.enQueue("Ahmad");
        queue.enQueue("Budi");
        queue.enQueue("Cecep");
        queue.enQueue("Dedi");
        queue.enQueue("Entong");
        queue.enQueue("Zaki");
        System.out.println(" ");
        queue.tampilkanData();
        System.out.println("");
        queue.deQueue();
        queue.tampilkanData();
        System.out.println("");
        queue.deQueue();

        queue.tampilkanData();
        System.out.println("");
        queue.deQueue();
        queue.tampilkanData();
        System.out.println("");
        queue.deQueue();
        queue.tampilkanData();
        System.out.println("");
        queue.deQueue();
        queue.tampilkanData();
    }
}