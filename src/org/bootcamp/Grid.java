package org.bootcamp;

import org.bootcamp.grid.Cell;

public class Grid {

    public static final int PADDING = 10;

    
    private int cols;
    private int rows;

    public Grid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        createGrid();
    }

    public void createGrid(){


        Cell[][] cell = new Cell[cols][rows];
        
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols ; col++) {
                cell[col][row] = new Cell(col, row);

            }
        }

    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }
}
