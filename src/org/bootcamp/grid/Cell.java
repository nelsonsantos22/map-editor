package org.bootcamp.grid;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static org.bootcamp.Grid.PADDING;

public class Cell {

    public static final int CELL_SIZE = 40;

    private int cols;
    private int rows;
    private Rectangle cell;
    private boolean painted;

    public Cell(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.cell = new Rectangle(this.cols * CELL_SIZE + PADDING, this.rows * CELL_SIZE + PADDING, CELL_SIZE , CELL_SIZE);
        cell.draw();
    }

    public Rectangle getCell() {
        return cell;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public boolean isPainted() {
        return painted;
    }

    public void setPainted(boolean painted) {
        this.painted = painted;
    }

    public void paint(){
        setPainted(true);
        cell.fill();
    }

    public void erase(){
        setPainted(false);
        cell.draw();
    }

}
