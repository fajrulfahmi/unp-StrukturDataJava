public class No2 {
    public static void main(String[] args) {
        int[] array = {12, 8, 100, -45, 3, -1};
        int min = array[0];
        int max = array[0];

        for(int i = 0; i <array.length; i++){
            if(array[i] < min){
                min = array[i];

            }else if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("nilai minimal array = " + min);
        System.out.println("nilai maksimal array = " + max);
    }
}
