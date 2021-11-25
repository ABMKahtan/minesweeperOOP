package com.tsi.training.kahtan.minesweeperoop;

public class SchrodingersTile extends Tile{

    //////////////////Attributes//////////////////
    private int counter = 0;
    private boolean isBomb;

    //////////////////Constructors////////////////

    public void findDisplayString() // sets a deepToString for the Tile
    {
        if(!isRevealed() && !isFlag()){
            setDisplayString("[ 👀 ]");
        }
        if(!isRevealed() && isFlag()){
            setDisplayString("[ ⛳ ]");
        }
        if(isRevealed() && !isBomb){
                setDisplayString("[ " + counter + " ]");
        }
        if(isRevealed() && isBomb){
                setDisplayString("{ 💣 }");
        }
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
