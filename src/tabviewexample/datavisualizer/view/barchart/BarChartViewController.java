package tabviewexample.datavisualizer.view.barchart;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class BarChartViewController {

    @FXML
    Label eventLabel;

    @FXML
    BarChart barChart;

    private BarChartViewModel viewModel;

    private XYChart.Data<String, Integer> x = new XYChart.Data<String, Integer>("X", 0);

    private XYChart.Data<String, Integer> y = new XYChart.Data<String, Integer>("Y", 0);

    private XYChart.Data<String, Integer> z = new XYChart.Data<String, Integer>("Z", 0);


    public BarChartViewController() {

    }

    public void init(BarChartViewModel BarChartViewModel) {
        this.viewModel = BarChartViewModel;

        x.YValueProperty().bind(viewModel.xProperty());
        y.YValueProperty().bind(viewModel.yProperty());
        z.YValueProperty().bind(viewModel.zProperty());

        eventLabel.textProperty().bind(viewModel.updateTimeStampProperty());

        XYChart.Series yellowSeries = new XYChart.Series();
        yellowSeries.setName("X");
        yellowSeries.getData().add(x);
        barChart.getData().add(yellowSeries);

        XYChart.Series greenSeries = new XYChart.Series();
        greenSeries.setName("Y");
        greenSeries.getData().add(y);
        barChart.getData().add(greenSeries);

        XYChart.Series redSeries = new XYChart.Series();
        redSeries.setName("Z");
        redSeries.getData().add(z);
        barChart.getData().add(redSeries);

    }

}
