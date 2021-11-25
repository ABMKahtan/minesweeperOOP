package com.tsi.training.kahtan.minesweeperoop;

public abstract class Tile {

    //////////////////Attributes//////////////////

    private boolean isRevealed = false;
    private boolean isFlag = false;
    private String displayString;


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


    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }
}
