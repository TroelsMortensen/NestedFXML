package exchangablecontent;

import exchangablecontent.core.ModelFactory;
import exchangablecontent.core.ViewModelFactory;
import javafx.stage.Stage;
import exchangablecontent.core.ViewHandler;

public class App extends javafx.application.Application{

    @Override
    public void start(Stage stage) throws Exception {
        ModelFactory mf = new ModelFactory();
        ViewModelFactory vmf = new ViewModelFactory(mf);
        ViewHandler vh = new ViewHandler(vmf, stage);
        vh.start();
    }
}
