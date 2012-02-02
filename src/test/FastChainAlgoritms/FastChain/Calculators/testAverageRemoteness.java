package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import main.libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorBase;
import main.libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 20:11
 */
public class testAverageRemoteness extends TestCase{
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getAverageRemoteness().getValue(chain, LinkUp.Start);
        assertEquals(value, 1.0424, 0.1);

        value = FastCalculatorFactory.getAverageRemoteness().getValue(chain, LinkUp.End);
        assertEquals(value, 1.0424, 0.1);

        value = FastCalculatorFactory.getAverageRemoteness().getValue(chain, LinkUp.Both);
        assertEquals(value, 1.3510, 0.1);

        value = FastCalculatorFactory.getAverageRemoteness().getValue(chain, LinkUp.Circle);
        assertEquals(value, 1.3962, 0.1);
    }

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getAverageRemoteness().getValue(chain.getFastUniformChain("1"), LinkUp.Start);
        assertEquals(value, 0.792, 0.1);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getAverageRemoteness().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getAverageRemoteness().getGroup(), "Building characteristic");
    }

    public void testGetName() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getAverageRemoteness();
        assertEquals(calculator.getName(), "g");
        FastChain chain = new FastChain("1231");
        calculator.getValue(chain.getFastUniformChain("1"), LinkUp.Both);
        assertEquals(calculator.getName(), "g(1)");
    }
}
