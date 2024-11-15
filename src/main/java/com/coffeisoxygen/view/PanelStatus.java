package com.coffeisoxygen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelStatus extends JPanel {

    public PanelStatus() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Image placeholder
        JLabel imageLabel = new JLabel(resizeImageIcon("/images/hiking.png", 100, 100));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(imageLabel, gbc);

        // Player Name
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        add(createLabel("Player Name:"), gbc);
        gbc.gridx = 1;
        add(createLabel("Value"), gbc);

        // Player Energy
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(createLabel("Player Energy:"), gbc);
        gbc.gridx = 1;
        add(createLabel("Value"), gbc);

        // Player Status
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(createLabel("Player Status:"), gbc);
        gbc.gridx = 1;
        add(createLabel("Value"), gbc);

        // Player Score
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(createLabel("Player Score:"), gbc);
        gbc.gridx = 1;
        add(createLabel("Value"), gbc);

        setBackground(Color.LIGHT_GRAY);
        setBorder(new EmptyBorder(10, 10, 10, 10));
    }

    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        return label;
    }

    private ImageIcon resizeImageIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }
}