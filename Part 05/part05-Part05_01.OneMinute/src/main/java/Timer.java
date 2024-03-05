/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giuseppe
 */
public class Timer {
    private ClockHand sec;
    private ClockHand cent;
    
    public Timer(){
        this.sec = new ClockHand(60);
        this.cent= new ClockHand(100);
    }
    public void advance(){
        this.cent.advance();
        if(this.cent.value() ==0){
            this.sec.advance();
        }
    }
    public String toString(){
        return sec +":"+cent ;
    }
}
