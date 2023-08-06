package ru.netology.radio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
public class Radio {

    private int maxStation  ;
    private int currentStation ;
    private int maxVolume  ;
    private int currentVolume ;

    public  Radio() {
        maxStation = 9;
        maxVolume = 100;
    }


    public Radio(int stationsCount) {
        this.currentStation = stationsCount;
        maxStation = stationsCount - 1;

    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    /*public int getCurrentStation() {
        return currentStation;
    }*/

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    /*public int getCurrentVolume() {
        return currentVolume;
    }*/

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }



}




