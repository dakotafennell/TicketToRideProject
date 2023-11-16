package com.example.tickettoride;
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;

public class HighlightTest extends Application {
    public static final double HEIGHT = 15;
    public static final double WIDTH = 50;
    public static final double WIDTH2 = 100;
    public static final double WIDTH3 = 150;
    public static final double WIDTH4 = 200;
    public static final Color COLOR = Color.YELLOW;
    //Rectangle for 1 block long routes
    Rectangle oneBlockRoute = new Rectangle(WIDTH, HEIGHT);
    //Rectangle for 2 block long routes
    Rectangle twoBlockRoute = new Rectangle(WIDTH2, HEIGHT);

    //Rectangle for 3 block long routes
    Rectangle threeBlockRoute = new Rectangle(WIDTH3, HEIGHT);

    //Rectangle for 4 block long routes
    Rectangle fourBlockRoute = new Rectangle(WIDTH4, HEIGHT);
    int oneWideRoutes = 9;
    int twoWideRoutes = 22;
    int threeWideRoutes = 9;
    int fourWideRoutes = 1;

    //One block routes
    Rectangle MidtownWestToTimesSquare = new Rectangle(200, 140, WIDTH, HEIGHT);
    Rectangle TimesSquareToEmpireStateBuildingOrange = new Rectangle(200, 140, WIDTH, HEIGHT);
    Rectangle TimesSquareToEmpireStateBuildingPink = new Rectangle(200, 140, WIDTH, HEIGHT);
    Rectangle EmpireStateBuildingToGramercyParkRed = new Rectangle(200, 140, WIDTH, HEIGHT);
    Rectangle EmpireStateBuildingToGramercyParkBlue = new Rectangle(200, 140, WIDTH, HEIGHT);
    Rectangle EastVillageToLowerEastSide = new Rectangle(200, 140, WIDTH, HEIGHT);
    Rectangle ChinatownToLowerEastSide = new Rectangle(200, 140, WIDTH, HEIGHT);
    Rectangle ChinatownToWallStreetGreen = new Rectangle(200, 140, WIDTH, HEIGHT);
    Rectangle ChinatownToWallStreetPink = new Rectangle(200, 140, WIDTH, HEIGHT);

    //All one block routes
    Rectangle[] oneBlockRoutes = {MidtownWestToTimesSquare, TimesSquareToEmpireStateBuildingOrange,
            TimesSquareToEmpireStateBuildingPink, EmpireStateBuildingToGramercyParkRed,
            EmpireStateBuildingToGramercyParkBlue, EastVillageToLowerEastSide, ChinatownToLowerEastSide,
            ChinatownToWallStreetGreen, ChinatownToWallStreetPink};

    //Two block routes
    Rectangle LincolnCenterToMidtownWest = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle LincolnCenterToTimesSquareGreen = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle LincolnCenterToTimesSquareBlue = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle LincolnCenterToCentralPark = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle CentralParkToTimesSquareBlack = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle CentralParkToTimesSquareRed = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle TimesSquareToUnitedNations = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle MidtownWestToChelsea = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle MidtownWestToEmpireStateBuilding = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle EmpireStateBuildingToUnitedNations = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle ChelseaToEmpireStateBuildingGrey0 = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle ChelseaToEmpireStateBuildingGrey1 = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle ChelseaToGramercyPark = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle GramercyParkToGreenwichVillageBlack = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle GramercyParkToGreenwichVillagePink = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle GramercyParkToEastVillage = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle GreenwichVillageToEastVillage = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle GreenwichVillageToSoho = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle GreenwichVillageToChinatownGrey0 = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle GreenwichVillageToChinatownGrey1 = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle GreenwichVillageToLowerEastSide = new Rectangle(200, 140, WIDTH2, HEIGHT);
    Rectangle SohoToWallStreet = new Rectangle(200, 140, WIDTH2, HEIGHT);

