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
 * Time: 17:12
 */
public class testHentropy extends TestCase{
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getHentropy().getValue(chain, LinkUp.Start);
        assertEquals(value, 1.5, 0.1);
    }

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getHentropy().getValue(chain.getFastUniformChain("1"), LinkUp.Start);
        assertEquals(value, 0.5, 0.1);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getHentropy().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getHentropy().getGroup(), "Propability");
    }

    public void testGetName() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getHentropy();
        assertEquals(calculator.getName(), "H");
        FastChain chain = new FastChain("1231");
        calculator.getValue(chain.getFastUniformChain("1"), LinkUp.Both);
        assertEquals(calculator.getName(), "H(1)");
    }
}
