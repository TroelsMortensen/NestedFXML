package tabviewexample.datavisualizer.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DataModel implements Model {

    private double x;
    private double y;
    private double z;
    private String lastUpdate;

    private Random random = new Random();
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);


    @Override
    public double[] getDataValues() {
        return new double[]{x, y, z};
    }

    @Override
    public String getLastUpdateTimeStamp() {
        return lastUpdate;
    }

    @Override
    public void addListener(String name, PropertyChangeListener listener) {
        if(name == null)
            changeSupport.addPropertyChangeListener(listener);
        else
            changeSupport.addPropertyChangeListener(name, listener);
    }

    @Override
    public void saveData(double[] data) {
        x = data[0];
        y = data[1];
        z = data[2];
        changeSupport.firePropertyChange("Data", null, new double[]{x, y, z});
        calcTimeStamp();
    }

    public void recalculateData() {
        int first = random.nextInt(100)+1;
        int second = random.nextInt(100)+1;
        int bottom = Math.min(first, second);
        int top = Math.max(first, second);

        x = bottom;
        y = top - bottom;
        z = 100 - top;
      /*  System.out.println("1: " + x);
        System.out.println("2: " + y);
        System.out.println("3: " + z);
        System.out.println("Sum: " + (x + y + z));*/
        changeSupport.firePropertyChange("Data", null, new double[]{x, y, z});
        calcTimeStamp();
    }

    private void calcTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        changeSupport.firePropertyChange("TimeUpdate", lastUpdate, strDate);
        lastUpdate = strDate;
    }


}
