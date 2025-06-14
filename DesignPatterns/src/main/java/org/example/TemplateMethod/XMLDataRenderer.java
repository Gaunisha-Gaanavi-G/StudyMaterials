package org.example.TemplateMethod;

public class XMLDataRenderer extends DataRenderer {
    @Override
    String readData() {
        return "XML Data";
    }

    @Override
    String process(String data) {
        return "Processed "+data;
    }
}
