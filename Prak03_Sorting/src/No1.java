import java.util.Arrays;

public class No1 {
    public static void main(String[] args) {
        int[] array = {3, 7, 11, 5, 12, 6, 16, 9};
        printArray(array, "Data Array sebelum di sorting ");
        bubble(array);

    }
    public static void bubble(int[] arrayData) {

        for(int i = 0; i < arrayData.length; i++){
            boolean k = false;
            for(int j = 0; j < arrayData.length-1; j++){
                if(arrayData[j] > arrayData[j+1]){
                    int temporary = arrayData[j];
                    arrayData[j] = arrayData[j+1];
                    arrayData[j+1] = temporary;
                    k = true;
                }
            }
            if(!k){
                break;
            }
        }
        printArray(arrayData, "\nSorting menggunakan Bubble Sort");
    }
    public static void printArray(int[] arrayData, String massage) {
        System.out.println(massage + "\n" + Arrays.toString(arrayData));
    }


}
