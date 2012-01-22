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
 * Time: 20:37
 */
public class testBinaryAverageGeometryInterval extends TestCase{
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("12--211-");
        double value = FastCalculatorFactory.getBinaryAverageGeomertyInterval("1", "2").getValue(chain, LinkUp.Start);
        assertEquals(value, 1.2457, 0.1);

        value = FastCalculatorFactory.getBinaryAverageGeomertyInterval("1", "2").getValue(chain, LinkUp.End);
        assertEquals(value, 1.4309, 0.1);

        value = FastCalculatorFactory.getBinaryAverageGeomertyInterval("1", "2").getValue(chain, LinkUp.Both);
        assertEquals(value, 1.3480, 0.1);

        value = FastCalculatorFactory.getBinaryAverageGeomertyInterval("1", "2").getValue(chain, LinkUp.Circle);
        assertEquals(value, 1.4309, 0.1);
    }

    public void testGetType() throws Exception {
        assertEquals(FastCalculatorFactory.getBinaryAverageGeomertyInterval("1", "2").getType(), "double");
    }

    public void testGetGroup() throws Exception {
        assertEquals(FastCalculatorFactory.getBinaryAverageGeomertyInterval("1", "2").getGroup(), "Binary building characteristic");
    }

    public void testGetName() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getBinaryAverageGeomertyInterval("1", "2");
        assertEquals(calculator.getName(), "delta(1,2)");
    }
}
