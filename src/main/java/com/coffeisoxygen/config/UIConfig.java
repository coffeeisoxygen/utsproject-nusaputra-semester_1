package com.coffeisoxygen.config;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class UIConfig {
    public static final Insets DEFAULT_INSETS = new Insets(10, 10, 10, 10);
    public static final Border DEFAULT_EMPTY_BORDER = new EmptyBorder(10, 10, 10, 10);
    public static final Border DEFAULT_LINE_BORDER = new LineBorder(Color.BLACK);
    public static final Font DEFAULT_FONT = new Font("Arial", Font.BOLD, 14);
    public static final Color BUTTON_BACKGROUND_COLOR = new Color(70, 130, 180);
    public static final Color BUTTON_HOVER_COLOR = new Color(100, 149, 237);
    public static final Color BUTTON_FOREGROUND_COLOR = Color.WHITE;
}