package com.company;

/**
 * Cell class holds information of each cell in the gameboard.
 * @author Melika
 * @since 2020
 * @ version 1
 */
public class Cell extends Board{
    //Gameboard consists of 13*9 cells
    private int x;
    private int y;
    // Each cell can have one type
    enum CellType{
        Ground, Hill, Forest, River, Bridge, City, Shelter;

        private static final CellType[] cells = CellType.values();
        public static CellType getCells(int i){
            return CellType.cells[i];
        }
    }
    //cell
    private CellType cell;
    private int armiesNum;

    /**
     * x and y fix  each cell's position
     * @param x first parameter of a cell's position
     * @param y second parameter of a cell's position
     */
    public Cell(int x , int y){
        this.x = x;
        this.y = y;
    }

    /**
     * @return type of cell
     */
    public CellType getCell(){
        return cell;
    }

    //getter
    public int getX() {
        return x;
    }

    public int getArmiesNum() {
        return armiesNum;
    }

    //setter
    public void setX(int x) {
        this.x = x;

    }

    //getter
    public int getY() {
        return y;
    }

    //setter
    public void setY(int y) {
        this.y = y;
    }

    public void setArmiesNum(int armiesNum) {
        this.armiesNum = armiesNum;
    }

    public void deleteArmiesNum(int armiesNum){
        this.armiesNum = armiesNum;
    }


    public CellType cellType(int x, int y){
        switch (y) {
            case 1:
                if (x == 1 || x == 2) return (CellType.Hill);
                else if (x == 4) return (CellType.City);
                else if (x == 5) return (CellType.Bridge);
                else return(CellType.Ground);
                //break;
            case 2:
                if (x == 2 || x == 3 || x == 4) return (CellType.River);
                else if (x == 5) return (CellType.Shelter);
                else if (x == 7) return (CellType.Hill);
                else return(CellType.Ground);
                //break;
            case 3:
                if (x == 1) return (CellType.City);
                else if (x == 2) return (CellType.River);
                else if (x == 7) return (CellType.Hill);
                else if (x == 10 || x == 13) return (CellType.Forest);
                else return(CellType.Ground);
               // break;
            case 4:
                if (x == 1) return (CellType.Bridge);
                else if (x == 2 || x == 4 || x == 13) return (CellType.Forest);
                else return(CellType.Ground);
                //break;
            case 5:
                if (x == 2 || x == 13 || x == 9) return (CellType.Forest);
                if (x == 1) return (CellType.River);
                if (x == 6 || x == 12) return (CellType.Hill);
                if (x == 7 || x == 11) return (CellType.City);
                //break;
            case 6:
                if (x == 4 || x == 13) return (CellType.Forest);
                else if (x == 5 || x == 12) return (CellType.Hill);
                else return(CellType.Ground);
                //break;
            case 7:
                if (x == 3) return (CellType.City);
                else if (x == 8 || x == 9) return (CellType.Forest);
                else return(CellType.Ground);
                //break;
            case 8:
                if (x == 4 || x == 5 || x == 9) return (CellType.Forest);
                else return(CellType.Ground);
                //break;
            case 9:
                if (x == 12) return (CellType.City);
                else return(CellType.Ground);
                //break;
        }
        return null;
    }



    public boolean checkRiver(int x , int y){
        Cell cell =new Cell(x,y);
        if(cell.getCell() == CellType.River){
            System.out.println("River!!");
            return true;
        }
        return false;
    }

    public boolean checkShelter(int x, int y){
        Cell cell =new Cell(x,y);
        if(cell.getCell() == CellType.Shelter){
            System.out.println("Shelter!!");
            return true;
        }
        return false;
    }

    public boolean checkForest(int x, int y){
        Cell cell =new Cell(x,y);
        if(cell.getCell() == CellType.Forest){
            System.out.println("Forest!!");
            return true;
        }
        return false;
    }

    public boolean checkCity(int x, int y){
        Cell cell =new Cell(x,y);
        if(cell.getCell() == CellType.City){
            System.out.println("City!!");
            return true;
        }
        return false;
    }

    public boolean checkHill(int x, int y){
        Cell cell =new Cell(x,y);
        if(cell.getCell() == CellType.Hill){
            System.out.println("Hill!!");
            return true;
        }
        return false;
    }

}
