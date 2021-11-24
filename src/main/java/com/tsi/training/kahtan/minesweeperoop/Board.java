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

        //Running the methods and setting the board initial values here:
        setBoardSize(bSize);
        board = new SchrodingersTile[boardSize][boardSize];
        totalPossibleMines = (int)(Math.round((boardSize*boardSize)*0.25));

        while (numberOfMines < totalPossibleMines){
            int xPos, yPos;
            for (xPos=0; xPos < boardSize; xPos++) {

                for (yPos=0; yPos < boardSize; yPos++){

                    int bombCalc = (int)(Math.round(rng.nextDouble()*4));

                   if (bombCalc<1){
                       SchrodingersTile mineTile = new SchrodingersTile();
                       mineTile.setBomb(true);
                       mineTile.findDisplayString();
                       board[xPos][yPos] = mineTile;
                       numberOfMines++;


                   }
                   else{
                       SchrodingersTile emptyTile = new SchrodingersTile();
                       emptyTile.setBomb(false);
                       emptyTile.findDisplayString();
                       board[xPos][yPos] = emptyTile;

                   }
                }
            }
        }
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