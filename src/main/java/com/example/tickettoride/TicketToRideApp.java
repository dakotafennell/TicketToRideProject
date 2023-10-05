package com.example.tickettoride;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TicketToRideApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the main VBox to hold player and game board sections
        VBox mainPane = new VBox();
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setSpacing(20);

        // Create a HBox for player information on the left (adjust the width as needed)
        HBox playerPane = new HBox();
        playerPane.setPrefWidth(200); // 1/4 of the screen width
        playerPane.setStyle("-fx-background-color: lightgray;");
        playerPane.setAlignment(Pos.CENTER);

        // Create a VBox for the game board on the right (adjust the width as needed)
        VBox gameBoardPane = new VBox();
        gameBoardPane.setPrefWidth(600); // 3/4 of the screen width
        gameBoardPane.setStyle("-fx-background-color: lightgreen;");
        gameBoardPane.setAlignment(Pos.CENTER);

        // Add player information to the playerPane (repeat for each player)
        // For example, to add player 1's information:
        VBox player1Info = createPlayerInfoPane("Player 1");
        playerPane.getChildren().add(player1Info);

        // Add the game board and pieces to the gameBoardPane
        // You can customize the game board layout as needed

        // Add the current player's cards at the bottom of the game board
        VBox currentPlayerCards = createPlayerCardsPane("Current Player's Cards");

        //gameBoardPane.getChildren().addAll(/* Add game board components here */, currentPlayerCards);

        // Add the player and game board panes to the mainPane
        mainPane.getChildren().addAll(playerPane, gameBoardPane);

        Scene scene = new Scene(mainPane, 1000, 600); // Set your preferred window size
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ticket to Ride Game");
        primaryStage.show();
    }

    // Helper method to create a player information pane
    private VBox createPlayerInfoPane(String playerName) {
        VBox playerInfoPane = new VBox();
        playerInfoPane.setPrefHeight(100); // Adjust the height as needed
        playerInfoPane.setStyle("-fx-border-color: black; -fx-padding: 10px;");
        playerInfoPane.setAlignment(Pos.CENTER_LEFT);

        Label playerNameLabel = new Label(playerName);
        Label playerScoreLabel = new Label("Score: 0"); // Replace with actual score

        playerInfoPane.getChildren().addAll(playerNameLabel, playerScoreLabel);
        return playerInfoPane;
    }

    // Helper method to create a pane for displaying the current player's cards
    private VBox createPlayerCardsPane(String title) {
        VBox playerCardsPane = new VBox();
        playerCardsPane.setPrefHeight(100); // Adjust the height as needed
        playerCardsPane.setStyle("-fx-background-color: lightblue; -fx-padding: 10px;");
        playerCardsPane.setAlignment(Pos.BOTTOM_CENTER); // Align cards to the bottom (optional)

        Label titleLabel = new Label(title);
        // Add current player's cards and card-related elements here

        playerCardsPane.getChildren().addAll(titleLabel /* Add cards here */);
        return playerCardsPane;
    }

    public static void main(String[] args) {
        launch(args);
    }
}