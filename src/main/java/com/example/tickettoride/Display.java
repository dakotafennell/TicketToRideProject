package com.example.tickettoride;

import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;


public class Display
{
    TicketToRide game = new TicketToRide();

    //This class will contain logic for displaying the game window and each of the game's components.

    //Public method that sets the application icon
    public static void ChangeIcon(Stage primaryStage)
    {
        //Sets the application icon.
        File iconFile = new File("src/main/resources/com/example/tickettoride/ticket.png");
        String iconUrl = iconFile.toURI().toString();
        primaryStage.getIcons().add(new Image(iconUrl));
    }

    private final ObservableList<Player> Players;

    // Constructor that takes the current players list
    public Display(ObservableList<Player> currentPlayers)
    {
        this.Players = currentPlayers;
    }

    //Method that will create a VBox for the player information
    //This method will be called when the game is started and when a player's information changes
    //This method calls the players information from the ObservableList currentPlayers
    public VBox getPlayerInfoVBox()
    {
        // Check if the list of current players is empty
        if (Players.isEmpty())
        {
            System.out.println("No players have been added.");
            //returns nothing if the list is empty
            return null;
        }
        else
        {
            //Create a VBox to store player information
            VBox playersVBox = new VBox();

            //Adds a separator above the first player's information
            Separator firstSeparator = new Separator();
            playersVBox.getChildren().add(firstSeparator);

            //Iterates through each player in the currentPlayers list
            for (Player player : Players)
            {
                //Creates labels for player information
                Label playerLabel = new Label("Player: " + player.getName());
                Label scoreLabel = new Label("Score: " + player.getScore());
                Label taxisLabel = new Label("Taxis: " + player.getNumGamePieces());

                //Creates a VBox for each player's information
                VBox playerVBox = new VBox(playerLabel, scoreLabel, taxisLabel);

                //Adds a separating line (Separator) below each player's information
                Separator separator = new Separator();

                //Adds player information and separator to the main VBox
                playersVBox.getChildren().addAll(playerVBox, separator);
            }

            //Removes the last separator to avoid an extra line at the end
            playersVBox.getChildren().remove(playersVBox.getChildren().size() - 1);

            //Returns the VBox containing player information
            return playersVBox;
        }
    }

}