package test.FastChainAlgoritms.FastChain;

import junit.framework.TestCase;
import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.FastChainAlgorithms.FastChain.FastUniformChain;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 28.10.11
 * Time: 0:40
 */
public class testFastUniformChain extends TestCase {
    public void testGetPositions() throws Exception {
        FastChain ch = new FastChain("12112141");
        FastUniformChain uChain = ch.getFastUniformChain("1");

        ArrayList<Integer> poses = uChain.getPositions();
        assertEquals(poses.get(0), (Integer)1);
        assertEquals(poses.get(1), (Integer)3);
        assertEquals(poses.get(2), (Integer)4);
        assertEquals(poses.get(3), (Integer)6);
        assertEquals(poses.get(4), (Integer)8);

        uChain.add("1");
        poses = uChain.getPositions();
        assertEquals(poses.get(0), (Integer)1);
        assertEquals(poses.get(1), (Integer)3);
        assertEquals(poses.get(2), (Integer)4);
        assertEquals(poses.get(3), (Integer)6);
        assertEquals(poses.get(4), (Integer)8);
        assertEquals(poses.get(5), (Integer)9);

        poses = uChain.getPositions();
        assertEquals(poses.get(0), (Integer)1);
        assertEquals(poses.get(1), (Integer)3);
        assertEquals(poses.get(2), (Integer)4);
        assertEquals(poses.get(3), (Integer)6);
        assertEquals(poses.get(4), (Integer)8);
        assertEquals(poses.get(5), (Integer)9);
    }

    public void testConstructor() throws Exception {
        FastUniformChain chain = new FastUniformChain(2);
        assertEquals(chain.toString(), "-, -");
    }

    public void testGetCommonIntervals() throws Exception {
        FastChain chain = new FastChain("211221");
        FastUniformChain uChain = chain.getFastUniformChain("1");

        HashMap<Integer, Integer> intervals = uChain.getCommonIntervals();
        assertEquals(intervals.get(1), Integer.valueOf(1));
        assertEquals(intervals.get(3), Integer.valueOf(1));
    }

    public void testGetEndIntervals() throws Exception {
        FastChain chain = new FastChain("211221");
        FastUniformChain uChain = chain.getFastUniformChain("2");

        HashMap<Integer, Integer> intervals = uChain.getEndIntervals();
        assertEquals(intervals.get(2), Integer.valueOf(1));
    }

    public void testGetCircledIntervals() throws Exception {
        FastChain chain = new FastChain("211221");
        FastUniformChain uChain = chain.getFastUniformChain("2");

        HashMap<Integer, Integer> intervals = uChain.getCircleIntervals();
        assertEquals(intervals.get(2), Integer.valueOf(1));
    }

    public void testGetStartIntervals() throws Exception {
        FastChain chain = new FastChain("2111111221");
        FastUniformChain uChain = chain.getFastUniformChain("1");

        HashMap<Integer, Integer> intervals = uChain.getCircleIntervals();
        assertEquals(intervals.get(2), Integer.valueOf(1));
    }

    public void testAlphabetPower() throws Exception {
        FastChain chain = new FastChain("2111111221");
        FastUniformChain uChain = chain.getFastUniformChain("1");
        assertEquals(uChain.alphabetPower(), 2);
    }

    public void testGetEvent() throws Exception {
        FastChain chain = new FastChain("2111111221");
        FastUniformChain uChain = chain.getFastUniformChain("1");
        assertEquals(uChain.getEvent(), "1");
    }
}
