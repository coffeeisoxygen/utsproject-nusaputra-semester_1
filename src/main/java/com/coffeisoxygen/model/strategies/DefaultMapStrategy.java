package com.coffeisoxygen.model.strategies;

import com.coffeisoxygen.model.tiles.FinishTile;
import com.coffeisoxygen.model.tiles.NormalTile;
import com.coffeisoxygen.model.tiles.StartTile;
import com.coffeisoxygen.model.tiles.Tile;

/*
 * class ini : digunakan untuk mengatur strategi penempatan papan permainan
 * default placement adalah 0,0 adalah StartTile
 * default lastrows cols adalah FinishTile
 * dan sisa nya akan menjadi Normaltile
 */
public class DefaultMapStrategy implements MapGenerationStrategy {

    @Override
    public void generate(final Tile[][] mapTiles) {
        for (int i = 0; i < mapTiles.length; i++) {
            for (int j = 0; j < mapTiles[i].length; j++) {
                if (i == 0 && j == 0) {
                    mapTiles[i][j] = new StartTile();
                } else if (i == mapTiles.length - 1 && j == mapTiles[i].length - 1) {
                    mapTiles[i][j] = new FinishTile();
                } else {
                    mapTiles[i][j] = new NormalTile();
                }
            }
        }

    }

}
