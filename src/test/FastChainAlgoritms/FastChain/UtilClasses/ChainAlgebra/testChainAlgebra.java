package test.FastChainAlgoritms.FastChain.UtilClasses.ChainAlgebra;

import junit.framework.TestCase;
import libiada.FastChainAlgorithms.FastChain.FastChain;
import libiada.FastChainAlgorithms.FastChain.FastUniformChain;
import libiada.FastChainAlgorithms.FastChain.UtilClasses.ChainAlgebra.FastChainAlgebra;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 22.01.12
 * Time: 21:04
 */
public class testChainAlgebra extends TestCase{
    public void testComposition1() throws Exception {
        FastChain first =  new FastChain("12341112");
        FastChain second = new FastChain("12211132");
        FastUniformChain chain = FastChainAlgebra.composition(first.getFastUniformChain("1"), second.getFastUniformChain("2"));
        assertEquals(chain.toString(), "2, 2, 2, -, 2, 2, 2, 2");
    }

    public void testComposition2() throws Exception {
        FastChain first =  new FastChain("12-4-111");
        FastChain second = new FastChain("12-1113-");
        FastUniformChain chain = FastChainAlgebra.composition(first.getFastUniformChain("1"), second.getFastUniformChain("2"));
        assertEquals(chain.toString(), "2, 2, -, -, -, 2, 2, 2");
    }

    public void testComposition3() throws Exception {
        FastChain first =  new FastChain("12341");
        FastChain second = new FastChain("12211132");
        FastUniformChain chain = FastChainAlgebra.composition(first.getFastUniformChain("1"), second.getFastUniformChain("2"));
        assertEquals(chain.toString(), "2, 2, 2, -, 2, -, -, -");
    }

    public void testComposition4() throws Exception {
        FastChain first =  new FastChain("12211132");
        FastChain second = new FastChain("12341");
        FastUniformChain chain = FastChainAlgebra.composition(first.getFastUniformChain("1"), second.getFastUniformChain("2"));
        assertEquals(chain.toString(), "2, 2, -, 2, 2, -, -, -");
    }
}
