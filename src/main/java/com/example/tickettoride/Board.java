package com.example.tickettoride;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.io.File;

/**
 * Board class
 * This class will contain logic for displaying and/or updating the board and map of the game
 *
 */
public class Board extends StackPane
{
    //Constants for display width and height
    private static final int BOARD_WIDTH = 1000;
    private static final int BOARD_HEIGHT = 800;

    //Gets and sets the image using try/catch to ensure success without crash
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
            System.out.println("Failed to load image from file");
            System.out.println(e.getMessage());
        }
        return ticketToRideImageView;
    }
}