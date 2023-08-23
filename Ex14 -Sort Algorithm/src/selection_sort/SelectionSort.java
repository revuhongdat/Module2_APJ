package selection_sort;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void main(String[] args) {
        selectionSort(list);
        for (double e : list) {
            System.out.printf("%5.1f", e);
        }
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currentIndexMin = i;
            for (int j = i+1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentIndexMin = j;
                }
            }
            if (currentIndexMin != i) {
                list[currentIndexMin] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
