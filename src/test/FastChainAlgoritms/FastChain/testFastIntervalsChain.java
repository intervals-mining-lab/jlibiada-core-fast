package test.FastChainAlgoritms.FastChain;

import junit.framework.TestCase;
import FastChainAlgorithms.FastChain.FastChain;
import FastChainAlgorithms.FastChain.FastIntervalsChain;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 20.01.12
 * Time: 16:23
 */
public class testFastIntervalsChain extends TestCase{
    public void testGetCommonIntervals() throws Exception {
        FastIntervalsChain chain = new FastChain();
        chain.add("1");
        chain.add("1");
        chain.add("2");
        chain.add("1");
        chain.add("3");
        HashMap<Integer, Integer> intervals = chain.getCommonIntervals();
        assertEquals(intervals.get(Integer.valueOf(1)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(2)), Integer.valueOf(1));

        chain.add("4", 1);
        intervals = chain.getCommonIntervals();
        assertEquals(intervals.get(Integer.valueOf(1)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(2)), Integer.valueOf(1));

        intervals = chain.getCommonIntervals();
        assertEquals(intervals.get(Integer.valueOf(1)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(2)), Integer.valueOf(1));
    }

    public void testGetStartIntervals() throws Exception {
        FastIntervalsChain chain = new FastChain();
        chain.add("1");
        chain.add("1");
        chain.add("2");
        chain.add("1");
        chain.add("3");
        HashMap<Integer, Integer> intervals = chain.getStartIntervals();
        assertEquals(intervals.get(Integer.valueOf(1)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(3)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(5)), Integer.valueOf(1));

        chain.add("4", 1);
        intervals = chain.getStartIntervals();
        assertEquals(intervals.get(Integer.valueOf(1)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(2)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(3)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(5)), Integer.valueOf(1));

        intervals = chain.getStartIntervals();
        assertEquals(intervals.get(Integer.valueOf(1)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(2)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(3)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(5)), Integer.valueOf(1));
    }

    public void testGetEndIntervals() throws Exception {
        FastIntervalsChain chain = new FastChain();
        chain.add("1");
        chain.add("1");
        chain.add("2");
        chain.add("1");
        chain.add("3");
        HashMap<Integer, Integer> intervals = chain.getEndIntervals();
        assertEquals(intervals.get(Integer.valueOf(1)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(2)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(3)), Integer.valueOf(1));

        chain.add("4", 1);
        intervals = chain.getEndIntervals();
        assertEquals(intervals.get(Integer.valueOf(1)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(2)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(3)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(4)), Integer.valueOf(1));

        intervals = chain.getEndIntervals();
        assertEquals(intervals.get(Integer.valueOf(1)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(2)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(3)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(4)), Integer.valueOf(1));
    }

    public void testGetCircledIntervals() throws Exception {
        FastIntervalsChain chain = new FastChain();
        chain.add("1");
        chain.add("1");
        chain.add("2");
        chain.add("1");
        chain.add("3");
        HashMap<Integer, Integer> intervals = chain.getCircleIntervals();
        assertEquals(intervals.get(Integer.valueOf(2)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(5)), Integer.valueOf(2));

        chain.add("4", 1);
        intervals = chain.getCircleIntervals();
        assertEquals(intervals.get(Integer.valueOf(2)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(5)), Integer.valueOf(3));

        intervals = chain.getCircleIntervals();
        assertEquals(intervals.get(Integer.valueOf(2)), Integer.valueOf(1));
        assertEquals(intervals.get(Integer.valueOf(5)), Integer.valueOf(3));
    }
}
