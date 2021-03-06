import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] intArr;
    static char[] charArr;
    static int size;
    static boolean isChar = false;   // false = integer, true = char

    private static void printMenu() {
        System.out.println("Choose the number of operation you want to execute:");
        System.out.println("1-\tMost repeated value");
        System.out.println("2-\tSort");
        System.out.println("3-\tShuffle");
        System.out.println("4-\tFind the largest prime");
        System.out.println("5-\tFind the smallest prime");
        System.out.println("6-\tCheck palindrome");
        System.out.println("7-\tCheck sorted");
        System.out.println("8-\tCount primes");
        System.out.println("9-\tReverse array");
        System.out.println("10-\tShift array");
        System.out.println("11-\tDistinct array");
        System.out.println("12-\tGet the maximum 3 numbers");
        System.out.println("13-\tGet the minimum 3 numbers");
        System.out.println("14-\tGet average");
        System.out.println("15-\tGet median");
        System.out.println("16-\tReturn only primes");
        System.out.println("17-\tZero if less than zero");
        System.out.println("18-\tExecute All");
    }

    public static void getMin3Numbers() {
        if (isChar) {
            Arrays.sort(charArr);
            System.out.print("Minimum 3 characters are: ");
            for (int i = 0; i < 3 && i < size; i++)
                System.out.print(charArr[i] + " ");
            System.out.println();
        } else {
            Arrays.sort(intArr);
            System.out.print("Minimum 3 numbers are: ");
            for (int i = 0; i < 3 && i < size; i++)
                System.out.print(intArr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The number of the input type:\n1- Character\n2- Integer");
        int type = in.nextInt();
        if (type == 1) {
            isChar = true;
        }
        System.out.print("Enter The Size of the Array: ");
        size = in.nextInt();
        System.out.println("Enter " + size + " Elements of the array");
        if (isChar) {
            charArr = new char[size];
            for (int i = 0; i < size; i++) {
                charArr[i] = in.next().charAt(0);
            }
        } else {
            intArr = new int[size];
            for (int i = 0; i < size; i++) {
                intArr[i] = in.nextInt();
            }
        }
        printMenu();
        int choice = in.nextInt();
        switch (choice) {
            case 13:
                getMin3Numbers();
                break;
            case 18: // Execute All
                getMin3Numbers();
                break;
        }
    }
}
