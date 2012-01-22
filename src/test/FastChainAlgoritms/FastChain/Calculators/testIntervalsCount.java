package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import libiada.FastChainAlgorithms.FastChain.FastChain;
import libiada.IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 16:57
 */
public class testIntervalsCount extends TestCase{
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getEventCount().getValue(chain, LinkUp.Start);
        assertEquals(value, 4, 0.1);

        chain = new FastChain("1231");
        value = FastCalculatorFactory.getEventCount().getValue(chain, LinkUp.Both);
        assertEquals(value, 5, 0.1);
    }

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("12310");
        double value = FastCalculatorFactory.getEventCount().getValue(chain.getFastUniformChain("1"), LinkUp.Start);
        assertEquals(value, 2, 0.1);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getEventCount().getType(), "int");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getEventCount().getGroup(), "Building characteristic");
    }

    public void testGetName() {
        assertEquals(FastCalculatorFactory.getEventCount().getName(), "Intervals count");
    }
}
