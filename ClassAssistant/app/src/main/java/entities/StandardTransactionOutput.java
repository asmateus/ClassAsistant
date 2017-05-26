package entities;

import java.util.HashMap;

/**
 * Created by asmateus on 26/05/17.
 */

public class StandardTransactionOutput {
    private final HashMap<String, String> content = new HashMap<>();


    public void addContent(String key, String value) {
        this.content.put(key, value);
    }

    public HashMap<String, String> getContent() {
        return this.content;
    }

    public static StandardTransactionOutput nullTransactionOutput() {
        StandardTransactionOutput out = new StandardTransactionOutput();
        out.addContent("null", "null");

        return out;
    }
}