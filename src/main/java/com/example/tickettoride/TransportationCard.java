package com.example.tickettoride;

/*
"com/example/tickettoride/RemadeCardImages/BlueTransportationCard.png",
"com/example/tickettoride/RemadeCardImages/GreenTransportationCard.png",
"com/example/tickettoride/RemadeCardImages/BlackTransportationCard.png",
"com/example/tickettoride/RemadeCardImages/PinkTransportationCard.png",
"com/example/tickettoride/RemadeCardImages/RedTransportationCard.png",
"com/example/tickettoride/RemadeCardImages/YellowTransportationCard.png",
"com/example/tickettoride/RemadeCardImages/TaxiTransportationCard.png"
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Random;

public class TransportationCard extends Application
{
    private final ImageView cardImageView = new ImageView();
    private final ImageView transportationDeckImageView = new ImageView();
    private final String[] CARDIMAGEPATHS = {
            "/com/example/tickettoride/BlueTransportationCard.jpeg",
            "/com/example/tickettoride/GreenTransportationCard.jpeg",
            "/com/example/tickettoride/BlackTransportationCard.jpeg",
            "/com/example/tickettoride/PinkTransportationCard.jpeg",
            "/com/example/tickettoride/RedTransportationCard.jpeg",
            "/com/example/tickettoride/YellowTransportationCard.jpeg",
            "/com/example/tickettoride/TaxiTransportationCard.jpeg"
    };
    private final String deckBack = "com/example/tickettoride/RemadeCardImages/TransportationCardBack.png";

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
       // transportationDeckImageView.setImage(new Image(getClass().getResource(deckBack).toExternalForm(),150, 200, true, false));

        primaryStage.setOnShowing(event ->
        {
            selectRandomCard();
        });

        //transportationDeckImageView.setOnMouseClicked(event ->
        //{
        //    selectRandomCard();
        //});

        btnRandomCard.setOnMouseClicked(event ->
        {
            selectRandomCard();
        });

        btnRandomCard.setAlignment(Pos.BOTTOM_CENTER);

        hbox.getChildren().addAll(btnRandomCard, cardImageView);

        deckPane.setRotate(90); // Rotate the StackPane, not the ImageView
        deckPane.getChildren().add(transportationDeckImageView);

        cardPane.setRotate(90); // Rotate the StackPane, not the ImageView
        cardPane.getChildren().add(cardImageView);

        //dd cardPane to the HBox
        hbox.getChildren().addAll(cardPane, deckPane);

        hbox.setPadding(new javafx.geometry.Insets(15, 12, 15, 12));

        root.getChildren().addAll(hbox);

        primaryStage.setTitle("Transportation Card Selector");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void selectRandomCard()
    {
        Random random = new Random();
        int cardIndex = random.nextInt(CARDIMAGEPATHS.length);
        String selectedCardImagePath = CARDIMAGEPATHS[cardIndex];

        // Use ClassLoader to load the image resources from the resources directory
        Image selectedCardImage = new Image(getClass().getResource(selectedCardImagePath).toExternalForm(),
                400, 600, true, false);

        cardImageView.setImage(selectedCardImage);
    }
}