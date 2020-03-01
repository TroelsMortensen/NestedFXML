package exchangablecontent.view;

import exchangablecontent.core.ViewHandler;
import exchangablecontent.core.ViewModelFactory;

public interface ViewController {
    void init(ViewHandler viewHandler, ViewModelFactory vmf);
    void reset();
}
