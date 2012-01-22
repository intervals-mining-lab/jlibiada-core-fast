package libiada.FastChainAlgorithms.FastChain.Calculators;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 29.07.11
 * Time: 0:46
 */
public abstract class FastCalculatorFactory {
    public static FastCalculatorBase getVolume() {
        return new FastVolume();
    }

    public static FastCalculatorBase getHentropy() {
        return new FastHentropy();
    }

    public static FastCalculatorBase getPropability() {
        return new FastPropability();
    }

    public static FastCalculatorBase getEventCount() {
        return new FastIntervalsCount();
    }

    public static FastCalculatorBase getGamaut() {
        return new FastGamaut();
    }

    public static FastCalculatorBase getAverageRemoteness() {
        return new FastAverageRemoteness();
    }

    public static FastCalculatorBase getRegularity() {
        return new FastRegularity();
    }

    public static FastCalculatorBase getLength() {
        return new FastLength();
    }

    public static FastCalculatorBase getPositionedPropability(HashSet<Integer> poses, int period) throws Exception {
        if (poses == null || poses.size() == 0)
            throw new Exception("Error: poses does not define");
        if (period == 0)
            throw new Exception("Error: period is 0");
        return new FastPositionedPropability(poses, period);
    }

    public static FastCalculatorBase getFastShepherd() {
        return new FastShepherd();
    }

    public static FastCalculatorBase getPositionedEventCount(HashSet<Integer> poses, int period) throws Exception {
        if (poses == null || poses.size() == 0)
            throw new Exception("Error: poses does not define");
        if (period == 0)
            throw new Exception("Error: period is 0");
        return new FastPositionedEventCount(poses, period);
    }

    public static FastCalculatorBase getFastTramontanoMacchiato() {
        return new FastTramontanoMacchiato();
    }

    public static FastCalculatorBase getGeometryInterval() {
        return new FastAverageGeometryInterval();
    }

    public static FastCalculatorBase getBinaryAverageGeomertyInterval(String sym1, String sym2) throws Exception {
        if (sym1 == null || sym1.equalsIgnoreCase(""))
            throw new Exception("Error: event one not defined");
        if (sym2 == null || sym2.equalsIgnoreCase(""))
            throw new Exception("Error: event two not defined");
        return new BinaryFastAverageGeometryInterval(sym1, sym2);
    }

    public static FastCalculatorBase getBinaryAverageRemoteness(String sym1, String sym2) throws Exception {
        if (sym1 == null || sym1.equalsIgnoreCase(""))
            throw new Exception("Error: event one not defined");
        if (sym2 == null || sym2.equalsIgnoreCase(""))
            throw new Exception("Error: event two not defined");
        return new BinaryFastAverageRemoteness(sym1, sym2);
    }

    public static FastCalculatorBase getPositionedAverageRemoteness(HashSet<Integer> poses, int period) throws Exception {
        if (poses == null || poses.size() == 0)
            throw new Exception("Error: poses not defined");
        if (period == 0)
            throw new Exception("Period could not be 0");
        return new FastPositionedAverageRemoteness(poses, period);
    }

    public static FastCalculatorBase getAverageWordLength() {
        return new FastAverageWordLength();
    }

    public static FastCalculatorBase getOrlovPartlyCriteria() {
        return new FastOrlovPartlyCriteria();
    }

    public static FastCalculatorBase getRo() {
        return new RoCalculator();
    }

    public static FastCalculatorBase getMu() {
        return new MuCalculator();
    }
}
