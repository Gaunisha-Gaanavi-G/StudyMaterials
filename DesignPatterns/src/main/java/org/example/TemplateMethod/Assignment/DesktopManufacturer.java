package org.example.TemplateMethod.Assignment;

public class DesktopManufacturer extends ComputerManufacturer {
    @Override
    String addHardDisk() {
        return "Desktop Hard Disk added ";
    }

    @Override
    String addRAM() {
        return "Desktop Ram added ";
    }

    @Override
    String addKeyboard() {
        return "Desktop KeyBoard added";
    }
}
