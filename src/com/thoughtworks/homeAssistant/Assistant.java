package com.thoughtworks.homeAssistant;

import java.util.HashMap;

public class Assistant {

    private final HashMap<String, Command> commands;

    public Assistant() {
        commands=new HashMap<>();
    }
    public  void  add(String message,Command command){
        commands.put(message,command);
    }

    public void listen(String instruction){
        Command cmd=commands.get(instruction);
        if(cmd != null) cmd.execute();
    }
}
