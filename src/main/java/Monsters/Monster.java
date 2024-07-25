/**
 * @author Rahim Siddiq
 * 07/20/2024
 * Strategy Pattern Part1
 */

package Monsters;

import java.util.*;

public abstract class Monster {
    /**
     * Fields
     */
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;
    Integer agility;
    Integer defense;
    Integer strength;
    Integer attack;

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

    // getters and setters
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