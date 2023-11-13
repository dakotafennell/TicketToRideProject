package com.example.tickettoride;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;

public class HighlightRectanglesOnImageTest extends Application
{
    public static final double WIDTH = 62.5;
    public static final double HEIGHT = 22;
    public static final Color HIGHLIGHT_COLOR = Color.YELLOW;
    public static final Duration ANIMATION_DURATION = Duration.seconds(2);
    public static double rotationAngle;

    private Rectangle[] initializeRouteRectangles(double[][] positions)
    {
        Rectangle[] routes = new Rectangle[positions.length];
        for (int i = 0; i < positions.length; i++)
        {
            routes[i] = new Rectangle(positions[i][0], positions[i][1], WIDTH, HEIGHT);
            routes[i].setFill(HIGHLIGHT_COLOR);
            routes[i].setEffect(new Glow(2));
        }
        return routes;
    }

    private void setupTimeline(Rectangle[] rectangles, ColorAdjust colorAdjust)
    {
        Timeline timeline = new Timeline();

        for (Rectangle rectangle : rectangles)
        {
            KeyFrame increaseBrightness = new KeyFrame(ANIMATION_DURATION, new KeyValue(colorAdjust.brightnessProperty(), 0.5));
            KeyFrame decreaseBrightness = new KeyFrame(ANIMATION_DURATION, new KeyValue(colorAdjust.brightnessProperty(), -0.5));
            KeyFrame increaseOpacity = new KeyFrame(ANIMATION_DURATION, new KeyValue(rectangle.fillProperty(), HIGHLIGHT_COLOR));
            KeyFrame decreaseOpacity = new KeyFrame(ANIMATION_DURATION, new KeyValue(rectangle.fillProperty(), Color.TRANSPARENT));
            KeyFrame setTransparent = new KeyFrame(ANIMATION_DURATION, new KeyValue(rectangle.fillProperty(), Color.TRANSPARENT));
            KeyFrame startFrame = new KeyFrame(Duration.ZERO, new KeyValue(rectangle.opacityProperty(), 1.0, Interpolator.EASE_BOTH));
            KeyFrame endFrame = new KeyFrame(ANIMATION_DURATION, new KeyValue(rectangle.opacityProperty(), 0.0, Interpolator.EASE_BOTH));

            timeline.getKeyFrames().addAll(increaseBrightness, decreaseBrightness, increaseOpacity, setTransparent, startFrame, endFrame);
        }

        timeline.setAutoReverse(true);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private void initializeClickableRectangles(Rectangle[] rectangles)
    {
        for (Rectangle rectangle : rectangles)
        {
            rectangle.setOnMouseClicked(event ->
            {
                // Handle click event for the rectangle
                System.out.println("Clicked on a rectangle");
            });
        }
    }

    @Override
    public void start(Stage primaryStage)
    {
        try
        {
            File imageFile = new File("src/main/resources/com/example/tickettoride/Game_Map_v2.PNG");
            String imageUrl = imageFile.toURI().toURL().toString();
            Image ticketToRideImage = new Image(imageUrl, 1200, 1000, true, false);
            ImageView imageView = new ImageView(ticketToRideImage);

            Pane overlayPane = new Pane();

            // Define route positions
            double[][] lcPositions = {{70, 20}, {90, 40}, {190, 89}, {220, 147}, {130, 110}, {130, 175}, {205, 40}, {270, 40}};
            double[][] lCtoGPositions = {{100, 80}, {110, 120}};
            double[][] lcTsbPositions = {{190, 89}, {220, 147}};
            double[][] mwPositions = {{200, 140}, {WIDTH, HEIGHT}, {WIDTH, HEIGHT}};

            rotationAngle = 63;


            // Initialize route rectangles
            Rectangle[] lincolnCenterRoutes = initializeRouteRectangles(lcPositions);
            Rectangle[] lcToTsg = initializeRouteRectangles(lCtoGPositions);
            Rectangle[] lcToTsb = initializeRouteRectangles(lcTsbPositions);
            Rectangle[] midtownWestRoutes = initializeRouteRectangles(mwPositions);

            // Initialize clickable rectangles
            initializeClickableRectangles(lincolnCenterRoutes);
            initializeClickableRectangles(lcToTsg);
            initializeClickableRectangles(lcToTsb);
            initializeClickableRectangles(midtownWestRoutes);

            // Set up timeline for animations
            ColorAdjust colorAdjust = new ColorAdjust();
            setupTimeline(lcToTsg, colorAdjust);
            setupTimeline(lincolnCenterRoutes, colorAdjust);

            // Add rectangles to overlay pane
            overlayPane.getChildren().addAll(lincolnCenterRoutes);

            // Stack the image view and overlay pane
            primaryStage.setScene(new Scene(new javafx.scene.layout.StackPane(imageView, overlayPane)));
            primaryStage.setResizable(false);
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
