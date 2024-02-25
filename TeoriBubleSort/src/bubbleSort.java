import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {13, 32, 26, 35, 10};
        System.out.println("Data Array sebelum di sorting");
        System.out.println(Arrays.toString(array));
        bubbleAsc(array);
    }
    public static void bubbleAsc(int[] arrayData) {
        for(int i = 0; i < arrayData.length; i++){
            for(int j = 0; j < arrayData.length-1; j++){
                if(arrayData[j] > arrayData[j+1]){
                    int temporary = arrayData[j];
                    arrayData[j] = arrayData[j+1];
                    arrayData[j+1] = temporary;
                }
            }
        }
        System.out.println("\nSorting menggunakan Bubble Sort" + "\n" + Arrays.toString(arrayData));
    }
}
