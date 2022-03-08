/*
* This is Text Reverser program.
*
* @author  Abdul Basit Butt
* @version 1.0
* @since   2022-02-15
* Class Reverse.
*/

import java.util.Scanner;

/**
* This is the calculating heating time program.
*/
final class Reverse {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    *
    */
    private Reverse() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting boardCalculator() function.
    *
    * @param stringArray is any string
    *
    * @return reversed array
    */
    public static String reverseString(final String stringArray) {
        final String returnValue;
        if (stringArray.length() == 0) {
            returnValue = stringArray;
        } else {
            returnValue = reverseString(stringArray.substring(1))
                + stringArray.charAt(0);
        }
        return returnValue;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Input a text to reverse: ");
        final String input = scanner.nextLine();

        final String reversedString = reverseString(input);
        System.out.println("The reverse of " + input + " is " + reversedString);

        System.out.println("\nDone.");
    }
}
