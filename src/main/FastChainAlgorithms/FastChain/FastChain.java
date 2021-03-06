package FastChainAlgorithms.FastChain;

import FastChainAlgorithms.FastChain.UtilClasses.IntervalsAlgebra;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 31.05.11
 * Time: 20:01
 */
public class FastChain extends FastIntervalsChain {
    private HashMap<Integer, FastUniformChain> uChains = new HashMap<Integer, FastUniformChain>();

    private HashMap<String,HashMap<Integer, Integer>> pChainToChainIntervals = new HashMap<String, HashMap<Integer, Integer>>();

    public FastChain(int length) throws Exception {
        super(length);
    }

    public FastChain() {
        super();
    }

    public FastChain(String chainAsString) throws Exception {
        super(chainAsString);
    }

    public FastUniformChain getFastUniformChain(int i) throws Exception {
        int count = 0;
        if (uChains.containsKey(i))
            return uChains.get(i);
        FastUniformChain uChain = new FastUniformChain();
        for (Integer event : events) {
            if (event == i) {
                uChain.add(alphabet.get(i));
                count++;
            } else {
                uChain.add("-");
            }
        }
        uChain.setCount(count);
        uChains.put(i, uChain);
        return uChain;
    }

    @Override
    protected void buildIntervals() throws Exception {
        pStartIntervals.clear();
        pEndIntervals.clear();
        pCommonIntervals.clear();
        pCircleIntervals.clear();

        for (int i = 0; i < alphabet.size(); i++) {
            pStartIntervals = IntervalsAlgebra.add(pStartIntervals, getFastUniformChain(i).getStartIntervals());
            pEndIntervals = IntervalsAlgebra.add(pEndIntervals, getFastUniformChain(i).getEndIntervals());
            pCommonIntervals = IntervalsAlgebra.add(pCommonIntervals, getFastUniformChain(i).getCommonIntervals());
            pCircleIntervals = IntervalsAlgebra.add(pCircleIntervals, getFastUniformChain(i).getCircleIntervals());
        }
    }

    @Override
    public int alphabetPower() {
        return alphabet.size();
    }

    public FastUniformChain getFastUniformChain(String s) throws Exception {
        return getFastUniformChain(alphabet.indexOf(s));
    }

}
