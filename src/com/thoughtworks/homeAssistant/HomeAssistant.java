package com.thoughtworks.homeAssistant;

public class HomeAssistant {

    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        TurnOn turnOnCommand = new TurnOn(new SquareLight());
        assistant.add("turn on", turnOnCommand);
        assistant.listen("turn on");
    }
}
