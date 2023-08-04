package ru.netology.radio;



public class Radio {
    private int minStation;
    private int maxStation;
    private int currentStation;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;

    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
        this.maxVolume = 100;
        this.minVolume = 0;
    }

    public Radio(int stationsCount) {
        this.currentStation = stationsCount;
        this.maxStation = stationsCount - 1;
    }

    public void next() {
        if (this.currentStation != this.maxStation) {
            ++this.currentStation;
        } else {
            this.currentStation = this.minStation;
        }
    }

    public void prev() {
        if (this.currentStation != this.minStation) {
            --this.currentStation;
        } else {
            this.currentStation = this.maxStation;
        }

    }

    public void increaseVolume() {
        if (this.currentVolume < this.maxVolume) {
            ++this.currentVolume;
        }

    }

    public void reduceVolume() {
        if (this.currentVolume > this.minVolume) {
            --this.currentVolume;
        }

    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= this.minStation) {
            if (currentStation <= this.maxStation) {
                this.currentStation = currentStation;
            }
        }
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= this.minVolume) {
            if (currentVolume <= this.maxVolume) {
                this.currentVolume = currentVolume;
            }
        }
    }

    public Radio(int minStation, int maxStation, int currentStation, int minVolume, int maxVolume, int currentVolume) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = currentStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public int getMinStation() {
        return this.minStation;
    }

    public int getMaxStation() {
        return this.maxStation;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getMinStation() != other.getMinStation()) {
                return false;
            } else if (this.getMaxStation() != other.getMaxStation()) {
                return false;
            } else if (this.getCurrentStation() != other.getCurrentStation()) {
                return false;
            } else if (this.getMinVolume() != other.getMinVolume()) {
                return false;
            } else if (this.getMaxVolume() != other.getMaxVolume()) {
                return false;
            } else {
                return this.getCurrentVolume() == other.getCurrentVolume();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        result = result * 59 + this.getMinStation();
        result = result * 59 + this.getMaxStation();
        result = result * 59 + this.getCurrentStation();
        result = result * 59 + this.getMinVolume();
        result = result * 59 + this.getMaxVolume();
        result = result * 59 + this.getCurrentVolume();
        return result;
    }

    public String toString() {
        int var10000 = this.getMinStation();
        return "Radio(minStation=" + var10000 + ", maxStation=" + this.getMaxStation() + ", currentStation=" + this.getCurrentStation() + ", minVolume=" + this.getMinVolume() + ", maxVolume=" + this.getMaxVolume() + ", currentVolume=" + this.getCurrentVolume() + ")";
    }
}
