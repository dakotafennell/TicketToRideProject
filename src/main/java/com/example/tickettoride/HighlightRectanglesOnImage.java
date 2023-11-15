package com.example.tickettoride;


import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import javafx.scene.effect.ColorAdjust;

import java.io.File;

public class HighlightRectanglesOnImage extends Application
{
    public static final double WIDTH = 50;
    public static final double HEIGHT = 15;

    //Route rectangles
    //Lincoln Center to Times Square Green route 0
    Rectangle LCtoTSGreen0 = new Rectangle(30, 20, WIDTH, HEIGHT);
    //Lincoln Center to Times Square Green route 1
    Rectangle LCtoTSGreen1 = new Rectangle(50, 40, WIDTH, HEIGHT);
    //Lincoln Center to Times Square Blue route 0
    Rectangle LCtoTSBlue0 = new Rectangle(150, 89, WIDTH, HEIGHT);
    //Lincoln Center to Times Square Blue route 1
    Rectangle LCtoTSBlue1 = new Rectangle(180, 147, WIDTH, HEIGHT);
    //Lincoln Center to Midtown West Red route 0
    //Rectangle LCtoMW0 = new Rectangle(104, 90, WIDTH, HEIGHT);
    //Lincoln Center to Midtown West Red route 1
    Rectangle LCtoMW = new Rectangle(104, 140, 100, 15);
    //Lincoln Center to Central Park Orange route 0
    Rectangle LCtoCP0 = new Rectangle(165, 40, WIDTH, HEIGHT);
    //Lincoln Center to Central Park Orange route 1
    Rectangle LCtoCP1 = new Rectangle(230, 40, WIDTH, HEIGHT);

    //Rectangle Variables
    Rectangle CPtoTSBlack0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CPtoTSBlack1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CPtoTSRed0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CPtoTSRed1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CPtoUN0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CPtoUN1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CPtoUN2 = new Rectangle(WIDTH, HEIGHT);
    Rectangle MWtoC0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle MWtoC1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle MWtoESB0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle MWtoESB1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle MWtoTS = new Rectangle(WIDTH, HEIGHT);
    Rectangle TStoESBOrange = new Rectangle(WIDTH, HEIGHT);
    Rectangle TStoESBPink = new Rectangle(WIDTH, HEIGHT);
    Rectangle TStoUN0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle TStoUN1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle UNtoESB = new Rectangle(WIDTH, HEIGHT);
    Rectangle UNtoGP0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle UNtoGP1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle UNtoGP2 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoS0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoS1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoS2 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoS3 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoGVGreen0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoGVGreen1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoGVGreen2 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoGVRed0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoGVRed1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoGVRed2 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoGP0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoGP1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoESBGreyFirst0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoESBGreyFirst1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoESBGreySecond0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoESBGreySecond1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle ESBtoGPRed = new Rectangle(WIDTH, HEIGHT);
    Rectangle ESBtoGPBlue = new Rectangle(WIDTH, HEIGHT);
    Rectangle GPtoGVBlack0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GPtoGVBlack1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GPtoGVPink0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GPtoGVPink1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GPtoEV0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GPtoEV1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GVtoS0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GVtoS1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GVtoCGreyFirst0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GVtoCGreyFirst1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GVtoCGreySecond0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GVtoCGreySecond1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GVtoLES0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GVtoLES1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GVtoEV0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle GVtoEV1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle EVtoLES = new Rectangle(WIDTH, HEIGHT);
    Rectangle LEStoC = new Rectangle(WIDTH, HEIGHT);
    Rectangle LEStoB0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle LEStoB1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle LEStoB2 = new Rectangle(WIDTH, HEIGHT);
    Rectangle StoWS0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle StoWS1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle WStoCGreen = new Rectangle(WIDTH, HEIGHT);
    Rectangle WStoCPink = new Rectangle(WIDTH, HEIGHT);
    Rectangle WStoBBlue0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle WStoBBlue1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle WStoBBlue2 = new Rectangle(WIDTH, HEIGHT);
    Rectangle WStoBBlack0 = new Rectangle(900, 880, WIDTH, HEIGHT);
    Rectangle WStoBBlack1 = new Rectangle(920, 900, WIDTH, HEIGHT);
    Rectangle WStoBBlack2 = new Rectangle(940, 920, WIDTH, HEIGHT);
    Rectangle[] WallStreetToBrooklynBlack = {WStoBBlack0, WStoBBlack1, WStoBBlack2};
    Rectangle CtoBRed0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoBRed1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoBRed2 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoBOrange0 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoBOrange1 = new Rectangle(WIDTH, HEIGHT);
    Rectangle CtoBOrange2 = new Rectangle(WIDTH, HEIGHT);
    //Rectangle Variables

