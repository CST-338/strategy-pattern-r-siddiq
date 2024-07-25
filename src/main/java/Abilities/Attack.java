/**
 * @author Rahim Siddiq
 * 07/20/2024
 * Strategy Pattern Final
 */

package Abilities;
import Monsters.Monster;

public interface Attack extends Ability {
    public abstract Integer attack(Monster target);
}
