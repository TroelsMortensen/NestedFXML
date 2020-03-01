package exchangablecontent.model;

public class TextConverterModel implements TextConverter {

    @Override
    public String toUpperCase(String text) {
        return text.toUpperCase();
    }

    @Override
    public String toLowerCase(String text) {
        return text.toLowerCase();
    }

    @Override
    public String toCamelCase(String s){
        String[] parts = s.split(" ");
        String camelCaseString = "";
        for (String part : parts){
            camelCaseString = camelCaseString + toProperCase(part);
        }
        return camelCaseString;
    }

    private static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