    //All two block routes
    Rectangle[] twoBlockRoutes = {LincolnCenterToMidtownWest, LincolnCenterToTimesSquareGreen,
            LincolnCenterToTimesSquareBlue, LincolnCenterToCentralPark, CentralParkToTimesSquareBlack,
            CentralParkToTimesSquareRed, TimesSquareToUnitedNations, MidtownWestToChelsea,
            MidtownWestToEmpireStateBuilding, EmpireStateBuildingToUnitedNations,
            ChelseaToEmpireStateBuildingGrey0, ChelseaToEmpireStateBuildingGrey1, ChelseaToGramercyPark,
            GramercyParkToGreenwichVillageBlack, GramercyParkToGreenwichVillagePink, GramercyParkToEastVillage,
            GreenwichVillageToEastVillage, GreenwichVillageToSoho, GreenwichVillageToChinatownGrey0,
            GreenwichVillageToChinatownGrey1, GreenwichVillageToLowerEastSide, SohoToWallStreet};

    //Three block routes
    Rectangle CentralParkToUnitedNations = new Rectangle(200, 140, WIDTH3, HEIGHT);
    Rectangle UnitedNationsToGramercyPark = new Rectangle(200, 140, WIDTH3, HEIGHT);
    Rectangle ChelseaToGreenwichVillageGreen = new Rectangle(200, 140, WIDTH3, HEIGHT);
    Rectangle ChelseaToGreenwichVillageRed = new Rectangle(200, 140, WIDTH3, HEIGHT);
    Rectangle LowerEastSideToBrooklyn = new Rectangle(200, 140, WIDTH3, HEIGHT);
    Rectangle ChinatownToBrooklynRed = new Rectangle(200, 140, WIDTH3, HEIGHT);
    Rectangle ChinatownToBrooklynOrange = new Rectangle(200, 140, WIDTH3, HEIGHT);
    Rectangle WallStreetToBrooklynBlue = new Rectangle(325, 720, WIDTH3, HEIGHT);
    Rectangle WallStreetToBrooklynBlack = new Rectangle(320, 735, WIDTH3, HEIGHT);

    //All three block routes
    Rectangle[] threeBlockRoutes = {CentralParkToUnitedNations, UnitedNationsToGramercyPark,
            ChelseaToGreenwichVillageGreen, ChelseaToGreenwichVillageRed, LowerEastSideToBrooklyn,
            ChinatownToBrooklynRed, ChinatownToBrooklynOrange, WallStreetToBrooklynBlue, WallStreetToBrooklynBlack};

    //Four block routes
    Rectangle ChelseaToSoho = new Rectangle(83, 470, WIDTH4, HEIGHT);

    //All four block routes
    Rectangle[] fourBlockRoutes = {ChelseaToSoho};

    double x = 0;
    double y = 0;

    //Adds the four rectangle sizes to a rectangle array
    Rectangle[] rectangleArray = {oneBlockRoute, twoBlockRoute, threeBlockRoute, fourBlockRoute};

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the image from a file
            File imageFile = new File("src/main/resources/com/example/tickettoride/Game_Map_v2.PNG");
            String imageUrl = imageFile.toURI().toURL().toString();
            Board board = new Board();

            // Load the image
            ImageView ticketToRideImage = board.getTicketToRideImage();

            // Create an overlay pane
            Pane overlayPane = new Pane();

            double[][] routePositions = {{83, 470}, {325, 720}, {210, 653}, {300, 653}};
            double[] routeRotations = {70, 7, 61, 110, 90, 60, 0, 1};

            Glow glow = new Glow(2);
            //Set initial brightness
            ColorAdjust colorAdjust = new ColorAdjust();
            colorAdjust.setBrightness(0);

            //Sets all rectangles in the array to fill yellow
            setRectangleFillAndEffects(rectangleArray, glow, colorAdjust);

            setRectangleFillAndEffects(threeBlockRoutes, glow, colorAdjust);

            setRectangleFillAndEffects(twoBlockRoutes, glow, colorAdjust);

