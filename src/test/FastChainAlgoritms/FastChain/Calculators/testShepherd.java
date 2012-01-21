package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import libiada.FastChainAlgorithms.FastChain.FastChain;
import libiada.IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 21.01.12
 * Time: 22:27
 */
public class testShepherd extends TestCase {
    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("AGGCTA");
        double value = FastCalculatorFactory.getFastShepherd().getValue(chain, LinkUp.Start);
        assertEquals(value, 1.21, 0.1);

        chain = new FastChain("AGGCTGG");
        value = FastCalculatorFactory.getFastShepherd().getValue(chain, LinkUp.Start);
        assertEquals(value, 1.2185, 0.1);
    }

    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("AGGCTA");
        try{
            FastCalculatorFactory.getFastShepherd().getValue(chain.getFastUniformChain("1"), LinkUp.Start);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getFastShepherd().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getFastShepherd().getGroup(), "Bioinformatics");
    }

    public void testGetName() {
        assertEquals(FastCalculatorFactory.getFastShepherd().getName(), "Shepherd");
    }
}
