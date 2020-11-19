package com.company;

public class Tank extends Army{
    /**
     * Create an army
     *
     * @param armyName name of the army
     * @param x        position of army
     * @param y        position of army
     * @param player   one player of two players
     */
    public Tank(String armyName, int x, int y, Player player) {
        super(armyName, x, y, player);
    }
}
