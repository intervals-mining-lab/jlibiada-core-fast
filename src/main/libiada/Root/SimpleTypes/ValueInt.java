package libiada.Root.SimpleTypes;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 30.11.2010
 * Time: 10:11:33
 */
public class ValueInt extends Value {
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

    public long getValue() {
        return value;
    }
}
