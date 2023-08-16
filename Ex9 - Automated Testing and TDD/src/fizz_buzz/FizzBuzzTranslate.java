package fizz_buzz;

public class FizzBuzzTranslate {
    private int number;

    public FizzBuzzTranslate(int number) {
        this.number = number;
    }

    public FizzBuzzTranslate() {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public boolean isDivisible3 () {
        return getNumber() % 3 == 0;
    }
    public boolean isContain3 () {
        String numText = getNumber() + "";
        return numText.contains("3");
    }

    public boolean isDivisible5 () {
        return getNumber() % 5 == 0;
    }
    public boolean isContain5 () {
        String numText = getNumber() + "";
        return numText.contains("5");
    }
    public String numberToText() {
        char[] num = {'1', '2', '4', '6', '7', '8', '9'};
        String[] text = {"one", "two", "four", "six", "seven", "eight", "nine"};
        String numToString = getNumber() + "";
        StringBuilder numText = new StringBuilder();
        for (int i = 0; i < numToString.length(); i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[j] == numToString.charAt(i)) {
                    numText.append(text[j]).append(" ");
                }
            }
        }
        return numText.deleteCharAt(numText.length()-1).toString();
    }
    public String translate() {
        if (isDivisible5() && isDivisible3()) return "FizzBuzz";
        else if (isContain3() || isDivisible3()) return "Fizz";
        else if (isContain5() || isDivisible5()) return "Buzz";
        else return numberToText();
    }
}
