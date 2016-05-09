import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by khrak on 5/9/16.
 */
public class TestGCD {

    @Test
    public void GCDOfSixAndEighteenEqualsSixTest() {
        CalculateGCD calculateGCD = new CalculateGCD(6,18);

        int gcd = calculateGCD.calculateGCD();

        assertEquals(6, gcd);
    }
}
