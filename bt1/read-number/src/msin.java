import java.util.Scanner;

public class msin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        String inWords = convertNumberToWord(number);
        System.out.println("Number in words: " + inWords);
    }

    public static String convertNumberToWord(int number) {
        String words = "";
        int sodu;
        int thuong;

        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            words = "minus ";
            number = -number;
        }

        thuong = number / 100;
        sodu = number % 100;
        switch (thuong) {
            case 1:
                words += "one hundred ";
                break;
            case 2:
                words += "two hundred ";
                break;
            case 3:
                words += "three hundred ";
                break;
            case 4:
                words += "four hundred ";
                break;
            case 5:
                words += "five hundred ";
                break;
            case 6:
                words += "six hundred ";
                break;
            case 7:
                words += "seven hundred ";
                break;
            case 8:
                words += "eight hundred ";
                break;
            case 9:
                words += "nine hundred ";
                break;
        }

        if (sodu < 20) {
            switch (sodu) {
                case 0:
                    break;
                case 1:
                    words += "one";
                    break;
                case 2:
                    words += "two";
                    break;
                case 3:
                    words += "three";
                    break;
                case 4:
                    words += "four";
                    break;
                case 5:
                    words += "five";
                    break;
                case 6:
                    words += "six";
                    break;
                case 7:
                    words += "seven";
                    break;
                case 8:
                    words += "eight";
                    break;
                case 9:
                    words += "nine";
                    break;
                case 10:
                    words += "ten";
                    break;
                case 11:
                    words += "eleven";
                    break;
                case 12:
                    words += "twelve";
                    break;
                case 13:
                    words += "thirteen";
                    break;
                case 14:
                    words += "fourteen";
                    break;
                case 15:
                    words += "fifteen";
                    break;
                case 16:
                    words += "sixteen";
                    break;
                case 17:
                    words += "seventeen";
                    break;
                case 18:
                    words += "eighteen";
                    break;
                case 19:
                    words += "nineteen";
                    break;
            }
        } else {
            thuong = sodu / 10;
            sodu = sodu % 10;
            switch (thuong) {
                case 2:
                    words += "twenty";
                    break;
                case 3:
                    words += "thirty";
                    break;
                case 4:
                    words += "forty";
                    break;
                case 5:
                    words += "fifty";
                    break;
                case 6:
                    words += "sixty";
                    break;
                case 7:
                    words += "seventy";
                    break;
                case 8:
                    words += "eighty";
                    break;
                case 9:
                    words += "ninety";
                    break;
            }

            switch (sodu) {
                case 0:
                    break;
                case 1:
                    words += "-one";
                    break;
                case 2:
                    words += "-two";
                    break;
                case 3:
                    words += "-three";
                    break;
                case 4:
                    words += "-four";
                    break;
                case 5:
                    words += "-five";
                    break;
                case 6:
                    words += "-six";
                    break;
                case 7:
                    words += "-seven";
                    break;
                case 8:
                    words += "-eight";
                    break;
                case 9:
                    words += "-nine";
                    break;
            }
        }
        return words;
    }
}


