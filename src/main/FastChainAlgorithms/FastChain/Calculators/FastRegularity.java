package FastChainAlgorithms.FastChain.Calculators;

import FastChainAlgorithms.FastChain.FastChain;
import FastChainAlgorithms.FastChain.FastUniformChain;
import IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 29.07.11
 * Time: 22:22
 */
public class FastRegularity extends FastCalculatorBase {
    @Override
    public double getValue(FastChain chain, LinkUp linkUp) throws Exception {
        return 0;  //TODO: "Заполнить метод"
    }

    @Override
    public double getValue(FastUniformChain chain, LinkUp linkUp) throws Exception {
        super.getValue(chain, linkUp);
        return 0;  //TODO: "Заполнить метод"
    }

    @Override
    public String getName() {
        return "r" + super.getName();
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
