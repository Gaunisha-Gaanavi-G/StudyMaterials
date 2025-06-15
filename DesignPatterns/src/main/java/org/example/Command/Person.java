package org.example.Command;

public class Person {
    public static void main(String[] args) {
        Television tv = new Television();
        RemoteControl rc = new RemoteControl();
        Command command = new OnCommand(tv);
        rc.pressButton(command);

        Command command2 = new OffCommand(tv);
        rc.pressButton(command2);
    }

}
