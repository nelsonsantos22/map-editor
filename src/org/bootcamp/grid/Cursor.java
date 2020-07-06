package org.bootcamp.grid;


import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor extends Cell {


    public enum DirectionType{
        UP,
        DOWN,
        RIGHT,
        LEFT
    }

    public Cursor() {
        super(0,0);
        getCell().setColor(Color.BLUE);
        getCell().fill();
    }


    public void moveUp(){
        getCell().translate(0, - CELL_SIZE);
        setRows(getRows() - CELL_SIZE);
    }

    public void moveDown(){
        getCell().translate(0, CELL_SIZE);
        setRows(getRows() + CELL_SIZE);
    }

    public void moveLeft(){
        getCell().translate(- CELL_SIZE, 0);
        setCols(getCols() - CELL_SIZE);
    }

    public void moveRight(){
        getCell().translate(CELL_SIZE, 0);
        setCols(getCols() + CELL_SIZE);
    }
}