    Rectangle[] LincolnCenterRoutes = {LCtoTSGreen0, LCtoTSGreen1, LCtoTSBlue0, LCtoTSBlue1,
            LCtoCP0, LCtoCP1};
    //Lincoln Center to Times Square Green route
    Rectangle[] LCtoTSG = {LCtoTSGreen0, LCtoTSGreen1};
    //Lincoln Center to Times Square Blue route
    Rectangle[] LCtoTSB = {LCtoTSBlue0, LCtoTSBlue1};


    //Lincoln Center to Central Park Orange route
    Rectangle[] LCtoCP = {LCtoCP0, LCtoCP1};
    /*
    Midtown West to Times Square Taxi route
    Midtown West to Empire State Building Green route
    Midtown West to Chelsea Blue route
     */
    //Midtown West to Times Square
    Rectangle MWtoTS0 = new Rectangle(200, 140, WIDTH, HEIGHT);
    //Midtown West to Chelsea
    //Times Square to Empire State Building

    Rectangle[] MidtownWestRoutes = {MWtoTS0, MWtoC0, MWtoESB0};

    Rectangle TStoESB0 = new Rectangle(WIDTH, HEIGHT);
    //United Nations to Empire State Building
    Rectangle UNtoESB0 = new Rectangle(WIDTH, HEIGHT);

    Rectangle[] allRoutes =
    {
            LCtoCP0, LCtoCP1, LCtoMW, LCtoTSGreen0, LCtoTSGreen1, LCtoTSBlue0, LCtoTSBlue1,
            CPtoTSBlack0, CPtoTSBlack1, CPtoTSRed0, CPtoTSRed1, CPtoUN0, CPtoUN1, CPtoUN2, MWtoC0, MWtoC1, MWtoESB0,
            MWtoESB1, MWtoTS0, TStoESBOrange, TStoESBPink, TStoUN0, TStoUN1, UNtoESB, UNtoGP0, UNtoGP1, UNtoGP2, CtoS0,
            CtoS1, CtoS2, CtoS3, CtoGVGreen0, CtoGVGreen1, CtoGVGreen2, CtoGVRed0, CtoGVRed1, CtoGVRed2, CtoGP0, CtoGP1,
            CtoESBGreyFirst0, CtoESBGreyFirst1, CtoESBGreySecond0, CtoESBGreySecond1, ESBtoGPRed, ESBtoGPBlue,
            GPtoGVBlack0, GPtoGVBlack1, GPtoGVPink0, GPtoGVPink1, GPtoEV0, GPtoEV1, GVtoS0, GVtoS1, GVtoCGreyFirst0,
            GVtoCGreyFirst1, GVtoCGreySecond0, GVtoCGreySecond1, GVtoLES0, GVtoLES1, GVtoEV0, GVtoEV1, EVtoLES, LEStoC,
            LEStoB0, LEStoB1, LEStoB2, StoWS0, StoWS1, WStoCGreen, WStoCPink, WStoBBlue0, WStoBBlue1, WStoBBlue2,
            WStoBBlack0, WStoBBlack1, WStoBBlack2, CtoBRed0, CtoBRed1, CtoBRed2, CtoBOrange0, CtoBOrange1, CtoBOrange2
    };

