package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameRulesTest {
	IGameBoard gameBoardWin;
	IGameBoard gameBoardDraw;
	IGameRules gameRules;
	
	@BeforeEach
	void init() {
		gameBoardWin = new GameBoard();
		gameBoardDraw = new GameBoard();	
		gameRules = new GameRules();
		
		gameBoardDraw.setSize(3);
		char[][] board = {{'X', 'X', 'O'},
						  {'O', 'O', 'X'},
						  {'X', 'O', 'X'}};
		gameBoardDraw.setBoard(board);
	}

	@Test
	void testCheckWin() {
		// row
		gameBoardWin.setSize(3);
		char[][] board = {{'X', 'X', 'X'},
						  {' ', 'O', ' '},
						  {' ', 'O', ' '}};
		gameBoardWin.setBoard(board);
		assertTrue(gameRules.checkWin(gameBoardWin));
		
		
		// Column
		gameBoardWin.setSize(3);
		char[][] board2 = {{'X', ' ', 'O'},
						   {'X', ' ', 'O'},
						   {'X', ' ', ' '}};
		gameBoardWin.setBoard(board2);
		assertTrue(gameRules.checkWin(gameBoardWin));
		
		// Diagonal
		gameBoardWin.setSize(3);
		char[][] board3 = {{'X', ' ', 'O'},
						   {' ', 'X', 'O'},
						   {' ', ' ', 'X'}};
		gameBoardWin.setBoard(board3);
		assertTrue(gameRules.checkWin(gameBoardWin));
	}	

	@Test
	void testCheckDraw() {
		assertTrue(gameRules.checkDraw(gameBoardDraw));
	}

}
