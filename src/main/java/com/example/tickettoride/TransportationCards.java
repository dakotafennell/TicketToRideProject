package com.example.tickettoride;

/*
"src/main/resources/com/example/tickettoride/BlueTransportationCard.jpeg",
"src/main/resources/com/example/tickettoride/GreenTransportationCard.jpeg",
"src/main/resources/com/example/tickettoride/BlackTransportationCard.jpeg",
"src/main/resources/com/example/tickettoride/PinkTransportationCard.jpeg",
"src/main/resources/com/example/tickettoride/RedTransportationCard.jpeg",
"src/main/resources/com/example/tickettoride/YellowTransportationCard.jpeg",
"src/main/resources/com/example/tickettoride/TaxiTransportationCard.jpeg"
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

public class TransportationCards extends Application {
    private ImageView cardImageView = new ImageView();

    private String[] cardImagePaths = {
            "/com/example/tickettoride/BlueTransportationCard.jpeg",
            "/com/example/tickettoride/GreenTransportationCard.jpeg",
            "com/example/tickettoride/BlackTransportationCard.jpeg",
            "/com/example/tickettoride/PinkTransportationCard.jpeg",
            "/com/example/tickettoride/RedTransportationCard.jpeg",
            "/com/example/tickettoride/YellowTransportationCard.jpeg",
            "/com/example/tickettoride/TaxiTransportationCard.jpeg"
    };

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 720, 480);

        Button btnRandomCard = new Button("Random Card");

        HBox hbox = new HBox(20); //Spacing = 10 (pixels)

        btnRandomCard.setOnMouseClicked(event ->
        {
            selectRandomCard();
        });

        hbox.getChildren().addAll(btnRandomCard, cardImageView);

        hbox.setPadding(new javafx.geometry.Insets(15, 12, 15, 12));
        hbox.setAlignment(Pos.CENTER);


        root.getChildren().add(hbox);

        primaryStage.setTitle("Transportation Card Selector");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void selectRandomCard()
    {
        Random random = new Random();
        int cardIndex = random.nextInt(cardImagePaths.length);
        String selectedCardImagePath = cardImagePaths[cardIndex];

        // Use ClassLoader to load the image resources from the resources directory
        Image selectedCardImage = new Image(getClass().getResource(selectedCardImagePath).toExternalForm(),
                100, 150, false, false);

        cardImageView.setImage(selectedCardImage);
    }
}