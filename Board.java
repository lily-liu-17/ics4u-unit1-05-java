/*
* This is Board foot program.
*
* @author  Lily Liu
* @version 1.0
* @since   2022-09-28
* Class BoardFoot.
*/

import java.util.Scanner;

/**
* This is the Board foot.
*/
final class Board {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    *
    */
    private Board() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The start of function.
    *
    * @param width - width
    * @param length - length
    *
    * @return height
    */
    static double boardFoot(final double width, final double length) {
        final double volume = 144.0;

        final double height = volume / (width * length);

        return height;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        try {
            final Scanner input = new Scanner(System.in);
            System.out.println(
                "Enter length of board : "
            );

            final double length = Double.parseDouble(input.nextLine());

            System.out.println(
                "Enter width of the board : "
            );

            final double width = Double.parseDouble(input.nextLine());

            final double height = boardFoot(width, length);

            System.out.println(
                "\nThe height of the board is " + height + " inches."
            );
        } catch (java.lang.NumberFormatException error) {
            System.out.println("Invalid Input");
        }
        System.out.println("\nDone.");
    }
}
