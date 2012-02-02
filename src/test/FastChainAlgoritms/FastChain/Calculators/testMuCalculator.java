package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import main.libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 28.10.11
 * Time: 3:09
 */
public class testMuCalculator extends TestCase {
    public void testMuValueUniform() throws Exception {
        FastChain ch = new FastChain("121211");
        double mu = FastCalculatorFactory.getMu().getValue(ch.getFastUniformChain("1"), null);

        double testRes = (1.0 * 3.0 * 5.0 * 6.0) / (1.0 * 2.0 * 3.0 * 4.0 * 5.0 * 6.0);
        assertEquals(testRes, mu);
    }

    public void testMuValueNotUniform() throws Exception {
        FastChain chain = new FastChain("121211");
        assertEquals(FastCalculatorFactory.getMu().getValue(chain, LinkUp.Start), 1.0);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getMu().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getMu().getGroup(), "Positioned");
    }

    public void testGetName() {
        assertEquals(FastCalculatorFactory.getMu().getName(), "Mu");
    }
}
