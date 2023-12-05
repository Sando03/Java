import java.util.Random;

public class MonsterFactory {
    public static Monster createMonster(Random random)
    {
        int x = random.nextInt(3);
        Monster m = null;

        switch (x) {
            case 0:
                m = new Zombie();
                break;
            case 1:
                m = new Vampire();
                break;
            case 2:
                m = new Dragon();
                break;
        }

        return m;
    }
}
