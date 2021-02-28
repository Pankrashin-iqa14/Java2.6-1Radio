package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio sony = new Radio();

    @Test
    public void shouldNextRadioStation() {
        int currentStation = 9;
        sony.setCurrentRadioStation(currentStation);
        sony.nextRadioStation();
        assertEquals(0, sony.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation1() {
        int currentStation = 0;
        sony.setCurrentRadioStation(currentStation);
        sony.nextRadioStation();
        assertEquals(1, sony.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation2() {
        int currentStation = 10;
        sony.setCurrentRadioStation(currentStation);
        sony.nextRadioStation();
        assertEquals(1, sony.getCurrentRadioStation());
    }
    @Test
    public void shouldNextRadioStation3() {
        int currentStation = -3;
        sony.setCurrentRadioStation(currentStation);
        sony.nextRadioStation();
        assertEquals(1, sony.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {
        int currentStation = 0;
        sony.setCurrentRadioStation(currentStation);
        sony.prevRadioStation();
        assertEquals(9, sony.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation1() {
        int currentStation = 5;
        sony.setCurrentRadioStation(currentStation);
        sony.prevRadioStation();
        assertEquals(4, sony.getCurrentRadioStation());

    }

    @Test
    public void shouldPrevRadioStation2() {
        int currentStation = 10;
        sony.setCurrentRadioStation(currentStation);
        sony.prevRadioStation();
        assertEquals(9, sony.getCurrentRadioStation());
    }
    @Test
    public void shouldPrevRadioStation3() {
        int currentStation = -1;
        sony.setCurrentRadioStation(currentStation);
        sony.prevRadioStation();
        assertEquals(9, sony.getCurrentRadioStation());
    }

    @Test
    public void shouldEnterNumberRadioStation() {
        int RadioStation = 7;
        int currentRadioStation = 6;
        sony.setCurrentRadioStation(currentRadioStation);
        sony.enterNumberRadioStation(RadioStation);
        assertEquals(7, sony.getCurrentRadioStation());
    }
    @Test
    public void shouldEnterNumberRadioStation1() {
        int RadioStation = 9;
        int currentRadioStation = 0;
        sony.setCurrentRadioStation(currentRadioStation);
        sony.enterNumberRadioStation(RadioStation);
        assertEquals(9, sony.getCurrentRadioStation());
    }
    @Test
    public void shouldEnterNumberRadioStation2() {
        int RadioStation = -5;
        int currentRadioStation = 0;
        sony.setCurrentRadioStation(currentRadioStation);
        sony.enterNumberRadioStation(RadioStation);
        assertEquals(0, sony.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        int currentVolume = 10;
        sony.setCurrentVolume(currentVolume);
        sony.increaseVolume();
        assertEquals(10, sony.getCurrentVolume());
    }
    @Test
    public void shouldIncreaseVolume1() {
        int currentVolume = 0;
        sony.setCurrentVolume(currentVolume);
        sony.increaseVolume();
        assertEquals(1, sony.getCurrentVolume());
    }
    @Test
    public void shouldIncreaseVolume2() {
        int currentVolume = 4;
        sony.setCurrentVolume(currentVolume);
        sony.increaseVolume();
        assertEquals(5, sony.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseVolume() {
        int currentVolume = 11;
        sony.setCurrentVolume(currentVolume);
        sony.decreaseVolume();
        assertEquals(0, sony.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseVolume1() {
        int currentVolume = -2;
        sony.setCurrentVolume(currentVolume);
        sony.decreaseVolume();
        assertEquals(0, sony.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseVolume2() {
        int currentVolume = 5;
        sony.setCurrentVolume(currentVolume);
        sony.decreaseVolume();
        assertEquals(4, sony.getCurrentVolume());
    }
}
