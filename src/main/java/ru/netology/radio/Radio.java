package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;

    public Radio() {
        this.maxStation = 10;
        this.maxVolume = 100;
    }

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next()  {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation --;
        } else {
            currentStation = maxStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void finishIncreaseAndReduceVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        if (currentVolume == 0) {
            return;
        }
    }
}



