package test.FastChainAlgoritms.FastChain;

import junit.framework.TestCase;
import main.libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorBase;
import main.libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 20:27
 */
public class testBinaryFastAverageRemoteness extends TestCase {
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("12--211-");
        double value = FastCalculatorFactory.getBinaryAverageRemoteness("1", "2").getValue(chain, LinkUp.Start);
        assertEquals(value, 0.3169, 0.1);

        value = FastCalculatorFactory.getBinaryAverageRemoteness("1", "2").getValue(chain, LinkUp.End);
        assertEquals(value, 0.5169, 0.1);

        value = FastCalculatorFactory.getBinaryAverageRemoteness("1", "2").getValue(chain, LinkUp.Both);
        assertEquals(value, 0.4308, 0.1);

        value = FastCalculatorFactory.getBinaryAverageRemoteness("1", "2").getValue(chain, LinkUp.Circle);
        assertEquals(value, 0.5169, 0.1);
    }

    public void testGetType() throws Exception {
        assertEquals(FastCalculatorFactory.getBinaryAverageRemoteness("1", "2").getType(), "double");
    }

    public void testGetGroup() throws Exception {
        assertEquals(FastCalculatorFactory.getBinaryAverageRemoteness("1", "2").getGroup(), "Binary building characteristic");
    }

    public void testGetName() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getBinaryAverageRemoteness("1", "2");
        assertEquals(calculator.getName(), "g(1,2)");
    }
}
