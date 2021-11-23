package com.tsi.training.kahtan.minesweeperoop;

public class MysteryTile extends Tile{

    //////////////////Attributes//////////////////
    private int counter = 0;
    private boolean isBomb;
    boolean isRevealed = isRevealed();
    boolean isFlag = isFlag();


    //////////////////Constructors////////////////

    @Override
    public String toString() // sets a deeptostring for the Tile
    {
        String displayString = null;

        if(!(isRevealed && isFlag)){
            displayString = "[ ? ]";
        }
        if(!isRevealed && isFlag){
            displayString = "[ F ]";
        }
        else{
            if(!isBomb){
                displayString = "[ " + counter + " ]";
            }
            else{
                displayString = "{***}";
            }
        }
        
        return displayString;
    }



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
