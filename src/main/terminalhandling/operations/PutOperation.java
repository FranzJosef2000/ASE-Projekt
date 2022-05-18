package main.terminalhandling.operations;


public class PutOperation {
    public PutOperation(String[] command) {
        if(command[1].equalsIgnoreCase("PACKAGE")){
            if (command[2].length() == 8){
                String packageNumber = command[2];
                System.out.println("Interface");
            }
            else{
                System.out.println("Fehlerhafte Eingabe");
            }
        }
        else{
            System.out.println("Fehlerhafte eingabe!");
        }
    }
}
