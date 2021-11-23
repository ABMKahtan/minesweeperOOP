package com.tsi.training.kahtan.minesweeperoop;

public class Board {
    // This class is going to make the board as well as define what each tile is for the minesweeper game.
    //////////////////Attributes//////////////////
    //use getter and setter for the boardSize
    private int boardSize = 10;
    private int totalMines = (int)((boardSize*0.3)+1);
    private int numberOfMines = 0;

    //////////////////Constructors////////////////
    Tile[][] board = new Tile[boardSize][boardSize];

    public Board() {

        while (numberOfMines<totalMines){
            int xPos, yPos;
            for (xPos=0; xPos < boardSize; xPos++) {

                for (yPos=0; yPos < boardSize; yPos++){

                   int bombCalc = (int)(Math.random()*5);

                   if (bombCalc<2){
                       MineTile nt = new MineTile();
                       board[xPos][yPos] = nt;
                       nt.setBomb(true);
                       numberOfMines++;
                   }
                   else{
                       board[xPos][yPos] = new EmptyTile();
                   }
                }
            }

            //nested for loop for iterating through 2d array
            numberOfMines++;
        }

        board[0][0] = new EmptyTile();
    }


    //////////////////Methods/////////////////////

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }




}
