package com.tsi.training.kahtan.minesweeperoop;

import java.util.ArrayList;
import java.util.List;

public abstract class Tile {

    //////////////////Attributes//////////////////

    private boolean isRevealed;
    private boolean isBomb;
    private boolean isFlag = false;

    // I might not need a tilePosition value for the tiles as the array will remember what it is for the game.
    // private List tilePosition = new ArrayList<Integer>(2);


    //////////////////Constructors////////////////



    //////////////////Methods/////////////////////


    public boolean isRevealed() {
        return isRevealed;
    }

    public void setRevealed(boolean revealed) {
        isRevealed = revealed;
    }

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }

    /*
    public List getTilePosition() {
        return tilePosition;
    }

    public void setTilePosition(List tilePosition) {
        this.tilePosition = tilePosition;
    }
    */

    public boolean isBomb() {
        return isBomb;
    }

    public void setBomb(boolean value) {
        isBomb = value;
    }
}
