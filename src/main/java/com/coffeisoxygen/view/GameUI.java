package com.coffeisoxygen.view;

import com.coffeisoxygen.model.MapBoard;
import com.coffeisoxygen.model.strategies.DefaultMapStrategy;
import com.coffeisoxygen.model.strategies.MapGenerationStrategy;
import com.coffeisoxygen.view.Layout.FrameMain;
import com.coffeisoxygen.viewmodel.BoardViewModel;

public class GameUI {
    private FrameMain frameMain;
    private BoardViewModel boardViewModel;

    public GameUI() {
        // Initialize the model and ViewModel
        MapGenerationStrategy strategy = new DefaultMapStrategy();
        MapBoard mapBoard = new MapBoard(6, 12, strategy);
        this.boardViewModel = new BoardViewModel(mapBoard);

        // Initialize the main frame and pass the ViewModel
        this.frameMain = new FrameMain(boardViewModel);
    }

    public void show() {
        frameMain.setVisible(true);
    }

    public static void main(String[] args) {
        GameUI gameUI = new GameUI();
        gameUI.show();
    }
}