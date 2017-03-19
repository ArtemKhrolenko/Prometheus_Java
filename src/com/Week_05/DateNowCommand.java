package com.Week_05;

public class DateNowCommand implements Command {
    @Override
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
