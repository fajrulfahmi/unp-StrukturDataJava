class No1 {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void insetAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("Teh given previus node connot be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void append(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = newNode;
        return;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        No1 llist = new No1();

        llist.append(0);
        llist.push(0);
        llist.push(0);
        llist.push(2);
        llist.push(0);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.append(8);
        llist.insetAfter(llist.head.next, 1);

        System.out.println("Data Linked List yang sudah dibuat adalah : ");
        llist.printList();
    }
}
