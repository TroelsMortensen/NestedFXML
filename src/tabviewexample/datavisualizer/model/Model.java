package tabviewexample.datavisualizer.model;

import java.beans.PropertyChangeListener;

public interface Model {
    double[] getDataValues();

    String getLastUpdateTimeStamp();

    void addListener(String name, PropertyChangeListener listener);

    void saveData(double[] data);
}
