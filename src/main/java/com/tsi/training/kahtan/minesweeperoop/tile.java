package com.tsi.training.kahtan.minesweeperoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class tile {

    //////////////////Attributes//////////////////

    boolean isMine;
    List position = new ArrayList<Integer>();
    Random numAssignment;


    //////////////////Constructors////////////////

    public Random getNumAssignment() {
        return numAssignment;
    }
    public void setVoid(){

    }



    //////////////////Methods/////////////////////

    abstract String String();

}
