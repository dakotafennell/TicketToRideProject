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

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Random;

public class TransportationCard extends Application
{
    public static final ImageView cardImageView = new ImageView();

    private Color cardColor;

    private final ImageView transportationDeckImageView = new ImageView();

    //Card images
    private static final String BLUECARD = "/com/example/tickettoride/TransportCards/BlueCard.png";
    private static final String GREENCARD = "/com/example/tickettoride/TransportCards/GreenCard.png";
    private static final String BLACKCARD = "/com/example/tickettoride/TransportCards/BlackCard.png";
    private static final String PINKCARD = "/com/example/tickettoride/TransportCards/PinkCard.png";
    private static final String REDCARD = "/com/example/tickettoride/TransportCards/RedCard.png";
    private static final String YELLOWCARD = "/com/example/tickettoride/TransportCards/OrangeCard.png";
    private static final String TAXICARD = "/com/example/tickettoride/TransportCards/RainbowCard.png";


    private static final String BACK = "com/example/tickettoride/TransportCards/BackTransportationCard.png";

    //Colors for the cards
    private final Color[] colors = {
            Color.BLUE, Color.GREEN, Color.BLACK, Color.PINK, Color.RED, Color.YELLOW, Color.ORANGE, Color.WHITE
    };

    //public String[][] cards = {{blueCard, "0"}, {Color.GREEN, 0}, {Color.BLACK, 0}, {Color.PINK, 0}, {Color.RED, 0}, {Color.YELLOW, 0}, {Color.ORANGE, 0}, {Color.WHITE, 0}};

    //Card values
    private final Color blueCard = colors[0];

    private final Color greenCard = colors[1];

    private final Color blackCard = colors[2];

    private final Color pinkCard = colors[3];

    private final Color redCard = colors[4];

    private final Color yellowCard = colors[5];

    private final Color orangeCard = colors[6];

    //Set taxi card to all available colors
    private final Color taxiCard = colors[7];

   // public String[][] cards = {{String.valueOf(blueCard), "0"}, {Color.GREEN, 0}, {Color.BLACK, 0}, {Color.PINK, 0}, {Color.RED, 0}, {Color.YELLOW, 0}, {Color.ORANGE, 0}, {Color.WHITE, 0}};

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

    //Array of card image paths
    public static final String[] CARDIMAGEPATHS = {BLUECARD, GREENCARD, BLACKCARD, PINKCARD, REDCARD, YELLOWCARD, TAXICARD};

    //Method to select a random card from the deck
    public Image selectRandomCard()
    {
        Random random = new Random();
        // Get a random card index
        int cardIndex = random.nextInt(CARDIMAGEPATHS.length);
        // Get the selected card image path
        String selectedCardImagePath = CARDIMAGEPATHS[cardIndex];

        cardColor = colors[cardIndex];

        // Load the image using ClassLoader
        final int imageWidth = 1000;
        final int imageHeight = 800;

        try
        {
            Image selectedCardImage = new Image(Objects.requireNonNull(getClass().getResource(selectedCardImagePath)).toExternalForm(),
                    imageWidth, imageHeight, true, false);



            // Set the selected card image to the cardImageView
            cardImageView.setImage(selectedCardImage);

            return selectedCardImage;
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
            System.out.println("The selected card image path is null.");
            //Prints out to the console the specific card image path that is null
            System.out.println("The selected card image path is: " + selectedCardImagePath);
        }
        return null;
    }

    //Method to

    /*
    if (selectedCardImagePath.equals(BACK))
        {
            transportationDeckImageView.setImage(selectedCardImage);
        }
        else if (selectedCardImagePath.equals(BLUECARD))
        {
            BlueCards += 1;
        }
        else if (selectedCardImagePath.equals(GREENCARD))
        {
            GreenCards += 1;
        }
        else if (selectedCardImagePath.equals(BLACKCARD))
        {

        }
        else if (selectedCardImagePath.equals(PINKCARD))
        {

        }
        else if (selectedCardImagePath.equals(REDCARD))
        {

        }
        else if (selectedCardImagePath.equals(YELLOWCARD))
        {

        }
        else if (selectedCardImagePath.equals(TAXICARD))
        {

        }
     */

    public Color getCardColor() {
        return cardColor;
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}