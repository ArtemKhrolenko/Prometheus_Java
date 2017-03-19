package com.Week_05;

public class Invoker {
    private String[] args;

    public Invoker(String[] args) {
        this.args = args;
    }

    public void execute(){
        Command command;
        if (args != null && args.length > 0 && args.length < 3){
            if (args[0].equals("help") && args.length == 1){
                command = new HelpCommand();
            }

            else
            if (args[0].equals("echo") && args.length == 2){
                command = new EchoCommand(args[1]);
            }

            else
            if (args[0].equals("date") && args[1].equals("now")){
                command = new DateNowCommand();
            }

            else
            if (args[0].equals("exit") && args.length == 1){
                command = new ExitCommand();
            }

            else{
                System.out.println("Error");
                return;
            }
        }
        else{
            System.out.println("Error");
            return;
        }
        command.execute();
    }

}
