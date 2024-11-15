package com.coffeisoxygen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelButtons extends JPanel {
    public PanelButtons() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        // Create and customize buttons
        JButton randomizeTileButton = createButton("Randomize Tile");
        JButton mapSettingsButton = createButton("Map Settings");
        JButton playerSettingsButton = createButton("Player Settings");
        JButton startButton = createButton("Start");
        JButton stopButton = createButton("Stop");
        JButton resetButton = createButton("Reset");

        // Add buttons to the panel
        gbc.gridy = 0;
        add(randomizeTileButton, gbc);
        gbc.gridy = 1;
        add(mapSettingsButton, gbc);
        gbc.gridy = 2;
        add(playerSettingsButton, gbc);
        gbc.gridy = 3;
        add(startButton, gbc);
        gbc.gridy = 4;
        add(stopButton, gbc);
        gbc.gridy = 5;
        add(resetButton, gbc);

        setBorder(new EmptyBorder(10, 10, 10, 10));
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBackground(new Color(70, 130, 180));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(new EmptyBorder(10, 20, 10, 20));

        // Add hover effect
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(100, 149, 237));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(70, 130, 180));
            }
        });

        return button;
    }
}