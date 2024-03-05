/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giuseppe
 */
public class Match {
    
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    
    public Match(String t1, String t2, int pun1, int pun2){
        this.team1 = t1;
        this.team2 = t2;
        this.score1 = pun1;
        this.score2 = pun2;
    }
    public String teamOne (){
        return this.team1;
    }
    public String teamTwo (){
        return this.team2;
    }
    public int pointsOne (){
        return this.score1;
    }
    public int pointsTwo (){
        return this.score2;
    }
    
    public String winner (){
        if(this.score1>this.score2){
            return this.team1;
        } else{
            return this.team2;
        }
    }
    
    public int wins(array<>())
}
