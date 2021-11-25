package com.tsi.training.kahtan.minesweeperoop;

import java.util.Random;

public class Board {

    //////////////////Attributes//////////////////
    SchrodingersTile[][] board;
    private int boardSize;
    int totalPossibleMines;

    //////////////////Constructors////////////////
    public Board(int bSize) {
        int numberOfMines = 0;
        Random rng = new Random();
        int xPos, yPos;

        //Running the methods and setting the board initial values here:
        setBoardSize(bSize);
        board = new SchrodingersTile[boardSize][boardSize];
        totalPossibleMines = (int)(Math.round((boardSize*boardSize)*0.25));

        for (xPos=0; xPos < boardSize; xPos++) {

            for (yPos=0; yPos < boardSize; yPos++){
                SchrodingersTile emptyTile = new SchrodingersTile();
                emptyTile.setBomb(false);
                emptyTile.findDisplayString();
                board[xPos][yPos] = emptyTile;
            }
        }
        do {
            SchrodingersTile mineTile = new SchrodingersTile();
            int bombCalcX = (int)(Math.round(rng.nextDouble()*(bSize-1)));
            int bombCalcY = (int)(Math.round(rng.nextDouble()*(bSize-1)));

            if (board[bombCalcX][bombCalcY].isBomb() == false){
            mineTile.setBomb(true);
            mineTile.findDisplayString();
            board[bombCalcX][bombCalcY] = mineTile;
            numberOfMines++;
            }
        }while (numberOfMines < totalPossibleMines);

        for (int i = 0; i<boardSize;i++){
            System.out.println("\n");
            for (int j = 0; j<boardSize; j++){
                System.out.print(board[i][j].getDisplayString());
            }
        }
    }

    //////////////////Methods/////////////////////

    public void setBoardSize(int value) {
        boardSize = value;
    }
}