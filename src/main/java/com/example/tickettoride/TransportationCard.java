package com.example.tickettoride;

/*
"/com/example/tickettoride/OLD_CardImages/BlueTransportationCard.jpeg",
"/com/example/tickettoride/OLD_CardImages/GreenTransportationCard.jpeg",
"/com/example/tickettoride/OLD_CardImages/BlackTransportationCard.jpeg",
"/com/example/tickettoride/OLD_CardImages/PinkTransportationCard.jpeg",
"/com/example/tickettoride/OLD_CardImages/RedTransportationCard.jpeg",
"/com/example/tickettoride/OLD_CardImages/YellowTransportationCard.jpeg",
"/com/example/tickettoride/OLD_CardImages/TaxiTransportationCard.jpeg"
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class TransportationCard extends Application
{
    private final ImageView cardImageView = new ImageView();
    private final ImageView transportationDeckImageView = new ImageView();
    public static final String[] CARDIMAGEPATHS = {
            "/com/example/tickettoride/RemadeCardImages/BlueTransportationCard.png",
            "/com/example/tickettoride/RemadeCardImages/GreenTransportationCard.png",
            "/com/example/tickettoride/RemadeCardImages/BlackTransportationCard.png",
            "/com/example/tickettoride/RemadeCardImages/PinkTransportationCard.png",
            "/com/example/tickettoride/RemadeCardImages/RedTransportationCard.png",
            "/com/example/tickettoride/RemadeCardImages/YellowTransportationCard.png",
            "/com/example/tickettoride/RemadeCardImages/TaxiTransportationCard.png"
    };
    private final String deckBack = "com/example/tickettoride/RemadeCardImages/TransportationCardBack.png";

    //Colors for the cards
    private final Color[] colors = {Color.BLUE, Color.GREEN, Color.BLACK, Color.PINK, Color.RED, Color.YELLOW, Color.ORANGE,};

    //Card values
    private Color blueTransportationCard = colors[0];

    private Color greenTransportationCard = colors[1];

    private Color blackTransportationCard = colors[2];

    private Color pinkTransportationCard = colors[3];

    private Color redTransportationCard = colors[4];

    private Color yellowTransportationCard = colors[5];

    private Color orangeTransportationCard = colors[6];

    //Set taxi card to all available colors

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        StackPane root = new StackPane();
        StackPane cardPane = new StackPane();
        StackPane deckPane = new StackPane();

        Scene scene = new Scene(root, 1280, 720);
        Button btnRandomCard = new Button("Random Card");
        ImageView transportationDeckImageView = new ImageView();
        HBox hbox = new HBox(20); //Spacing = 10 (pixels)

        // Initialize the transportationDeckImageView here
        //transportationDeckImageView.setImage(new Image(getClass().getResource(deckBack).toExternalForm(),150, 200, true, false));

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

        root.getChildren().addAll(hbox);

        primaryStage.setTitle("Transportation Card Selector");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

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
}