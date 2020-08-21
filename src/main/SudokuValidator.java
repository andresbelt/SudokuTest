package main;


/**
 * This class validates the given sudoku plus input and print the result as valid or invalid.
 * <p/>
 *
 * @author Andres Beltran
 * @version 1.0
 */

public class SudokuValidator {
	

	public static int[][] BOARD = 
			{
		     {5, 3, 4, 6, 7, 8, 9, 1, 2},
		     {6, 7, 2, 1, 9, 5, 3, 4, 8},
		     {1, 9, 8, 3, 4, 2, 5, 6, 7},
		     {8, 5, 9, 7, 6, 1, 4, 2, 3},
		     {4, 2, 6, 8, 5, 3, 7, 9, 1},
		     {7, 1, 3, 9, 2, 4, 8, 5, 6},
		     {9, 6, 1, 5, 3, 7, 2, 8, 4},
		     {2, 8, 7, 4, 1, 9, 6, 3, 5},
		     {3, 4, 5, 2, 8, 6, 1, 7, 9}
		   };
	
	
	public static void main(String[] args) {

			validateSolution(BOARD);
						
	}


	private static void validateSolution(int[][] BOARD) {
		
			Logger logger = new Logger();
			
	        //Create the Sudoku
			Sudoku game = new Sudoku();
			game.setup(BOARD);

	        boolean isCorrect = game.checkSolution();
	        if (isCorrect) {
	        	logger.log("true");
	        } else {
	        	logger.log("false");
	        }
	}

}
