package main.libiada.FastChainAlgorithms.FastChain.Calculators;

import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.FastChainAlgorithms.FastChain.FastPeriodicChainConverter;
import main.libiada.FastChainAlgorithms.FastChain.FastUniformChain;
import main.libiada.IntervalAnalysis.LinkUp;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 30.07.11
 * Time: 17:20
 */
public class FastPositionedPropability extends FastCalculatorBase {
    private HashSet<Integer> poses = null;
    private int period = 0;

    public FastPositionedPropability(HashSet<Integer> poses, int period) {
        this.poses = poses;
        this.period = period;
    }

    @Override
    public double getValue(FastChain ch, LinkUp linkUp) throws Exception {
        FastChain chain = (FastChain) FastPeriodicChainConverter.toPeriodicChain(ch, poses, period);
        return FastCalculatorFactory.getPropability().getValue(chain, linkUp);
    }

    @Override
    public double getValue(FastUniformChain ch, LinkUp linkUp) throws Exception {
        super.getValue(ch, linkUp);
        FastUniformChain chain = FastPeriodicChainConverter.toPeriodicChain(ch, poses, period);
        return FastCalculatorFactory.getPropability().getValue(chain, linkUp);
    }

    @Override
    public String getName() {
        if (event == null)
            return "P(" + getPos(poses) + ")";
        else
            return "P(" + event + ", " + getPos(poses) + ")";
    }

    @Override
    public String getType() {
        return "double";
    }

    @Override
    public String getGroup() {
        return "Positioned propability";
    }

    private String getPos(HashSet<Integer> poses) {
        String result = "";
        for (Integer pos : poses) {
            result += ", " + Integer.toString(pos + 1);
        }
        return result.substring(2);
    }
}
