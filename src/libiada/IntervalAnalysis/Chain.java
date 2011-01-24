package libiada.IntervalAnalysis;

import libiada.EventTheory.Place;
import libiada.IntervalAnalysis.Characteristics.AuxiliaryInterfaces.IChainDataForCalculator;
import libiada.IntervalAnalysis.Characteristics.AuxiliaryInterfaces.ICharacteristicCalculator;
import libiada.IntervalAnalysis.Characteristics.AuxiliaryInterfaces.IDataForCalculator;
import libiada.IntervalAnalysis.Characteristics.Characteristic;
import libiada.Root.IBaseObject;
import libiada.Root.SimpleTypes.ValueChar;
import libiada.Statistics.FrequencyList;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ������
 * Date: 11.12.2010
 * Time: 1:18:31
 * To change this template use File | Settings | File Templates.
 */
public class Chain extends ChainWithCharacteristic implements IChainDataForCalculator, IBaseObject {
    private ArrayList<UniformChain> pUniformChains = new ArrayList<UniformChain>();

    public Chain(int length) throws Exception {
        super(length);
    }

    public UniformChain IUniformChain(int i) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ClearAndSetNewLength(int length) throws Exception {
        super.ClearAndSetNewLength(length);
        pUniformChains = new ArrayList();
    }

    public void addItem(IBaseObject what, Place where) throws Exception
    {
        super.addItem(what, where);
        if (pUniformChains.size() != getAlpahbet().getPower())
        {
            pUniformChains.add(new UniformChain(getLength(), what));
        }
        for (int i = 0; i < pUniformChains.size(); i++)
        {
            pUniformChains.get(i).addItem(what, where);
        }
    }

    @Override
    protected void buildIntervals()
    {
        if (!IntervalsChanged) return;
        IntervalsChanged = false;

        for (int i = 0; i < pUniformChains.size(); i++)
        {
            IDataForCalculator Datainterface = pUniformChains.get(i);
            pIntervals.sum(Datainterface.getCommonIntervals());
            startinterval.sum(Datainterface.getStartInterval());
            endinterval.sum(Datainterface.getEndInterval());
        }
    }

    @Override
    public double injectIntoCharacteristic(Class<? extends ICharacteristicCalculator> calculatorClass, LinkUp link) throws Exception {
        return ((Characteristic) CharacteristicSnapshot.get(calculatorClass)).value(this, link);
    }

    public ChainWithCharacteristic getUniformChain(IBaseObject baseObject) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}