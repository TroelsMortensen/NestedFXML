package tabviewexample.datavisualizer.core;

import tabviewexample.datavisualizer.model.Model;
import tabviewexample.datavisualizer.view.barchart.BarChartViewModel;
import tabviewexample.datavisualizer.view.piechart.PieChartViewModel;
import tabviewexample.datavisualizer.view.textchart.TextViewModel;

public class ViewModelFactory {

    private PieChartViewModel pieChartViewModel;
    private BarChartViewModel barChartViewModel;
    private TextViewModel textViewModel;

    public ViewModelFactory(Model model) {
        pieChartViewModel = new PieChartViewModel(model);
        barChartViewModel = new BarChartViewModel(model);
        textViewModel = new TextViewModel(model);
    }

    public PieChartViewModel getPieChartViewModel() {
        return pieChartViewModel;
    }

    public BarChartViewModel getBarChartViewModel() {
        return barChartViewModel;
    }

    public TextViewModel getTextViewModel() {
        return textViewModel;
    }
}
