package com.example.tickettoride;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.*;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.*;

/**
 * TicketToRide class
 * This class will contain logic for displaying the game window and each of the game's components.
 */
public class TicketToRide extends Application
{
    //Contains the number of players
    private int currentNumPlayers;

    private List<Player> currentPlayers = new ArrayList<>(); //Stores Player objects in a list

    public static final String TITLE = "Ticket to Ride: New York";
    public static final String AUTHORS = "By: Austin, Joseph, and Louis";

    @Override
    public void start(Stage primaryStage)
    {
        //Creates a new StackPane for the splash screen
        StackPane splashScreen = new StackPane();

        //Get the image from the TransportationCard class
        TransportationCard transportationCard = new TransportationCard();
        Image cardImage = transportationCard.selectRandomCard();

        //Create an ImageView for the splash screen
        ImageView imageView = new ImageView(cardImage);

        //Set up Image Size.
        //Width of the splash screen
        imageView.setFitWidth(1000);

        //Height of the splash screen
        imageView.setFitHeight(800);

        // Set the imageView as the background
        splashScreen.getChildren().add(imageView);

        // Create a label with the game title
        Label titleLabel = new Label(TITLE);
        titleLabel.setTextFill(Color.BLACK);
        //Sets the style of the titleLabel with a background color and 50% opacity with rounded corners, a black border
        //set to 3 pixels wide, and a font size of 50px and San-serif font.
        titleLabel.setStyle("-fx-background-color: rgba(255, 255, 255, 0.5); -fx-background-radius: 10; " +
                "-fx-border-color: black; -fx-border-radius: 10; -fx-border-width: 3; -fx-font: 50px \"San-serif\";");
        //Increases the spacing between the titleLabel and the authorsLabel
        titleLabel.setPadding(new Insets(0, 0, 50, 0));


        //Create labels for Authors
        Label authorsLabel = new Label(AUTHORS);
        authorsLabel.setFont(Font.font("San-serif", 30));
        authorsLabel.setTextFill(Color.WHITESMOKE);
        authorsLabel.setPadding(new Insets(150, 0, 0, 0));

        //Creates a label for the "Click here to begin!" text
        Label clickToBeginLabel = new Label("Click anywhere to begin!");
        clickToBeginLabel.setTextFill(Color.BLACK);
        clickToBeginLabel.setFont(Font.font("San-serif", 20));

        //Adds the labels to the splash screen
        splashScreen.getChildren().addAll(titleLabel, authorsLabel, clickToBeginLabel);
        //Centers the labels vertically
        StackPane.setAlignment(titleLabel, Pos.CENTER);
        titleLabel.setPadding(new Insets(10));

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
            setStyle("-fx-border-style: groove;"
                    +"-fx-border-width: 3;"
                    +"-fx-border-radius: 4;"
                    +"-fx-border-color: gray;"
            );
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
                currentPlayers.add(player); // Add each player to the list
            }

            PlayerTest playerTest0 = new PlayerTest("Dakota", 0, new ArrayList<TransportationCard>(),
                    new ArrayList<DestinationCard>(), 15);

            PlayerTest playerTest1 = new PlayerTest("Austin", 0, new ArrayList<TransportationCard>(),
                    new ArrayList<DestinationCard>(), 15);

            PlayerTest playerTest2 = new PlayerTest("Joseph", 0, new ArrayList<TransportationCard>(),
                    new ArrayList<DestinationCard>(), 15);

            //Now, you have a list of Player objects for the selected number of players
            //int currentNumPlayers = currentPlayers.size();
            //Sets the number of players to the value of the ComboBox

            currentNumPlayers = playerComboBox.getValue();

            //Player.setNumPlayers(currentNumPlayers);

            if (currentNumPlayers == 2)
            {
                colorComboBox.visibleProperty().setValue(true);
                taPlayer.visibleProperty().setValue(true);
                btnAddPlayer.visibleProperty().setValue(true);
            }



