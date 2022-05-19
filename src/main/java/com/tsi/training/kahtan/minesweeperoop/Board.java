package com.tsi.training.kahtan.minesweeperoop;

import java.util.Random;

public class Board {

    //////////////////Attributes//////////////////
    private SchrodingersTile[][] board;
    private int boardSize;
    private int totalPossibleMines;
    private int xPos, yPos;

    boolean isGamePlayed;

    //////////////////Constructors////////////////
    public Board(int bSize) {
        //Running the methods and setting the board initial values here:
        setBoardSize(bSize);
        board = new SchrodingersTile[this.boardSize][this.boardSize];
        totalPossibleMines = (int)(Math.round((this.boardSize*this.boardSize)*0.25));
        fillBoard(bSize);
        playGame();
    }

    //////////////////Methods/////////////////////

    private void setBoardSize(int value) {
        this.boardSize = value;
    }

    private void fillBoard(int bSize){
        int numberOfMines = 0;
        Random rng = new Random();

        for (xPos=0; xPos < boardSize; xPos++) {

            for (yPos=0; yPos < boardSize; yPos++){
                SchrodingersTile emptyTile = new SchrodingersTile();
                this.board[xPos][yPos] = emptyTile;
            }
        }
        do {
            int bombCalcX = (int)(Math.round(rng.nextDouble()*(bSize-1)));
            int bombCalcY = (int)(Math.round(rng.nextDouble()*(bSize-1)));
            SchrodingersTile mineTile = new SchrodingersTile();

            if (this.board[bombCalcX][bombCalcY].isBomb() == false){
                mineTile.setBomb();
                this.board[bombCalcX][bombCalcY] = mineTile;
                numberOfMines++;
            }
        }while (numberOfMines < this.totalPossibleMines);
    }

    private void playGame() {
        //While Loop needed here to play the game.
        for (int i = 0; i < boardSize; i++) {
            System.out.println("\n");
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j].getDisplayString());
            }
        }
    }
}