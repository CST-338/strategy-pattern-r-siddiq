import java.util.HashMap;
import java.util.Objects;

/**
 * @author Rahim Siddiq
 * 07/20/2024
 * HW00 Strategy
 */

public abstract class Monster {
    private int hp;
    private int xp = 10;
    private int maxHP;
    private HashMap<String, Integer> items;

    // constructor
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