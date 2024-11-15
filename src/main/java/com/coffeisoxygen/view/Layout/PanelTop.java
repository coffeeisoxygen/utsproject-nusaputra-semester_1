package com.coffeisoxygen.view.Layout;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTop extends JPanel {

    private String stringMovementPlan = "LLLLUUUDDDRRRDD"; // Sample movement plan
    private String currentMovement = "L";

    public PanelTop() {
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // Create a label
        JLabel movementPlanLabel = new JLabel("Movement Plan: ");
        add(movementPlanLabel); // Add the label to the panel

        // Create a label for each movement character
        for (int i = 0; i < stringMovementPlan.length(); i++) {
            JLabel movementCharLabel = new JLabel(String.valueOf(stringMovementPlan.charAt(i)));
            add(movementCharLabel); // Add each movement label to the panel
        }

        // Create A Current Movement Holder
        JLabel currentMovementLabel = new JLabel("Current Movement: " + currentMovement);
        currentMovementLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        currentMovementLabel.setFont(currentMovementLabel.getFont().deriveFont(20.0f));
        currentMovementLabel.setForeground(java.awt.Color.RED);
        add(currentMovementLabel); // Add the label to the panel

        // Add a border around the panel
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }
}