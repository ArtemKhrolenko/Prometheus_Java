package com.Week_05;

public class EchoCommand implements Command {
    private String string;

    public EchoCommand(String string) {
        this.string = string;
    }

    @Override
    public void execute() {
        System.out.println(string);

    }
}
