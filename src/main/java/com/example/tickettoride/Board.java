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
public class Board extends StackPane {
    // Board display logic
    public ImageView getTicketToRideImage() {
        ImageView ticketToRideImageView = new ImageView();
        try {
            // Load the image from a file
            File imageFile = new File("/Users/jlemois/IdeaProjects/TicketToRideProject/src/main/resources/com/example/tickettoride/IMG_0394.PNG");
            String imageUrl = imageFile.toURI().toURL().toString();
            Image ticketToRideImage = new Image(imageUrl,450,600,false,false);

            // Set the image in the ImageView
            ticketToRideImageView.setImage(ticketToRideImage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ticketToRideImageView;
    }
}
