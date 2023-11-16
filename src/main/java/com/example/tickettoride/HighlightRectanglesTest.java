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

public class HighlightRectanglesTest extends Application
{
    //Rectangle height
    public static final double HEIGHT = 15;
    //Rectangle width for 1 block routes
    public static final double WIDTH = 50;

    //Rectangle width for 2 block routes
    public static final double WIDTH2 = 100;
    //Rectangle width for 3 block routes
    public static final double WIDTH3 = 150;
    //Rectangle width for 4 block routes
    public static final double WIDTH4 = 200;


    //Position information for the rectangle
    double x = 0;
    double y = 0;


    //Number of 2 wide routes
    int twoWideRoutes = 22;
    //Number of 3 wide routes
    int threeWideRoutes = 9;
    //Number of 4 wide routes
    int fourWideRoutes = 1;
    //Rectangle for 1 block long routes
    Rectangle oneBlockRoute = new Rectangle(WIDTH, HEIGHT);
    //Rectangle for 2 block long routes
    Rectangle twoBlockRoute = new Rectangle(WIDTH2, HEIGHT);

    //Rectangle for 3 block long routes
    Rectangle threeBlockRoute = new Rectangle(WIDTH3, HEIGHT);

    //Rectangle for 4 block long routes
    Rectangle fourBlockRoute = new Rectangle(WIDTH4, HEIGHT);

    //Adds the four rectangle sizes to a rectangle array
    Rectangle[] rectangleArray = {oneBlockRoute, twoBlockRoute, threeBlockRoute, fourBlockRoute};

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
            //Set initial brightness
            ColorAdjust colorAdjust = new ColorAdjust();
            colorAdjust.setBrightness(0);

            //Sets the position of the 4 wide route
            fourBlockRoute.setX(83);
            fourBlockRoute.setY(470);
            //Sets the rotation of the 4 wide route
            fourBlockRoute.setRotate(70);

            // Sets the position of the 3 wide route
            threeBlockRoute.setX(320);
            threeBlockRoute.setY(740);
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

            //Sets all rectangles in the array to fill yellow
            for (Rectangle rectangle : rectangleArray)
            {
                //Sets the rectangle fill to yellow
                rectangle.setFill(Color.YELLOW);
                rectangle.setEffect(glow);
            }

            //Animation testing for rectangle

            //Applies the ColorAdjust effect to the rectangle array
            for (Rectangle rectangle : rectangleArray)
            {
                rectangle.setEffect(colorAdjust);
            }

            // Create a Timeline for the animation
            Timeline timeline = new Timeline();

            //Deeper testing for animation
            // Add keyframes for smoothly increasing and decreasing brightness and opacity for each rectangle
            routeAnimationKeyFrames(colorAdjust, timeline);

            //if else for displaying the rectangles based on the cards the player has

            //Add the rectangles to the overlay pane
            overlayPane.getChildren().addAll(oneBlockRoute, twoBlockRoute, threeBlockRoute, fourBlockRoute);
            //overlayPane.getChildren().addAll(allRoutes);

            // Stack the image view and overlay pane
            StackPane stackPane = new StackPane(ticketToRideImage, overlayPane);

            // Create a scene
            Scene scene = new Scene(stackPane);

            //preserves the ratio of the image
            ticketToRideImage.setPreserveRatio(true);

            //Disable resizing of the window
            primaryStage.setResizable(false);

            initializeClickableRectangles(rectangleArray);

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

    public static void main(String[] args)
    {
        launch(args);
    }
}
