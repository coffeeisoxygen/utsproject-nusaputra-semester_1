package com.coffeisoxygen.model.tiles;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import com.coffeisoxygen.model.Player;

/*
 * menggunakan Immutable Pattern
 */
public abstract class Tile {

    private final ETileType tileType;
    private final String tileName;

    private static final Map<ETileType, Color> tileColorMap = new HashMap<>();

    static {
        tileColorMap.put(ETileType.NORMALTILE, Color.WHITE);
        tileColorMap.put(ETileType.DANGERTILE, Color.RED);
        tileColorMap.put(ETileType.FINISHTILE, Color.BLUE);
        tileColorMap.put(ETileType.STARTTILE, Color.GREEN);
        tileColorMap.put(ETileType.SAFETILE, Color.YELLOW);
        // nanti dsini tinggal tambah mapping warna atau photo misalnya
    }

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

    public Color getTileColor() {
        return tileColorMap.getOrDefault(tileType, Color.WHITE);
    }

    public abstract void onPlayerStep(Player player);
}