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
        setRows(getRows() - 1);
        System.out.println(getRows());
    }

    public void moveDown(){
        getCell().translate(0, CELL_SIZE);
        setRows(getRows() + 1);
        System.out.println(getRows());
    }

    public void moveLeft(){
        getCell().translate(- CELL_SIZE, 0);
        setCols(getCols() - 1);
        System.out.println(getCols());
    }

    public void moveRight(){
        getCell().translate(CELL_SIZE, 0);
        setCols(getCols() + 1);
        System.out.println(getCols());
    }
}
