package bubble_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        System.out.printf("%-5s", "Array:");
        for (int element : list) {
            System.out.printf("%5d", element);
        }
    }

    public static void bubbleSort(int[] array) {
        boolean checkContinue = true;
        for (int i = 0; i < array.length && checkContinue; i++) {
            checkContinue = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    checkContinue = true;
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
