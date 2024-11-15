package com.coffeisoxygen;

import com.coffeisoxygen.model.MapBoard;
import com.coffeisoxygen.model.strategies.DefaultMapStrategy;
import com.coffeisoxygen.model.strategies.MapGenerationStrategy;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        MapGenerationStrategy strategy = new DefaultMapStrategy();
        MapBoard mapBoard = new MapBoard(5, 5, strategy);
        mapBoard.printMap();
        // Use mapBoard...
    }
}
