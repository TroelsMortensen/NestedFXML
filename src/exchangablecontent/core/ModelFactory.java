package exchangablecontent.core;

import exchangablecontent.model.TextConverter;
import exchangablecontent.model.TextConverterModel;

public class ModelFactory {
    private TextConverter textConverter;

    public ModelFactory(){
        textConverter = new TextConverterModel();
    }

    public TextConverter getTextConverter(){
        return textConverter;
    }
}
