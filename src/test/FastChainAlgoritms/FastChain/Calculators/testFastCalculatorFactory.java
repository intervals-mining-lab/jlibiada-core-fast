package test.FastChainAlgoritms.FastChain.Calculators;

import junit.framework.TestCase;
import libiada.FastChainAlgorithms.FastChain.Calculators.*;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 21.01.12
 * Time: 14:11
 */
public class testFastCalculatorFactory extends TestCase{
    public void testGetMu() {
        FastCalculatorBase calculator = FastCalculatorFactory.getMu();
        assertEquals(calculator.getClass(), MuCalculator.class);
    }

    public void testGetRo() {
        FastCalculatorBase calculator = FastCalculatorFactory.getRo();
        assertEquals(calculator.getClass(), RoCalculator.class);
    }

    public void testGetFastOrlovPartlyCriteria() {
        FastCalculatorBase calculator = FastCalculatorFactory.getOrlovPartlyCriteria();
        assertEquals(calculator.getClass(), FastOrlovPartlyCriteria.class);
    }

    public void testGetFastAverageWordLength() {
        FastCalculatorBase calculator = FastCalculatorFactory.getAverageWordLength();
        assertEquals(calculator.getClass(), FastAverageWordLength.class);
    }

    public void testGetFastPositionedAverageRemoteness() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(1);
        FastCalculatorBase calculator = FastCalculatorFactory.getPositionedAverageRemoteness(poses, 3);
        assertEquals(calculator.getClass(), FastPositionedAverageRemoteness.class);
    }

    public void testGetFastPositionedAverageRemotenessError3() throws Exception {
        try {
            FastCalculatorFactory.getPositionedAverageRemoteness(null, 2);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetFastPositionedAverageRemotenessError4() throws Exception {
        try {
            HashSet<Integer> poses = new HashSet<Integer>();
            FastCalculatorFactory.getPositionedAverageRemoteness(poses, 2);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetFastPositionedAverageRemotenessError5() throws Exception {
        try {
            HashSet<Integer> poses = new HashSet<Integer>();
            poses.add(1);
            FastCalculatorFactory.getPositionedAverageRemoteness(poses, 0);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetBinaryAverageRemoteness() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getBinaryAverageRemoteness("1", "2");
        assertEquals(calculator.getClass(), BinaryFastAverageRemoteness.class);
    }

    public void testGetBinaryAverageRemotenessError1() throws Exception {
        try {
            FastCalculatorFactory.getBinaryAverageRemoteness(null, "2");
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetBinaryAverageRemotenessError2() throws Exception {
        try {
            FastCalculatorFactory.getBinaryAverageRemoteness("", "2");
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetBinaryAverageRemotenessError3() throws Exception {
        try {
            FastCalculatorFactory.getBinaryAverageRemoteness("1", null);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetBinaryAverageRemotenessError4() throws Exception {
        try {
            FastCalculatorFactory.getBinaryAverageRemoteness("1", "");
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetgetBinaryAverageGeomertyInterval() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getBinaryAverageGeomertyInterval("1", "2");
        assertEquals(calculator.getClass(), BinaryFastAverageGeometryInterval.class);
    }

    public void testGetBinaryAverageGeomertyIntervalError1() throws Exception {
        try {
            FastCalculatorFactory.getBinaryAverageGeomertyInterval(null, "2");
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetBinaryAverageGeomertyIntervalError2() throws Exception {
        try {
            FastCalculatorFactory.getBinaryAverageGeomertyInterval("", "2");
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetBinaryAverageGeomertyIntervalError3() throws Exception {
        try {
            FastCalculatorFactory.getBinaryAverageGeomertyInterval("1", null);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetBinaryAverageGeomertyIntervalError4() throws Exception {
        try {
            FastCalculatorFactory.getBinaryAverageGeomertyInterval("1", "");
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetGeometryInterval() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getGeometryInterval();
        assertEquals(calculator.getClass(), FastAverageGeometryInterval.class);
    }

    public void testGetFastTramontanoMacchiato() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getFastTramontanoMacchiato();
        assertEquals(calculator.getClass(), FastTramontanoMacchiato.class);
    }

    public void testGetPositionedEventCount() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(1);
        FastCalculatorBase calculator = FastCalculatorFactory.getPositionedEventCount(poses, 3);
        assertEquals(calculator.getClass(), FastPositionedEventCount.class);
    }

    public void testGetPositionedEventCountError3() throws Exception {
        try{
            FastCalculatorFactory.getPositionedEventCount(null, 3);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetPositionedEventCountError4() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        try{
            FastCalculatorFactory.getPositionedEventCount(poses, 3);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetPositionedEventCountError5() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(1);
        try{
        FastCalculatorBase calculator = FastCalculatorFactory.getPositionedEventCount(poses, 0);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetFastShepherd() throws Exception {
        FastCalculatorBase calculator = FastCalculatorFactory.getFastShepherd();
        assertEquals(calculator.getClass(), FastShepherd.class);
    }

    public void testGetPositionedProbability() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        FastCalculatorBase calculator = FastCalculatorFactory.getPositionedPropability(poses, 3);
        assertEquals(calculator.getClass(), FastPositionedPropability.class);
    }

    public void testGetPositionedProbabilityError3() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        try{
            FastCalculatorFactory.getPositionedPropability(null, 3);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetPositionedProbabilityError4() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        try{
            FastCalculatorFactory.getPositionedPropability(poses, 3);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetPositionedProbabilityError5() throws Exception {
        HashSet<Integer> poses = new HashSet<Integer>();
        poses.add(0);
        try{
            FastCalculatorFactory.getPositionedPropability(poses, 0);
        } catch (Exception e) {
            return;
        }
        fail();
    }

    public void testGetLength() {
        FastCalculatorBase calculator = FastCalculatorFactory.getLength();
        assertEquals(calculator.getClass(), FastLength.class);
    }

    public void testGetRegularity() {
        FastCalculatorBase calculator = FastCalculatorFactory.getRegularity();
        assertEquals(calculator.getClass(), FastRegularity.class);
    }

    public void testGetAverageRemoteness() {
        FastCalculatorBase calculator = FastCalculatorFactory.getAverageRemoteness();
        assertEquals(calculator.getClass(), FastAverageRemoteness.class);
    }

    public void testGetGamaut() {
        FastCalculatorBase calculator = FastCalculatorFactory.getGamaut();
        assertEquals(calculator.getClass(), FastGamaut.class);
    }

    public void testGetEventCount() {
        FastCalculatorBase calculator = FastCalculatorFactory.getEventCount();
        assertEquals(calculator.getClass(), FastIntervalsCount.class);
    }

    public void testGetPropability() {
        FastCalculatorBase calculator = FastCalculatorFactory.getPropability();
        assertEquals(calculator.getClass(), FastPropability.class);
    }

    public void testGetHentropy() {
        FastCalculatorBase calculator = FastCalculatorFactory.getHentropy();
        assertEquals(calculator.getClass(), FastHentropy.class);
    }

    public void testGetVolume() {
        FastCalculatorBase calculator = FastCalculatorFactory.getVolume();
        assertEquals(calculator.getClass(), FastVolume.class);
    }
}
