package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewRadioTest {
    @Test
    public void test() {
        Radio radio = new Radio(8);

        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
