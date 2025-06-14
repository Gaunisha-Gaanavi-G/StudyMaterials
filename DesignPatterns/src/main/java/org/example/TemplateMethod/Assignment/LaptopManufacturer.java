package org.example.TemplateMethod.Assignment;

public class LaptopManufacturer extends ComputerManufacturer{
    @Override
    String addHardDisk() {
        return "Laptop Hard Disk added ";
    }

    @Override
    String addRAM() {
        return "Laptop Ram added ";
    }

    @Override
    String addKeyboard() {
        return "Laptop KeyBoard added";
    }
}
