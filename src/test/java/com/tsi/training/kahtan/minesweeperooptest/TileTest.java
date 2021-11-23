package com.tsi.training.kahtan.minesweeperooptest;

import com.tsi.training.kahtan.minesweeperoop.EmptyTile;
import com.tsi.training.kahtan.minesweeperoop.MineTile;
import com.tsi.training.kahtan.minesweeperoop.Tile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileTest {

    @Test
    public void testIsFlag(){
        Tile testTile = new EmptyTile();
        Assertions.assertEquals(false,testTile.isFlag(),"Initial Value Is Incorrect!");


    }


}
