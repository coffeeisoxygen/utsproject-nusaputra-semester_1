package com.coffeisoxygen.model;

/*
 * subclass dari Tile: untuk kategori tile yang aman
 */
public class TileTypeSafe extends Tile {
    public TileTypeSafe() {
        super(ETileType.SAFETILE);
    }

    @Override
    public void onPlayerStep(Player player) {
        // do nothing
        // for development
        System.out.println("Player stepped on Safe Tile");
    }

}
