package excercise_adapter;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(5);
        integerSet.add(20);
        integerSet.add(15);
        CollectionUtilsAdapter collectionUtilsAdapter = new CollectionUtilsAdapter();
        Client client = new Client(collectionUtilsAdapter);
        client.printMaxValue(integerSet);
    }
}