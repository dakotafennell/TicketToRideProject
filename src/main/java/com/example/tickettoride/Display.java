package com.example.tickettoride;

import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.util.Map;
import java.util.Objects;


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

    //Gets the current players list
    public ObservableList<Player> getPlayers()
    {
        return Players;
    }

    //Method that will create a HBox that will contain the current player's information
    //This method is ready for you to update Joseph Lemois
    public HBox getBottomPlayersInventoryHBox()
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
            //Creates a HBox to store the current player's information
            HBox currentPlayerHBox = new HBox();

            //Creates a label for the current player's name
            Label currentPlayerNameLabel = new Label("Player: " + Players.get(0).getName());

            //Creates a label for the current player's score
            Label currentPlayerScoreLabel = new Label("Score: " + Players.get(0).getScore());

            //Creates a label for the current player's number of taxis
            Label currentPlayerTaxisLabel = new Label("Taxis: " + Players.get(0).getNumGamePieces());

            //Prints out the number of each color Transportation Cards the player has
            for (int i = 0; i < Players.get(0).getNumTransportationCards(); i++)
            {
                //Creates a label for the current player's number of taxis
                Label currentPlayerTransportationCardsColorLabel =
                        new Label("Transportation Cards: " + Players.get(0).getNumTransportationCards());
            }

            Label currentPlayerDestinationCardsLabel =
                    new Label("Destination Cards: " + Players.get(0).getNumDestinationCards());

            //Adds the current player's information to the VBox
            currentPlayerHBox.getChildren().addAll(currentPlayerNameLabel, currentPlayerScoreLabel, currentPlayerTaxisLabel);

            //Returns the HBox containing the current player's information
            return currentPlayerHBox;
        }
    }

    public VBox displayPlayersHand()
    {
        //Create players 1 and 2 hand
        // Create Labels for player names
        Label player1Label = new Label("Player 1");
        Label player2Label = new Label("Player 2");

        // HBox images for player 1
        HBox cardImagesHBoxP1 = new HBox(45);

        // HBox images for player 2
        HBox cardImagesHBoxP2 = new HBox(45);

        HBox valueImageHBoxP1 = new HBox(150);
        HBox valueImageHBoxP2 = new HBox(150);

        ImageView redCardImageViewP1 = getImageView("/com/example/tickettoride/TransportCards/RedCard.png");

        // Create ImageView for the blue card player 1
        ImageView blueCardImageViewP1 = getImageView("/com/example/tickettoride/TransportCards/BlueCard.png");

        // Create ImageView for the rainbow card player 1
        ImageView rainbowCardImageViewP1 = getImageView("/com/example/tickettoride/TransportCards/RainbowCard.png");

        // Create ImageView for the pink card player 1
        ImageView pinkCardImageViewP1 = getImageView("/com/example/tickettoride/TransportCards/PinkCard.png");

        // Create ImageView for the black card player 1
        ImageView blackCardImageViewP1 = getImageView("/com/example/tickettoride/TransportCards/BlackCard.png");

        // Create ImageView for the green card player 1
        ImageView greenCardImageViewP1 = getImageView("/com/example/tickettoride/TransportCards/GreenCard.png");

        // Create ImageView for the orange card player 1
        ImageView orangeCardImageViewP1 = getImageView("/com/example/tickettoride/TransportCards/OrangeCard.png");

        // Create ImageView for the red card player 2
        ImageView redCardImageViewP2 = getImageView("/com/example/tickettoride/TransportCards/RedCard.png");

        // Create ImageView for the blue card player 2
        ImageView blueCardImageViewP2 = getImageView("/com/example/tickettoride/TransportCards/BlueCard.png");

        // Create ImageView for the rainbow card player 2
        ImageView rainbowCardImageViewP2 = getImageView("/com/example/tickettoride/TransportCards/RainbowCard.png");

        // Create ImageView for the pink card player 2
        ImageView pinkCardImageViewP2 = getImageView("/com/example/tickettoride/TransportCards/PinkCard.png");

        // Create ImageView for the black card player 2
        ImageView blackCardImageViewP2 = getImageView("/com/example/tickettoride/TransportCards/BlackCard.png");

        // Create ImageView for the green card player 2
        ImageView greenCardImageViewP2 = getImageView("/com/example/tickettoride/TransportCards/GreenCard.png");

        // Create ImageView for the orange card player 2
        ImageView orangeCardImageViewP2 = getImageView("/com/example/tickettoride/TransportCards/OrangeCard.png");

        // Add both card images to the HBox for player 1
        cardImagesHBoxP1.getChildren().addAll(redCardImageViewP1, blueCardImageViewP1, rainbowCardImageViewP1, pinkCardImageViewP1, blackCardImageViewP1, greenCardImageViewP1, orangeCardImageViewP1);

        //gets the current players
        ObservableList<Player> currentPlayers = getPlayers();

        //gets the current players hand
        for(int i = 0; i < currentPlayers.size(); i++)
        {
            if (i == 0)
            {
                for (Map.Entry<Color, Integer> entry : currentPlayers.get(i).getPlayerHandMap().entrySet())
                {
                    Color color = entry.getKey();
                    int value = entry.getValue();
                    Text text = new Text(Integer.toString(value));
                    valueImageHBoxP1.getChildren().add(text);
                }
            }
            else if (i == 1)
            {
                for (Map.Entry<Color, Integer> entry : currentPlayers.get(i).getPlayerHandMap().entrySet())
                {
                    Color color = entry.getKey();
                    int value = entry.getValue();
                    Text text = new Text(Integer.toString(value));
                    valueImageHBoxP2.getChildren().add(text);
                }
            }
        }

        // Add both card images to the HBox for player 2
        cardImagesHBoxP2.getChildren().addAll(redCardImageViewP2, blueCardImageViewP2, rainbowCardImageViewP2, pinkCardImageViewP2, blackCardImageViewP2, greenCardImageViewP2, orangeCardImageViewP2);

        // Add the HBox with card images to the bottom of the borderPane
        VBox cardImagesVBox = new VBox(5);
        cardImagesVBox.getChildren().addAll(player1Label, cardImagesHBoxP1,valueImageHBoxP1,valueImageHBoxP2, player2Label, cardImagesHBoxP2);
        return cardImagesVBox;
    }

    private ImageView getImageView(String redCardImagePathP1)
    {
        // Create ImageView for the red card player 1
        ImageView redCardImageViewP1 = new ImageView();
        Image redCardImageP1 = new Image(Objects.requireNonNull(getClass().getResource(redCardImagePathP1)).toExternalForm());
        redCardImageViewP1.setImage(redCardImageP1);
        redCardImageViewP1.setFitWidth(100);
        redCardImageViewP1.setFitHeight(75);
        return redCardImageViewP1;
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
                //Adds a margin to the left of the player's information
                playersVBox.setMargin(playersVBox, new javafx.geometry.Insets(0, 0, 0, 10));
                //Sets the font size for the player's information
                playersVBox.setStyle("-fx-font-size: 20px;");
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