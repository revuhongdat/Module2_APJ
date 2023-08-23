package test_baigiang;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {8, 9, 17, 2, 4, 6, 10, 1};
        int pos, x;
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
