package FastChainAlgorithms.FastChain.Calculators;

import FastChainAlgorithms.FastChain.FastChain;
import FastChainAlgorithms.FastChain.FastPeriodicChainConverter;
import FastChainAlgorithms.FastChain.FastUniformChain;
import IntervalAnalysis.LinkUp;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 01.08.11
 * Time: 20:15
 */
public class FastPositionedEventCount extends FastCalculatorBase {
    private HashSet<Integer> poses = null;
    private int period = 3;

    public FastPositionedEventCount(HashSet<Integer> poses, int period) {
        this.poses = poses;
        this.period = period;
    }

    @Override
    public double getValue(FastChain chain, LinkUp linkUp) throws Exception {
        FastChain uchain = FastPeriodicChainConverter.toPeriodicChain(chain, poses, period);
        if (uchain.getAlphabet().size() <= 1)
            return 0;
        return FastCalculatorFactory.getEventCount().getValue(uchain, linkUp);
    }

    @Override
    public double getValue(FastUniformChain chain, LinkUp linkUp) throws Exception {
        super.getValue(chain, linkUp);
        FastUniformChain uchain = FastPeriodicChainConverter.toPeriodicChain(chain, poses, period);
        if (uchain.getAlphabet().size() <= 1)
            return 0;
        return FastCalculatorFactory.getEventCount().getValue(uchain, linkUp);
    }

    @Override
    public String getName() {
        if (event == null)
            return "n(" + getPos(poses) + ")";
        else
            return "n(" + event + ", " + getPos(poses) + ")";
    }

    @Override
    public String getType() {
        return "int";
    }

    @Override
    public String getGroup() {
        return "Positioned common";
    }

    private String getPos(HashSet<Integer> poses) {
        String result = "";
        for (Integer pos : poses) {
            result += ", " + Integer.toString(pos + 1);
        }
        return result.substring(2);
    }
}
