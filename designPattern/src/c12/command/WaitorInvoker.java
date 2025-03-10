package c12.command;

import java.util.ArrayList;

public class WaitorInvoker {
    private ArrayList<command> commands;
    public WaitorInvoker() {
        commands = new ArrayList<>();
    }

    public void addCommand(command command) {
        commands.add(command);
    }

    public void notifyCommand() {
        System.out.println("通知");
        for (command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
