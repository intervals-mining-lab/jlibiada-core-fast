package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import FastChainAlgorithms.FastChain.FastChain;
import IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 15:20
 */
public class testOrlovPartlyCriteria extends TestCase{
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getOrlovPartlyCriteria().getValue(chain, LinkUp.Start);
        assertEquals(value, 0.88, 0.1);

        chain = new FastChain("1234");
        value = FastCalculatorFactory.getOrlovPartlyCriteria().getValue(chain, LinkUp.Start);
        assertEquals(value, Double.MAX_VALUE, 0.1);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getOrlovPartlyCriteria().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getOrlovPartlyCriteria().getGroup(), "Propability");
    }

    public void testGetName() {
        assertEquals(FastCalculatorFactory.getOrlovPartlyCriteria().getName(), "OrlovPart");
    }
}
