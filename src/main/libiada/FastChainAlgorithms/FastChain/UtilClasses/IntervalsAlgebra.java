package main.libiada.FastChainAlgorithms.FastChain.UtilClasses;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 28.07.11
 * Time: 23:21
 */
public abstract class IntervalsAlgebra {
    public static HashMap<Integer, Integer> add(HashMap<Integer, Integer> first, HashMap<Integer, Integer> second) {
        HashMap<Integer, Integer> result = first;
        for (Map.Entry<Integer, Integer> entry : second.entrySet()) {
            Integer value1 = entry.getValue();
            if (result.containsKey(entry.getKey()))
            {
                Integer value2 = result.get(entry.getKey());
                result.remove(entry.getKey());
                result.put(entry.getKey(), value1 + value2);
            } else {
                result.put(entry.getKey(), value1);
            }
        }
        return result;
    }
}
