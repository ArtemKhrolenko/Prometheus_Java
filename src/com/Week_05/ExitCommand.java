package com.Week_05;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Goodbye!");

    }
}
