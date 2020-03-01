package exchangablecontent.view.uppercase;

import exchangablecontent.core.ViewModelFactory;
import exchangablecontent.view.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import exchangablecontent.core.ViewHandler;


public class UppercaseViewController implements ViewController {
    @FXML private TextField requestField;
    @FXML private TextField replyField;
    @FXML private Label errorLabel;
    private UppercaseViewModel viewModel;


    public void init(ViewHandler viewHandler, ViewModelFactory vmf){
        viewModel = vmf.getUppercaseViewModel();

        requestField.textProperty().bindBidirectional(viewModel.requestProperty());
        replyField.textProperty().bind(viewModel.replyProperty());
        errorLabel.textProperty().bind(viewModel.errorProperty());
    }

    @Override
    public void reset() {
        viewModel.clear();
    }

    @FXML private void onSubmitButton(){
        viewModel.convertToUpperCase();
    }
}
