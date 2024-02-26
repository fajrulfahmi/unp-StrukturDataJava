import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] dataArray = {3, 7, 1, 9, 5};
        print(dataArray, "Data array sebelum diurutkan : ");
        bubble(dataArray);
    }

    public static void print(int[] dataArray, String pesan) {
        System.out.println(pesan + "\n" + Arrays.toString(dataArray));
    }

    public static void bubble(int[] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            boolean k = false;
            for (int j = 0; j < dataArray.length - 1; j++) {
                if (dataArray[j] < dataArray[j + 1]) {
                    int temp = dataArray[j];
                    dataArray[j] = dataArray[j + 1];
                    dataArray[j + 1] = temp;
                    k = true;
                }
            }
            if(!k){
                break;
            }
        }
        print(dataArray, "Data sesudah diurutkan :");
    }
}
