package main.libiada.FastChainAlgorithms.FastChain.Interfaces;

import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.FastChainAlgorithms.FastChain.FastUniformChain;
import main.libiada.IntervalAnalysis.LinkUp;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 29.07.11
 * Time: 0:46
 */
public interface IFastCalculator {
    double getValue(FastChain chain, LinkUp linkUp) throws Exception;
    double getValue(FastUniformChain chain, LinkUp linkUp) throws Exception;
    String getName();
}
