package com.example.tickettoride;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class TransportationCard extends Application
{
    public static final ImageView cardImageView = new ImageView();
    private final ImageView transportationDeckImageView = new ImageView();

    //Card images
    private static final String BLUECARD = "/com/example/tickettoride/TransportCards/BlueTransportationCard.png";
    private static final String GREENCARD = "/com/example/tickettoride/TransportCards/GreenTransportationCard.png";
    private static final String BLACKCARD = "/com/example/tickettoride/TransportCards/BlackTransportationCard.png";
    private static final String PINKCARD = "/com/example/tickettoride/TransportCards/PinkTransportationCard.png";
    private static final String REDCARD = "/com/example/tickettoride/TransportCards/RedTransportationCard.png";
    private static final String YELLOWCARD = "/com/example/tickettoride/TransportCards/YellowTransportationCard.png";
    private static final String TAXICARD = "/com/example/tickettoride/TransportCards/TaxiTransportationCard.png";

    //Array of card image paths
    public static final String[] CARDIMAGEPATHS = {BLUECARD, GREENCARD, BLACKCARD, PINKCARD, REDCARD, YELLOWCARD, TAXICARD};
    private static final String BACK = "com/example/tickettoride/TransportCards/BackTransportationCard.png";

    //Colors for the cards
    private final Color[] colors = {Color.BLUE, Color.GREEN, Color.BLACK, Color.PINK, Color.RED, Color.YELLOW, Color.ORANGE, Color.WHITE};

    //Card values
    private final Color blueTransportationCard = colors[0];

    private final Color greenTransportationCard = colors[1];

    private final Color blackTransportationCard = colors[2];

    private final Color pinkTransportationCard = colors[3];

    private final Color redTransportationCard = colors[4];

    private final Color yellowTransportationCard = colors[5];

    private final Color orangeTransportationCard = colors[6];

    //Set taxi card to all available colors
    private final Color taxiTransportationCard = colors[7];

    @Override
    public void start(Stage primaryStage)
    {
        StackPane root = new StackPane();
        StackPane cardPane = new StackPane();
        StackPane deckPane = new StackPane();
        GridPane gridPane = new GridPane();

        gridPane.gridLinesVisibleProperty().setValue(true);

        Scene scene = new Scene(root, 1280, 720);
        Button btnRandomCard = new Button("Random Card");
        ImageView transportationDeckImageView = new ImageView();
        HBox hbox = new HBox(20); //Spacing = 10 (pixels)

        primaryStage.setOnShowing(event ->
        {
            selectRandomCard();
        });

        btnRandomCard.setOnMouseClicked(event ->
        {
            selectRandomCard();
        });

        btnRandomCard.setAlignment(Pos.BOTTOM_CENTER);

        hbox.getChildren().addAll(btnRandomCard, cardImageView);

        deckPane.getChildren().add(transportationDeckImageView);

        cardPane.getChildren().add(cardImageView);

        //dd cardPane to the HBox
        hbox.getChildren().addAll(cardPane, deckPane);

        hbox.setPadding(new javafx.geometry.Insets(15, 12, 15, 12));

        gridPane.getChildren().add(hbox);

        root.getChildren().addAll(gridPane);

        primaryStage.setTitle("Transportation Card Selector");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Method to select a random card from the deck
    public Image selectRandomCard()
    {
        Random random = new Random();
        // Get a random card index
        int cardIndex = random.nextInt(CARDIMAGEPATHS.length);
        // Get the selected card image path
        String selectedCardImagePath = CARDIMAGEPATHS[cardIndex];

        // Load the image using ClassLoader
        final int imageWidth = 1000;
        final int imageHeight = 800;

        Image selectedCardImage = new Image(getClass().getResource(selectedCardImagePath).toExternalForm(),
                imageWidth, imageHeight, true, false);

        // Set the selected card image to the cardImageView
        cardImageView.setImage(selectedCardImage);

        return selectedCardImage;
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}