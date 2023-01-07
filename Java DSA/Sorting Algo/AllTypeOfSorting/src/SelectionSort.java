public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 13, -4, 12, -40, 12, 45, 90};

        for (int lastUnsorted = intArray.length - 1; lastUnsorted > 0; lastUnsorted--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsorted; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsorted);
        }
        String str = "";
        for (int i = 0; i < intArray.length; i++) {
            str += (intArray[i]) +" ";
        }
        System.out.println(str);

    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
