public class Player {
    String name;
    int spd;
    int hp;
    int mp;

    // run -1
    // attack -10
    // your mp is low

    void calculateMp(String type) {
        if (type == "run") {
            mp = mp - 1;
        } else if (type == "attack") {
            mp = mp - 10;
        }
    }

    void run() {
        if (mp-1 < 0) {
            System.out.print("Your MP is low, cannot run.");
        } else {
            System.out.println(name + " is running...");
            System.out.println("Speed: " + spd);
            calculateMp("run");
        }
    }

    void attack() {
        if(mp-10 < 0){
            System.out.println("Your MP is running low, cannot attack.");
        } else {
            System.out.println(name + " attack!");
            System.out.println("Ice Beam!!!!!");
            calculateMp("attack");
        }
    }

    boolean isDead() {
        if (hp <= 0) {
            return true;
        } else {
            return false;
        }
    }
}