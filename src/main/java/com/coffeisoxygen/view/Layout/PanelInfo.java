package com.coffeisoxygen.view.Layout;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class PanelInfo extends JPanel {

    public PanelInfo() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;

        // PanelStatus at the top
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        PanelStatus panelStatus = new PanelStatus();
        panelStatus.setBorder(new LineBorder(Color.BLACK));
        panelStatus.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(panelStatus, gbc);

        // PanelButtons at the bottom
        gbc.gridy = 1;
        PanelButtons panelButtons = new PanelButtons();
        panelButtons.setBorder(new LineBorder(Color.BLACK));
        panelButtons.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(panelButtons, gbc);
    }
}