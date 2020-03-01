package exchangablecontent.model;

public interface TextConverter {

    public String toUpperCase(String text);

    String toLowerCase(String text);

    String toCamelCase(String value);
}
