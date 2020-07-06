package org.bootcamp;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.bootcamp.util.KeyboardController;

public class Main {

    public static void main(String[] args) {

        MapEditor mapEditor = new MapEditor(20, 20);
        new KeyboardController(mapEditor);
    }
}
