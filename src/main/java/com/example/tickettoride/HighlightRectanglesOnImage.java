package com.example.tickettoride;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

import java.io.File;

public class HighlightRectanglesOnImage extends Application
{
    //Route rectangles
    //Lincoln Center to Midtown West
    Rectangle LCtoMW = new Rectangle();
    //Lincoln Center to Times Square Green route
    Rectangle LCtoTS0 = new Rectangle();
    //Lincoln Center to Times Square Blue route
    Rectangle LCtoTS1 = new Rectangle();
    //Lincoln Center to Central Park Orange route
    Rectangle LCtoCP = new Rectangle();
    //Midtown West to Times Square
    Rectangle MWtoTS = new Rectangle();
    //Midtown West to Chelsea
    Rectangle MWtoC = new Rectangle();
    //Midtown West to Empire State Building
    Rectangle MWtoESB = new Rectangle();
    //Times Square to Empire State Building
    Rectangle TStoESB = new Rectangle();
    //Times Square to United Nations
    Rectangle TStoUN = new Rectangle();
    //United Nations to Empire State Building
    Rectangle UNtoESB = new Rectangle();
    //United Nations to Gramercy Park
    Rectangle UNtoGP = new Rectangle();

    @Override
    public void start(Stage primaryStage)
    {
        try
        {
            // Load the image from a file
            File imageFile = new File("src/main/resources/com/example/tickettoride/Game_Map_v2.PNG");
            String imageUrl = imageFile.toURI().toURL().toString();
            Image ticketToRideImage = new Image(imageUrl, 1200, 1000,
                    true, false);

            //Load the image
            //Image image = new Image("src/main/resources/com/example/tickettoride/GameMap.PNG");
            ImageView imageView = new ImageView(ticketToRideImage);

            // Create an overlay pane
            Pane overlayPane = new Pane();

            // Add rectangles to the overlay
            Rectangle LCtoTS = new Rectangle(50, 50, 125, 22);

            //Sets the rectangle fill to yellow
            //LCtoTS.setFill(Color.YELLOW);
            LCtoTS.setFill(null);

            //Sets the rectangles opacity to 0.5
            //LCtoTS.setOpacity(0.4);
            //Sets the rectangle stroke to yellow
            LCtoTS.setStroke(Color.YELLOW);
            LCtoTS.rotateProperty().set(63);
            LCtoTS.setTranslateX(100);
            LCtoTS.setTranslateY(80);
            LCtoTS.setStrokeWidth(4);

            Rectangle LCtoCP = new Rectangle(200, 80, 125, 22);
            LCtoCP.setFill(null);
            LCtoCP.setStroke(Color.YELLOW);
            LCtoCP.setTranslateY(-43);
            LCtoCP.rotateProperty().set(1);
            LCtoCP.setTranslateX(5);
            LCtoCP.setStrokeWidth(4);

            //if else for displaying the rectangles based on the cards the player has

            //Add the rectangles to the overlay pane
            overlayPane.getChildren().addAll(LCtoTS, LCtoCP);

            // Stack the image view and overlay pane
            StackPane stackPane = new StackPane(imageView, overlayPane);

            // Create a scene
            Scene scene = new Scene(stackPane);

            //Disable resizing of the window
            primaryStage.setResizable(false);

            // Set the scene and show the stage
            primaryStage.setScene(scene);
            primaryStage.setTitle("Ticket To Ride: New York");
            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Could not load image");
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
