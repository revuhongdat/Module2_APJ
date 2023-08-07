import java.util.Scanner;
public class ReadNumber {
    public static void main(String[] args) {
        int number;
        String ones = "";
        String tens = "";
        String hundreds = "";
        System.out.println("Input number :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if (number < 0) {
            System.out.println("Out of ability");
        } else if (number < 10) {
            switch (number) {
                case 1 -> ones = "One";
                case 2 -> ones = "Two";
                case 3 -> ones = "Three";
                case 4 -> ones = "Four";
                case 5 -> ones = "Five";
                case 6 -> ones = "Six";
                case 7 -> ones = "Seven";
                case 8 -> ones = "Eight";
                case 9 -> ones = "Nine";
            }
        } else if (number < 20) {
            switch (number % 10) {
                case 0 -> ones = "Ten";
                case 1 -> ones = "Eleven";
                case 2 -> ones = "Twelve";
                case 3 -> ones = "Thirteen";
                case 4 -> ones = "Fourteen";
                case 5 -> ones = "Fifteen";
                case 6 -> ones = "Sixteen";
                case 7 -> ones = "Seventeen";
                case 8 -> ones = "Eighteen";
                case 9 -> ones = "Nineteen";
            }
        } else if (number < 100) {
            switch (number / 10) {
                case 2 -> tens = "Twenty";
                case 3 -> tens = "Thirty";
                case 4 -> tens = "Forty";
                case 5 -> tens = "Fifty";
                case 6 -> tens = "Sixty";
                case 7 -> tens = "Seventy";
                case 8 -> tens = "Eighty";
                case 9 -> tens = "Ninety";

            }
            switch (number % 10) {
                case 0 -> ones = "";
                case 1 -> ones = "One";
                case 2 -> ones = "Two";
                case 3 -> ones = "Three";
                case 4 -> ones = "Four";
                case 5 -> ones = "Five";
                case 6 -> ones = "Six";
                case 7 -> ones = "Seven";
                case 8 -> ones = "Eight";
                case 9 -> ones = "Nine";
            }
        } else if (number < 1000) {
            switch (number / 100) {
                case 1 -> hundreds = "One hundred";
                case 2 -> hundreds = "Two hundred";
                case 3 -> hundreds = "Three hundred";
                case 4 -> hundreds = "Four hundred";
                case 5 -> hundreds = "Five hundred";
                case 6 -> hundreds = "Six hundred";
                case 7 -> hundreds = "Seven hundred";
                case 8 -> hundreds = "Eight hundred";
                case 9 -> hundreds = "Nine hundred";
            }
            if ((number % 100) / 10 == 0) {
                switch ((number % 100) % 10) {
                    case 0 -> ones = "";
                    case 1 -> ones = " and One";
                    case 2 -> ones = " and Two";
                    case 3 -> ones = " and Three";
                    case 4 -> ones = " and Four";
                    case 5 -> ones = " and Five";
                    case 6 -> ones = " and Six";
                    case 7 -> ones = " and Seven";
                    case 8 -> ones = " and Eight";
                    case 9 -> ones = " and Nine";
                }
            } else if ((number % 100) / 10 == 1) {
                tens = " and ";
                switch ((number % 100) % 10) {
                    case 0 -> ones = "Ten";
                    case 1 -> ones = "Eleven";
                    case 2 -> ones = "Twelve";
                    case 3 -> ones = "Thirteen";
                    case 4 -> ones = "Fourteen";
                    case 5 -> ones = "Fifteen";
                    case 6 -> ones = "Sixteen";
                    case 7 -> ones = "Seventeen";
                    case 8 -> ones = "Eighteen";
                    case 9 -> ones = "Nineteen";
                }
            } else {
                switch ((number % 100) / 10) {
                    case 2 -> tens = " and Twenty";
                    case 3 -> tens = " and Thirty";
                    case 4 -> tens = " and Forty";
                    case 5 -> tens = " and Fifty";
                    case 6 -> tens = " and Sixty";
                    case 7 -> tens = " and Seventy";
                    case 8 -> tens = " and Eighty";
                    case 9 -> tens = " and Ninety";
                }
                switch ((number % 100) % 10) {
                    case 0 -> ones = "";
                    case 1 -> ones = " One";
                    case 2 -> ones = " Two";
                    case 3 -> ones = " Three";
                    case 4 -> ones = " Four";
                    case 5 -> ones = " Five";
                    case 6 -> ones = " Six";
                    case 7 -> ones = " Seven";
                    case 8 -> ones = " Eight";
                    case 9 -> ones = " Nine";
                }
            }
        } else {
            System.out.println("Don't know!");
        }
        System.out.println(hundreds + tens + ones);
    }
}
