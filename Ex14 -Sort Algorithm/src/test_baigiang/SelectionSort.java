package test_baigiang;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 17, 2, 4, 6, 10, 1};
        int indexMin;
        for (int i = 0; i < array.length; i++) {
            indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = array[indexMin];
                array[indexMin] = array[i];
                array[i] = temp;
            }
        }
        for (int element:array) {
            System.out.printf("%5d", element);
        }
    }
}
