package com.tsi.training.kahtan.minesweeperoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Tile {

    //////////////////Attributes//////////////////

    boolean isRevealed = false;
    boolean isFlag = false;
    List tilePosition = new ArrayList<Integer>(2);
    Random numAssignment;


    //////////////////Constructors////////////////

    public Random getNumAssignment() {
        return numAssignment;
    }



    //////////////////Methods/////////////////////

    public void putFlagOnTile(){
        if (isFlag = false){
            isFlag = true;
        }
        if (isFlag = true){
            isFlag = false;
        }
    }




}
