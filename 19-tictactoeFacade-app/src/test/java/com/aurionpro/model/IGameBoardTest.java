package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IGameBoardTest {
	IGameBoard gameBoard;
	
	@BeforeEach
	void init(){
		gameBoard =  new GameBoard();
	}
	
	
	@Test
	void testSetSize() {
		int size = 3;
		gameBoard.setSize(3);
		assertEquals(size, gameBoard.getBoard().length);
		
		size=4;
		gameBoard.setSize(4);
		assertEquals(size, gameBoard.getBoard().length);
	}

	@Test
	void testMakeMove() {
		gameBoard.setSize(3);
		char player='X';
		gameBoard.makeMove(1, 2, player);
		assertEquals('X',gameBoard.getBoard()[1][2]);
		
		gameBoard.setSize(4);
		player='O';
		gameBoard.makeMove(3, 3, player);
		assertEquals('O',gameBoard.getBoard()[3][3]);
	}

}
