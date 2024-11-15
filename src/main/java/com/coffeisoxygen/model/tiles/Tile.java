package com.coffeisoxygen.model.tiles;

import com.coffeisoxygen.model.Player;

/*
 * menggunakan Immutable Pattern
 */
public abstract class Tile {

    private final ETileType tileType;
    private final String tileName;

    public Tile(ETileType type) {
        this.tileType = type;
        this.tileName = type.toString();
    }

    public ETileType getTileType() {
        return tileType;
    }

    public String getTileName() {
        return tileName;
    }

    public abstract void onPlayerStep(Player player);
}