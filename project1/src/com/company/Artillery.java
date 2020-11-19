package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Artillery extends Army{

    Artillery(String armyName, int x, int y,Player player) {
        super(armyName, x,y, player);
        setName("A");

    }


    public ArrayList<Artillery> getArtilleries() {
        return artillery;
    }


}
