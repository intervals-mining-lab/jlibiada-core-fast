package test.FastChainAlgoritms.FastChain;

import junit.framework.TestCase;
import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.FastChainAlgorithms.FastChain.FastChainBase;
import main.libiada.FastChainAlgorithms.FastChain.FastPeriodicChainConverter;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 21.01.12
 * Time: 13:43
 */
public class testFastPeriodicChainConverter extends TestCase {
    public void testToPeriodicChain() throws Exception {
        FastChain chain = new FastChain("123456789");
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        poses.add(1);
        FastChainBase periodic = FastPeriodicChainConverter.toPeriodicChain(chain, poses, 3);
        assertEquals("1, 2, -, 4, 5, -, 7, 8, -", periodic.toString());
    }
}
