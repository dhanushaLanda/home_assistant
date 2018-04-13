package com.thoughtworks.homeAssistant;

public class TurnOn  implements  Command{

    private final SquareLight light;

    public TurnOn(SquareLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