            setRectangleFillAndEffects(oneBlockRoutes, glow, colorAdjust);

            setRectangleFillAndEffects(fourBlockRoutes, glow, colorAdjust);

            //Sets the position of the 4 wide route
            fourBlockRoute.setX(83);
            fourBlockRoute.setY(470);
            fourBlockRoute.setFill(Color.YELLOW);
            //fourBlockRoute.setEffect(glow);

            //Rotation positioning for each route
            //One block route rotations
            MidtownWestToTimesSquare.setRotate(11);
            TimesSquareToEmpireStateBuildingOrange.setRotate(55);
            TimesSquareToEmpireStateBuildingPink.setRotate(55);
            EmpireStateBuildingToGramercyParkRed.setRotate(55);
            EmpireStateBuildingToGramercyParkBlue.setRotate(55);
            EastVillageToLowerEastSide.setRotate(82);
            ChinatownToLowerEastSide.setRotate(33);
            ChinatownToWallStreetGreen.setRotate(110);
            ChinatownToWallStreetPink.setRotate(110);

            //Two block route rotations
            LincolnCenterToMidtownWest.setRotate(90);
            LincolnCenterToTimesSquareGreen.setRotate(62);
            LincolnCenterToTimesSquareBlue.setRotate(62);
            LincolnCenterToCentralPark.setRotate(2);
            CentralParkToTimesSquareBlack.setRotate(-70);
            CentralParkToTimesSquareRed.setRotate(-70);
            TimesSquareToUnitedNations.setRotate(2);
            MidtownWestToChelsea.setRotate(75);
            MidtownWestToEmpireStateBuilding.setRotate(26);
            EmpireStateBuildingToUnitedNations.setRotate(32);
            ChelseaToEmpireStateBuildingGrey0.setRotate(36);
            ChelseaToEmpireStateBuildingGrey1.setRotate(36);
            ChelseaToGramercyPark.setRotate(4);
            GramercyParkToGreenwichVillageBlack.setRotate(78);
            GramercyParkToGreenwichVillagePink.setRotate(78);
            GramercyParkToEastVillage.setRotate(51);
            GreenwichVillageToEastVillage.setRotate(0);
            GreenwichVillageToSoho.setRotate(58);
            GreenwichVillageToChinatownGrey0.setRotate(76);
            GreenwichVillageToChinatownGrey1.setRotate(76);
            GreenwichVillageToLowerEastSide.setRotate(38);
            SohoToWallStreet.setRotate(61);

            //Three block route rotations
            CentralParkToUnitedNations.setRotate(46);
            UnitedNationsToGramercyPark.setRotate(60);
            ChelseaToGreenwichVillageGreen.setRotate(43);
            ChelseaToGreenwichVillageRed.setRotate(43);
            LowerEastSideToBrooklyn.setRotate(66);
            ChinatownToBrooklynRed.setRotate(38);
            ChinatownToBrooklynOrange.setRotate(38);
            WallStreetToBrooklynBlue.setRotate(7);
            WallStreetToBrooklynBlack.setRotate(7);

            //Four block route rotations
            ChelseaToSoho.setRotate(70);

            //Sets the position of the 4 wide route
            fourBlockRoute.setX(83);
            fourBlockRoute.setY(470);
            //Sets the rotation of the 4 wide route
            fourBlockRoute.setRotate(70);

            // Sets the position of the 3 wide route
            threeBlockRoute.setX(325);
            threeBlockRoute.setY(720);
            //Sets the rotation of the 3 wide route
            threeBlockRoute.setRotate(7);

            //Sets the position of the 2 wide route
            twoBlockRoute.setX(210);
            twoBlockRoute.setY(653);
            //Sets the rotation of the 2 wide route
            twoBlockRoute.setRotate(61);

            //Sets the position of the 1 wide route
            oneBlockRoute.setX(300);
            oneBlockRoute.setY(653);
            //Sets the rotation of the 1 wide route
            oneBlockRoute.setRotate(110);

