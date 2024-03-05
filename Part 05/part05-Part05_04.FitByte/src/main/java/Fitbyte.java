/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giuseppe
 */
public class Fitbyte {
    private int age, rest;
     
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.rest = restingHeartRate;           
    }
    public double targetHeartRate(double percentageOfMaximum){
        double max = 206.3 - (0.711 * age);
        double perc = percentageOfMaximum;
        return (max - rest)*(perc)+ rest;
    }
}
