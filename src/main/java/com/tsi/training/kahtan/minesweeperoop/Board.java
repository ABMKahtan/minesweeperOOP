package com.tsi.training.kahtan.minesweeperoop;

public class Board {
    // This class is going to make the board as well as define what each tile is for the minesweeper game.
    //////////////////Attributes//////////////////
    int boardSize;
    int totalPossibleMines = (int)(Math.round((boardSize*boardSize)*0.3));
    private int numberOfMines = 0;

    //////////////////Constructors////////////////
    Tile[][] board = new Tile[boardSize][boardSize];

    public Board() {

        while (numberOfMines < totalPossibleMines){
            int xPos, yPos;
            for (xPos=0; xPos < boardSize; xPos++) {

                for (yPos=0; yPos < boardSize; yPos++){

                   int bombCalc = (int)(Math.random()*5);

                   if (bombCalc<2){
                       MysteryTile mineTile = new MysteryTile();
                       board[xPos][yPos] = mineTile;
                       mineTile.setBomb(true);
                       numberOfMines++;
                   }
                   else{
                       MysteryTile emptyTile = new MysteryTile();
                       board[xPos][yPos] = emptyTile;
                       emptyTile.setBomb(false);
                   }
                }
            }
        }

    }


    //////////////////Methods/////////////////////

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }




}
