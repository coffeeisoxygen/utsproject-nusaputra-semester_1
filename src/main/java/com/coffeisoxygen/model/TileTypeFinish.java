package com.coffeisoxygen.model;

/*
 * subclass dari Tile: untuk kategori tile yang merupakan finish
 */
public class TileTypeFinish extends Tile {
    public TileTypeFinish() {
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
