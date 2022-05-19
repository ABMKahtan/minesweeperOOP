package com.tsi.training.kahtan.minesweeperoop;

public class SchrodingersTile {

    //////////////////Attributes//////////////////
    private int counter = 0;
    private boolean isBomb;
    private boolean isRevealed;
    private boolean isFlag;
    private String displayString;

    //////////////////Constructors////////////////
    public SchrodingersTile(){
        this.isRevealed = false;
        this.isFlag = false;
        findDisplayString();
    }

    //////////////////Methods/////////////////////

    public void addCounter() {
        this.counter++;
    }

    public int getCounter() {
        return this.counter;
    }

    public boolean isBomb() {
        return this.isBomb;
    }

    public void setBomb() {
        this.isBomb = true;
        findDisplayString();
    }

    public boolean isRevealed() {
        return this.isRevealed;
    }

    public void setRevealed() {
        this.isRevealed = true;
        findDisplayString();
    }

    public boolean isFlag() {
        return this.isFlag;
    }

    public void setFlag() {
        this.isFlag = !this.isFlag;
        findDisplayString();
    }

    public String getDisplayString() {
        return this.displayString;
    }

    private void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    private void findDisplayString() // sets a deepToString for the Tile
    {
        if(!this.isRevealed && !this.isFlag){
            setDisplayString("[ 👀 ]");
        }
        else if(!this.isRevealed && this.isFlag){
            setDisplayString("[ ⛳ ]");
        }
        else if(this.isRevealed && !this.isBomb){
            if(this.counter > 0){
            setDisplayString("[ " + this.counter + " ]");
            } else {
                setDisplayString("[ _ ]");
            }
        }
        else if(this.isRevealed && isBomb){
            setDisplayString("{ 💣 }");
        }
    }
}
