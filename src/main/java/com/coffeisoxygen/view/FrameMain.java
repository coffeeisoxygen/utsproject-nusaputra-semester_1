package com.coffeisoxygen.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class FrameMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Top panel
        PanelTop panelTop = new PanelTop();
        panelTop.setBorder(new EmptyBorder(10, 10, 10, 10));
        frame.add(panelTop, BorderLayout.NORTH);

        // Main panel with GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        // PanelMap on the left
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        PanelMap panelMap = new PanelMap(5, 5);
        panelMap.setBorder(new LineBorder(Color.BLACK));
        panelMap.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.add(panelMap, gbc);

        // PanelInfo on the right
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        PanelInfo panelInfo = new PanelInfo();
        panelInfo.setBorder(new LineBorder(Color.BLACK));
        panelInfo.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.add(panelInfo, gbc);

        // Create a split pane to separate PanelMap and the right side panels
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelMap, mainPanel);
        splitPane.setDividerLocation(400); // Set initial divider location
        frame.add(splitPane, BorderLayout.CENTER);

        // Legend panel at the bottom
        PanelLegend panelLegend = new PanelLegend();
        panelLegend.setBorder(new EmptyBorder(10, 10, 10, 10));
        frame.add(panelLegend, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}