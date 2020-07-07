package org.bootcamp;

import org.bootcamp.grid.Cell;

public class Grid {

    public static final int PADDING = 10;

    
    private int cols;
    private int rows;
    private Cell[][] cell;

    public Grid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        createGrid();
    }

    public void createGrid(){


        cell = new Cell[cols][rows];
        
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

    //will return one cell in a specific location on the grid
    public Cell getCell(int col, int row){
        return cell[col][row];
    }
}
