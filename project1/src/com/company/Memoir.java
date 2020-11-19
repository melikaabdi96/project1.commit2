package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Memoir {
    private Board board;
    private int axisMedals;
    private int alliedMedals;
    private boolean alliedTurn;

    public Memoir(){
        this.board = Board.getInstance();
        this.alliedMedals = 0;
        this.axisMedals = 0;
        this.alliedTurn = true;
    }
    public Board getBoard() {
        return board;
    }

    /**
     * @return a random number between 1 to 6
     */
    public int dice(){
        Random dice = new Random();
        int diceNum = dice.nextInt(6)+1;
        return diceNum;
    }



    public void checkTurn(int x , int y){

        Cell cell = new Cell(x, y);
        if ((cell.checkCity(x,y) == true) || (cell.checkForest(x,y) == true)){
            if(alliedTurn == true){
                setalliedTurn(false);
            }
            else setalliedTurn(true);
        }
    }

    public void addAlliedMedals(){
        this.alliedMedals += 1;
    }

    public void addAxisMedals(){this.axisMedals += 1;}

    public int getAlliedMedals() {
        return alliedMedals;
    }

    public int getAxisMedals() {
        return axisMedals;
    }



    boolean alliedTurn() {
        return alliedTurn;
    }

    void setalliedTurn(boolean alliedTurn) {
        this.alliedTurn = alliedTurn;
    }


}

