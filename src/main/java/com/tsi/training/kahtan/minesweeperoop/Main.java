package com.tsi.training.kahtan.minesweeperoop;

public class Main {
    public static void main(String[] args){
        Board gameBoard = new Board();
        gameBoard.setBoardSize(10);
        System.out.println(gameBoard.toString());
    }
}
