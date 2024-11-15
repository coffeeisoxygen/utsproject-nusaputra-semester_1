package com.coffeisoxygen.model.tiles;

import com.coffeisoxygen.model.Player;

/*
 * subclass dari Tile: untuk kategori tile yang aman
 */
public class SafeTile extends Tile {
    public SafeTile() {
        super(ETileType.SAFETILE);
    }

    @Override
    public void onPlayerStep(Player player) {
        // do nothing
        // for development
        System.out.println("Player stepped on Safe Tile");
    }

}
