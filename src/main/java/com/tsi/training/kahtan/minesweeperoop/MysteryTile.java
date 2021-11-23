package com.tsi.training.kahtan.minesweeperoop;

public class MysteryTile extends Tile{

    //////////////////Attributes//////////////////
    private int counter = 0;
    private boolean isBomb;


    //////////////////Constructors////////////////



    //////////////////Methods/////////////////////


    public void addCounter() {
        this.counter++;
    }

    public int getCounter() {
        return counter;
    }
    public boolean isBomb() {
        return isBomb;
    }

    public void setBomb(boolean value) {
        isBomb = value;
    }

}
