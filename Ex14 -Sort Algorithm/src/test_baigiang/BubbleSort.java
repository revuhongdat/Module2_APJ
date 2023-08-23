package test_baigiang;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 17, 2, 4, 6, 10, 1};
        boolean checkContinue = true;
        for (int i = 0; i < array.length && checkContinue; i++) {
            checkContinue = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] > array[j - 1]) {
                    checkContinue = true;
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.printf("%-5s", "Array:");
        for (int element : array) {
            System.out.printf("%5d", element);
        }
    }
}
