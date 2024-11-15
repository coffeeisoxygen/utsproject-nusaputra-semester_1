package com.coffeisoxygen.model;

/*
 * subclass dari Tile: untuk kategori tile yang normal
 */
public class TileTypeNormal extends Tile {
    public TileTypeNormal() {
        super(ETileType.NORMALTILE);
    }

    @Override
    public void onPlayerStep(Player player) {
        // do nothing
        // for development
        System.out.println("Player stepped on Normal Tile");
    }

}
