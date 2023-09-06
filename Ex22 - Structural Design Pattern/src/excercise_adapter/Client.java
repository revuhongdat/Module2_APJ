package excercise_adapter;

import java.util.Set;

public class Client {
    private CollectionOperations collectionOperations;

    public Client(CollectionOperations collectionOperations) {
        this.collectionOperations = collectionOperations;
    }

    public void printMaxValue(Set<Integer> numbers){
        int max = collectionOperations.findMax(numbers);
        System.out.println("Max value is: " + max);
    }
}