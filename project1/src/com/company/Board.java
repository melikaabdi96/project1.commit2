package com.company;

import javafx.scene.control.Cell;

public class Board {
    private static Board instance;
    private final int column;
    private final int row;
    private int x;
    private int y;
    public Cell board[][];
    private boolean firstBoard = true;

    public Board() {
        this.column = 13;
        this.row = 9;
        this.x = x;
        this.y = y;
        this.board = new Cell[row][column];
    }

    synchronized public static Board getInstance()
    {
        if (instance == null)
        {
            // if instance is null, initialize
            instance = new Board();
        }
        return instance;
    }
    public int getRow(){
        return row;
    }

    public int getColumn(){
        return column;
    }

    public boolean validX(int x){
        if( x > 0 && x <= row )
            return true;
        else
            return false;
    }
    public boolean validY(int y){
        if( y > 0 && y <= column )
            return true;
        else
            return false;
    }

    public void printBoard() {}

}
