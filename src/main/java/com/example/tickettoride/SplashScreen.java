package com.example.tickettoride;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.geometry.Pos;

public class SplashScreen extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Image backgroundImage = new Image("file:src/main/resources/com/example/tickettoride/BlueTransportationCard.jpeg");

        BackgroundImage backgroundImg = new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,

                BackgroundPosition.CENTER,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false)
        );
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Ticket to Ride: New York");

        Display.ChangeIcon(primaryStage);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
