package org.bootcamp.util;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.bootcamp.MapEditor;
import org.bootcamp.grid.Cursor;
import static org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent.*;

public class KeyboardController implements KeyboardHandler {

    private MapEditor mapEditor;

    public KeyboardController(MapEditor mapEditor){
       this.mapEditor = mapEditor;
        initKeyboard();
    }

    private void initKeyboard() {

        Keyboard keyboard = new Keyboard(this);
        KeyboardEvent[] events = new KeyboardEvent[4];

        for (int i = 0; i < events.length ; i++) {
            events[i] = new KeyboardEvent();
        }

        events[0].setKey(KEY_UP);
        events[0].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[1].setKey(KEY_DOWN);
        events[1].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[2].setKey(KEY_LEFT);
        events[2].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        events[3].setKey(KEY_RIGHT);
        events[3].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        for (int i = 0; i < events.length; i++) {
            keyboard.addEventListener(events[i]);
        }

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()){

            case KEY_UP:
                mapEditor.moveCursor(Cursor.DirectionType.UP);
                break;
            case KEY_DOWN:
                mapEditor.moveCursor(Cursor.DirectionType.DOWN);
                break;
            case KEY_LEFT:
                mapEditor.moveCursor(Cursor.DirectionType.LEFT);
                break;
            case KEY_RIGHT:
                mapEditor.moveCursor(Cursor.DirectionType.RIGHT);
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
