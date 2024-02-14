public class No1 {
    public static void main(String[] args) {
        float hitung = 0, nTotal = 0, r;
        int[] array = {12, 5, 21, 2, 8, 15};
        for(var i : array){
            hitung += 1;
            nTotal += i;
        }
        r = nTotal / array.length;

        System.out.println("Panjang Array = " + hitung);
        System.out.println("Nilai Total = " + nTotal);
        System.out.println("Rata-rata = " + r);
    }

}
