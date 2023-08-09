package StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch count = new StopWatch();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        count.start();
        for (int i = 0; i < array.length - 1; i++) {
             int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index =j;
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        for (int a:array) {
            System.out.println(a);
        }
        count.stop();
        count.getElapsedTime();
        System.out.println("Time : " + count.getElapsedTime());
    }
}
