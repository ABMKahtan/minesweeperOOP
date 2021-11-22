package com.tsi.training.kahtan.minesweeperoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Tile {

    //////////////////Attributes//////////////////

    private boolean isRevealed;
    private boolean isFlag;
    private List tilePosition = new ArrayList<Integer>(2);

    protected Tile() {
    }


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

    public List getTilePosition() {
        return tilePosition;
    }

    public void setTilePosition(List tilePosition) {
        this.tilePosition = tilePosition;
    }

}
