package main.terminalhandling;

public class CommandSplitter {
    private String[] splittedCommand;
    private String seperator;

    public CommandSplitter(String command, String seperator) {
        this.seperator = seperator;
        this.splittedCommand = command.split(this.seperator);
    }
    public String[] getSplittedCommand(){
        return this.splittedCommand;
    }
}
