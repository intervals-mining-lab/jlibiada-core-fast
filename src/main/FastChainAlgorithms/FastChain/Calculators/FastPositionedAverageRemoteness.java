package FastChainAlgorithms.FastChain.Calculators;

import FastChainAlgorithms.FastChain.FastChain;
import FastChainAlgorithms.FastChain.FastPeriodicChainConverter;
import FastChainAlgorithms.FastChain.FastUniformChain;
import IntervalAnalysis.LinkUp;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 21.08.11
 * Time: 15:15
 */
public class FastPositionedAverageRemoteness extends FastCalculatorBase {
    private HashSet<Integer> poses = null;
    private int period = 0;

    public FastPositionedAverageRemoteness(HashSet<Integer> poses, int period) {
        this.poses = poses;
        this.period = period;
    }

    @Override
    public double getValue(FastChain chain, LinkUp linkUp) throws Exception {
        FastChain uchain = FastPeriodicChainConverter.toPeriodicChain(chain, poses, period);
        return FastCalculatorFactory.getAverageRemoteness().getValue(uchain, linkUp);
    }

    @Override
    public double getValue(FastUniformChain chain, LinkUp linkUp) throws Exception {
        super.getValue(chain, linkUp);
        FastUniformChain uchain = FastPeriodicChainConverter.toPeriodicChain(chain, poses, period);
        if (uchain.getAlphabet().size() <= 1)
            return 0;
        return FastCalculatorFactory.getAverageRemoteness().getValue(uchain, linkUp);
    }

    @Override
    public String getName() {
        if (event == null)
            return "g(" + getPos(poses) + ")";
        else
            return "g(" + event + ", " + getPos(poses) + ")";
    }

    @Override
    public String getType() {
        return "double";
    }

    @Override
    public String getGroup() {
        return "Positioned building characteristic";
    }

    private String getPos(HashSet<Integer> poses) {
        String result = "";
        for (Integer pos : poses) {
            result += ", " + Integer.toString(pos + 1);
        }
        return result.substring(2);
    }
}
