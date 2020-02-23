package tabviewexample.datavisualizer.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tabviewexample.datavisualizer.view.tabview.TabViewController;

import java.io.IOException;

public class ViewHandler {

    private Stage stage;
    private ViewModelFactory vmf;

    public ViewHandler(Stage stage, ViewModelFactory _vmp) {
        this.stage = stage;
        this.vmf = _vmp;
    }

    public void start() throws Exception {
        openTabPane();
    }

    private void openTabPane() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/tabview/TabView.fxml"));
            Parent root = loader.load();

            TabViewController view = loader.getController();
            view.init(vmf);
            Scene scene = new Scene(root);
            stage.setTitle("Datavisualizer");

            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
