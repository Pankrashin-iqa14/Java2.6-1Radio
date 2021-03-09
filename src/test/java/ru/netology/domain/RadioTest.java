package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldGetmaxRadiostation() {
        Radio radio = new Radio(11, 10, 50);

        assertEquals(11, radio.getMaxRadiostation());
    }


    @Test
    public void shouldGetCurrentRadiostation() {
        Radio radio = new Radio(10, 11, 50);


        assertEquals(11, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldGetMaxVolume1() {
        Radio radio = new Radio(10, 10, 101);

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldGetMaxVolume2() {
        Radio radio = new Radio(10, 10, 99);

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio(10, 10, 50);

        assertEquals(50, radio.getCurrentVolume());
    }


    @Test
    public void shouldNextRadiostation1() {
        Radio radio = new Radio(11, 10, 50);

        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostation());

    }

    @Test
    public void shouldNextRadiostation2() {
        Radio radio = new Radio(10, 10, 50);


        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldNextRadiostation3() {
        Radio radio = new Radio(10, 15, 50);


        radio.nextRadiostation();

        assertEquals(10, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldNextRadiostation4() {
        Radio radio = new Radio(10, -1, 50);


        radio.nextRadiostation();

        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldPrevRadiostation1() {
        Radio radio = new Radio(10, 10, 50);

        radio.prevRadiostation();

        assertEquals(9, radio.getCurrentRadiostation());

    }

    @Test
    public void shouldPrevRadiostation2() {
        Radio radio = new Radio(10, 0, 50);


        radio.prevRadiostation();

        assertEquals(10, radio.getCurrentRadiostation());

    }

    @Test
    public void shouldPrevRadiostation3() {
        Radio radio = new Radio(10, 11, 50);


        radio.prevRadiostation();

        assertEquals(10, radio.getCurrentRadiostation());

    }

    @Test
    public void shouldPrevRadiostation4() {
        Radio radio = new Radio(10, -5, 50);


        radio.prevRadiostation();

        assertEquals(0, radio.getCurrentRadiostation());

    }

    @Test
    public void shouldIncreaseCurrentVolume1() {
        Radio radio = new Radio(10, 10, 50);

        radio.increaseCurrentVolume();

        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolume2() {
        Radio radio = new Radio(10, 10, 101);


        radio.increaseCurrentVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolume3() {
        Radio radio = new Radio(10, 10, -5);


        radio.increaseCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolume4() {
        Radio radio = new Radio(10, 10, 0);


        radio.increaseCurrentVolume();

        assertEquals(1, radio.getCurrentVolume());
    }


    @Test
    public void shouldDecreaseCurrentVolume1() {
        Radio radio = new Radio(20, 10, 50);

        radio.decreaseCurrentVolume();

        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume2() {
        Radio radio = new Radio(20, 10, 100);

        radio.decreaseCurrentVolume();

        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume3() {
        Radio radio = new Radio(10, 10, -10);

        radio.decreaseCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume4() {
        Radio radio = new Radio(10, 10, 101);

        radio.decreaseCurrentVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldEnterNumberRadioStation1() {
        Radio radio = new Radio(10, 10, 50);
        radio.enterNumberRadiostation(7);
        assertEquals(7, radio.getCurrentRadiostation());
    }
    @Test
    public void shouldEnterNumberRadioStation2() {
        Radio radio = new Radio(10, 10, 50);
        radio.enterNumberRadiostation(11);
        assertEquals(10, radio.getCurrentRadiostation());
    }
    @Test
    public void shouldEnterNumberRadioStation3() {
        Radio radio = new Radio(10, 10, 50);
        radio.enterNumberRadiostation(0);
        assertEquals(0, radio.getCurrentRadiostation());
    }
}