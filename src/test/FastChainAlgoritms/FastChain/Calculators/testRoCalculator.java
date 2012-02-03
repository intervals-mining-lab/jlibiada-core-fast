package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import FastChainAlgorithms.FastChain.FastChain;
import IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 28.10.11
 * Time: 0:55
 */
public class testRoCalculator extends TestCase {
    public void testUniformChainCharacteristic() throws Exception {
        FastChain ch = new FastChain("121211");
        double ro = FastCalculatorFactory.getRo().getValue(ch.getFastUniformChain("1"), null);

        double testRes = (1.0 + 3.0 + 5.0 + 6.0) / (1.0 + 2.0 + 3.0 + 4.0 + 5.0 + 6.0);
        assertEquals(testRes, ro);
    }

    public void testNotUniformChainCharacteristic() throws Exception {
        FastChain chain = new FastChain("121211");
        assertEquals(FastCalculatorFactory.getRo().getValue(chain, LinkUp.Start), 1.0);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getRo().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getRo().getGroup(), "Positioned");
    }

    public void testGetName() {
        assertEquals(FastCalculatorFactory.getRo().getName(), "Ro");
    }
}
