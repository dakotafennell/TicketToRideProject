package com.example.tickettoride;

import javafx.collections.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import java.util.Objects;
import java.util.Random;
/*
    Creation of the cards that are in the Transportation Deck
    -Assigns the Image to the color of the card to become
     applicable to the players hand
 */
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
    private static final String ORANGECARD = "/com/example/tickettoride/TransportCards/OrangeCard.png";
    private static final String TAXICARD = "/com/example/tickettoride/TransportCards/RainbowCard.png";

    private static final String BACK = "com/example/tickettoride/TransportCards/BackTransportationCard.png";

    //Colors for the cards
    private final Color[] colors = {
            Color.BLUE, Color.GREEN, Color.BLACK, Color.PINK, Color.RED, Color.ORANGE, Color.WHITE
    };

    public ObservableList<TransportationCard> transportationCards = FXCollections.observableArrayList();

    //Card values
    private final Color blueCard = colors[0];

    private final Color greenCard = colors[1];

    private final Color blackCard = colors[2];

    private final Color pinkCard = colors[3];

    private final Color redCard = colors[4];

    private final Color orangeCard = colors[5];

    //Set taxi card to all available colors
    private final Color taxiCard = colors[6];

    public String[][] cards = {
            {"Color.BLUE", "0"}, {"Color.GREEN", "0"}, {"Color.BLACK", "0"},
            {"Color.PINK", "0"}, {"Color.RED", "0"},
            {"Color.ORANGE", "0"}, {"Color.WHITE", "0"}
    };

    //Array of card image paths
    public static final String[] CARDIMAGEPATHS = {BLUECARD, GREENCARD, BLACKCARD, PINKCARD, REDCARD, ORANGECARD, TAXICARD};

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

    public Color getCardColor() {
        return cardColor;
    }
}