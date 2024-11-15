package com.coffeisoxygen.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class PanelMap extends JPanel {
    private int tileRows;
    private int tileColumns;
    private JPanel[][] tiles;
    private int playerRow = 0; // posisi awal
    private int playerCol = 0;

    private Color playerColor = Color.GREEN; // Warna untuk player
    private Color defaultColor = Color.WHITE; // Warna default tile

    public PanelMap(int tileRows, int tileColumns) {
        this.tileRows = tileRows;
        this.tileColumns = tileColumns;

        setLayout(new GridLayout(tileRows, tileColumns, 1, 1));
        setBackground(Color.BLACK);

        tiles = new JPanel[tileRows][tileColumns];

        for (int row = 0; row < tileRows; row++) {
            for (int col = 0; col < tileColumns; col++) {
                final int currentRow = row;
                final int currentCol = col;
                JPanel tile = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.setFont(new Font("Arial", Font.BOLD, 12));
                        g.setColor(Color.WHITE);
                        if (currentRow == playerRow && currentCol == playerCol) {
                            g.drawString("P", getWidth() / 2 - 4, getHeight() / 2 + 4);
                        }
                    }
                };
                tile.setBackground(defaultColor);
                tile.addMouseListener(new TileMouseListener(row, col));
                tiles[row][col] = tile;
                add(tile);
            }
        }

        // Atur warna tile awal player menjadi hijau
        tiles[playerRow][playerCol].setBackground(playerColor);

        setFocusable(true);
        requestFocusInWindow();
        addKeyListener(new ArrowKeyListener());
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 600);
    }

    private void updatePlayerPosition(int newRow, int newCol) {
        // Set warna tile lama kembali ke putih
        tiles[playerRow][playerCol].setBackground(defaultColor);

        // Update posisi player
        playerRow = newRow;
        playerCol = newCol;

        // Set warna tile baru menjadi warna player
        tiles[playerRow][playerCol].setBackground(playerColor);

        // Repaint hanya pada tile yang diubah
        tiles[playerRow][playerCol].repaint();
        tiles[newRow][newCol].repaint();
        // print posisi player
        System.out.println("Player position: " + playerRow + ", " + playerCol);
    }

    private class TileMouseListener extends MouseAdapter {
        private int row;
        private int col;

        public TileMouseListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            updatePlayerPosition(row, col);
            // print posisi player
            System.out.println("Mouse position: " + playerRow + ", " + playerCol);

        }
    }

    private class ArrowKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int newRow = playerRow;
            int newCol = playerCol;

            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP -> newRow = Math.max(playerRow - 1, 0);
                case KeyEvent.VK_DOWN -> newRow = Math.min(playerRow + 1, tileRows - 1);
                case KeyEvent.VK_LEFT -> newCol = Math.max(playerCol - 1, 0);
                case KeyEvent.VK_RIGHT -> newCol = Math.min(playerCol + 1, tileColumns - 1);
            }
            updatePlayerPosition(newRow, newCol);
        }
    }
}
