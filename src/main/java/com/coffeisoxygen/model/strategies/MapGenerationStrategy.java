package com.coffeisoxygen.model.strategies;

import com.coffeisoxygen.model.tiles.Tile;

/*
 * interfaces untuk menyimpan Logika penempatan Tile pada board
 */
public interface MapGenerationStrategy {
    void generate(Tile[][] mapTiles);
}