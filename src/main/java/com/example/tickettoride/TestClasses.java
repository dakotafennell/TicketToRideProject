package com.example.tickettoride;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;

//This class will contain each of the class testing "start" methods
public class TestClasses /*extends Application*/
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


    @Override
    public void start(Stage primaryStage) throws Exception
    {
        try {
            // Load the image from a file
            File imageFile = new File("src/main/resources/com/example/tickettoride/Game_Map_v2.PNG");
            String imageUrl = imageFile.toURI().toURL().toString();
            Board board = new Board();

            // Load the image
            ImageView ticketToRideImage = board.getTicketToRideImage();

            // Create an overlay pane
            Pane overlayPane = new Pane();

            Glow glow = new Glow(2);
            //Set initial brightness
            ColorAdjust colorAdjust = new ColorAdjust();
            colorAdjust.setBrightness(0);

            setRectangleFillAndEffects(threeBlockRoutes, glow, colorAdjust);

            setRectangleFillAndEffects(twoBlockRoutes, glow, colorAdjust);

            setRectangleFillAndEffects(oneBlockRoutes, glow, colorAdjust);

            setRectangleFillAndEffects(fourBlockRoutes, glow, colorAdjust);

            //Sets the effects for all rectangles
            setRectangleFillAndEffects(allRectangles, glow, colorAdjust);

            //Rotation positioning for each route
            //One block route rotations
            MidtownWestToTimesSquare.setRotate(-11);
            TimesSquareToEmpireStateBuildingOrange.setRotate(55);
            TimesSquareToEmpireStateBuildingPink.setRotate(55);
            EmpireStateBuildingToGramercyParkRed.setRotate(55);
            EmpireStateBuildingToGramercyParkBlue.setRotate(55);
            EastVillageToLowerEastSide.setRotate(97);
            ChinatownToLowerEastSide.setRotate(-33);
            ChinatownToWallStreetGreen.setRotate(110);
            ChinatownToWallStreetPink.setRotate(110);

            //Three block route rotations
            CentralParkToUnitedNations.setRotate(46);
            UnitedNationsToGramercyPark.setRotate(110);
            ChelseaToGreenwichVillageGreen.setRotate(43);
            ChelseaToGreenwichVillageRed.setRotate(43);
            LowerEastSideToBrooklyn.setRotate(66);
            ChinatownToBrooklynRed.setRotate(38);
            ChinatownToBrooklynOrange.setRotate(38);
            WallStreetToBrooklynBlue.setRotate(7);
            WallStreetToBrooklynBlack.setRotate(7);

            //Four block route rotations
            ChelseaToSoho.setRotate(70);

            //Two block route rotations
            LincolnCenterToMidtownWest.setRotate(90);
            LincolnCenterToTimesSquareGreen.setRotate(62);
            LincolnCenterToTimesSquareBlue.setRotate(62);
            LincolnCenterToCentralPark.setRotate(1);
            CentralParkToTimesSquareBlack.setRotate(-70);
            CentralParkToTimesSquareRed.setRotate(-70);
            TimesSquareToUnitedNations.setRotate(-2);
            MidtownWestToChelsea.setRotate(75);
            MidtownWestToEmpireStateBuilding.setRotate(26);
            EmpireStateBuildingToUnitedNations.setRotate(-32);
            ChelseaToEmpireStateBuildingGrey0.setRotate(-36);
            ChelseaToEmpireStateBuildingGrey1.setRotate(-36);
            ChelseaToGramercyPark.setRotate(-4);
            GramercyParkToGreenwichVillageBlack.setRotate(-78);
            GramercyParkToGreenwichVillagePink.setRotate(-78);
            GramercyParkToEastVillage.setRotate(51);
            GreenwichVillageToEastVillage.setRotate(0);
            GreenwichVillageToSoho.setRotate(-60);
            GreenwichVillageToChinatownGrey0.setRotate(75);
            GreenwichVillageToChinatownGrey1.setRotate(75);
            GreenwichVillageToLowerEastSide.setRotate(38);
            SohoToWallStreet.setRotate(61);

            //Creates a Timeline for the animation
            Timeline timeline = new Timeline();

            //Adds keyframes for smoothly increasing and decreasing brightness and opacity for each rectangle
            routeAnimationKeyFrames(colorAdjust, timeline);

            overlayPane.getChildren().addAll(oneBlockRoutes);
            overlayPane.getChildren().addAll(twoBlockRoutes);
            overlayPane.getChildren().addAll(threeBlockRoutes);
            overlayPane.getChildren().addAll(fourBlockRoutes);

            // Create a scene
            Scene scene = new Scene(new StackPane(ticketToRideImage, overlayPane));

            initializeClickableRectangles(allRectangles, timeline);

            // Set the scene and show the stage
            primaryStage.setScene(scene);
            primaryStage.setTitle("Ticket To Ride: New York");
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Could not load image");
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }

     */
}
