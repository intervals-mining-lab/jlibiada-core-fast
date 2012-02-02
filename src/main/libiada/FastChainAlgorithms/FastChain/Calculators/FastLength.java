package main.libiada.FastChainAlgorithms.FastChain.Calculators;

import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.FastChainAlgorithms.FastChain.FastUniformChain;
import main.libiada.IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 29.07.11
 * Time: 22:21
 */
public class FastLength extends FastCalculatorBase {
    @Override
    public double getValue(FastChain chain, LinkUp linkUp) throws Exception {
        return chain.length();
    }

    @Override
    public double getValue(FastUniformChain chain, LinkUp linkUp) throws Exception {
        super.getValue(chain, linkUp);
        return chain.length();
    }

    @Override
    public String getName() {
        return "n" + super.getName();
    }

    @Override
    public String getType() {
        return "int";
    }

    @Override
    public String getGroup() {
        return "Common";
    }
}
