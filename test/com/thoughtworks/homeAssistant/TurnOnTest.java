package com.thoughtworks.homeAssistant;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TurnOnTest {
    @Test
    public void lightTurnOnMethodShouldGetCalled() {
        SquareLight mockedLight = mock(SquareLight.class);
        TurnOn turnOn = new TurnOn(mockedLight);
        turnOn.execute();
        verify(mockedLight).turnOn();
    }
}