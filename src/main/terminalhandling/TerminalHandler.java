package main.terminalhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerminalHandler {

    private Thread thread;

    public void terminalHandler() {
        thread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    String line = bufferedReader.readLine();
                    System.out.println(line);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
