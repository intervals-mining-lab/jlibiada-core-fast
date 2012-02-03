package FastChainAlgorithms.FastChain.Calculators;

import FastChainAlgorithms.FastChain.FastChain;
import FastChainAlgorithms.FastChain.FastUniformChain;
import IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 29.07.11
 * Time: 19:01
 */
public class FastAverageGeometryInterval extends FastCalculatorBase {
    @Override
    public double getValue(FastChain chain, LinkUp linkUp) throws Exception {
        double V = FastCalculatorFactory.getVolume().getValue(chain, linkUp);
        double n = FastCalculatorFactory.getEventCount().getValue(chain, linkUp);
        return Math.pow(V, 1 / n);
    }

    @Override
    public double getValue(FastUniformChain chain, LinkUp linkUp) throws Exception {
        super.getValue(chain, linkUp);
        double V = FastCalculatorFactory.getVolume().getValue(chain, linkUp);
        double n = FastCalculatorFactory.getEventCount().getValue(chain, linkUp);
        return Math.pow(V, 1 / n);
    }

    @Override
    public String getName() {
        return "delta_g" + super.getName();
    }

    @Override
    public String getType() {
        return "double";
    }

    @Override
    public String getGroup() {
        return "Building characteristic";
    }
}
