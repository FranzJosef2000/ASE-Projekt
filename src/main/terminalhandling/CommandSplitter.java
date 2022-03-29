package main.terminalhandling;

public class CommandSplitter {
    private String[] splittedCommand;
    private String seperator;

    public CommandSplitter(String command, String seperator) {
        this.splittedCommand = command.split(seperator);
        this.seperator = seperator;
    }
}
