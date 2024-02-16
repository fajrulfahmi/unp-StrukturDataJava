import java.util.Arrays;

public class No3 {
    static void shellShort(String data[]) {
        int n = data.length;
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                String temp = data[i];
                int j;

                for (j = i; j >= interval && data[j - interval].compareTo(temp) > 0; j -= interval) {
                    data[j] = data[j - interval];
                }
                data[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String data[] = {"n", "u", "s", "a", "n", "t", "a", "r", "a"};
        System.out.println("Data sebelum di urutkan ");
        System.out.println(Arrays.toString(data));
        shellShort(data);
        System.out.println("\nData sesudah di urutkan menggunakan Shell Sort ");
        System.out.println(Arrays.toString(data));
    }
}