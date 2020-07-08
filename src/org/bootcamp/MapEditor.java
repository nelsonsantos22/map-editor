package org.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.bootcamp.grid.Cell;
import org.bootcamp.grid.Cursor;


public class MapEditor {

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
            directionType == Cursor.DirectionType.DOWN && cursor.getRows() == grid.getRows() - 1||
            directionType == Cursor.DirectionType.LEFT && cursor.getCols() == 0||
            directionType == Cursor.DirectionType.RIGHT && cursor.getCols() == grid.getCols() - 1){

            return true;
        }
        return false;
    }

    public void printOrErase(){

        Cell cellState = grid.getCell(cursor.getCols(), cursor.getRows());

        if(!cellState.isPainted()){
            cellState.paint();
            return;
        }
        cellState.erase();
    }

    public void clearAll(){

        for (int i = 0; i < grid.getRows(); i++) {
            for (int j = 0; j < grid.getCols(); j++) {
                if(grid.getCell(j, i).isPainted()){
                    grid.getCell(j, i).erase();
                }
            }
        }
    }
}
