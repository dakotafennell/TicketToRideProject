package com.example.tickettoride;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * TicketToRide class
 * This class will contain logic for displaying the game window and each of the game's components.
 */
public class TicketToRide extends Application
{

    //Border and Stack panes setup with similar naming conventions ~JCL
    BorderPane borderPane;
    StackPane stackPane;

    Canvas canvas;

    @Override
    public void start(Stage stage) throws IOException
    {
        BorderPane borderPane = new BorderPane();

        Board board = new Board();
        ImageView ticketToRideImage = board.getTicketToRideImage();

        // Wrap the ImageView in a StackPane to apply padding
        StackPane imageContainer = new StackPane();
        imageContainer.getChildren().add(ticketToRideImage);
        // Add the padded image container to the center of the BorderPane
        borderPane.setCenter(imageContainer);


        //setup of borderPane displays titles
        borderPane.setTop(new LabelPane("By: Austin, Joseph, and Louis!"));
        borderPane.setRight(new LabelPane("Draw & Discard area!"));
        borderPane.setBottom(new LabelPane("Displays current players hand!"));
        borderPane.setLeft(new LabelPane("Displays players in turn order with points!"));


        FXMLLoader fxmlLoader = new FXMLLoader(TicketToRide.class.getResource("hello-view.fxml"));
        //Scene set to width of a 720p screen
        //Scene scene = new Scene(fxmlLoader.load(), 1280, 720);

        //set scene to borderpane with 720p screen size
        Scene scene = new Scene(borderPane, 1000, 800);

        //Title of Game
        stage.setTitle("Ticket to Ride");
        stage.setScene(scene);
        stage.show();
    }

    //sets up border and allows text to be displayed
    class LabelPane extends StackPane {
        public LabelPane(String title) {
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: blue");
            setPadding(new Insets(20, 30,50,30));
        }
    }

    public static void main(String[] args)
    {
        launch();
    }
}
