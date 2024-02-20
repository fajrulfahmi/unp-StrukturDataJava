public class No2 {
    private int front;

    private int rear;
    private int capacity;
    private int items[];
    private int top;

    No2(int size) {
        items = new int[size];
        capacity = size;
        top = -1;
        rear = rear + 1;
        front = front + 1;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("antrian penuh");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println(element + " enQueue");
        }
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("\nAntrian Kosong");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(" deQueue " + element);
            return (element);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printQueue() {
        for (int i = top; i > -1; i--) {
            System.out.println(" " + items[i]);
        }
    }

    public static void main(String[] args) {
        No2 queue = new No2(16);
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
        queue.printQueue();
        queue.deQueue();
        queue.printQueue();
    }
}