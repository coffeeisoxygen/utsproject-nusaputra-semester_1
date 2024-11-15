package com.coffeisoxygen.viewmodel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import com.coffeisoxygen.model.MapBoard;
import com.coffeisoxygen.model.tiles.Tile;

public class BoardViewModel {
    private MapBoard mapBoard;
    private PropertyChangeSupport support;

    public BoardViewModel(MapBoard mapBoard) {
        this.mapBoard = mapBoard;
        this.support = new PropertyChangeSupport(this);
    }

    public int getMapRows() {
        return mapBoard.getMapRows();
    }

    public int getMapCols() {
        return mapBoard.getMapCols();
    }

    public Tile getTile(int row, int col) {
        return mapBoard.getTile(row, col);
    }

    public void setTile(int row, int col, Tile tile) {
        Tile oldTile = mapBoard.getTile(row, col);
        mapBoard.setTile(row, col, tile);
        support.firePropertyChange("tile", oldTile, tile);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
}