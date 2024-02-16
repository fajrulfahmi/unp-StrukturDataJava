import java.util.Arrays;

public class No2 {
    public static void main(String[] args) {
        double[] array = {1, 0.5, 5, 3, 2.6, 10.3, 1.7, 4.1};
        printArray(array, "Data Array sebelum di sorting");
        selection(array);
    }
    public static void selection(double[] arrayData){
        for(int i = 0; i < arrayData.length; i++){
            int indexArray = i;
            for(int j = i; j < arrayData.length; j++){
                if(arrayData[indexArray] > arrayData[j]){
                    indexArray = j;
                }
            }
            double temporary = arrayData[i];
            arrayData[i] = arrayData[indexArray];
            arrayData[indexArray] = temporary;
        }
        printArray(arrayData, "\nSorting menggunakan Selection Sort");
    }
    public static void printArray(double[] arrayData, String massage) {
        System.out.println(massage + "\n" + Arrays.toString(arrayData));
    }

}
