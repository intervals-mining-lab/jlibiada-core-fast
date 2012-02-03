package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import FastChainAlgorithms.FastChain.FastChain;
import IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 21.01.12
 * Time: 21:16
 */
public class testVolume extends TestCase {
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double g = FastCalculatorFactory.getVolume().getValue(chain, LinkUp.Start);
        assertEquals(g, 1 * 2 * 3 * 3, 0.1);
    }

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("12310");
        double g = FastCalculatorFactory.getVolume().getValue(chain.getFastUniformChain("1"), LinkUp.Start);
        assertEquals(g, 1 * 3, 0.1);

        g = FastCalculatorFactory.getVolume().getValue(chain.getFastUniformChain("1"), LinkUp.End);
        assertEquals(g, 2 * 3, 0.1);

        g = FastCalculatorFactory.getVolume().getValue(chain.getFastUniformChain("1"), LinkUp.Both);
        assertEquals(g, 1 * 3 * 2, 0.1);

        g = FastCalculatorFactory.getVolume().getValue(chain.getFastUniformChain("1"), LinkUp.Circle);
        assertEquals(g, 3 * 2, 0.1);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getVolume().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getVolume().getGroup(), "Building characteristic");
    }

    public void testGetName() {
        assertEquals(FastCalculatorFactory.getVolume().getName(), "V");
    }
}
