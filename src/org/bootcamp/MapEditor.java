package org.bootcamp;

import org.bootcamp.grid.Cell;
import org.bootcamp.grid.Cursor;


public class MapEditor {


    private Cell cell;
    private Grid grid;
    private Cursor cursor;


    public MapEditor(int cols, int rows){
        this.grid = new Grid(cols,rows);
        this.cursor = new Cursor();
    }


    public void moveCursor(Cursor.DirectionType directionType){

        if(cursorOnEdge(directionType)){
            return;
        }

        switch (directionType){
            case UP:
                cursor.moveUp();
                break;
            case DOWN:
                cursor.moveDown();
                break;
            case LEFT:
                cursor.moveLeft();
                break;
            case RIGHT:
                cursor.moveRight();
                break;
        }

    }

    public boolean cursorOnEdge(Cursor.DirectionType directionType){

        if (directionType == Cursor.DirectionType.UP && cursor.getRows() == 0 ||
            directionType == Cursor.DirectionType.DOWN && cursor.getRows() == grid.getRows() * Cell.CELL_SIZE - Cell.CELL_SIZE||
            directionType == Cursor.DirectionType.LEFT && cursor.getCols() == 0||
            directionType == Cursor.DirectionType.RIGHT && cursor.getCols() == grid.getCols() * Cell.CELL_SIZE - Cell.CELL_SIZE){

            return true;
        }
        return false;
    }

}
