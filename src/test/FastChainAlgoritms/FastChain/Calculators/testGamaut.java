package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import FastChainAlgorithms.FastChain.FastChain;
import IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 19:47
 */
public class testGamaut extends TestCase {
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getGamaut().getValue(chain, LinkUp.Start);
        assertEquals(value, 4.1699, 0.1);

        value = FastCalculatorFactory.getGamaut().getValue(chain, LinkUp.End);
        assertEquals(value, 4.1699, 0.1);

        value = FastCalculatorFactory.getGamaut().getValue(chain, LinkUp.Both);
        assertEquals(value, 6.7548, 0.1);

        value = FastCalculatorFactory.getGamaut().getValue(chain, LinkUp.Circle);
        assertEquals(value, 5.5849, 0.1);
    }

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getGamaut().getValue(chain.getFastUniformChain("1"), LinkUp.Start);
        assertEquals(value, 1.5849, 0.1);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getGamaut().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getGamaut().getGroup(), "Building characteristic");
    }

    public void testGetName() {
        assertEquals(FastCalculatorFactory.getGamaut().getName(), "G");
    }
}