            btnAddPlayer.setOnAction(event ->
            {
                //Adds the player to the list of players
                currentPlayers.add(new Player(taPlayer.getText()));
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

        //Create HBox and buttons for top of game
        //This will have the rules, scoring, about, save, and load buttons
        HBox hBox = new HBox(5);
        Button rules = new Button("Rules");
        Button score = new Button("Scoring");
        Button about = new Button("About");
        Button save = new Button("Save");
        Button load = new Button("Load");
        hBox.getChildren().addAll(rules, score, about, save, load);

        //Create the event and text for the buttons listed above
        rules.setOnAction(actionEvent -> {
            Dialog<String> dialog = new Dialog<>();
            dialog.setTitle("The Rules");
            ButtonType buttonType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
            dialog.setContentText("""
                    The Game Turn consists of doing one of the following three actions: draw Transportation cards
                    claim a Route, or draw Destination Ticket cards.
                    __________________________
                    Draw Transportation Cards
                    -Transportation Cards match route colors on the board.
                    -Taxis are multicolored and act as wild cards.
                    -You may have any number of Transport cards in your hand.
                    -You can draw up to Two cards.
                    -This can be from the deck or take any one of the five face up cards.
                    -If your taking a face up taxi card, you cannot draw any other card.
                    __________________________
                    Claim a Route
                    -A route is the set of spaces of same color that link adjacent Locations.
                    -To claim a route, you must have the same amount of color matched cards as the route.
                    -Gray routes are available to any color of Transportation Cards.
                    -You can claim any open Route on the board, even if it is not connected to a Route you previously
                    claimed. You cannot claim more than one route per turn.
                    ____________________________
                    Draw Destination Ticket Cards
                    -Each Destination Ticket Card shows the two points, starting and stopping, and a point value.
                    -To complete a Destination Ticket card, you must connect the two locations on the card by creating
                    a continuous path. You may have any number of Destination tickets.
                    -You can draw two cards from the deck, you must keep at least one.
                    """);
            dialog.getDialogPane().getButtonTypes().add(buttonType);
            dialog.showAndWait();
        });

        //Creates the event and text for the scoring button
        score.setOnAction(actionEvent -> {
            Dialog<String> dialog = new Dialog<>();
            dialog.setTitle("The Scoring");
            ButtonType buttonType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
            dialog.setContentText("""
                                          The Scoring of the Game
                                         _______________________
                                  
                    When a player has two or fewer Taxis left in their supply, each player, including
                    that player, gets one last turn. Then the game ends and players calculate their
                    final scores using the scorecard:
                    
                    -First, each player scores points for each Route they claimed during the game
                     based on the route Scoring Table printed on the board.
                     
                    -Then, each player reveals all their destination cards, adds the value of each
                     card they completed, and subtracts the value of any card they failed to complete.
                     
                    -Finally, each player scores one points for each Tourist Attraction that is connected
                     to one or more of the Routes they claimed.
                                  
                                  The player with the most points wins.\s
                    """);
            dialog.getDialogPane().getButtonTypes().add(buttonType);
            dialog.showAndWait();
        });

        //Creates the event and text for the about button
        about.setOnAction(actionEvent -> {
            Dialog<String> dialog = new Dialog<>();
            dialog.setTitle("About");
            ButtonType buttonType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
            dialog.setContentText("""
                                  _________________________
                                  CPT-231 Group Project:
                                  Ticket to Ride: New York
                                  
                                  By: Austin Bradley,
                                         Louis Fennell III,
                                         Joseph Lemois
                                  __________________________
                                  """);
            dialog.getDialogPane().getButtonTypes().add(buttonType);
            dialog.showAndWait();
        });

        LabelPane lblEast = new LabelPane("Draw & Discard area!");
        lblEast.setPadding(new Insets(50));

        //setup of borderPane displays titles
        //borderPane.setTop(new LabelPane("By: Austin, Joseph, and Louis!"));
        borderPane.setTop(hBox);
        borderPane.setRight(lblEast);
        borderPane.setBottom(new LabelPane("Displays current players hand!"));
        borderPane.setLeft(new LabelPane("Displays players in turn order with points!"));

        //Initializes the scene
        Scene scene = new Scene(borderPane, 1000, 800);

        Display.ChangeIcon(primaryStage); //Sets the programs icon
        primaryStage.setTitle(TITLE); //Title of Game
        //Disables resizing the window
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Method to get a random card image
    public Image getRandomCardImage()
    {
        Random random = new Random();
        int cardIndex = random.nextInt(TransportationCards.cardImagePaths.length);
        String selectedCardImagePath = TransportationCards.cardImagePaths[cardIndex];
        return new Image(getClass().getResource(selectedCardImagePath).toExternalForm());
    }

    public static void main(String[] args)
    {
        launch();
    }
}