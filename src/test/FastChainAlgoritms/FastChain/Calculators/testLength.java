package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import FastChainAlgorithms.FastChain.FastChain;
import IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 15:35
 */
public class testLength extends TestCase{
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getLength().getValue(chain, LinkUp.Start);
        assertEquals(value, 4, 0.1);
    }

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getLength().getValue(chain.getFastUniformChain("1"), LinkUp.Start);
        assertEquals(value, 4, 0.1);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getLength().getType(), "int");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getLength().getGroup(), "Common");
    }

    public void testGetName() {
        assertEquals(FastCalculatorFactory.getLength().getName(), "n");
    }
}
