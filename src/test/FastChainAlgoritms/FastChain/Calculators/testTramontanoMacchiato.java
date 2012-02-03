package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import FastChainAlgorithms.FastChain.FastChain;
import IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 21.01.12
 * Time: 21:41
 */
public class testTramontanoMacchiato extends TestCase {
    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("AGGCTA");
        double value = FastCalculatorFactory.getFastTramontanoMacchiato().getValue(chain, LinkUp.Start);
        assertEquals(value, 0.841, 0.1);

        chain = new FastChain("AGGCTGG");
        value = FastCalculatorFactory.getFastTramontanoMacchiato().getValue(chain, LinkUp.Start);
        assertEquals(value, 0.4184, 0.1);
    }

    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("AGGCTA");
        try{
        FastCalculatorFactory.getFastTramontanoMacchiato().getValue(chain.getFastUniformChain("1"), LinkUp.Start);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetType() {
        assertEquals(FastCalculatorFactory.getFastTramontanoMacchiato().getType(), "double");
    }

    public void testGetGroup() {
        assertEquals(FastCalculatorFactory.getFastTramontanoMacchiato().getGroup(), "Bioinformatics");
    }

    public void testGetName() {
        assertEquals(FastCalculatorFactory.getFastTramontanoMacchiato().getName(), "Tramontano-Macchiato");
    }
}
