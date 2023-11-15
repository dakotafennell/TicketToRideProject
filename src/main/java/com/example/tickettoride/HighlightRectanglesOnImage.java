package com.example.tickettoride;


import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import javafx.geometry.Rectangle2D;
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
    Rectangle LCtoTS0 = new Rectangle(30, 20, WIDTH, HEIGHT);
    //Lincoln Center to Times Square Green route 1
    Rectangle LCtoTS1 = new Rectangle(50, 40, WIDTH, HEIGHT);
    //Lincoln Center to Times Square Blue route 0
    Rectangle LCtoTS2 = new Rectangle(150, 89, WIDTH, HEIGHT);
    //Lincoln Center to Times Square Blue route 1
    Rectangle LCtoTS3 = new Rectangle(180, 147, WIDTH, HEIGHT);
    //Lincoln Center to Midtown West Red route 0
    Rectangle LCtoMW0 = new Rectangle(90, 110, WIDTH, HEIGHT);
    //Lincoln Center to Midtown West Red route 1
    Rectangle LCtoMW1 = new Rectangle(90, 175, WIDTH, HEIGHT);
    //Lincoln Center to Central Park Orange route 0
    Rectangle LCtoCP0 = new Rectangle(165, 40, WIDTH, HEIGHT);
    //Lincoln Center to Central Park Orange route 1
    Rectangle LCtoCP1 = new Rectangle(230, 40, WIDTH, HEIGHT);

    Rectangle[] LincolnCenterRoutes = {LCtoTS0, LCtoTS1, LCtoTS2, LCtoTS3,
            LCtoMW0, LCtoMW1, LCtoCP0, LCtoCP1};
    //Lincoln Center to Times Square Green route
    Rectangle[] LCtoTSG = {LCtoTS0, LCtoTS1};
    //Lincoln Center to Times Square Blue route
    Rectangle[] LCtoTSB = {LCtoTS2, LCtoTS3};

    //Lincoln Center to Midtown West Red route
    Rectangle[] LCtoMW = {LCtoMW0, LCtoMW1};

    //Lincoln Center to Central Park Orange route
    Rectangle[] LCtoCP = {LCtoCP0, LCtoCP1};

    //Central Park to Times Square Black route
    Rectangle CPtoTS0 = new Rectangle(WIDTH, HEIGHT);
    //Central Park to Times Square Red route
    Rectangle CPtoTS1 = new Rectangle(WIDTH, HEIGHT);
    //Central Park to United Nations Pink route
    Rectangle CPtoUN = new Rectangle(WIDTH, HEIGHT);

    /*
    Midtown West to Times Square Taxi route
    Midtown West to Empire State Building Green route
    Midtown West to Chelsea Blue route
     */
    //Midtown West to Times Square
    Rectangle MWtoTS0 = new Rectangle(200, 140, WIDTH, HEIGHT);
    //Midtown West to Chelsea
    Rectangle MWtoC0 = new Rectangle(WIDTH, HEIGHT);
    //Midtown West to Empire State Building
    Rectangle MWtoESB0 = new Rectangle(WIDTH, HEIGHT);
    //Times Square to Empire State Building

    Rectangle[] MidtownWestRoutes = {MWtoTS0, MWtoC0, MWtoESB0};

    Rectangle TStoESB0 = new Rectangle(WIDTH, HEIGHT);
    //Times Square to United Nations
    Rectangle TStoUN0 = new Rectangle(WIDTH, HEIGHT);
    //United Nations to Empire State Building
    Rectangle UNtoESB0 = new Rectangle(WIDTH, HEIGHT);
    //United Nations to Gramercy Park
    Rectangle UNtoGP0 = new Rectangle(WIDTH, HEIGHT);


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
            //ImageView imageView = new ImageView(ticketToRideImage);

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

            for (Rectangle rectangle : LCtoMW)
            {
                //Sets the rectangle fill to yellow
                rectangle.setFill(Color.YELLOW);
                rectangle.rotateProperty().set(90);
                rectangle.setEffect(glow);
            }

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
            //LCtoTSG

            LCtoTS0.setTranslateX(100);
            LCtoTS0.setTranslateY(80);

            //LCtoTS1.setFill(null);
            LCtoTS1.setTranslateX(110);
            LCtoTS1.setTranslateY(120);

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

            for (int i = 0; i < LCtoTSG.length; i++)
            {
                final int index = i;
                // Create keyframes to change visibility over time
                KeyFrame startFrame = new KeyFrame(Duration.ZERO, e -> LCtoTSG[index].setVisible(true));
                KeyFrame endFrame = new KeyFrame(Duration.seconds(2), e -> LCtoTSG[index].setVisible(false));

                // Create a timeline and add keyframes
                timeline1 = new Timeline(startFrame, endFrame);

            }

            timeline1.setCycleCount(Animation.INDEFINITE); // Repeat indefinitely
            timeline1.setAutoReverse(true);

            //timeline1.play();

            //Deeper testing for animation
            // Add keyframes for smoothly increasing and decreasing brightness and opacity for each rectangle
            for (int i = 0; i < LincolnCenterRoutes.length; i++)
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
                        new KeyValue(LincolnCenterRoutes[index].fillProperty(), Color.rgb(255, 255, 0, 1.0)) // Set alpha to 1.0
                );

                KeyFrame decreaseOpacity = new KeyFrame(
                        Duration.seconds(2),
                        new KeyValue(LincolnCenterRoutes[index].fillProperty(), Color.rgb(255, 255, 0, 0)) // Set alpha to 0.1
                );

                KeyFrame setTransparent = new KeyFrame(
                        Duration.seconds(2),
                        new KeyValue(LincolnCenterRoutes[index].fillProperty(), Color.TRANSPARENT)
                );

                //Create keyframes with interpolator to smoothly pulse between visible and invisible
                KeyFrame startFrame = new KeyFrame(Duration.ZERO, new KeyValue(
                        LincolnCenterRoutes[index].opacityProperty(), 1.0, Interpolator.EASE_BOTH));
                KeyFrame endFrame = new KeyFrame(Duration.seconds(2), new KeyValue(
                        LincolnCenterRoutes[index].opacityProperty(), 0.0, Interpolator.EASE_BOTH));

                //Add the keyframes to the timeline
                timeline.getKeyFrames().addAll(increaseBrightness, decreaseBrightness, increaseOpacity,
                        setTransparent, startFrame, endFrame);
            }

            timeline.setAutoReverse(true);
            // Set the timeline to repeat indefinitely
            timeline.setCycleCount(Animation.INDEFINITE);

            // Play the timeline
            timeline.play();

            //if else for displaying the rectangles based on the cards the player has

            //Add the rectangles to the overlay pane
            //overlayPane.getChildren().addAll(LCtoCP0);
            overlayPane.getChildren().addAll(LincolnCenterRoutes);

            // Stack the image view and overlay pane
            StackPane stackPane = new StackPane(ticketToRideImage, overlayPane);

            // Create a scene
            Scene scene = new Scene(stackPane);

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

    public static void main(String[] args)
    {
        launch(args);
    }
}
