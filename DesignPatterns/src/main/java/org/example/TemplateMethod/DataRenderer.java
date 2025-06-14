package org.example.TemplateMethod;

public abstract class DataRenderer {
    public void render(){
        String data = readData();
        String processedData = process(data);
        System.out.println(processedData);
    }
    abstract String readData();
    abstract String process(String data);
}
