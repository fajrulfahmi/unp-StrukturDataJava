import java.util.Arrays;

public class No2 {
    static void merge(double[] data, int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        double leftArray[] = new double[n1];
        double rightArray[] = new double[n2];

        for (i = 0; i < n1; i++) {
            leftArray[i] = data[beg + i];
        }
        for (j = 0; j < n2; j++) {
            rightArray[j] = data[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = beg;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                data[k] = leftArray[i];
                i++;
            } else {
                data[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            data[k] = leftArray[i];
            i++;
            k++;
        }
    }

    static void mergeShort(double[] data, int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeShort(data, beg, mid);
            mergeShort(data, mid + 1, end);
            merge(data, beg, mid, end);
        }
    }

    public static void main(String[] args) {
        double[] data = {1, 0.5, 5, 3, 2.6, 10.3, 1.7, 4.1};
        System.out.println("Sebelum diurutkan");
        System.out.println(Arrays.toString(data));

        mergeShort(data, 0, data.length - 1);

        System.out.println("\nSetelah diurutkan menggunakan Merge Sort");
        System.out.println(Arrays.toString(data));
    }

}