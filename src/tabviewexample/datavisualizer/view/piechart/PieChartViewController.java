package tabviewexample.datavisualizer.view.piechart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

public class PieChartViewController {

    @FXML
    Label eventLabel;

    @FXML
    PieChart pieChart;

    private PieChartViewModel viewModel;

    private PieChart.Data yellow = new PieChart.Data("X", 0);
    private PieChart.Data green = new PieChart.Data("Y", 0);
    private PieChart.Data red = new PieChart.Data("Z", 0);

    public PieChartViewController() {
    }

    public void init(PieChartViewModel pieChartViewModel) {

        this.viewModel = pieChartViewModel;

        yellow.pieValueProperty().bind(viewModel.xProperty());
        green.pieValueProperty().bind(viewModel.yProperty());
        red.pieValueProperty().bind(viewModel.zProperty());

        eventLabel.textProperty().bind(viewModel.updateTimeStampProperty());

        ObservableList<PieChart.Data> datas = FXCollections.observableArrayList(yellow, green, red);
        pieChart.setData(datas);

    }

}
