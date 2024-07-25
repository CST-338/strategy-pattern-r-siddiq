/**
 * @author Rahim Siddiq
 * 07/20/2024
 * Strategy Pattern Part1
 */

package Monsters;
import Abilities.Attack;
import java.util.*;

public abstract class Monster {
    /**
     * Fields
     */
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;
    Integer agility = 10;
    Integer defense = 10;
    Integer strength = 10;
    Attack attack;

    /**
     * Constructor
     * @param maxHP
     * @param xp
     * @param items
     */
    public Monster(int maxHP, int xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    /**
     * Getters and setters
     */
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getAgility() {
        return agility;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getStrength() {
        return strength;
    }

    /**
     * This method returns an integer value between min and max.
     * then adds min back in.
     * @param min an integer
     * @param max an integer
     * @return a random integer
     */
    Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if (min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max - min) + min;
    }

    /**
     * takeDamage(Integer damage)
     * This method calculates if the target has taken any damage, and determines if the target’s hp
     * has fallen below 0. If the damage value is greater than 0, the damage amount is subtracted
     * from the current hp value. Print out:
     * “The creature was hit for [x] damage” (where [x] is the passed in value.)
     * If the creature’s hp falls to 0 or less, print out
     * "Oh no! the creature has perished"
     * print the toString() associated with the current creature
     * return true if the current value of hp is greater than 0, false if it is not.
     * Currently, we don't do anything if health falls below zero. Ideally, the loop would exit or
     * some other indication of this event will be made.
     */
    boolean takeDamage(Integer damage) {
        if (damage > 0) {
            hp -= damage;
            System.out.println("The creature was hit for [" + damage + "] damage");
            if (hp <= 0) {
                System.out.println("Oh no! the creature has perished");
            }
        }
        return hp > 0;
    }

    /**
     * attackTarget(Monster target)
     * This method calls the takeDamage(Integer) method of the Monster that was passed in. This
     * method, takeDamage(integer), is called with the value that is returned from the attack
     * method as described below.
     * That is to say that Monster.java has a field of type Attack.java. Attack.java has a method
     * named attack(Monster target). This new method, attackTarget(Monster target), uses the
     * attack method of the Attack object assigned to the current monster on the target that was
     * passed in to the method attackTarget(Monster).
     * This method returns the results of the attack method of the Attack object of the current
     * monster on the target.
     */
    // todo
    public Integer attackTarget(Monster target) {
        return null;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;
        Monster monster = (Monster) o;
        return Objects.equals(getItems(), monster.getItems());
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hashCode(getItems());
    }

    // toString
    @Override
    public String toString() {
        return "hp = " + getHp() + "/" + getMaxHP();
    }
}