package command;

import java.util.Stack;

public class RemoteControl {
    private final Stack<Command> commandHistory = new Stack<>();


    void pressButton(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    void pressUndo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }

}