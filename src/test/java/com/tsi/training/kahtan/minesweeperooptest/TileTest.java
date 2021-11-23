package com.tsi.training.kahtan.minesweeperooptest;

import com.tsi.training.kahtan.minesweeperoop.EmptyTile;
import com.tsi.training.kahtan.minesweeperoop.Tile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileTest {
    EmptyTile testTile = new EmptyTile();

    @Test
    public void testIsFlag(){
        Assertions.assertEquals(false,testTile.isFlag(),"isFlag initial value is not set");
        testTile.setFlag(true);
        Assertions.assertEquals(true,testTile.isFlag(),"isFlag value does Not change");

    }
    @Test
    public void testIsRevealed() {
        Assertions.assertEquals(false, testTile.isRevealed(), "Initial value is not set");
        testTile.setRevealed();
        Assertions.assertEquals(true, testTile.isRevealed(), "testTile cannot be revealed");


    }
    @Test
    public void testIsBomb(){
        testTile.setBomb(true);
        Assertions.assertEquals(true, testTile.isBomb(),"Tile Boolean does not change to true" );
        testTile.setBomb(false);
        Assertions.assertEquals(false,testTile.isBomb(),"Tile Boolean does not change to false");
    }
    @Test
    public void testTileCounter(){
        Assertions.assertEquals(0, testTile.getCounter(), "Counter has not been initialised");
        testTile.addCounter();
        Assertions.assertEquals(1, testTile.getCounter(), "Counter does not add correctly");


    }
}
