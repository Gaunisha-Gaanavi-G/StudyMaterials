package org.example.TemplateMethod;

public class CSVDataRenderer extends DataRenderer {
    @Override
    String readData() {
        return "CSV Data";
    }

    @Override
    String process(String data) {
        return "Processed: " + data;
    }
}
