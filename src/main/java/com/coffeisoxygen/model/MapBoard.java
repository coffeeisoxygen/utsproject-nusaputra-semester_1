package com.coffeisoxygen.model;
/*
 * class ini : digunakan untuk mengatur papan permainan
 * Kita akan menggunakan array 2 dimensi untuk menyimpan tile
 * Kita akan menggunakan startegy design pattern untuk mengatur papan permainan
 */

import com.coffeisoxygen.model.strategies.MapGenerationStrategy;
import com.coffeisoxygen.model.tiles.Tile;

public class MapBoard {
    private int mapRows;
    private int mapCols;
    private Tile[][] mapTiles;

    // constructor
    public MapBoard(int mapRows, int mapCols, MapGenerationStrategy strategy) {
        this.mapRows = mapRows;
        this.mapCols = mapCols;
        this.mapTiles = new Tile[mapRows][mapCols];

        // Memanggil strategi untuk mengisi mapTiles
        strategy.generate(mapTiles);
    }

    /*
     * default placement akan menggunakan startegy design pattern
     */
    public int getMapRows() {
        return mapRows;
    }

    public void setMapRows(int mapRows) {
        this.mapRows = mapRows;
    }

    public int getMapCols() {
        return mapCols;
    }

    public void setMapCols(int mapCols) {
        this.mapCols = mapCols;
    }

    public Tile[][] getMapTiles() {
        return mapTiles;
    }

    public void setMapTiles(Tile[][] mapTiles) {
        this.mapTiles = mapTiles;
    }

    public Tile getTile(int row, int col) {
        return mapTiles[row][col];
    }

    public void setTile(int row, int col, Tile tile) {
        mapTiles[row][col] = tile;
    }

}
