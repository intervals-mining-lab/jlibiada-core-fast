package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorBase;
import libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import libiada.FastChainAlgorithms.FastChain.FastChain;
import libiada.IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 20:16
 */
public class testAverageGeometryInterval extends TestCase {
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getAverageGeometryInterval().getValue(chain, LinkUp.Start);
        assertEquals(value, 2.0597, 0.1);

        value = FastCalculatorFactory.getAverageGeometryInterval().getValue(chain, LinkUp.End);
        assertEquals(value, 2.0597, 0.1);

        value = FastCalculatorFactory.getAverageGeometryInterval().getValue(chain, LinkUp.Both);
        assertEquals(value, 2.5508, 0.1);

        value = FastCalculatorFactory.getAverageGeometryInterval().getValue(chain, LinkUp.Circle);
        assertEquals(value, 2.6321, 0.1);
    }

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("1231");
        double value = FastCalculatorFactory.getAverageGeometryInterval().getValue(chain.getFastUniformChain("1"), LinkUp.Start);
        assertEquals(value, 1.7320, 0.1);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getAverageGeometryInterval().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getAverageGeometryInterval().getGroup(), "Building characteristic");
    }

    public void testGetName() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getAverageGeometryInterval();
        assertEquals(calculator.getName(), "delta_g");
        FastChain chain = new FastChain("1231");
        calculator.getValue(chain.getFastUniformChain("1"), LinkUp.Both);
        assertEquals(calculator.getName(), "delta_g(1)");
    }
}
