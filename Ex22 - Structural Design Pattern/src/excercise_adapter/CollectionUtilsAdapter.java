package excercise_adapter;

import java.util.*;

public class CollectionUtilsAdapter implements  CollectionOperations{
    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> linkedList = new ArrayList<>(numbers);
        return Collections.max(linkedList);
    }
}
