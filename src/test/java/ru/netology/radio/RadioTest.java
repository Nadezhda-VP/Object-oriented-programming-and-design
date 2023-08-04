package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void radioConstructorTest0() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        assertEquals(9, radio.getCurrentStation());

        radio.next();
        assertEquals(0, radio.getCurrentStation());

        radio.next();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void radioConstructorTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void radioConstructorTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void radioConstructorTest3() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchNextStation1() { //переключение на следующую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.next();
        //int expected = 7;
        //int actual = radio.getCurrentStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStation1() { // переключение на предыдущую
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStation1() {//смена станции
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    /*@Test
    public void shouldNotChangeStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }*/

    @Test
    public void shouldIncreaseVolume() {// увеличение громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void doesNotExceedMaxValue() {//не превышает максимального значения
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolume() {// уменьшение громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void notBelowMin() { // не уменьшает ниже минимума
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

   /* @Test
    public void notBelowMin1() {//не уменьшает минимальное значение
        Radio radio = new Radio();
        //radio.setCurrentVolume(100);
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void doesNotExceedMaxValue1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }*/


}
