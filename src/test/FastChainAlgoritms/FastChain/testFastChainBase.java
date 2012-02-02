package test.FastChainAlgoritms.FastChain;

import junit.framework.TestCase;
import main.libiada.FastChainAlgorithms.FastChain.FastAlphabet;
import main.libiada.FastChainAlgorithms.FastChain.FastChain;
import main.libiada.FastChainAlgorithms.FastChain.FastChainBase;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 20.01.12
 * Time: 13:13
 */
public class testFastChainBase extends TestCase {
    public void testConstructor() throws Exception {
        FastChainBase chain = new FastChain(5);

        assertEquals(chain.get(0), "-");
        assertEquals(chain.get(1), "-");
        assertEquals(chain.get(2), "-");
        assertEquals(chain.get(3), "-");
        assertEquals(chain.get(4), "-");
    }

    public void testAddNull() {
        FastChainBase chain = new FastChain();
        try{
            chain.add(null);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testAddEmpty() {
        FastChainBase chain = new FastChain();
        try{
            chain.add("");
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testToString() throws Exception {
        FastChainBase chain = new FastChain();
        chain.add("123");
        chain.add("1");
        assertEquals(chain.toString(), "123, 1");
    }

    public void testToStringEmpty() {
        FastChainBase chain = new FastChain();
        assertEquals(chain.toString(), "");
    }

    public void testEventCount() throws Exception {
        FastChainBase chain = new FastChain("1211121");
        assertEquals(chain.getEventCount(), 7);
    }

    public void testEventCountWithNull() throws Exception {
        FastChainBase chain = new FastChain("--1-12-");
        assertEquals(chain.getEventCount(), 3);
    }

    public void testAdd() throws Exception {
        FastChainBase chain = new FastChain(4);
        chain.add("1", 0);
        chain.add("12", 2);
        chain.add("21", 1);
        chain.add("1", 3);

        assertEquals(chain.toString(), "1, 21, 12, 1");
    }

    public void testToDividedString() throws Exception {
        FastChainBase chain = new FastChain(3);
        chain.add("1", 0);
        chain.add("12", 2);
        chain.add("21", 1);

        assertEquals(chain.toDividedString('|'), "1|21|12");
    }

    public void testGet() throws Exception {
        FastChainBase chain = new FastChain(3);
        chain.add("1", 0);
        chain.add("12", 2);
        chain.add("21", 1);

        assertEquals(chain.get(0), "1");
        assertEquals(chain.get(1), "21");
        assertEquals(chain.get(2), "12");
    }

    public void testGetAlphabet() throws Exception {
        FastChainBase chain = new FastChain("123112");
        FastAlphabet alphabet = chain.getAlphabet();

        assertEquals(alphabet.get(0), "1");
        assertEquals(alphabet.get(1), "2");
        assertEquals(alphabet.get(2), "3");
    }

    public void testGetBuilding() throws Exception {
        FastChainBase chain = new FastChain("abcadba");
        assertEquals(chain.getBuilding(), "1231421");
    }

    public void testEqualsNotSameType() throws Exception {
        FastChainBase chain = new FastChain();
        assertFalse(chain.equals(new ArrayList(1)));
    }

    public void testEqualsNotEqualAlphabetPower() throws Exception {
        FastChainBase chain1 = new FastChain("123");
        FastChainBase chain2 = new FastChain("1243");

        assertFalse(chain1.equals(chain2));
    }

    public void testEqualsNotEqualLength() throws Exception {
        FastChainBase chain1 = new FastChain("123");
        FastChainBase chain2 = new FastChain("1233");

        assertFalse(chain1.equals(chain2));
    }

    public void testNotEquals() throws Exception {
        FastChainBase chain1 = new FastChain("1253");
        FastChainBase chain2 = new FastChain("1235");

        assertFalse(chain1.equals(chain2));
    }

    public void testEquals() throws Exception {
        FastChainBase chain1 = new FastChain("1235");
        FastChainBase chain2 = new FastChain("1235");

        assertTrue(chain1.equals(chain2));
    }
}
