package com.coffeisoxygen;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

import com.coffeisoxygen.model.MapBoard;
import com.coffeisoxygen.model.strategies.DefaultMapStrategy;
import com.coffeisoxygen.model.strategies.MapGenerationStrategy;
import com.coffeisoxygen.model.tiles.NormalTile;
import com.coffeisoxygen.model.tiles.Tile;

public class MapBoardTest {

    private MapBoard mapBoard;
    private MapGenerationStrategy strategy;

    @Before
    public void setUp() {
        strategy = new DefaultMapStrategy();
        mapBoard = new MapBoard(5, 5, strategy);
    }

    @Test
    public void testConstructorAndInitialState() {
        assertEquals(5, mapBoard.getMapRows());
        assertEquals(5, mapBoard.getMapCols());
        assertNotNull(mapBoard.getMapTiles());
    }

    @Test
    public void testGetAndSetMapRows() {
        mapBoard.setMapRows(10);
        assertEquals(10, mapBoard.getMapRows());
    }

    @Test
    public void testGetAndSetMapCols() {
        mapBoard.setMapCols(10);
        assertEquals(10, mapBoard.getMapCols());
    }

    @Test
    public void testGetAndSetTile() {
        Tile tile = new NormalTile(); // Use a concrete subclass of Tile
        mapBoard.getMapTiles()[0][0] = tile;
        assertEquals(tile, mapBoard.getMapTiles()[0][0]);
    }

    @Test
    public void testGetAndSetMapTiles() {
        Tile[][] newTiles = new Tile[5][5];
        mapBoard.setMapTiles(newTiles);
        Assert.assertArrayEquals(newTiles, mapBoard.getMapTiles());
    }
}