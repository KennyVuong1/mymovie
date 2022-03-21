/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sample;



import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafxapplication5.Movie;


public class Controller implements Initializable {
ObservableList list = FXCollections.observableArrayList();
    
    @FXML
    private ListView<String> listOfNames;
    @FXML
    private TextField screen;
    @FXML
    private TextField screen1;
    @FXML
    private TextField screen2;
    @FXML
    private TextField screen3;
    @FXML
    private TextField screen4;
    @FXML
    private TextField screen5;
    @FXML
    private TextField screen6;
    
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    @FXML
    private Text like;
    @FXML
    private Text dislike;
    
    @FXML
    private Text date;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadData();
       
    }
    
    private void loadData(){
        list.removeAll(list);
        Movie m1 = new Movie("Sicario", "M", "Cartels & Politics", "11/12/2016", "180 minutes", "Dennis V", "Emily Blunt",150,2,"date");
        movies.add(m1);
        listOfNames.getItems().add(m1.getName());
        Movie m2 = new Movie("Spirited Away", "PG", "Saving parents", "02/02/1999", "111 minutes", "Kynan Vuong", "2 piggy",144,3,"date");
        movies.add(m2);
        listOfNames.getItems().add(m2.getName());
        Movie m3 = new Movie("Up", "G", "The opening scene", "14/04/2013", "90 minutes", "Pixar", "Colourful Bird",111,3,"date");
        movies.add(m3);
        listOfNames.getItems().add(m3.getName());
        Movie m4 = new Movie("Saw", "R18+", "Do you to play a little game", "28/09/1995", "120 minutes", "BlackCat", "Flawed People",123,33,"date");
        movies.add(m4);
        listOfNames.getItems().add(m4.getName());
        
        
        
    }
    

    @FXML
    private TextField name;
    
    // FIX
    @FXML
    void addName(MouseEvent event) {
        listOfNames.getItems().add(name.getText());
       
        screen.setText(name.getText());        
        screen1.setText("");
        screen2.setText("");
        screen3.setText("");
        screen4.setText("");
        screen5.setText("");
        screen6.setText("");
        Movie m = new Movie(name.getText(), "", "", "", "","", "", 0, 0, "");
        movies.add(m);
        
        name.setText("");
        like.setText(Double.toString(0));
        dislike.setText(Double.toString(0));
        date.setText("");
          
    }
    
    // FIX
    @FXML
    void removeName(MouseEvent event) {
        int selectedID = listOfNames.getSelectionModel().getSelectedIndex();
        listOfNames.getItems().remove(selectedID);
    }
    
    // DO NOT TOUCH THIS
    @FXML
    private void displaySelected(MouseEvent event) {
        String movie = listOfNames.getSelectionModel().getSelectedItem();
        if(movie==null||movie.isEmpty()){
        screen.setText("Nothing Selected");
                }
        else{
        screen.setText(movie);
        }
        for (Movie m : movies) {
            if (m.getName().equals(movie)) {
                screen1.setText(m.getRating());
                screen2.setText(m.getSynopsis());
                screen3.setText(m.getDate());
                screen4.setText(m.getRunTime());
                screen5.setText(m.getDirector());
                screen6.setText(m.getCast());
                like.setText(Double.toString(m.getLike()));
                dislike.setText(Double.toString(m.getDislike()));
                date.setText(m.getDatetime());
            }
            
        }          
    } 

    @FXML
    private void addDetails(MouseEvent event) {
        //ArrayList<String> listDetails = new ArrayList<String>();
        String movie = listOfNames.getSelectionModel().getSelectedItem();
        if(movie==null||movie.isEmpty()){
        screen.setText("Nothing Selected");
                }
        else{
        screen.setText(movie);
        }
        for (Movie m : movies) {
            if (m.getName().equals(movie)) {
                double parse1 = Double.valueOf(like.getText());
                double parse2 = Double.valueOf(dislike.getText());
                m.setRating(screen1.getText());
                m.setSynopsis(screen2.getText());
                m.setDate(screen3.getText());
                m.setRunTime(screen4.getText());
                m.setDirector(screen5.getText());
                m.setCast(screen6.getText());
                m.setLike(parse1);
                m.setDislike(parse2);
                m.setDatetime(date.getText());
               
                /*listDetails.add(screen.getText());
                listDetails.add(screen1.getText());
                listDetails.add(screen2.getText());
                listDetails.add(screen3.getText());
                listDetails.add(screen4.getText());
                listDetails.add(screen5.getText());
                listDetails.add(screen6.getText());
                listDetails.add(like.getText());
                listDetails.add(dislike.getText());
                listDetails.add(date.getText());
                double parse1 = Double.valueOf(listDetails.get(7));
                double parse2 = Double.valueOf(listDetails.get(8));*/
            }
            
        }
        
        /*
        listDetails.add(screen.getText());
        listDetails.add(screen1.getText());
        listDetails.add(screen2.getText());
        listDetails.add(screen3.getText());
        listDetails.add(screen4.getText());
        listDetails.add(screen5.getText());
        listDetails.add(screen6.getText());
        listDetails.add(like.getText());
        listDetails.add(dislike.getText());
        listDetails.add(date.getText());
        
        
        double parse1 = Double.valueOf(listDetails.get(7));
        double parse2 = Double.valueOf(listDetails.get(8));
        */
        
       
        //listOfNames.getItems().remove(listDetails.get(0));
        //Movie m5 = new Movie(listDetails.get(0), listDetails.get(1), listDetails.get(2), listDetails.get(3), listDetails.get(4), listDetails.get(5), listDetails.get(6),parse1,parse2,listDetails.get(9));
        //movies.add(m5);
        //listOfNames.getItems().add(m5.getName());
        
    }

    @FXML
    private void onLike(MouseEvent event) {
        
        double likecount = Double.parseDouble(like.getText());
        likecount = likecount + 1;
        like.setText(Double.toString(likecount));
        LocalDateTime myDate = LocalDateTime.now();
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDate.format(myformat);
        date.setText(formattedDate);
        
        String movie = listOfNames.getSelectionModel().getSelectedItem();
        for (Movie m : movies) {
            if (m.getName().equals(movie)) {
                m.setLike(likecount);
                m.setDatetime(formattedDate);
            }
        }
        
        
    }

    @FXML
    private void onDislike(MouseEvent event) {
        double dislikecount = Double.parseDouble(dislike.getText());
        dislikecount = dislikecount + 1;
        dislike.setText(Double.toString(dislikecount));
        LocalDateTime myDate = LocalDateTime.now();
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDate.format(myformat);
        date.setText(formattedDate);
        
        String movie = listOfNames.getSelectionModel().getSelectedItem();
        for (Movie m : movies) {
            if (m.getName().equals(movie)) {
                m.setDislike(dislikecount);
                m.setDatetime(formattedDate);
            }
        }
    }
}