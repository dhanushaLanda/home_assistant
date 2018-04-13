package com.thoughtworks.homeAssistant;


public class TurnOff implements Command{

    private SquareLight light;

    public TurnOff(SquareLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
