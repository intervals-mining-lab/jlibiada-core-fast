package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import main.libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorBase;
import main.libiada.FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.IntervalAnalysis.LinkUp;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 14:22
 */
public class testPositionedAverageRemoteness extends TestCase{
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("AGGCTA");
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        poses.add(1);
        double value = FastCalculatorFactory.getPositionedAverageRemoteness(poses, 3).getValue(chain, LinkUp.Start);
        assertEquals(value, 1.33, 0.1);
    }

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("AGCATA");
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        poses.add(1);
        FastCalculatorBase calculator = FastCalculatorFactory.getPositionedAverageRemoteness(poses, 3);
        double value = calculator.getValue(chain.getFastUniformChain("A"), LinkUp.Start);
        assertEquals(value, 0.79, 0.1);
        poses.remove(0);
        value = calculator.getValue(chain.getFastUniformChain("A"), LinkUp.Start);
        assertEquals(value, 0.0, 0.1);
    }

    public void testGetType() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        assertEquals(FastCalculatorFactory.getPositionedAverageRemoteness(poses, 3).getType(), "double");
    }

    public void testGetGroup() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        assertEquals(FastCalculatorFactory.getPositionedAverageRemoteness(poses, 3).getGroup(), "Positioned building characteristic");
    }

    public void testGetName() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        FastCalculatorBase calculator = FastCalculatorFactory.getPositionedAverageRemoteness(poses, 3);
        assertEquals(calculator.getName(), "g(1)");

        FastChain chain = new FastChain("ABC");
        calculator.getValue(chain.getFastUniformChain("A"), LinkUp.Start);
        assertEquals(calculator.getName(), "g(A, 1)");
    }
}
