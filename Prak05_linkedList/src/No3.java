import java.util.LinkedList;

public class No3 {
    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<Integer>();
        data.add(1);
        data.add(1);
        data.add(1);
        data.add(1);
        data.add(1);
        System.out.println("Data Linked List : \n" + data);
        data.add(3, 0);
        System.out.println("Setelah menggunakan method add(3, 0): \n"+data);
        data.add(2);
        System.out.println("Setelah menggunakan method add(2): \n"+data);
        data.addFirst(3);
        System.out.println("Setelah menggunakan method addFirst(3): \n"+data);
        data.addLast(4);
        System.out.println("Setelah menggunakan method addLast(4): \n"+data);
        data.set(2, 5);
        System.out.println("Setelah menggunakan method set(2, 5): \n"+data);
        data.size();
        System.out.println("Setelah menggunakan method size(): \n"+data);
        data.remove(6);
        System.out.println("Setelah menggunakan method remove(6): \n"+data);
        data.remove();
        System.out.println("Setelah menggunakan method remove(): \n"+data);
        data.removeFirst();
        System.out.println("Setelah menggunakan method removeFirst(): \n"+data);
        data.removeLast();
        System.out.println("Setelah menggunakan method removeLast(): \n"+data);
        data.clear();
        System.out.println("Setelah menggunakan method clear(): \n"+data);
    }
}

