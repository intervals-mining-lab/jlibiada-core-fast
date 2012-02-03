package FastChainAlgorithms.FastChain.Interfaces;

import FastChainAlgorithms.FastChain.FastChain;
import FastChainAlgorithms.FastChain.FastUniformChain;
import IntervalAnalysis.LinkUp;

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
