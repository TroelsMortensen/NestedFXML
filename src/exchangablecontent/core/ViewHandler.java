package exchangablecontent.core;

import exchangablecontent.view.ViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import exchangablecontent.core.ViewModelFactory;

import java.io.IOException;

public class ViewHandler {


    private Stage stage;
    private ViewModelFactory vmf;

    private ViewController currentlyActive;

    public ViewHandler(ViewModelFactory vmf, Stage stage) {
        this.vmf = vmf;
        this.stage = stage;
    }

    public void start() throws IOException {
        Scene scene;
        Parent root;

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/master/MasterView.fxml"));
        root = loader.load();

        ViewController ctrl = loader.getController();
        currentlyActive = ctrl;
        ctrl.init(this, vmf);

        stage.setTitle("Converter");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public Parent getUpperCaseView() {
        currentlyActive.reset();
        return getRoot("../view/uppercase/UppercaseView.fxml");
    }

    public Parent getLowerCaseView() {
        currentlyActive.reset();
        return getRoot("../view/lowercase/LowercaseView.fxml");
    }

    public Parent getCamelCaseView() {
        currentlyActive.reset();
        return getRoot("../view/camelcase/CamelcaseView.fxml");
    }

    private Parent getRoot(String s) {
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(s));
            root = loader.load();
            ViewController ctrl = loader.getController();
            currentlyActive = ctrl;
            ctrl.init(this, vmf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return root;
    }

}
