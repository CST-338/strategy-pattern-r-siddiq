/**
 * @author Rahim Siddiq
 * 07/20/2024
 * Strategy Pattern Final
 */

package Monsters;

import Abilities.MeleeAttack;

import java.util.HashMap;

public class Kobold extends Monster {
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);

        Integer maxStr = 10;
        Integer maxDef = 5;
        Integer maxAgi = 2;

        attack = new MeleeAttack(this);
        strength = super.getAttribute(strength, maxStr);
        defense = super.getAttribute(defense, maxDef);
        agility = super.getAttribute(agility, maxAgi);
    }

    @Override
    public String toString() {
        return "Monsters.Kobold has : " + super.toString();
    }
}
