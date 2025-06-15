package org.example.Command;

public class RemoteControl {
    void pressButton(Command command) {
        command.execute();
    }
}
