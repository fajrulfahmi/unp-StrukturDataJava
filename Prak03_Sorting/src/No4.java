import java.util.Arrays;

public class No4 {
    public static void main(String[] args) {
        String[] array = {"Badrun", "Evan", "Triadi", "Cahyo", "Zaki", "Wendy", "Susanto", "Nanda", "Imron", "Adhim", "Rizki", "Dimas", "Gilang", "Indra", "Abid", "Hakim", "Andika", "Rendy", "Hadi", "Fandi", "Mamad", "Yusron", "Jeje", "Febri"};
        printArray(array, "Data Array sebelum di sorting");
        insertion(array);
        binarySearch(array, "Mamad");

    }

    public static void insertion(String[] arrayData) {
        for (int i = 1; i < arrayData.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrayData[j].compareTo(arrayData[j - 1]) > 0) {
                    String temporary = arrayData[j];
                    arrayData[j] = arrayData[j - 1];
                    arrayData[j - 1] = temporary;
                }
            }
        }
        printArray(arrayData, "\nSorting menggunakan Insertion Sort");
    }

    public static void printArray(String[] arrayData, String massage) {
        System.out.println(massage + "\n" + Arrays.toString(arrayData));
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
                if (search.compareTo(arrayData[mid]) < 0/*search > arrayData[mid]*/) {
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

}
