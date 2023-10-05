package com.example.tickettoride;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * TicketToRide class
 * This class will contain logic for displaying the game window and each of the game's components.
 */
public class TicketToRide extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(TicketToRide.class.getResource("hello-view.fxml"));
        //Scene set to width of a 720p screen
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        //Title of Game
        stage.setTitle("Ticket to Ride");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}