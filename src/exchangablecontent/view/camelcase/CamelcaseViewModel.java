package exchangablecontent.view.camelcase;

import exchangablecontent.model.TextConverter;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CamelcaseViewModel {
    private StringProperty request;
    private StringProperty reply;
    private StringProperty error;

    private TextConverter model;

    public CamelcaseViewModel(TextConverter model){
        this.model = model;
        request = new SimpleStringProperty();
        reply = new SimpleStringProperty();
        error = new SimpleStringProperty();
    }

    StringProperty requestProperty() { return request; }
    StringProperty replyProperty() { return reply; }
    StringProperty errorProperty() { return error; }

    void convertToCamelCase(){
        String value = request.getValue();
        if( request == null  || value.equals("") ){
            error.setValue("Empty input.");
        }else{
            reply.setValue(model.toCamelCase(value));
            error.setValue("");
        }
    }

    void clear() {
        request.set("");
        reply.set("");
        error.set("");
    }
}
