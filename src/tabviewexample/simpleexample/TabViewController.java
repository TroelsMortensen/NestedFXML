package tabviewexample.simpleexample;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import tabviewexample.simpleexample.tab1.Tab1Controller;
import tabviewexample.simpleexample.tab2.Tab2Controller;

public class TabViewController {

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab tab1;

    @FXML
    private Tab tab2;

    @FXML
    private Tab1Controller tab1Controller;

    @FXML
    private Tab2Controller tab2Controller;

    public void init() {
        tab1Controller.init();
        tab2Controller.init();
    }
}
