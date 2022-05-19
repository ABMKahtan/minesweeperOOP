package com.tsi.training.kahtan.minesweeperooptest;

import com.tsi.training.kahtan.minesweeperoop.SchrodingersTile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileTest {
    SchrodingersTile testTile = new SchrodingersTile();

    @Test
    public void testIsFlag(){
        Assertions.assertEquals(false,testTile.isFlag(),"isFlag initial value is not set");
        testTile.setFlag();
        Assertions.assertEquals(true,testTile.isFlag()," isFlag value does Not change");

    }
    @Test
    public void testIsRevealed() {
        Assertions.assertEquals(false, testTile.isRevealed(), "Initial value is not set");
        testTile.setRevealed();
        Assertions.assertEquals(true, testTile.isRevealed(), "testTile cannot be revealed");


    }
    @Test
    public void testIsBomb(){
        Assertions.assertEquals(false,testTile.isBomb(),"Tile Boolean does not initialise to false");
        testTile.setBomb();
        Assertions.assertEquals(true, testTile.isBomb(),"Tile Boolean does not change to true" );
    }
    @Test
    public void testTileCounter(){
        Assertions.assertEquals(0, testTile.getCounter(), "Counter has not been initialised");
        testTile.addCounter();
        Assertions.assertEquals(1, testTile.getCounter(), "Counter does not add correctly");


    }
}
