import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PowerCalculatorTest {
    PowerCalculator p1 = new PowerCalculator();

    @Test
    public void testSum() {
        Assert.assertEquals(p1.sum(2,3),5);
    }

    @Test
    public void testPowerIfAandBarePositive()
    {
       Assert.assertEquals(p1.power(2,3),8.0);

    }

    @Test
    public void testPowerIfBisZero()
    {
        Assert.assertEquals(p1.power(2,0),1.0);
    }

    @Test
    public void testPowerIfAisNegative()
    {
        Assert.assertEquals(p1.power(-2,1),-2.0);
    }

    @Test
    public void testPowerIfAisZero()
    {
        Assert.assertEquals(p1.power(0,3),0.0);
    }
    @Test
    public void testPowerIfAandBareMax()
    {
        Assert.assertEquals(p1.power(32767,32767),-32769.0);
    }
    @Test
    public void testPowerIfBisNegative()
    {
        Assert.assertEquals(p1.power(2,-1),0.5);
    }

}