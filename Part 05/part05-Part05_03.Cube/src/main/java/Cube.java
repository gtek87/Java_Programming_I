/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giuseppe
 */
public class Cube {
    
    private int value;
    private int val;
    
    
    public Cube (int edgeLength){
        this.value = edgeLength;
        this.val = this.value;
        
    }
    
    public int volume(){
         
        return this.value * this.value * this.value;
    }
    public String toString(){
        return "The length of the edge is "+ val +" and the volume "+ volume();
    }
    
}
