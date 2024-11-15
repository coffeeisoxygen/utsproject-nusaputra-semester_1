package com.coffeisoxygen.view.Layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.coffeisoxygen.model.tiles.Tile;
import com.coffeisoxygen.viewmodel.BoardViewModel;

public class PanelMap extends JPanel {
    private BoardViewModel boardViewModel;
    private JPanel[][] tiles;

    public PanelMap(int rows, int cols, BoardViewModel boardViewModel) {
        this.boardViewModel = boardViewModel;
        this.tiles = new JPanel[rows][cols];
        initializeUI(rows, cols);
    }

    private void initializeUI(int rows, int cols) {
        setLayout(new GridLayout(rows, cols));

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                JPanel tile = new JPanel();
                Tile modelTile = boardViewModel.getTile(row, col);
                tile.setBackground(modelTile.getTileColor());
                tile.setBorder(new LineBorder(Color.BLACK)); // Add border to each tile

                // Create a label to display the coordinates
                JLabel label = new JLabel(row + "," + col);
                label.setFont(new Font("Arial", Font.PLAIN, 10));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                tile.add(label);

                tiles[row][col] = tile;
                add(tile);
            }
        }

        setFocusable(true);
        requestFocusInWindow();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 600);
    }

    public void updateMap() {
        for (int row = 0; row < tiles.length; row++) {
            for (int col = 0; col < tiles[row].length; col++) {
                Tile modelTile = boardViewModel.getTile(row, col);
                tiles[row][col].setBackground(modelTile.getTileColor());
                // Update the label text if needed
                JLabel label = (JLabel) tiles[row][col].getComponent(0);
                label.setText(row + "," + col);
            }
        }
        revalidate();
        repaint();
    }
}