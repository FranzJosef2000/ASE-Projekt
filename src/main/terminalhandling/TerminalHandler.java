package main.terminalhandling;

import main.interfaces.PacketEventsImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerminalHandler {

    private static final String SEPERATOR = " ";
    private Thread thread;

    public void terminalHandler(PacketEventsImpl packetEventsImpl) {
        thread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    String line = bufferedReader.readLine();

                    CommandSplitter commandSplitter = new CommandSplitter(line, SEPERATOR);
                    String[] command = commandSplitter.getSplittedCommand();
                    new CommandParser().execute(command,packetEventsImpl);

                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
