package com.example.tickettoride;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.File;

/**
 * Board class
 * This class will contain logic for displaying and/or updating the board and map of the game
 *
 */
public class Board extends StackPane
{
    // Board display logic

    //Constants for display width and height
    private static final int BOARD_WIDTH = 1000;
    private static final int BOARD_HEIGHT = 800;

    public ImageView getTicketToRideImage()
    {
        ImageView ticketToRideImageView = new ImageView();
        try
        {
            // Load the image from a file
            File imageFile = new File("src/main/resources/com/example/tickettoride/Game_Map_v2.png");
            String imageUrl = imageFile.toURI().toURL().toString();
            Image ticketToRideImage = new Image(imageUrl, BOARD_WIDTH, BOARD_HEIGHT, true, false);

            // Set the image in the ImageView
            ticketToRideImageView.setImage(ticketToRideImage);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ticketToRideImageView;
    }

    //Testing Board highlighting
    public static Pane HighlightRectanglesOnImage(StackPane imageContainer)
    {
        StackPane stackPane = null;
        try
        {
            // Load the image from a file
            File imageFile = new File("src/main/resources/com/example/tickettoride/Game_Map_v2.PNG");
            String imageUrl = imageFile.toURI().toURL().toString();
            Image ticketToRideImage = new Image(imageUrl, 1200, 1000,
                    true, false);

            //Load the image
            //Image image = new Image("src/main/resources/com/example/tickettoride/Game_Map_v2.png");
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
            stackPane = new StackPane(imageView, overlayPane);


        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Could not load image");
        }
        return stackPane;
    }
    //Testing Board highlighting
}
