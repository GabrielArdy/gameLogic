public class Rex extends Player {
    public Rex() {
        this.health = 100;
        this.attack = 10;
        this.weapon = new Weapon();
        this.level = 1;
    }

    public void chooseWeapon() {
        if (this.weapon.Sword) {
            this.attack += 10;
        } else if (this.weapon.Bow) {
            this.attack += 5;
        } else if (this.weapon.Axe) {
            this.attack += 15;
        } else if (this.weapon.Bat) {
            this.attack += 13;
        } else if (this.weapon.none) {
            this.attack = this.attack;
        }
    }

    @Override
    public void attack(Enemy player) {
        player.health = player.health - this.attack;
    }

    @Override
    public void levelUp(Player player) {
        if (player.level % 2 == 0) {
            player.health += 10;
            player.attack += 10;
        } else if (player.level == 1) {
            player.health = this.health;
            player.attack = this.attack;
        } else {
            player.health += 5;
            player.attack += 5;
        }
    }
}
