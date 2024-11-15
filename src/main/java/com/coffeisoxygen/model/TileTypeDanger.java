package com.coffeisoxygen.model;

/*
 * subclass dari Tile: untuk kategori tile yang berbahaya
 */
public class TileTypeDanger extends Tile {
    public TileTypeDanger() {
        super(ETileType.DANGERTILE);
    }

    @Override
    public void onPlayerStep(Player player) {
        // kill player with reducing energy to -1
        player.setPlEnergy(-1);
        // for development
        System.out.println("Player stepped on Danger Tile");
    }

}
