package com.example.tickettoride;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.util.Pair;

import java.util.Objects;
import java.util.Random;

public class RandomImages
{
    //Destination card logic
    public static final ImageView cardImageView = new ImageView();
    private final ImageView DestinationCardImageView = new ImageView();
    private Color cardColor;

    //Card Images
    private static final String CentralPark_Chelsea = "/com/example/tickettoride/DestinationCards/CentralParkToChelsea.png";
    private static final String CentralPark_Chinatown = "/com/example/tickettoride/DestinationCards/CentralParkToChinatown.png";
    private static final String CentralPark_Gramercy = "/com/example/tickettoride/DestinationCards/CentralParkToGramercyPark.png";
    private static final String CentralPark_Midtown = "/com/example/tickettoride/DestinationCards/CentralParkToMidtownWest.png";
    private static final String Chelsea_Brooklyn = "/com/example/tickettoride/DestinationCards/ChelseaToBrooklyn.png";
    private static final String Chelsea_WallStreet = "/com/example/tickettoride/DestinationCards/ChelseaToWallStreet.png";
    private static final String EastVillage_Soho = "/com/example/tickettoride/DestinationCards/EastVillageToSoho.png";
    private static final String EmpireState_Brooklyn = "/com/example/tickettoride/DestinationCards/EmpireStateBuildingToBrooklyn.png";
    private static final String EmpireState_Greenwich = "/com/example/tickettoride/DestinationCards/EmpireStateBuildingToGreenwichVillage.png";
    private static final String Gramercy_ChinaTown = "/com/example/tickettoride/DestinationCards/GramercyParkToChinatown.png";
    private static final String LincolnCenter_EmpireState = "/com/example/tickettoride/DestinationCards/LincolnCenterToEmpireStateBuilding.png";
    private static final String LincolnCenter_Greenwich = "/com/example/tickettoride/DestinationCards/LincolnCenterToGreenwichVillage.png";
    private static final String LowerEastSide_WallStreet = "/com/example/tickettoride/DestinationCards/LowerEastSideToWallStreet.png";
    private static final String TimesSquare_Brooklyn = "/com/example/tickettoride/DestinationCards/TimesSquareToBrooklyn.png";
    private static final String TimesSquare_EastVillage = "/com/example/tickettoride/DestinationCards/TimesSquareToEastVillage.png";
    private static final String TimesSquare_Soho = "/com/example/tickettoride/DestinationCards/TimesSquareToSoho.png";
    private static final String UN_Midtown = "/com/example/tickettoride/DestinationCards/UnitedNationsToMidtownWest.png";
    private static final String UN_WallStreet = "/com/example/tickettoride/DestinationCards/UnitedNationsToWallStreet.png";
    private static final String Back = "/com/example/tickettoride/DestinationCards/BackOfTransportationCard.png";

    //Card images
    private static final String BLUECARD = "/com/example/tickettoride/TransportCards/BlueCard.png";
    private static final String GREENCARD = "/com/example/tickettoride/TransportCards/GreenCard.png";
    private static final String BLACKCARD = "/com/example/tickettoride/TransportCards/BlackCard.png";
    private static final String PINKCARD = "/com/example/tickettoride/TransportCards/PinkCard.png";
    private static final String REDCARD = "/com/example/tickettoride/TransportCards/RedCard.png";
    private static final String ORANGECARD = "/com/example/tickettoride/TransportCards/OrangeCard.png";
    private static final String TAXICARD = "/com/example/tickettoride/TransportCards/RainbowCard.png";

    private static final String BACK = "com/example/tickettoride/TransportCards/BackTransportationCard.png";

    //Array of card image paths
    public static final String[] CARDIMAGEPATHS = {BLUECARD, GREENCARD, BLACKCARD, PINKCARD, REDCARD, ORANGECARD, TAXICARD};

    public static final String[] TRANSPORTATIONCARDIMAGEPATHS = {BLUECARD, GREENCARD, BLACKCARD, PINKCARD, REDCARD, ORANGECARD, TAXICARD};

