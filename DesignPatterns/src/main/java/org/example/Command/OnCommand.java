package org.example.Command;

public class OnCommand implements Command {

    Television television;

    public OnCommand(Television television) {
        this.television = television;
    }
    @Override
    public void execute() {
        television.on();
    }
}
