package insertion_sort;

public class InsertionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void main(String[] args) {
        insertionSort(list);
        for (double e : list) {
            System.out.printf("%5.1f", e);
        }
    }

    public static void insertionSort(double[] array) {
        int pos;
        double x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
