package tabviewexample.datavisualizer.view.barchart;

import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import tabviewexample.datavisualizer.model.Model;

import java.beans.PropertyChangeEvent;

public class BarChartViewModel {

    private DoubleProperty x;
    private DoubleProperty y;
    private DoubleProperty z;

    private StringProperty updateTimeStamp;

    public BarChartViewModel(Model model) {
        x = new SimpleDoubleProperty();
        y = new SimpleDoubleProperty();
        z = new SimpleDoubleProperty();
        updateTimeStamp = new SimpleStringProperty("Last update: ");
        model.addListener("Data", evt -> updateBarChart(evt));
        model.addListener("TimeUpdate", evt -> timeStampUpdated(evt));
    }

    public StringProperty updateTimeStampProperty() {
        return updateTimeStamp;
    }

    public void updateBarChart(PropertyChangeEvent evt) {
        Platform.runLater(() -> {
            double[] vals = (double[]) evt.getNewValue();
            x.setValue(vals[0]);
            y.setValue(vals[1]);
            z.setValue(vals[2]);
        });

    }

    private void timeStampUpdated(PropertyChangeEvent evt) {
        Platform.runLater(() -> {
            updateTimeStamp.setValue("Last updated: " + evt.getNewValue());
        });
    }

    public ObservableValue xProperty() {
        return x;
    }

    public ObservableValue yProperty() {
        return y;
    }

    public ObservableValue zProperty() {
        return z;
    }
}
