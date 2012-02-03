package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import FastChainAlgorithms.FastChain.Calculators.FastCalculatorBase;
import FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import FastChainAlgorithms.FastChain.FastChain;
import IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 20:01
 */
public class testAverageWordLength extends TestCase {
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain();
        chain.add("12");
        chain.add("12");
        chain.add("1");
        double value = FastCalculatorFactory.getAverageWordLength().getValue(chain, LinkUp.Start);
        assertEquals(value, (2.0 + 2.0 + 1.0)/3, 0.1);
    }

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain();
        chain.add("12");
        chain.add("12");
        chain.add("1");
        double value = FastCalculatorFactory.getAverageWordLength().getValue(chain.getFastUniformChain("12"), LinkUp.Start);
        assertEquals(value, 2.0, 0.1);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getAverageWordLength().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getAverageWordLength().getGroup(), "Propability");
    }

    public void testGetName() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getAverageWordLength();
        assertEquals(calculator.getName(), "L_avegare");
        FastChain chain = new FastChain("1231");
        calculator.getValue(chain.getFastUniformChain("1"), LinkUp.Both);
        assertEquals(calculator.getName(), "L_avegare(1)");
    }
}
