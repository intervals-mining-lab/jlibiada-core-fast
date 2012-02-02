package main.libiada.Root.SimpleTypes;

import main.Root.IBaseObject;
import main.Root.IBin;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 30.11.2010
 * Time: 10:11:33
 */
public class ValueInt implements IBaseObject {
    private long value;

    public ValueInt(long i) {
        value = i;
    }

    @Override
    public String toString() {
        return ((Long)value).toString();
    }

    @Override
    public ValueInt clone() {
        return new ValueInt(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        return value == ((ValueInt)obj).getValue();
    }

    public IBin GetBin() {
        return null;  //TODO:"Заполни метод!"
    }

    public long getValue() {
        return value;
    }
}
