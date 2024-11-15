package com.coffeisoxygen.model.tiles;

import com.coffeisoxygen.model.Player;

/*
 * subclass dari Tile: untuk kategori tile yang merupakan finish
 */
public class FinishTile extends Tile {
    public FinishTile() {
        super(ETileType.FINISHTILE);
    }

    @Override
    public void onPlayerStep(Player player) {
        // set winning condition to true with conditon player energy > 0
        if (player.getPlEnergy() > 0) {
            player.setPlIsWin(true);
        }

        // for development
        System.out.println("Player stepped on Finish Tile");
    }

}
