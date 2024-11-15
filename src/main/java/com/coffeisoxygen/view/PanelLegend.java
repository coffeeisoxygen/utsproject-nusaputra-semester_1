package com.coffeisoxygen.view;

/*
 * Panel that will hold the legend of the game at the bottom of the frame.
 * Including the Colour Representaton Of A tile with a smallbox of colour and the meaning of the colour.
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelLegend extends JPanel {

    private String legend = "P = Player, X = Wall, O = Path, E = Exit";

    public PanelLegend() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Centered, with spacing

        for (String item : legend.split(", ")) {
            JPanel legendItemPanel = createLegendItemPanel(item);
            add(legendItemPanel);
        }
    }

    private JPanel createLegendItemPanel(String item) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0)); // Left aligned, with spacing

        String[] parts = item.split(" = ");
        String colorCode = parts[0];
        String meaning = parts[1];

        JLabel colorLabel = new JLabel();
        colorLabel.setOpaque(true);
        colorLabel.setBackground(getColorFromCode(colorCode));
        colorLabel.setPreferredSize(new Dimension(15, 15)); // Smaller size

        JLabel meaningLabel = new JLabel(meaning);

        panel.add(colorLabel);
        panel.add(meaningLabel);

        return panel;
    }

    private Color getColorFromCode(String code) {
        return switch (code) {
            case "P" -> Color.GREEN;
            case "X" -> Color.GRAY;
            case "O" -> Color.WHITE;
            case "E" -> Color.RED;
            default -> Color.BLACK;
        };
    }
}