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
    private String aut;
    private String name;
    private int pag;
    public Book(String author, String name, int pages){
        this.aut = author;
        this.name = name;
        this.pag = pages;
    }
    public String getAuthor(){
        return this.aut;
    }
    public String getName(){
        return this.name;
    }
    public int getPages(){
        return this.pag;
    }
    public String toString(){
        return aut + ", " + name + ", " + pag + " pages";
    }
}
