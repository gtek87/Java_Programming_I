/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giuseppe
 */
public class Book {
    private String name;
    private int pages;
    private int year;
    
    public Book(String title, int pag, int pubblic){
        this.name = title;
        this.pages = pag;
        this.year= pubblic;
    }
    
    public String getTitle(){
        return this.name;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
    
}
