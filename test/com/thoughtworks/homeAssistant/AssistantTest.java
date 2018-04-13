package com.thoughtworks.homeAssistant;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AssistantTest {
    @Test
    public void shouldTurnOnLightWhenCommandIsTurnOn() {
        Assistant assistant = new Assistant();
        TurnOn mockedTurnOn = mock(TurnOn.class);
        assistant.add("turn on", mockedTurnOn);
        assistant.listen("turn on");
        verify(mockedTurnOn).execute();
    }

    @Test
    public void shouldTurnOffLightWhenCommandIsTurnOn() {
        Assistant assistant = new Assistant();
        TurnOff mockedTurnOff = mock(TurnOff.class);
        assistant.add("turn off", mockedTurnOff);
        assistant.listen("turn off");
        verify(mockedTurnOff).execute();
    }
}