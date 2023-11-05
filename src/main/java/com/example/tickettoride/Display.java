package com.example.tickettoride;

import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.layout.BackgroundImage;

import java.io.File;

public class Display
{
    //This class will contain logic for displaying the game window and each of the game's components.

    //Public method that sets the application icon
    public static void ChangeIcon(Stage primaryStage)
    {
        //Sets the application icon.
        File iconFile = new File("src/main/resources/com/example/tickettoride/ticket.png");
        String iconUrl = iconFile.toURI().toString();
        primaryStage.getIcons().add(new Image(iconUrl));
    }

}
