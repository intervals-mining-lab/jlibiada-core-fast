package FastChainAlgorithms.FastChain.UtilClasses.ChainAlgebra;

import FastChainAlgorithms.FastChain.FastUniformChain;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 08.08.11
 * Time: 18:11
 */
public abstract class FastChainAlgebra {
    public static FastUniformChain composition(FastUniformChain firstChain, FastUniformChain secondChain) throws Exception {
        FastUniformChain resultChain = new FastUniformChain(Math.max(firstChain.length(), secondChain.length()));
        for (int i = 0; (i < firstChain.length()) && (i < secondChain.length()); i++) {
            String a = firstChain.get(i);
            String b = secondChain.get(i);
            if ("-" !=b ) {
                resultChain.add(b, i);
            } else if (("-" == a) && ("-" == b)) {
                resultChain.add("-", i);
            } else {
                resultChain.add(secondChain.getAlphabet().get(1), i);
            }
        }
        return resultChain;
    }
}
