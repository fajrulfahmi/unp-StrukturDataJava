import java.util.Arrays;

public class No4 {
    static int partisi(String[] data, int start, int end) {
        String pivot = data[end];
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++) {
            if (data[j].compareTo(pivot) > 0) {
                i++;
                String temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        String temp = data[i + 1];
        data[i + 1] = data[end];
        data[end] = temp;
        return (i + 1);
    }

    static void quickShort(String[] data, int start, int end) {
        if (start < end) {
            int pivot = partisi(data, start, end);
            quickShort(data, start, pivot - 1);
            quickShort(data, pivot + 1, end);
        }
    }

    public static void binarySearch(String[] arrayData, String search) {
        int begin = 0, end = arrayData.length - 1, mid;
        boolean status = false;
        while (begin <= end) {
            mid = (begin + end) / 2;
            if (search == arrayData[mid]) {
                System.out.println("\n" + search + " berada pada posisi ke-" + (mid + 1) + " pada index ke-" + mid);
                status = true;
                break;
            } else {
                if (search.compareTo(arrayData[mid]) < 0) {
                    begin = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        if (status == false) {
            System.out.println("\n" + search + " tidak ditemukan pada array");
        }
    }

    public static void main(String[] args) {
        String[] data = {"Badrun", "Evan", "Triadi", "Cahyo", "Zaki", "Wendy", "Susanto", "Nanda", "Imron", "Adhim", "Rizki", "Dimas", "Gilang", "Indra", "Abid", "Hakim", "Andika", "Rendy", "Hadi", "Fandi", "Mamad", "Yusron", "Jeje", "Febri"};
        System.out.println("Data sebelum di sorting");
        System.out.println(Arrays.toString(data));

        quickShort(data, 0, data.length - 1);

        System.out.println("\nData sesudah di sorting menggunakan Quick Sort");
        System.out.println(Arrays.toString(data));

        binarySearch(data, "Mamad");



    }

}
