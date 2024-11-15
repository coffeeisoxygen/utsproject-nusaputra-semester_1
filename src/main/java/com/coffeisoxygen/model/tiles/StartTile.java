package com.coffeisoxygen.model.tiles;

import com.coffeisoxygen.model.Player;

/*
 * subclass dari Tile: untuk kategori tile yang merupakan start
 */
public class StartTile extends Tile {
    public StartTile() {
        super(ETileType.STARTTILE);
    }

    @Override
    public void onPlayerStep(Player player) {
        // do nothing
        // for development
        System.out.println("Player stepped on Start Tile");
    }

}
