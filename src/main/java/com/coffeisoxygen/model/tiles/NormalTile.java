package com.coffeisoxygen.model.tiles;

import com.coffeisoxygen.model.Player;

/*
 * subclass dari Tile: untuk kategori tile yang normal
 */
public class NormalTile extends Tile {
    public NormalTile() {
        super(ETileType.NORMALTILE);
    }

    @Override
    public void onPlayerStep(Player player) {
        // do nothing
        // for development
        System.out.println("Player stepped on Normal Tile");
    }

}
