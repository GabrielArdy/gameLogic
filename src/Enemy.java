import java.lang.Math;

public class Enemy {
    public int health;
    public int attack;
    int min = 1;
    int max = 10;
    double range = Math.random() * (max - min + 1) + min;

    public Enemy() {
        this.health = 100;
        this.attack = (int) Math.random() * 10 + min;
    }

    public void attack(Player player) {
        player.health = player.health - this.attack;
    }
}
