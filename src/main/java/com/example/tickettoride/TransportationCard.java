package com.example.tickettoride;

import javafx.collections.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import java.util.Objects;
import java.util.Random;

public class TransportationCard
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

    public ObservableList<TransportationCard> transportationCards = FXCollections.observableArrayList();

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

    public String[][] cards = {
            {"Color.BLUE", "0"}, {"Color.GREEN", "0"}, {"Color.BLACK", "0"},
            {"Color.PINK", "0"}, {"Color.RED", "0"}, {"Color.YELLOW", "0"},
            {"Color.ORANGE", "0"}, {"Color.WHITE", "0"}
    };

    //Array of card image paths
    public static final String[] CARDIMAGEPATHS = {BLUECARD, GREENCARD, BLACKCARD, PINKCARD, REDCARD, YELLOWCARD, TAXICARD};

    /*
    Color color;
    Image cardImage;

    //Constructor
    public TransportationCard(Image img, Color c)
    {
        this.cardColor = c;
        this.cardImage = img;
    }
    */

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
            //Prints out to the console the specific card image path that is null
            System.out.println("The selected card image path is: " + selectedCardImagePath);

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

    public Color getCardColor() {
        return cardColor;
    }
}