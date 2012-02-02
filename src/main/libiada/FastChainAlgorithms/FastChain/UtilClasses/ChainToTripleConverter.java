package main.libiada.FastChainAlgorithms.FastChain.UtilClasses;

import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.FastChainAlgorithms.FastChain.FastChainBase;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 04.08.11
 * Time: 19:13
 */
public abstract class ChainToTripleConverter {
    public static FastChainBase convert(FastChainBase ch) throws Exception {
        FastChainBase result = new FastChain();
        String triple = "";
        for (int i = 0; i < ch.length(); i++) {
            triple += ch.get(i);
            if (i % 3 == 2) {
                result.add(triple);
                triple = "";
            }
        }
        return result;
    }
}
