package libiada.TheoryOfSet;

import libiada.Root.SimpleTypes.Value;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 11.12.2010
 * Time: 1:49:09
 */
public class Alphabet {
    protected ArrayList<Value> vault = new ArrayList<Value>();

    public int getPower() {
        return vault.size();
    }

    public int add(Value value) throws Exception {
        if (vault.contains((value)))
        {
            throw new Exception("????????? ?????????? ??????? ? ???????");
        }
        if (value == null)
        {
            throw new Exception("??????? ???????? ??????? ?????? ? ???????");
        }
        Value obj = (Value) value.clone();
        vault.add(obj);
        return vault.indexOf(obj);
    }

    public boolean isContains(Value obj)
    {
        return vault.contains(obj);
    }

    public int indexOf(Value value) {
        int index = -1;
        for (int i = 0; i < vault.size(); i++)
        {
            if (value.equals(vault.get(i)))
                index = i;
        }
        return index;
    }

    public void remove(int index) {
        vault.remove(index);
    }

    public Value get(int index) {
        return vault.get(index);
    }
}
