package com.example.tickettoride;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//This class will contain each of the class testing "start" methods
public class TestClasses extends Application
{
    RandomImages ran = new RandomImages();
    TransportationCard transportationCard = new TransportationCard();
    DestinationCard destinationCard = new DestinationCard();
    public static final ImageView cardImageView = new ImageView();
    /*
    //Start method to be used for testing
    /**
     * Start method to be used for testing TransportationCard random card selection
     * @param primaryStage
     *
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
            ran.selectRandomTransportationCard();
        });

        btnRandomCard.setOnMouseClicked(event ->
        {
            ran.selectRandomTransportationCard();
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

     * Start method to be used for testing DestinationCard random card selection
     * @param primaryStage
     */
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
            ran.selectRandomDestinationCard();
        });

        btnRandomCard.setOnMouseClicked(event ->
        {
            ran.selectRandomDestinationCard();
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
    public static void main(String[] args)
    {
        launch(args);
    }
}
