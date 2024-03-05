/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giuseppe
 */
public class Counter {
    private int value;
    public Counter(int startValue){   
        this.value = startValue;
    }
    public Counter() {
        this.value =0;
    }
    public int value(){
        return this.value;
    }
    public void increase(){
        this.value += 1;
    }
    public void decrease(){
        this.value -=1;
    }
    public void increase(int increaseBy){
        for (int i =0;i<increaseBy; i++){
            increase();
        }
    }
    public void decrease(int decreaseBy){
        for (int i =0;i<decreaseBy; i++){
            decrease();
        }
    }
}
