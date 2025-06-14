package org.example.TemplateMethod.Assignment;

public abstract class ComputerManufacturer {
    public void buildComputer(){
        String computer = addHardDisk();
        computer += addRAM();
        computer +=addKeyboard();
        System.out.println(computer);

    }
    abstract String addHardDisk();
    abstract String addRAM();
    abstract String addKeyboard();
}
