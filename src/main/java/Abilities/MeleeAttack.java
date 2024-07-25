/**
 * @author Rahim Siddiq
 * 07/20/2024
 * Strategy Pattern Part2
 */

package Abilities;
import Monsters.Monster;

public class MeleeAttack implements Attack {

    Monster attacker;

    public MeleeAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return attacker.getStrength() - target.getDefense();
    }
}
