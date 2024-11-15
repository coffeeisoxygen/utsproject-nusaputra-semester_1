package com.coffeisoxygen;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.coffeisoxygen.model.MapBoard;
import com.coffeisoxygen.model.strategies.MapGenerationStrategy;
import com.coffeisoxygen.model.tiles.Tile;



public class MapBoardTest {

    private MapBoard mapBoard;
    private MapGenerationStrategy strategy;

    @Before
    public void setUp() {
        strategy = Mockito.mock(MapGenerationStrategy.class);
        mapBoard = new MapBoard(5, 5, strategy);
    }

    @Test
    public void testConstructorAndInitialState() {
        assertEquals(5, mapBoard.getMapRows());
        assertEquals(5, mapBoard.getMapCols());
        assertNotNull(mapBoard.getMapTiles());
        Mockito.verify(strategy).generate(Mockito.any(Tile[][].class));
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
    public void testGetAndSetMapTiles() {
        Tile[][] newTiles = new Tile[10][10];
        mapBoard.setMapTiles(newTiles);
        Assert.assertArrayEquals(newTiles, mapBoard.getMapTiles());
    }

    @Test
    public void testGetAndSetTile() {
        Tile tile = Mockito.mock(Tile.class);
        mapBoard.setTile(0, 0, tile);
        assertEquals(tile, mapBoard.getTile(0, 0));
    }
}