package test.FastChainAlgoritms.FastChain.UtilClasses;

import junit.framework.TestCase;
import FastChainAlgorithms.FastChain.UtilClasses.IntervalsAlgebra;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 20:51
 */
public class testIntervalsAlgebra extends TestCase {
    public void testAdd() {
        HashMap<Integer, Integer> first = new HashMap<Integer, Integer>();
        first.put(1, 2);
        first.put(3, 4);
        HashMap<Integer, Integer> second = new HashMap<Integer, Integer>();
        second.put(2, 1);
        second.put(3, 3);
        HashMap<Integer, Integer> third = IntervalsAlgebra.add(first, second);
        assertEquals(third.get(1), Integer.valueOf(2));
        assertEquals(third.get(2), Integer.valueOf(1));
        assertEquals(third.get(3), Integer.valueOf(7));
    }
}
