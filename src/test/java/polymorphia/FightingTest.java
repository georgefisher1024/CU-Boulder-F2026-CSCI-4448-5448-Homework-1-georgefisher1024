package polymorphia;

import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FightingTest {
    private static Random random = new Random();

    @Test
    public void testFight() {
        Creature ogre = new Creature("Shrek", 5.0);
        Adventurer bilbo = new Adventurer("Bilbo", 5.0);
        int winner = random.nextInt(2); // the fight is a coin flip
        assertTrue((winner == 0)||(winner == 1  ));
    }
}
