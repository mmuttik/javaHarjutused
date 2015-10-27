package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kasutaja on 18.10.2015.
 */
public class Laevad_9x9 {
    public static void main(String[] args) {

        int boardRows    = 3;
        int boardColumns = 3;

        int[][] board = new int[boardRows][boardColumns];

        for (int a = 0; a < boardRows; a++) { //Checks for rows
            for (int b = 0; b < boardColumns; b++) { //Checks for columns
                board[a][b] = randShip(); //Fills board with ships
            }
        }
        for (int a = 0; a < boardRows; a++) {
            System.out.println(Arrays.toString(board[a])); //Prints board until it has printed out all lines
        }

        while (continuegame(board, boardRows, boardColumns)) {

            Scanner user1 = new Scanner(System.in);
            System.out.println("Please, pick a row between 1 and " + board.length);
            int row = (user1.nextInt() - 1); //Asks for row, +1 for user friendliness

            Scanner user2 = new Scanner(System.in);
            System.out.println("Please, pick a column between 1 and " + board.length);
            int column = (user2.nextInt() - 1); //Asks for column, +1 for use friendliness

            System.out.println("You picked row number " + (row + 1) + " and column number " + (column + 1));

            if (board[row][column] == 1) { //Check for hit
                System.out.println("It's a hit!");
            } else {
                System.out.println("That's a bad miss");
            }

            if (board[row][column] == 2) {//Check for second attempt
                System.out.println("You already tried this, noob!");
            }

            if (board[row][column] == 1) { //If hit, mark sunken
                board[row][column] = 2;
            }
        }
        System.out.println("Would you like to play a game?");

    }


    public static int randShip() {
        int ship = (int) (Math.random() * 2); //Generates 0 or 1
        return ship;
    }

    public static boolean continuegame(int[][] board, int boardRows, int boardColumns) {
        for (int a = 0; a < boardRows; a++) {
            for (int b = 0; b < boardColumns; b++) {
                if (board[a][b] == 1) {
                    return true;
                }
            }
        }
        return false;
    }

}

