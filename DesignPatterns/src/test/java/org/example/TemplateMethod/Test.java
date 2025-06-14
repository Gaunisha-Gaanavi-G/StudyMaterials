package org.example.TemplateMethod;

import org.example.TemplateMethod.Assignment.ComputerManufacturer;
import org.example.TemplateMethod.Assignment.DesktopManufacturer;

public class Test {
    public static void main(String[] args) {
        DataRenderer renderer = new CSVDataRenderer();
        renderer.render();
        ComputerManufacturer computerManufacturer = new DesktopManufacturer();
        computerManufacturer.buildComputer();
    }
}
