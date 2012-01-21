package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import libiada.FastChainAlgorithms.FastChain.FastChain;
import libiada.IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 21.01.12
 * Time: 21:41
 */
public class testTramontanoMacchiato extends TestCase {
    private static final double rightValue = 0.841;

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("AGGCTA");
        double value = FastCalculatorFactory.getFastTramontanoMacchiato().getValue(chain, LinkUp.Start);
        assertEquals(value, rightValue, 0.1);
    }

    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("AGGCTA");
        double g = FastCalculatorFactory.getVolume().getValue(chain.getFastUniformChain("1"), LinkUp.Start);
        assertEquals(g, 1 * 3, 0.1);

        g = FastCalculatorFactory.getVolume().getValue(chain.getFastUniformChain("1"), LinkUp.End);
        assertEquals(g, 2 * 3, 0.1);

        g = FastCalculatorFactory.getVolume().getValue(chain.getFastUniformChain("1"), LinkUp.Both);
        assertEquals(g, 1 * 3 * 2, 0.1);

        g = FastCalculatorFactory.getVolume().getValue(chain.getFastUniformChain("1"), LinkUp.Circle);
        assertEquals(g, 3 * 2, 0.1);
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getVolume().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getVolume().getGroup(), "Building characteristic");
    }

    public void testGetName() {
        assertEquals(FastCalculatorFactory.getVolume().getName(), "V");
    }
}