    @Override
    public void start(Stage primaryStage)
    {
        try
        {
            // Load the image from a file
            File imageFile = new File("src/main/resources/com/example/tickettoride/Game_Map_v2.PNG");
            String imageUrl = imageFile.toURI().toURL().toString();
            Board board = new Board();

            //Load the image
            ImageView ticketToRideImage = board.getTicketToRideImage();

            // Create an overlay pane
            Pane overlayPane = new Pane();

            Glow glow = new Glow(2);

            //Sets all rectangles in the array to fill yellow
            for (Rectangle rectangle : LincolnCenterRoutes)
            {
                //Sets the rectangle fill to yellow
                rectangle.setFill(Color.YELLOW);

                //rectangle.rotateProperty().set(63);
                rectangle.setEffect(glow);
            }

            //Sets the rectangle fill to yellow
            LCtoMW.setFill(Color.YELLOW);
            LCtoMW.rotateProperty().set(90);
            LCtoMW.setEffect(glow);

            for (Rectangle rectangle : LCtoCP)
            {
                //Sets the rectangle fill to yellow
                rectangle.setFill(Color.YELLOW);
                rectangle.rotateProperty().set(1);
                rectangle.setEffect(glow);
            }

            for (Rectangle rectangle : LCtoTSG)
            {
                //Sets the rectangle fill to yellow
                rectangle.setFill(Color.YELLOW);
                rectangle.rotateProperty().set(63);
                rectangle.setEffect(glow);
            }

            for (Rectangle rectangle : LCtoTSB)
            {
                //Sets the rectangle fill to yellow
                rectangle.setFill(Color.YELLOW);
                rectangle.rotateProperty().set(63);
                rectangle.setEffect(glow);
            }

            for (Rectangle rectangle : MidtownWestRoutes)
            {
                //Sets the rectangle fill to yellow
                rectangle.setFill(Color.YELLOW);
                rectangle.rotateProperty().set(15);
                rectangle.setEffect(glow);
            }

            for (Rectangle rectangle : WallStreetToBrooklynBlack)
            {
                //Sets the rectangle fill to yellow
                rectangle.setFill(Color.YELLOW);
                rectangle.rotateProperty().set(15);
                rectangle.setEffect(glow);
            }

            for (Rectangle rectangle : allRoutes)
            {
                //Sets the rectangle fill to yellow
                rectangle.setFill(Color.YELLOW);
                //rectangle.rotateProperty().set(15);
                rectangle.setEffect(glow);
            }

            //LCtoTSG

            LCtoTSGreen0.setTranslateX(100);
            LCtoTSGreen0.setTranslateY(80);

            //LCtoTS1.setFill(null);
            LCtoTSGreen1.setTranslateX(110);
            LCtoTSGreen1.setTranslateY(120);

            //Animation testing for rectangle
            //Set initial brightness
            ColorAdjust colorAdjust = new ColorAdjust();
            colorAdjust.setBrightness(0);

            //Applies the ColorAdjust effect to the rectangle array
            for (Rectangle rectangle : LCtoTSG)
            {
                rectangle.setEffect(colorAdjust);
            }

            // Create a Timeline for the animation
            Timeline timeline = new Timeline();
            Timeline timeline1 = new Timeline();

            for (int i = 0; i < allRoutes.length; i++)
            {
                final int index = i;
                // Create keyframes to change visibility over time
                KeyFrame startFrame = new KeyFrame(Duration.ZERO, e -> allRoutes[index].setVisible(true));
                KeyFrame endFrame = new KeyFrame(Duration.seconds(2), e -> allRoutes[index].setVisible(false));

                // Create a timeline and add keyframes
                timeline1 = new Timeline(startFrame, endFrame);
            }

            timeline1.setCycleCount(Animation.INDEFINITE); // Repeat indefinitely
            timeline1.setAutoReverse(true);

            //timeline1.play();

            //Deeper testing for animation
            // Add keyframes for smoothly increasing and decreasing brightness and opacity for each rectangle
            routeAnimationKeyFrames(colorAdjust, timeline);

            //if else for displaying the rectangles based on the cards the player has

            //Add the rectangles to the overlay pane
            //overlayPane.getChildren().addAll(LCtoCP0);
            overlayPane.getChildren().addAll(allRoutes);

            // Stack the image view and overlay pane
            StackPane stackPane = new StackPane(ticketToRideImage, overlayPane);

            // Create a scene
            Scene scene = new Scene(stackPane);
            //sets width and height of the scene
            scene.widthProperty().addListener((observable, oldValue, newValue) ->
            {
                ticketToRideImage.setFitWidth((double) newValue);
            });
            //sets width and height of the scene
            scene.heightProperty().addListener((observable, oldValue, newValue) ->
            {
                ticketToRideImage.setFitHeight((double) newValue);
            });
            //preserves the ratio of the image
            ticketToRideImage.setPreserveRatio(true);

            //Disable resizing of the window
            primaryStage.setResizable(false);

            // Set the scene and show the stage
            primaryStage.setScene(scene);
            primaryStage.setTitle("Ticket To Ride: New York");
            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Could not load image");
        }
    }

    private void routeAnimationKeyFrames(ColorAdjust colorAdjust, Timeline timeline)
    {
        for (int i = 0; i < allRoutes.length; i++)
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
                    new KeyValue(allRoutes[index].fillProperty(), Color.rgb(255, 255, 0, 1.0)) // Set alpha to 1.0
            );

            KeyFrame decreaseOpacity = new KeyFrame(
                    Duration.seconds(2),
                    new KeyValue(allRoutes[index].fillProperty(), Color.rgb(255, 255, 0, 0)) // Set alpha to 0.1
            );

            KeyFrame setTransparent = new KeyFrame(
                    Duration.seconds(2),
                    new KeyValue(allRoutes[index].fillProperty(), Color.TRANSPARENT)
            );

            //Create keyframes with interpolator to smoothly pulse between visible and invisible
            KeyFrame startFrame = new KeyFrame(Duration.ZERO, new KeyValue(
                    allRoutes[index].opacityProperty(), 1.0, Interpolator.EASE_BOTH));
            KeyFrame endFrame = new KeyFrame(Duration.seconds(2), new KeyValue(
                    allRoutes[index].opacityProperty(), 0.0, Interpolator.EASE_BOTH));

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

    public static void main(String[] args)
    {
        launch(args);
    }
}
