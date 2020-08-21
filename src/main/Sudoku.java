package main;
import java.util.Arrays;


/**
 * This class represents the Sudoku Validation
 * It prints if sudoku board is valid
 *
 * @author Andres Beltran
 * @version 1.0
 */

public class Sudoku extends SolutionBoard {
	
	private Logger logger = new Logger();
	Board sudokuBoard = new Board();
	
	
    /**
     * This method is for setting up the sudoku board
     */
    public void setup(int[][] board) {
    	
    	sudokuBoard.setBoard(board);
  
        if (sudokuBoard.getRows() != sudokuBoard.getCols() || sudokuBoard.getInnerSquareSize() == -1) {
            throw new RuntimeException("Invalid Board !");
        }
    }


    /**
     * This method check the solution for the given Sudoku
     * and returns true for valid board or false for invalid board
     *
     * @return boolean
     */
    @Override
    public boolean checkSolution() {

        int noOfRows = sudokuBoard.getRows();
        int noOfCols = sudokuBoard.getCols();
        int boardSize = sudokuBoard.getOuterSquareSize();

        //Check square
        if (noOfCols != noOfRows)
            return false;

        //Check board is initialized
        if (sudokuBoard.getBoard() == null) {
        	logger.log("Board is null. Please set the board!");
            return false;
        }


        int innerSquareSize = sudokuBoard.getInnerSquareSize();
        //copy each row to array and check the rule
        for (int i = 0; i < boardSize; i++) {
            if (!checkRule(sudokuBoard.getBoard()[i]))
                return false;
        }


        //Copy columns to and array and check the rule
        for (int j = 0; j < boardSize; j++) {
            int[] boardCol = new int[boardSize];

            for (int i = 0; i < boardSize; i++) {
                boardCol[i] = sudokuBoard.getBoard()[i][j];
            }
            //Check Column Rule
            if (!checkRule(boardCol))
                return false;
        }


        //copy elements for each inner square to an int array and check rule
        for (int i = 0; i < sudokuBoard.getInnerSquareSize(); i++) {
            int k = 0;
            int[] list = new int[boardSize];

            for (int row = i * innerSquareSize; row < (i * innerSquareSize + innerSquareSize); row++) {

                for (int column = i * innerSquareSize; column < (i * innerSquareSize + innerSquareSize); column++) {
                    list[k++] = sudokuBoard.getBoard()[row][column];
                }

            }
            if (!checkRule(list))
                return false;

        }

        return true;
    }




    /**
     * This method check the rule for each portion of the board
     * it accepts the integer array that represents a row, column or elements of inner square of the board.
     * It sorts the input and checks all numbers from 1 to n where n is the size of the board are present in
     * sequence without duplicates
     *
     * @param boardPortion
     * @return boolean
     */
    @Override
    public boolean checkRule(int[] boardPortion) {

        int boardLength = boardPortion.length;
        int[] temp = Arrays.copyOf(boardPortion, boardPortion.length);
        Arrays.sort(temp);

        for (int i = 0; i < boardLength; i++) {
            if (temp[i] != i + 1) {
                return false;
            }
        }
        return true;
    }




}