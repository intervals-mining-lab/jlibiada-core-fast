package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import FastChainAlgorithms.FastChain.Calculators.FastCalculatorBase;
import FastChainAlgorithms.FastChain.Calculators.FastCalculatorFactory;
import FastChainAlgorithms.FastChain.FastChain;
import IntervalAnalysis.LinkUp;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 13:37
 */
public class testPositionedEventCount extends TestCase{
    public void testNotUniformValue() throws Exception {
        FastChain chain = new FastChain("AGGCTA");
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        poses.add(1);
        double value = FastCalculatorFactory.getPositionedEventCount(poses, 3).getValue(chain, LinkUp.Start);
        assertEquals(value, 4.0, 0.1);
    }

    public void testUniformValue() throws Exception {
        FastChain chain = new FastChain("AGGCTA");
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        poses.add(1);
        FastCalculatorBase calculator = FastCalculatorFactory.getPositionedEventCount(poses, 3);
        double value = calculator.getValue(chain.getFastUniformChain("A"), LinkUp.Start);
        assertEquals(value, 1.0, 0.1);
        poses.remove(0);
        value = calculator.getValue(chain.getFastUniformChain("A"), LinkUp.Start);
        assertEquals(value, 0.0, 0.1);
    }

    public void testGetType() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        assertEquals(FastCalculatorFactory.getPositionedEventCount(poses, 3).getType(), "int");
    }

    public void testGetGroup() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        assertEquals(FastCalculatorFactory.getPositionedEventCount(poses, 3).getGroup(), "Positioned common");
    }

    public void testGetName() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        FastCalculatorBase calculator = FastCalculatorFactory.getPositionedEventCount(poses, 3);
        assertEquals(calculator.getName(), "n(1)");

        FastChain chain = new FastChain("ABC");
        calculator.getValue(chain.getFastUniformChain("A"), LinkUp.Start);
        assertEquals(calculator.getName(), "n(A, 1)");
    }
}
