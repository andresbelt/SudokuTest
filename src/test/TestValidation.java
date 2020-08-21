package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Sudoku;

class TestValidation {

	
	@Test
	public void validBoxesOnly() {
	  int[][] BOARD = {
	      {1, 2, 3, 1, 2, 3, 1, 2, 3},
	      {4, 5, 6, 4, 5, 6, 4, 5, 6},
	      {7, 8, 9, 7, 8, 9, 7, 8, 9},
	      {1, 2, 3, 1, 2, 3, 1, 2, 3},
	      {4, 5, 6, 4, 5, 6, 4, 5, 6},
	      {7, 8, 9, 7, 8, 9, 7, 8, 9},
	      {1, 2, 3, 1, 2, 3, 1, 2, 3},
	      {4, 5, 6, 4, 5, 6, 4, 5, 6},
	      {7, 8, 9, 7, 8, 9, 7, 8, 9}
	  };

	  Sudoku game = new Sudoku();
	  game.setup(BOARD);

	  assertEquals(false, game.checkSolution());
	}

	
	
	
	@Test
	public void s() {
	  int[][] BOARD = {
	      {1, 2, 3, 1, 2, 3, 1, 2, 3},
	      {4, 5, 6, 4, 5, 6, 4, 5, 6},
	      {7, 8, 9, 7, 8, 9, 7, 8, 9},
	      {1, 2, 3, 1, 2, 3, 1, 2, 3},
	      {4, 5, 6, 4, 5, 6, 4, 5, 6},
	      {7, 8, 9, 7, 8, 9, 7, 8, 9},
	      {1, 2, 3, 1, 2, 3, 1, 2, 3},
	      {4, 5, 6, 4, 5, 6, 4, 5, 6},
	      {7, 8, 9, 7, 8, 9, 7, 8, 9}
	  };

	  Sudoku game = new Sudoku();
	  game.setup(BOARD);

	  assertEquals(true, game.checkSolution());
	}


}
