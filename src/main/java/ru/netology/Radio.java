package ru.netology;

public class Radio {

    private int currentVolume = 5;
    int maxVolume = 10;
    int minVolume = 0;
    private int currentRadioStation = 5;
    int maxRadioStation = 9;
    int minRadioStation = 0;

    public void setcurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getcurrentVolume() {
        return currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


    public void setcurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getcurrentRadioStation() {
        return currentRadioStation;
    }

    public int getmaxRadioStation() {
        return maxRadioStation;
    }

    public int getminRadioStation() {
        return minRadioStation;
    }

    public void setchangeTheStationByNext() {
        if (currentRadioStation < maxRadioStation) {
            this.currentRadioStation = currentRadioStation += 1;

        } else {
            this.currentRadioStation = minRadioStation;

        }
    }

    public void setchangeTheStationByPrey() {
        if (currentRadioStation > minRadioStation) {
            this.currentRadioStation = currentRadioStation -= 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }
}