            //Creates a Timeline for the animation
            Timeline timeline = new Timeline();

            //Adds keyframes for smoothly increasing and decreasing brightness and opacity for each rectangle
            routeAnimationKeyFrames(colorAdjust, timeline);

            // Sets all rectangles in the array to fill yellow and apply glow effect
            overlayPane.getChildren().addAll(oneBlockRoute, twoBlockRoute, threeBlockRoute, fourBlockRoute);

            // Create a scene
            Scene scene = new Scene(new StackPane(ticketToRideImage, overlayPane));

            initializeClickableRectangles(rectangleArray);

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

    private void setRectangleFillAndEffects(Rectangle[] twoBlockRoutes, Glow glow, ColorAdjust colorAdjust) {
        for (Rectangle rectangle : twoBlockRoutes) {
            //Sets the rectangle fill to yellow
            rectangle.setFill(Color.YELLOW);
            rectangle.setEffect(glow);
            rectangle.setEffect(colorAdjust);
        }
    }

    private void routeAnimationKeyFrames(ColorAdjust colorAdjust, Timeline timeline)
    {
        for (int i = 0; i < rectangleArray.length; i++)
        {
            final int index = i;

            // Brightness Animation
            KeyFrame increaseBrightness = new KeyFrame(
                    Duration.seconds(2),
                    new KeyValue(colorAdjust.brightnessProperty(), 0.5)
            );

            KeyFrame decreaseBrightness = new KeyFrame(
                    Duration.seconds(2),
                    new KeyValue(colorAdjust.brightnessProperty(), -0.5)
            );

            // Opacity Animation
            KeyFrame increaseOpacity = new KeyFrame(
                    Duration.seconds(2),
                    new KeyValue(rectangleArray[index].fillProperty(), Color.rgb(255, 255, 0, 1.0)) // Set alpha to 1.0
            );

            KeyFrame decreaseOpacity = new KeyFrame(
                    Duration.seconds(2),
                    new KeyValue(rectangleArray[index].fillProperty(), Color.rgb(255, 255, 0, 0)) // Set alpha to 0.1
            );

            KeyFrame setTransparent = new KeyFrame(
                    Duration.seconds(2),
                    new KeyValue(rectangleArray[index].fillProperty(), Color.TRANSPARENT)
            );

            //Create keyframes with interpolator to smoothly pulse between visible and invisible
            KeyFrame startFrame = new KeyFrame(Duration.ZERO, new KeyValue(
                    rectangleArray[index].opacityProperty(), 1.0, Interpolator.EASE_BOTH));
            KeyFrame endFrame = new KeyFrame(Duration.seconds(2), new KeyValue(
                    rectangleArray[index].opacityProperty(), 0.0, Interpolator.EASE_BOTH));

            //Add the keyframes to the timeline
            timeline.getKeyFrames().addAll(increaseBrightness, decreaseBrightness, increaseOpacity,
                    setTransparent, startFrame, endFrame);
        }

        timeline.setAutoReverse(true);
        // Set the timeline to repeat indefinitely
        timeline.setCycleCount(Animation.INDEFINITE);

        // Play the timeline
        timeline.play();
    }

    private void initializeClickableRectangles(Rectangle[] rectangles)
    {
        for (Rectangle rectangle : rectangles)
        {
            rectangle.setOnMouseClicked(event ->
            {
                //Handle click event for the rectangle
                System.out.println("Clicked on a rectangle");
                System.out.println("Rectangle X: " + rectangle.getX());
                System.out.println("Rectangle Y: " + rectangle.getY());
                System.out.println("Rectangle Width: " + rectangle.getRotate());
                //prints out the color of the rectangle
                System.out.println("Rectangle Color: " + rectangle.getFill());
                //Sets the rectangle fill to white when that rectangle is clicked
                rectangle.setFill(Color.WHITE);
            });
        }
    }
}