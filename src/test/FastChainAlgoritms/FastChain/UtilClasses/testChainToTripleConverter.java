package test.FastChainAlgoritms.FastChain.UtilClasses;

import junit.framework.TestCase;
import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.FastChainAlgorithms.FastChain.FastChainBase;
import main.libiada.FastChainAlgorithms.FastChain.UtilClasses.ChainToTripleConverter;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 20:43
 */
public class testChainToTripleConverter extends TestCase{
    public void testConvert() throws Exception {
        FastChain chain = new FastChain("AGCCTGATC");
        FastChainBase trippedChain = ChainToTripleConverter.convert(chain);
        assertEquals(trippedChain.toString(), "AGC, CTG, ATC");
    }
}
