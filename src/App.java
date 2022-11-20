import java.util.Scanner;

public class App {

    // Run Class
    public static void main(String[] args) throws Exception {
        String status = "";
        System.out.println("===============================");
        System.out.println("RPG Game");
        System.out.println("===============================");
        System.out.println("Choose your character");
        System.out.println("1. Rex");
        System.out.println("2. Elma");
        System.out.println("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Player player = null;
        if (choice == 1) {
            player = new Rex();
        } else if (choice == 2) {
            player = new Elma();
        }
        System.out.println("Choose your weapon");
        System.out.println("1. Sword");
        System.out.println("2. Bow");
        System.out.println("3. Axe");
        System.out.println("4. Bat");
        System.out.println("5. None");
        System.out.println("Your choice: ");
        int weaponChoice = scanner.nextInt();
        if (weaponChoice == 1) {
            player.weapon.setSword();
        } else if (weaponChoice == 2) {
            player.weapon.setBow();
        } else if (weaponChoice == 3) {
            player.weapon.setAxe();
        } else if (weaponChoice == 4) {
            player.weapon.setBat();
        } else if (weaponChoice == 5) {
            player.weapon.setNone();
        }
        player.chooseWeapon();
        Enemy enemy = new Enemy();
        while (player.health > 0 && enemy.health > 0) {
            player.attack(enemy);
            System.out.println("Player deal " + player.attack + " damage to enemy");
            System.out.println("Enemy health: " + enemy.health);
            enemy.attack(player);
            System.out.println("Enemy deal " + enemy.attack + " damage to player");
            System.out.println("Player health: " + player.health);
        }
        if (player.health > 0) {
            status = "Player Win";
            player.level += 1;
            player.levelUp(player);
            System.out.println(status);
        } else {
            status = "Enemy Win";
            System.out.println(status);
        }

    }
}
