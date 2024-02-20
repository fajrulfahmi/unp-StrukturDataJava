import java.util.LinkedList;
import java.util.Queue;

public class No4 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(1);
        queue.add(1);
        queue.add(3);
        queue.add(0);
        queue.add(2);
        queue.add(0);
        queue.add(0);
        queue.add(0);
        queue.add(8);

        System.out.print(" Queue kosong ? ");
        boolean cekKosong = queue.isEmpty();
        if (cekKosong == true){
            System.out.print("ya");
        }else{
            System.out.print("tidak");
        }
        System.out.println(" \n Isi Queue      : " + queue);
        System.out.println(" Panjang Queue  : " + queue.size());
        System.out.println(" Peek Queue     : " + queue.peek());
        System.out.println(" Hapus Queue    : " + queue.remove(8));
        System.out.println(" Isi Queue setelah dihapus : " + queue);
    }
}