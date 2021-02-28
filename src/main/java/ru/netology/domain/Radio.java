package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private boolean on;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        int currentRadioStation = this.getCurrentRadioStation();
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    public void prevRadioStation() {
        int currentRadioStation = this.currentRadioStation;
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }

    public void enterNumberRadioStation(int RadioStation) {

        if (RadioStation > maxRadioStation) {
            return;
        }
        if (RadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = RadioStation;

    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void decreaseVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }
}

