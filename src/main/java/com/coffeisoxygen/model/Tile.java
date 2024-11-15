package com.coffeisoxygen.model;

abstract  class Tile {

    private ETileType tileType;
    private String tileName = "";

    // constructor default
    public Tile(ETileType type) {
        this.tileType = type;
        this.tileName = tileType.toString();
    }

    public ETileType getTileType() {
        return tileType;
    }

    public void setTileType(ETileType tileType) {
        this.tileType = tileType;
    }

    public String getTileName() {
        return tileName;
    }

    public void setTileName(String tileName) {
        this.tileName = tileName;
    }

    @Override
    public String toString() {
        return tileName;
    }

    public abstract void onPlayerStep(Player player);

}
