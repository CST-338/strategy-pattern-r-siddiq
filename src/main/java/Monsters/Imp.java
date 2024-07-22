package Monsters;

import java.util.HashMap;

/**
 * @author Rahim Siddiq
 * 07/20/2024
 * HW00 Strategy
 */

public class Imp extends Monster {
    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Monsters.Imp has : " + super.toString();
    }
}