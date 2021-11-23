package com.tsi.training.kahtan.minesweeperoop;

public abstract class Tile {

    //////////////////Attributes//////////////////

    private boolean isRevealed = false;
    private boolean isFlag = false;

    //////////////////Constructors////////////////




    //////////////////Methods/////////////////////


    public boolean isRevealed() {
        return isRevealed;
    }

    public void setRevealed() {
        isRevealed = true;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean value) {
        isFlag = value;
    }


}
