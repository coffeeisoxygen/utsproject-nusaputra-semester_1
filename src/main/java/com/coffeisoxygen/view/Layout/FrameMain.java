package com.coffeisoxygen.view.Layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.coffeisoxygen.viewmodel.BoardViewModel;

public class FrameMain extends JFrame {
    private BoardViewModel boardViewModel;

    public FrameMain(BoardViewModel boardViewModel) {
        this.boardViewModel = boardViewModel;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Game UI");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

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
        PanelMap panelMap = new PanelMap(boardViewModel.getMapRows(), boardViewModel.getMapCols(), boardViewModel);
        panelMap.setBorder(new LineBorder(Color.BLACK));
        mainPanel.add(panelMap, gbc);

        // PanelInfo on the right
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        PanelInfo panelInfo = new PanelInfo();
        panelInfo.setBorder(new LineBorder(Color.BLACK));
        mainPanel.add(panelInfo, gbc);

        // Create a split pane to separate PanelMap and the right side panels
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelMap, mainPanel);
        splitPane.setDividerLocation(400); // Set initial divider location
        add(splitPane, BorderLayout.CENTER);

        // Legend panel at the bottom
        PanelLegend panelLegend = new PanelLegend();
        panelLegend.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(panelLegend, BorderLayout.SOUTH);

        // Bind ViewModel to UI components
        bindViewModel(panelMap);
    }

    private void bindViewModel(PanelMap panelMap) {
        boardViewModel.addPropertyChangeListener(evt -> {
            if ("tile".equals(evt.getPropertyName())) {
                // Update the UI based on the new tile value
                panelMap.updateMap();
            }
        });
    }
}