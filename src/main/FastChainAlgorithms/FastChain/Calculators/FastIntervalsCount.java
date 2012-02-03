package FastChainAlgorithms.FastChain.Calculators;

import FastChainAlgorithms.FastChain.FastChain;
import FastChainAlgorithms.FastChain.FastIntervalsChain;
import FastChainAlgorithms.FastChain.FastUniformChain;
import IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 29.07.11
 * Time: 19:06
 */
public class FastIntervalsCount extends FastCalculatorBase {
    @Override
    public double getValue(FastChain chain, LinkUp linkUp) throws Exception {
        return getCommonValue(chain, linkUp);
    }

    @Override
    public double getValue(FastUniformChain chain, LinkUp linkUp) throws Exception {
        super.getValue(chain, linkUp);
        event = chain.getEvent();
        return getCommonValue(chain, linkUp);
    }

    @Override
    public String getName() {
        return "Intervals count" + super.getName();
    }

    @Override
    public String getType() {
        return "int";
    }

    @Override
    public String getGroup() {
        return "Building characteristic";
    }

    private double getCommonValue(FastIntervalsChain chain, LinkUp linkUp) throws Exception {
        int n = chain.getEventCount();
        if (linkUp == LinkUp.Both) {
            n++;
        }
        return n;
    }
}
