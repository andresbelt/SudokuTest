package main;


public class Board {
 
	private int rows;
	private int cols;
	
	private int outerSquareSize;
	private int innerSquareSize;
	private int[][] board;
	
    /**
     * Get the no of rows in the game
     *
     * @return rows
     */
    public int getRows() {
        return rows;
    }


    /**
     * get the no of columns
     *
     * @return cols
     */
    public int getCols() {
        return cols;
    }

 

    /**
     * get outer square size
     *
     * @return getOuterSquareSize
     */
    public int getOuterSquareSize() {
        return outerSquareSize;

    }


    /**
     * get inner square size
     *
     * @return innerSquareSize
     */
    public int getInnerSquareSize() {
        return innerSquareSize;
    }

  
    /**
     * get the game board array
     *
     * @return board
     */
    public int[][] getBoard() {
        return board;
    }
    
    /**
     * This method accepts a integer number
     * Computes the square root.
     * it returns -1 when the give number is not a perfect square root.
     *
     * @param n
     * @return
     */

    private final int getSquareRoot(int n) {
        if (n < 0)
            return -1;

        switch ((int) (n)) {
            case 0:
            case 1:
            case 4:
            case 9:
                int squareRoot = (int) Math.sqrt(n);

                if (squareRoot * squareRoot == n)
                    return squareRoot;
                else
                    return -1;

            default:
                return -1;
        }
    }
    


    /**
     * set board
     *
     * @param board
     */
    public void setBoard(int[][] board) {
    		this.board = board;
            rows = board.length;
            cols = board[0].length;
            outerSquareSize = rows;
            innerSquareSize = getSquareRoot(outerSquareSize);
       
    }


}