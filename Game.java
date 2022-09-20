public class Game {
    public static void main(String[] args) {
        Player ice_warrior = new Player();

        ice_warrior.name = "Iceman";
        ice_warrior.spd = 50;
        ice_warrior.hp = 1300;
        ice_warrior.mp = 20;

        System.out.println("========================");

        while (ice_warrior.mp > 0) {
            if (ice_warrior.mp >= 1) {
                ice_warrior.run();
            }

            if (ice_warrior.mp >= 10) {
                ice_warrior.attack();
            }

            System.out.println("Current MP = " + ice_warrior.mp);

            if (ice_warrior.isDead()) {
                System.out.println("Game Over!");
            }
        }
        System.out.println("========================");
    }
}
