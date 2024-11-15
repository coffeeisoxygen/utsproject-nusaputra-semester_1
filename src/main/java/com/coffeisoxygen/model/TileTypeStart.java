package com.coffeisoxygen.model;

/*
 * subclass dari Tile: untuk kategori tile yang merupakan start
 */
public class TileTypeStart extends Tile {
    public TileTypeStart() {
        super(ETileType.STARTTILE);
    }

    @Override
    public void onPlayerStep(Player player) {
        // do nothing
        // for development
        System.out.println("Player stepped on Start Tile");
    }

}
