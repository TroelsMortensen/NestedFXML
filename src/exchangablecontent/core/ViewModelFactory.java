package exchangablecontent.core;

import exchangablecontent.view.camelcase.CamelcaseViewModel;
import exchangablecontent.view.lowercase.LowercaseViewModel;
import exchangablecontent.view.uppercase.UppercaseViewModel;

public class ViewModelFactory {

    private CamelcaseViewModel camelcaseViewModel;
    private UppercaseViewModel uppercaseViewModel;
    private LowercaseViewModel lowercaseViewModel;

    public ViewModelFactory(ModelFactory mf) {
        camelcaseViewModel = new CamelcaseViewModel(mf.getTextConverter());
        uppercaseViewModel = new UppercaseViewModel(mf.getTextConverter());
        lowercaseViewModel = new LowercaseViewModel(mf.getTextConverter());
    }

    public CamelcaseViewModel getCamelcaseViewModel() {
        return camelcaseViewModel;
    }

    public UppercaseViewModel getUppercaseViewModel() {
        return uppercaseViewModel;
    }

    public LowercaseViewModel getLowercaseViewModel() {
        return lowercaseViewModel;
    }
}

