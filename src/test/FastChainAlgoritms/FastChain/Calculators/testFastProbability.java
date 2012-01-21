package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import libiada.FastChainAlgorithms.FastChain.FastChain;
import libiada.FastChainAlgorithms.FastChain.FastUniformChain;
import libiada.IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 21.01.12
 * Time: 22:58
 */
public class testFastProbability extends TestCase {
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("AGGCTA");
        double value = FastCalculatorFactory.getPropability().getValue(chain, LinkUp.Start);
        assertEquals(value, 1, 0.1);
    }

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("AGGCTA");
        double value = FastCalculatorFactory.getPropability().getValue(chain.getFastUniformChain("A"), LinkUp.Start);
        assertEquals(value, 1.0 / 3.0, 0.1);

        FastUniformChain uChain = new FastUniformChain(10);
        value = FastCalculatorFactory.getPropability().getValue(uChain, LinkUp.Start);
        assertEquals(value, 0, 0.1);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getPropability().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getPropability().getGroup(), "Propability");
    }

    public void testGetName() {
        assertEquals(FastCalculatorFactory.getPropability().getName(), "p");
    }
}
