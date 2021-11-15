import java.util.Random;

public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands() {

        int attackdamage = generator.nextInt(10) + 1;

        System.out.println("Enemy robot causes " + attackdamage + " Damage with its hands");

    }

    public void walkForward() {

        int mouvement = generator.nextInt(5) + 1;

        System.out.println("Enemy robot walks forward " + mouvement + " spaces");

    }

    public void reactToHuman(String target) {

        System.out.println("Enemy robot Tramps on " + target);

    }

}
