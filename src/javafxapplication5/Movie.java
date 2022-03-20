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
    double like;
    double dislike;
    
    public Movie(String name, String rating, String synopsis, String date, String runTime, String director, String cast, double like, double dislike) {
        this.name = name;
        this.rating = rating;
        this.synopsis = synopsis;
        this.date = date;
        this.runTime = runTime;
        this.director = director;
        this.cast = cast;
        this.like = like;
        this.dislike = dislike;
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
    public void setLike(double like) {
        this.like = like;
    }
    
    public double getLike(){
        return this.like;
    }
    
    public  void setDislike(double dislike) {
        this.dislike = dislike;
    }
    
    public double getDislike(){
        return this.dislike;
    }
    
}
