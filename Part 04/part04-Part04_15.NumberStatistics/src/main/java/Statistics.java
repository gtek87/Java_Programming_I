/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giuseppe
 */

public class Statistics {
    private int count;
    private int sum;
    
    public Statistics(){
        this.count=0;
        this.sum=0;
    }
    public void addNumber(int number){
        this.count = this.count + 1;
        this.sum = this.sum + number;
    }
    public int getCount(){
        return this.count;
    }
    public int sum(){
        return this.sum;
    }
    public double average(){
        if (this.count!=0){
            return this.sum*1.0/this.count;
        } else{
            return 0.0;
        }
        
    }
}
