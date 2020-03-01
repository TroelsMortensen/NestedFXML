package exchangablecontent.view.camelcase;

import exchangablecontent.core.ViewModelFactory;
import exchangablecontent.view.ViewController;
import exchangablecontent.core.ViewHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CamelcaseViewController implements ViewController {
    @FXML
    private TextField requestField;
    @FXML
    private TextField replyField;
    @FXML
    private Label errorLabel;

    private CamelcaseViewModel viewModel;

    public void init(ViewHandler viewHandler, ViewModelFactory vmf) {
        viewModel = vmf.getCamelcaseViewModel();

        requestField.textProperty().bindBidirectional(this.viewModel.requestProperty());
        replyField.textProperty().bind(this.viewModel.replyProperty());
        errorLabel.textProperty().bind(this.viewModel.errorProperty());
    }

    @Override
    public void reset() {
        viewModel.clear();
    }

    @FXML
    private void onSubmitButton() {
        viewModel.convertToCamelCase();
    }
}
