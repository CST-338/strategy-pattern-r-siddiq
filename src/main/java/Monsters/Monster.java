/**
 * @author Rahim Siddiq
 * 07/20/2024
 * Strategy Pattern Final
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
     * @param maxHP maximum hit points of the monster
     * @param xp    maximum experience points of the monster
     * @param items items the monster has in its possession
     */
    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        this.hp = maxHP;
        this.xp = xp;
        this.items = items;
        this.strength = getStrength();
        this.defense = getDefense();
        this.agility = getAgility();
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
        return rand.nextInt(max - min ) + min;
    }

    /**
     * Apply damage to the monster
     * @param damage the damage to apply
     * @return false if the monster dies, true otherwise
     */
    boolean takeDamage(Integer damage) {
        if (hp > 0) {
            hp -= damage;
            System.out.println("The creature was hit for " + damage + " damage");
            if (hp <= 0) {
                hp = 0;
                System.out.println("Oh no! The creature has perished");
                System.out.println(toString());
                return false;
            }
        }
        return true;
    }

    /**
     * Attack a target monster
     * @param target the target monster
     * @return the damage dealt to the target
     */
    public Integer attackTarget(Monster target) {
        Integer damage = attack.attack(target);
        target.takeDamage(damage);
        return damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;
        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) &&
                Objects.equals(xp, monster.xp) &&
                Objects.equals(maxHP, monster.maxHP) &&
                Objects.equals(items, monster.items) &&
                Objects.equals(agility, monster.agility) &&
                Objects.equals(defense, monster.defense) &&
                Objects.equals(strength, monster.strength) &&
                Objects.equals(attack, monster.attack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHP, items, agility, defense, strength, attack);
    }

    /**
     * toString
     * @return a string representation of the monster's health points
     */
    @Override
    public String toString() {
        return "hp = " + getHp() + "/" + getMaxHP();
    }
}