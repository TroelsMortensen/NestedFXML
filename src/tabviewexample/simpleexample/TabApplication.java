package tabviewexample.simpleexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TabApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("TabView.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        TabViewController view = loader.getController();

        Scene scene = new Scene(root);

        stage.setTitle("View tasks");

        stage.setScene(scene);
        stage.show();
    }
}
