public class FindMinElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int indexMin = findMin(arr);
        System.out.println("Min is : " + arr[indexMin]);
    }
    public static int findMin(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
