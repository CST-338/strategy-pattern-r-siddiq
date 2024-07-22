package Monsters;

import java.util.HashMap;

/**
 * @author Rahim Siddiq
 * 07/20/2024
 * HW00 Strategy
 */

public class Kobold extends Monster {
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Monsters.Kobold has : " + super.toString();
    }
}
