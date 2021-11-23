package com.tsi.training.kahtan.minesweeperoop;

public class Board {
    // This class is going to make the board as well as define what each tile is for the minesweeper game.
    //////////////////Attributes//////////////////
    int boardSize = 10;
    int totalPossibleMines = (int)(Math.round((boardSize*boardSize)*0.3));


    //////////////////Constructors////////////////
    SchrodingersTile[][] board = new SchrodingersTile[boardSize][boardSize];

    public Board() {
        int numberOfMines = 0;

        while (numberOfMines < totalPossibleMines){
            int xPos, yPos;
            for (xPos=0; xPos < boardSize; xPos++) {

                for (yPos=0; yPos < boardSize; yPos++){

                   int bombCalc = (int)(Math.random()*5);

                   if (bombCalc<2){
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


    }


    //////////////////Methods/////////////////////

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public void displayBoard(){

        for (int i = 0; i<boardSize;i++){
            System.out.println("\n");

            for (int j = 0; j<boardSize; j++){
                System.out.print(board[i][j].getDisplayString());
            }
        }
    }


}
