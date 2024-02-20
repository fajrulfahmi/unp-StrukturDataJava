public class No1 {
    private int top;
    private int rear;
    private int front;
    private int capacity;
    private int items[];

    No1(int ukuran) {
        items = new int[ukuran];
        capacity = ukuran;
        top = -1;
        rear = rear + 1;
        front = front + 1;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Antrian penuh");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println(element + " enqueue ");
        }
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + items[i]);
        }
    }

    public static void main(String[] args) {
        No1 queue = new No1(12);
        queue.enQueue(2);
        queue.enQueue(1);
        queue.enQueue(1);
        queue.enQueue(3);
        queue.enQueue(0);
        queue.enQueue(2);
        queue.enQueue(0);
        queue.enQueue(0);
        queue.enQueue(0);
        queue.enQueue(8);
        queue.printStack();
    }
}
