package libiada.Statistics;

import libiada.Root.SimpleTypes.Value;

/**
 * Created by IntelliJ IDEA.
 * User: Alex
 * Date: 25.01.2011
 * Time: 20:25:02
 */
public class DictionaryEntryBase extends Value{
    private Value key;
    private Value value;

    public DictionaryEntryBase(Value pkey, Value pvalue) {
        key = pkey;
        value = pvalue;
    }

    public Value getKey()
    {
        return key;
    }

    public Value getValue()
    {
        return value;
    }

    public void setKey(Value key)
    {
        this.key = key;
    }

    public void setValue(Value value)
    {
        this.value = value;
    }

    @Override
    public Object clone() {
        return null;  //TODO:"Заполни метод!"
    }

    @Override
    public boolean equals(Object obj) {
        return false;  //TODO:"Заполни метод!"
    }
}
