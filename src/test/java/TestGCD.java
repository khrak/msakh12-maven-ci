import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

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

    @Test
    public void GCDMockTest() {
        CalculateGCD gcdmock = mock(CalculateGCD.class);

        when(gcdmock.calculateGCD()).thenReturn(1);

        int gcd = gcdmock.calculateGCD();

        verify(gcdmock, times(1)).calculateGCD();
    }


}
