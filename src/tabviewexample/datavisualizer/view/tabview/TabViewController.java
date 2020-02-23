package tabviewexample.datavisualizer.view.tabview;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import tabviewexample.datavisualizer.view.barchart.BarChartViewController;
import tabviewexample.datavisualizer.view.piechart.PieChartViewController;
import tabviewexample.datavisualizer.view.textchart.TextViewController;
import tabviewexample.datavisualizer.core.ViewModelFactory;

public class TabViewController {

    // these controllers are automatically injected. They !MUST! be suffixed "Controller"

    @FXML
    private BarChartViewController barChartViewController;
    @FXML
    private PieChartViewController pieChartViewController;
    @FXML
    private TextViewController textViewController;

    @FXML
    private TabPane chartTabPane;

    public void init(ViewModelFactory vmp) {
        barChartViewController.init(vmp.getBarChartViewModel());
        pieChartViewController.init(vmp.getPieChartViewModel());
        textViewController.init(vmp.getTextViewModel());
    }


}
