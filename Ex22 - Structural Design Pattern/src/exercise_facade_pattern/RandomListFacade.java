package exercise_facade_pattern;

import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade() {
        randomList = new RandomList();
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
    }

    public void printRandomEventList(int size, int min, int max) {
        List<Integer> createRandomList = randomList.generateList(size, min, max);
        List<Integer> createFilterList = listFilter.filterOdd(createRandomList);
        listPrinter.printList(createFilterList);
    }
}
