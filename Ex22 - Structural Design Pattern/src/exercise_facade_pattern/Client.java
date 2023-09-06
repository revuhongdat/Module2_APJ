package exercise_facade_pattern;

public class Client {

    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade();
        randomListFacade.printRandomEventList(10,0,10);
    }
}
