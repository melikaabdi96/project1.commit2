package com.company;

public class Soldier extends Army {
    /**
     * Create an army
     *
     * @param armyName name of the army
     * @param x        position of army
     * @param y        position of army
     * @param player   one player of two players
     */
    public Soldier(String armyName, int x, int y, Player player) {
        super(armyName, x, y, player);
    }
}
