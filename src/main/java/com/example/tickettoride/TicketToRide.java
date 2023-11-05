package com.example.tickettoride;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

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

    //Contains the number of players
    private int numPlayers;

    private List<Player> players = new ArrayList<>(); //Stores Player objects in a list

    private static final String TITLE = "Ticket to Ride: New York";
    private static final String AUTHORS = "By: Austin, Joseph, and Louis";

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        //Creates a new StackPane for the splash screen
        StackPane splashScreen = new StackPane();
        //Sets the background color of the splash screen
        splashScreen.setStyle("-fx-background-color: lightgray;");

        // Create a label with the game title
        Label titleLabel = new Label(TITLE);
        titleLabel.setStyle("");
        //Sets the style of the titleLabel with a background color and 50% opacity
        titleLabel.setStyle("-fx-font-size: 32pt; -fx-background-color: rgba(255, 255, 255, 0.75);");

        Label authorsLabel = new Label(AUTHORS);
        authorsLabel.setStyle("-fx-font-size: 20;");
        authorsLabel.setPadding(new Insets(100, 0, 0, 0));

        //Creates a label for the "Click here to begin!" text
        Label clickToBeginLabel = new Label("Click anywhere to begin!");
        clickToBeginLabel.setStyle("-fx-font-size: 20;");

        //Adds the labels to the splash screen
        splashScreen.getChildren().addAll(titleLabel, authorsLabel, clickToBeginLabel);
        //Centers the labels vertically
        StackPane.setAlignment(titleLabel, Pos.CENTER);

        VBox clickToBeginLabelBox = new VBox();
        clickToBeginLabelBox.getChildren().add(clickToBeginLabel);

        //Modifies the style of the clickToBeginLabelBox adding a gap between the labels
        clickToBeginLabelBox.setStyle("-fx-padding: 100;");
        //Adds the clickToBeginLabelBox to the splash screen
        splashScreen.getChildren().add(clickToBeginLabelBox);

        clickToBeginLabelBox.setAlignment(Pos.BOTTOM_CENTER);

        //Creates a scene for the splash screen
        Scene splashScene = new Scene(splashScreen, 1000, 800);

        //Sets the programs icon
        Display.ChangeIcon(primaryStage);

        //Initialize the scene
        primaryStage.setTitle(TITLE);
        primaryStage.setScene(splashScene);
        //Disables resizing the window
        primaryStage.setResizable(false);
        primaryStage.show();

        //Handle the click event to close the splash screen
        splashScene.setOnMouseClicked(event ->
        {
            //Closes the splash screen
            primaryStage.close();

            //Displays the player selection screen
            Stage playerSelectStage = new Stage();
            createPlayerSelection(playerSelectStage);
        });
    }

    //sets up border and allows text to be displayed
    class LabelPane extends StackPane
    {
        public LabelPane(String title)
        {
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: blue");
            setPadding(new Insets(20, 30,50,30));
        }
    }

    //Method that will display the player count and selection screen
    private void createPlayerSelection(Stage playerSelectStage)
    {
        //Creates a label with the games title
        Label titleLabel = new Label(TITLE);
        //Sets the font size of the title label
        titleLabel.setStyle("-fx-font-size: 32pt;");

        //Creates a label with the games authors
        Label authorsLabel = new Label(AUTHORS);
        //Sets the font size of the authors label
        authorsLabel.setStyle("-fx-font-size: 20;");
        //Sets the padding of the authors label
        authorsLabel.setPadding(new Insets(20, 0, 20, 0));

        //text area for player names
        Label playerLabel = new Label("Player Names:");
        TextArea taPlayer = new TextArea();
        taPlayer.setPrefColumnCount(20);
        taPlayer.setPromptText("Enter player names here");
        taPlayer.visibleProperty().setValue(false);
        //Creates a button for adding players
        Button btnAddPlayer = new Button("Add Player");
        btnAddPlayer.visibleProperty().setValue(false);

        //Creates the ComboBox for selecting the player color
        ComboBox<String> colorComboBox = new ComboBox<>();
        colorComboBox.getItems().addAll("Blue", "Green", "Black", "Pink", "Red", "Yellow");
        colorComboBox.visibleProperty().setValue(false);

        //Creates the ComboBox for selecting the number of players
        ComboBox<Integer> playerComboBox = new ComboBox<>();
        playerComboBox.getItems().addAll(2, 3, 4);
        playerComboBox.setPromptText("Select the number of players");

        //Sets the default value of the ComboBox to 2
        playerComboBox.setValue(2);

        // Create the Confirm button
        Button confirmButton = new Button("Confirm");

        confirmButton.setOnAction(e ->
        {
            int selectedNumPlayers = playerComboBox.getValue();

            // Create Player objects based on the selected number of players
            for (int i = 0; i < selectedNumPlayers; i++) {
                Player player = new Player("Player " + (i + 1));
                players.add(player); // Add each player to the list
            }

            // Now, you have a list of Player objects for the selected number of players
            int currentNumPlayers = players.size();
            //Sets the number of players to the value of the ComboBox

            currentNumPlayers = playerComboBox.getValue();

            //Player.setNumPlayers(currentNumPlayers);

            colorComboBox.visibleProperty().setValue(true);
            taPlayer.visibleProperty().setValue(true);
            btnAddPlayer.visibleProperty().setValue(true);

            btnAddPlayer.setOnAction(event ->
            {
                //Adds the player to the list of players
                players.add(new Player(taPlayer.getText()));
                //Clears the text area
                taPlayer.clear();
                //Displays the color selection ComboBox
                colorComboBox.visibleProperty().setValue(true);

                playerSelectStage.close(); //Closes the initial window
                //Creates the game interface and shows it
                Stage primaryStage = new Stage();
                createGameInterface(primaryStage);
            });
        });

        // Create a VBox to arrange the UI elements
        VBox layout = new VBox(10);
        //Add the title and authors labels to the layout
        layout.getChildren().addAll(titleLabel, authorsLabel);
        layout.getChildren().addAll(playerComboBox, confirmButton);

        layout.setStyle("-fx-alignment: center; -fx-padding: 20px;");

        VBox layout2 = new VBox(10);
        layout2.getChildren().addAll(colorComboBox,btnAddPlayer, taPlayer);
        layout2.setAlignment(Pos.BASELINE_RIGHT);
        layout.getChildren().add(layout2);

        // Create the initial scene
        Scene scene = new Scene(layout, 1000, 800);

        //Set's the programs icon
        Display.ChangeIcon(playerSelectStage);

        //Sets the title of the player selection screen
        playerSelectStage.setTitle("Ticket to Ride - Select Players");
        //Disables resizing the window
        playerSelectStage.setResizable(false);
        playerSelectStage.setScene(scene);
        playerSelectStage.show();
    }

    private void createGameInterface(Stage primaryStage)
    {
        //Creates a new borderPane
        BorderPane borderPane = new BorderPane();

        //Creates a new board object then gets the map image from the board class
        Board board = new Board();
        ImageView ticketToRideNYMap = board.getTicketToRideImage();

        // Wrap the ImageView in a StackPane to apply padding
        StackPane imageContainer = new StackPane();
        //Adds the ticketToRideNYMap to the imageContainer
        imageContainer.getChildren().add(ticketToRideNYMap);
        //Adds the image container to the center of the borderPane
        borderPane.setCenter(imageContainer);

        LabelPane lblEast = new LabelPane("Draw & Discard area!");
        lblEast.setPadding(new Insets(50));

        //setup of borderPane displays titles
        //borderPane.setTop(new LabelPane("By: Austin, Joseph, and Louis!"));
        borderPane.setRight(lblEast);
        borderPane.setBottom(new LabelPane("Displays current players hand!"));
        borderPane.setLeft(new LabelPane("Displays players in turn order with points!"));

        //Initializes the scene
        Scene scene = new Scene(borderPane, 1000, 800);

        Display.ChangeIcon(primaryStage); //Sets the programs icon
        primaryStage.setTitle("Ticket to Ride"); //Title of Game
        //Disables resizing the window
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}