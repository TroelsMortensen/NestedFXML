package exchangablecontent.view.uppercase;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import exchangablecontent.model.TextConverter;

public class UppercaseViewModel {
    private StringProperty request;
    private StringProperty reply;
    private StringProperty error;

    private TextConverter model;

    public UppercaseViewModel(TextConverter model) {
        this.model = model;
        request = new SimpleStringProperty();
        reply = new SimpleStringProperty();
        error = new SimpleStringProperty();
    }


    void convertToUpperCase() {
        String value = request.getValue();
        if (request == null || value.equals("")) {
            error.setValue("Empty input!");
        } else {
            String result = model.toUpperCase(value);
            reply.setValue(result);
            error.setValue("");
        }
    }

    void clear() {
        request.set("");
        reply.set("");
        error.set("");
    }

    StringProperty requestProperty() {
        return request;
    }

    StringProperty replyProperty() {
        return reply;
    }

    StringProperty errorProperty() {
        return error;
    }
}
