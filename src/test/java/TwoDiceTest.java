import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TwoDiceTest {

    @Test
    public void testRollDieRange() {
        for (int i = 0; i < 100; i++) {
            int roll = TwoDice.rollDie();
            assertTrue("Die roll should be between 1 and 6", roll >= 1 && roll <= 6);
        }
    }

    @Test
    public void testRollUntilDouble() {
        int attempts = TwoDice.rollUntilDouble();
        assertTrue("Should take at least one roll to get a double", attempts >= 1);
    }
}
