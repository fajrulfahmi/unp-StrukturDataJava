public class No3r {
    public static String insertionSort(String str) {
        int longStr = str.length();
        char[] chars =  str.toCharArray();
        for (int i = 1; i < chars.length; ++i) {
            char temp = chars[i];
            int j = i - 1;
            while (j >= 0 && chars[j] > temp) {
                chars[j+1] = chars[j];
                j--;
            }
            chars[j+1] = temp;
        }
        str = "";
        for (int i = 0; i < longStr; i++) {
            str += Character.toString(chars[i]);
        }

        return str;
    }

    public static void main(String[] args) {

        String str = "nusantara";

        str = insertionSort(str);

        System.out.println(str);
    }
}
