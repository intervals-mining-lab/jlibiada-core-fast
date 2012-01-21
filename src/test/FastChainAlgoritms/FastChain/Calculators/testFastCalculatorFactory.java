package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import libiada.FastChainAlgorithms.FastChain.Calculators.*;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 21.01.12
 * Time: 14:11
 */
public class testFastCalculatorFactory extends TestCase{
    public void testGetMu() {
        FastCalculatorBase calculator = FastCalculatorFactory.getMu();
        assertEquals(calculator.getClass(), MuCalculator.class);
    }

    public void testGetRo() {
        FastCalculatorBase calculator = FastCalculatorFactory.getRo();
        assertEquals(calculator.getClass(), RoCalculator.class);
    }

    public void testGetFastOrlovPartlyCriteria() {
        FastCalculatorBase calculator = FastCalculatorFactory.getOrlovPartlyCriteria();
        assertEquals(calculator.getClass(), FastOrlovPartlyCriteria.class);
    }

    public void testGetFastAverageWordLength() {
        FastCalculatorBase calculator = FastCalculatorFactory.getAverageWordLength();
        assertEquals(calculator.getClass(), FastAverageWordLength.class);
    }

    public void testGetFastPositionedAverageRemoteness() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(1);
        FastCalculatorBase calculator = FastCalculatorFactory.getPositionedAverageRemoteness("1", poses, 3);
        assertEquals(calculator.getClass(), FastPositionedAverageRemoteness.class);
    }

    public void testGetBinaryAverageRemoteness() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getBinaryAverageRemoteness("1", "2");
        assertEquals(calculator.getClass(), BinaryFastAverageRemoteness.class);
    }

    public void testGetgetBinaryAverageGeomertyInterval() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getBinaryAverageGeomertyInterval("1", "2");
        assertEquals(calculator.getClass(), BinaryFastAverageGeometryInterval.class);
    }
}
