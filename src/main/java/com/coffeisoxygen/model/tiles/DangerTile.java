package com.coffeisoxygen.model.tiles;

import com.coffeisoxygen.model.Player;

/*
 * subclass dari Tile: untuk kategori tile yang berbahaya
 */
public class DangerTile extends Tile {
    public DangerTile() {
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
