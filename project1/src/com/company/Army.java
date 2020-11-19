package com.company;

import java.util.*;

public class Army extends Actions{
    //Army's name
    private String armyName;
    // a cell for each of them on the gameboard
    private Cell cell;
    //declares the player group
    private Player player;
    //contains armies and their positions
    private static HashMap<Army , HashMap<Integer,Integer>> full;
    //a hashmap that holds x and y of the army
    private HashMap<Integer , Integer> position;

    private Soldier[] soldiers;
    private Tank[] tanks;


    ArrayList<Tank> alliedGroup = new ArrayList<>();
    ArrayList<Tank> axisGroup = new ArrayList<>();
    ArrayList<Artillery> artillery = new ArrayList<>();


    /**
     * Create an army
     * @param armyName name of the army
     * @param x position of army
     * @param y position of army
     * @param player one player of two players
     */
    public Army(String armyName, int x , int y , Player player){
        this.armyName = armyName;
        this.cell = new Cell(x,y);
        this.player = player;
        this.position = new HashMap<>();
        this.full = new HashMap<>();
        this.player = player;
    }


    public String tostring(){
        return armyName;
    }

    /**
     * @return return the position of an amry
     */
    public HashMap<Integer, Integer> getPosition() {
        return position;
    }

    public Cell getCell() {
        return cell;
    }
    public String getName() {
        return armyName;
    }

    public void setName(String armyName) {
        this.armyName = armyName;
    }

    /**
     * @param map       the Hashmap that we want search through that
     * @param value     the value in the Hashmap thet we are looking for its key
     * @return          returns key of the given value in the given map
     */
    public static Army getKeyByValue(Map<Army, HashMap<Integer, Integer>> map, HashMap value) {
        for (Map.Entry<Army, HashMap<Integer,Integer>> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /**
     * update position of the army
     * @param army army type
     * @param x position of army
     * @param y position of army
     */
    public void updatePosition(Army army, int x, int y){
        full.get(army).replace(x,y);
        position.replace(x,y);
        cell.setX(x);
        cell.setY(y);
        System.out.println(" position updated . new position : ( " + cell.getX() + " , " + cell.getY() + " )"  );
    }

    private void setCell(Cell cell) {
        this.cell = cell;
    }

    /**
     * remove army and update position
     * @param army the army that has been attacked
     * @param x position of army
     * @param y position of army
     */
    public void removeArmy(Army army, int x, int y){
        position.remove(x, y);
        updatePosition(null, x, y);
    }

   /* public void throwingDice(){
        Random dice = new Random();
        int diceNum = dice.nextInt(6)+1;
        switch (diceNum){
            case 1:
                attack(armyName, getCell().getX(), getCell().getY());
                break;
            case 2:
                attack();

        }
    }*/


}