    //Colors for the cards
    public static final Color[] colors = {
            Color.BLUE, Color.GREEN, Color.BLACK, Color.PINK, Color.RED, Color.ORANGE, Color.WHITE
    };

    /*
    "#0000FF" = Color.BLUE
    "#008000" = Color.GREEN
    "#000000" = Color.BLACK
    "#FFC0CB" = Color.PINK
    "#FF0000" = Color.RED
    "#FFA500" = Color.ORANGE
    "#FFFFFF" = Color.WHITE
     */
    //Color hex codes
    public static final String[] colorHexCodes = {
            "#0000FF BLUE", "#008000 GREEN", "#000000 BLACK", "#FFC0CB PINK", "#FF0000 RED", "#FFA500 ORANGE", "#FFFFFF WHITE"
    };
    //array of card images
    public static final String[] CardImagePath = {
            CentralPark_Chelsea, CentralPark_Chinatown, CentralPark_Gramercy, CentralPark_Midtown,
            Chelsea_Brooklyn, Chelsea_WallStreet, EastVillage_Soho, EmpireState_Brooklyn,
            EmpireState_Greenwich, Gramercy_ChinaTown, LincolnCenter_EmpireState, LincolnCenter_Greenwich,
            LowerEastSide_WallStreet, TimesSquare_Brooklyn, TimesSquare_EastVillage, TimesSquare_Soho,
            UN_Midtown, UN_WallStreet
    };

    public Color color;

    public Image selectRandomDestinationCard()
    {
        Random random = new Random();
        // Get a random card index
        int cardIndex = random.nextInt(CardImagePath.length);
        // Get the selected card image path
        String selectedCardImagePath = CardImagePath[cardIndex];

        // Load the image using ClassLoader
        final int imageWidth = 1000;
        final int imageHeight = 800;

        Image selectedCardImage = new Image(getClass().getResource(selectedCardImagePath).toExternalForm(),
                imageWidth, imageHeight, true, false);

        // Set the selected card image to the cardImageView
        cardImageView.setImage(selectedCardImage);

        return selectedCardImage;
    }

    //Method to select a random card from the deck
    public Image selectRandomTransportationCard()
    {
        Random random = new Random();
        // Get a random card index
        //prints out the length of the card image paths
        System.out.println("The length of the card image paths is: " + CARDIMAGEPATHS.length);
        int cardIndex = random.nextInt(CARDIMAGEPATHS.length - 1);
        //prints out the index of the card
        System.out.println("The card index is: " + cardIndex);
        // Get the selected card image path
        String selectedCardImagePath = CARDIMAGEPATHS[cardIndex];
        //prints out the selected card image path
        System.out.println("The selected card image path is: " + selectedCardImagePath);

        //sets the card color to the color of the card image
        cardColor = colors[cardIndex];
        //prints out the index of the card color
        System.out.println("The card color index is: " + cardIndex);
        //Prints out the card color index hex code as a string
        System.out.println("The card color index hex code is: " + colorHexCodes[cardIndex]);
        //prints out the color of the card
        System.out.println("The card color is: " + cardColor);

        // Load the image using ClassLoader
        final int imageWidth = 1000;
        final int imageHeight = 800;

        try
        {
            Image selectedCardImage = new Image(Objects.requireNonNull(getClass().getResource(selectedCardImagePath)).toExternalForm(),
                    imageWidth, imageHeight, true, false);

            // Set the selected card image to the cardImageView
            cardImageView.setImage(selectedCardImage);
            //prints out the selected card image
            //System.out.println("The selected card image is: " + selectedCardImage);

            //Prints out the new pair
            System.out.println("The new pair is: " + new Pair<>(selectedCardImage, cardColor));

            return new Pair<>(selectedCardImage, cardColor).getKey();
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

    //returns the color of the card
    public Color selectRandomTransportationCardColor()
    {
        return cardColor;
    }

}
