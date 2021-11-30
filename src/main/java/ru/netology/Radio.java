package ru.netology;

public class Radio {
    private int idStation = 10; //количество радиостанций
    private int radioStation;
    private int volume;
    private int maxStation = idStation-1;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int idStation) {
        this.idStation = idStation;
        this.maxStation = idStation-1;
    }


    public Radio() {
    }

    public void stationNext() {
        if (radioStation == maxStation) {
            radioStation = minStation;
        } else {
            radioStation = radioStation + 1;
        }
        return;
    }

    public void stationPrev() {
        if (radioStation == minStation) {
            radioStation = maxStation;
        } else {
            radioStation = radioStation - 1;
        }
        return;
    }

    public void setChoiceStation(int radioStation) {
        if (radioStation > maxStation) {
            return;
        }
        if (radioStation < minStation) {
            return;
        }
        this.radioStation = radioStation;
    }


    public int getRadioStation() {
        return radioStation;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            return;
        }
        if (volume < minVolume) {
            return;
        }
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public void volumePlus() {
        if (volume == maxVolume) {
            volume = maxVolume;
        } else {
            volume = volume + 1;
        }
        return;
    }

    public void volumeMinus() {
        if (volume == minVolume) {
            volume = minVolume;
        } else {
            volume = volume - 1;
        }
        return;
    }


}
