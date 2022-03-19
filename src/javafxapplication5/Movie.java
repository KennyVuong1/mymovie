/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication5;

/**
 *
 * @author Kynan
 */
public class Movie {
    String name;
    String rating;
    String synopsis;
    String date;
    String runTime;
    String director;
    String cast;
    
    public Movie(String name, String rating, String synopsis, String date, String runTime, String director, String cast) {
        this.name = name;
        this.rating = rating;
        this.synopsis = synopsis;
        this.date = date;
        this.runTime = runTime;
        this.director = director;
        this.cast = cast;
    }

    public Movie(String name, String pg, String string, String string0, String whoever, String emblunt) {
   
    }
    
    //write the other setters
    public void setName(String name) {
        this.name = name;
    }
    
    // write the getters
    public String getName() {
        return this.name;
    }
    
    public String setRating(String rating) {
        return this.rating;
    }
    
    public String getRating(){
        return this.rating;
    }
    
    public String setSynopsis(String Synopsis) {
        return this.rating;
    }
    
    public String getSynopsis(){
        return this.synopsis;
    }
    
    public String setDate(String date) {
        return this.date;
    }
    
    public String getDate(){
        return this.date;
    }
    
    public String setRunTime(String runTime) {
        return this.runTime;
    }
    
    public String getRunTime(){
        return this.runTime;
    }
    public String setDirector(String director) {
        return this.director;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public String setCast(String cast) {
        return this.cast;
    }
    
    public String getCast(){
        return this.cast;
    }
    
}
