package com.example.tickettoride;

import java.util.List;
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

/**
 * Destinations class
 * This class will contain logic for the destinations and/or the destination cards
 */
public class DestinationCard extends Application
{
    //Destination card logic
    public static final ImageView cardImageView = new ImageView();
    private final ImageView DestinationCardImageView = new ImageView();

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

    //array of card images
    public static final String[] CardImagePath = {
            CentralPark_Chelsea, CentralPark_Chinatown, CentralPark_Gramercy, CentralPark_Midtown,
            Chelsea_Brooklyn, Chelsea_WallStreet, EastVillage_Soho, EmpireState_Brooklyn,
            EmpireState_Greenwich, Gramercy_ChinaTown, LincolnCenter_EmpireState, LincolnCenter_Greenwich,
            LowerEastSide_WallStreet, TimesSquare_Brooklyn, TimesSquare_EastVillage, TimesSquare_Soho,
            UN_Midtown, UN_WallStreet, Back
    };

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

    public Image selectRandomCard()
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

    public static void main(String[] args)
    {
        launch(args);
    }

    public void removeCardFromDeck()
    {

    }
}
