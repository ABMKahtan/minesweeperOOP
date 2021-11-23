package com.tsi.training.kahtan.minesweeperoop;

public class EmptyTile extends Tile{

    //////////////////Attributes//////////////////
    private int counter = 0;



    //////////////////Constructors////////////////



    //////////////////Methods/////////////////////


    public void addCounter() {
        this.counter++;
    }

    public int getCounter() {
        return counter;
    }

}
