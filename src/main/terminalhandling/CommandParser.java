package main.terminalhandling;

import main.interfaces.EmployeeEventsImpl;
import main.interfaces.PacketEventsImpl;
import main.terminalhandling.operations.CreateOperation;
import main.terminalhandling.operations.GetOperation;
import main.terminalhandling.operations.HelpOperation;
import main.terminalhandling.operations.PutOperation;

public class CommandParser {
    public CommandParser() {}

    public void execute(String[] command, PacketEventsImpl packetEventsImpl, EmployeeEventsImpl employeeEventsImpl){
        int POSITION = 0;
        //command[POSITION].equalsIgnoreCase("CREATE") && command.length==3
        if (checkOperator(command,POSITION,"CREATE",3)){
            new CreateOperation(command, packetEventsImpl);

        }
        else if (checkOperator(command,POSITION,"PUT",3)){
            new PutOperation(command, packetEventsImpl, employeeEventsImpl);
        }
        else if (checkOperator(command,POSITION,"GET",3)){
            new GetOperation(command, packetEventsImpl);
        }
        else if (command[POSITION].equalsIgnoreCase("HELP")){
            new HelpOperation(command, packetEventsImpl);
        }
        else{
            System.out.println("Fehlerhafte eingabe!");
            new HelpOperation(command, packetEventsImpl);
        }
    }
    private boolean checkOperator(String[] commands,int commandPosition, String commandCheck, int length){
        return commands[commandPosition].equalsIgnoreCase(commandCheck) && commands.length==length;
    }
}
