import java.util.Arrays;

public class No3 {
    public static void main(String[] args) {
        String[] array = {"n", "u", "s", "a", "n", "t", "a", "r", "a"};
        printArray(array, "Data Array sebelum di sorting");
        insertion(array);
    }
    public static void insertion(String[] arrayData){
        for(int i = 1; i < arrayData.length; i++){
            for(int j = i; j > 0; j--){
                if(arrayData[j].compareTo(arrayData[j-1]) < 0){
                    String temporary = arrayData[j];
                    arrayData[j] = arrayData[j-1];
                    arrayData[j-1] = temporary;
                }
            }
        }
        printArray(arrayData, "\nSorting menggunakan Insertion Sort");
    }
    public static void printArray(String[] arrayData, String massage) {
        System.out.println(massage + "\n" + Arrays.toString(arrayData));
    }
}
