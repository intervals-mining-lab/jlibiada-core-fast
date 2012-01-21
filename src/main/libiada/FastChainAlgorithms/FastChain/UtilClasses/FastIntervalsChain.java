package libiada.FastChainAlgorithms.FastChain.UtilClasses;

import libiada.FastChainAlgorithms.FastChain.FastChainBase;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 29.07.11
 * Time: 2:55
 */
public abstract class FastIntervalsChain extends FastChainBase {
    public FastIntervalsChain(String chainAsString) throws Exception {
        super(chainAsString);
    }

    public FastIntervalsChain() {
        super();
    }

    public abstract int alphabetPower();

    public abstract HashMap<Integer, Integer> getCommonIntervals() throws Exception;
    public abstract HashMap<Integer, Integer> getStartIntervals() throws Exception;
    public abstract HashMap<Integer, Integer> getEndIntervals() throws Exception;
    public abstract HashMap<Integer, Integer> getCircleIntervals() throws Exception;
}
