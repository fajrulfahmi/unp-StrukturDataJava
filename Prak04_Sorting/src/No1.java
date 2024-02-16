import java.util.Arrays;

public class No1 {
    static int partisi(int[] data, int start, int end) {
        int pivot = data[end];
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++) {
            if (data[j] < pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[end];
        data[end] = temp;
        return (i + 1);
    }

    static void quickShort(int[] data, int start, int end) {
        if (start < end) {
            int pivot = partisi(data, start, end);
            quickShort(data, start, pivot - 1);
            quickShort(data, pivot + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] data = {3, 7, 11, 5, 12, 6, 16, 9};
        System.out.println("Sebelum diurutkan");
        System.out.println(Arrays.toString(data));

        quickShort(data, 0, data.length - 1);

        System.out.println("\nSetelah diurutkan menggunakan Quick Sort ");
        System.out.println(Arrays.toString(data));
    }
}