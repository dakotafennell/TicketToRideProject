package com.example.tickettoride;

import javafx.animation.*;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * HighlightRoutes class
 * This class was created to display where the user is able to use their taxis.
 * added feature of them pulsing
 * Upon click we are able to change from a highlight to the routes color marking that it has been taken.
 */
public class HighlightRoutes
{
    //Using variables to keep measurements uniform
    public static final double HEIGHT = 15;
    public static final double WIDTH = 50;
    public static final double WIDTH2 = 100;
    public static final double WIDTH3 = 150;
    public static final double WIDTH4 = 200;

    //One block routes
    Rectangle MidtownWestToTimesSquare = new Rectangle(149, 176, WIDTH, HEIGHT);
    Rectangle TimesSquareToEmpireStateBuildingOrange = new Rectangle(217, 215, WIDTH, HEIGHT);
    Rectangle TimesSquareToEmpireStateBuildingPink = new Rectangle(234, 203, WIDTH, HEIGHT);
    Rectangle EmpireStateBuildingToGramercyParkRed = new Rectangle(278, 300, WIDTH, HEIGHT);
    Rectangle EmpireStateBuildingToGramercyParkBlue = new Rectangle(294, 289, WIDTH, HEIGHT);
    Rectangle EastVillageToLowerEastSide = new Rectangle(421, 503, WIDTH, HEIGHT);
    Rectangle ChinatownToLowerEastSide = new Rectangle(367, 572, WIDTH, HEIGHT);
    Rectangle ChinatownToWallStreetGreen = new Rectangle(299, 653, WIDTH, HEIGHT);
    Rectangle ChinatownToWallStreetPink = new Rectangle(317, 660, WIDTH, HEIGHT);

    //List of All one block routes
    Rectangle[] oneBlockRoutes = {
            MidtownWestToTimesSquare, TimesSquareToEmpireStateBuildingOrange,
            TimesSquareToEmpireStateBuildingPink, EmpireStateBuildingToGramercyParkRed,
            EmpireStateBuildingToGramercyParkBlue, EastVillageToLowerEastSide, ChinatownToLowerEastSide,
            ChinatownToWallStreetGreen, ChinatownToWallStreetPink
    };

    //Two block routes
    Rectangle LincolnCenterToMidtownWest = new Rectangle(80, 115, WIDTH2, HEIGHT);
    Rectangle LincolnCenterToTimesSquareGreen = new Rectangle(125, 107, WIDTH2, HEIGHT);
    Rectangle LincolnCenterToTimesSquareBlue = new Rectangle(142, 97, WIDTH2, HEIGHT);
    Rectangle LincolnCenterToCentralPark = new Rectangle(163, 33, WIDTH2, HEIGHT);
    Rectangle CentralParkToTimesSquareBlack = new Rectangle(198, 95, WIDTH2, HEIGHT);
    Rectangle CentralParkToTimesSquareRed = new Rectangle(216, 103, WIDTH2, HEIGHT);
    Rectangle TimesSquareToUnitedNations = new Rectangle(267, 155, WIDTH2, HEIGHT);
    Rectangle MidtownWestToChelsea = new Rectangle(95, 267, WIDTH2, HEIGHT);
    Rectangle MidtownWestToEmpireStateBuilding = new Rectangle(142, 225, WIDTH2, HEIGHT);
    Rectangle EmpireStateBuildingToUnitedNations = new Rectangle(287, 206, WIDTH2, HEIGHT);
    Rectangle ChelseaToEmpireStateBuildingGrey0 = new Rectangle(165, 287, WIDTH2, HEIGHT);
    Rectangle ChelseaToEmpireStateBuildingGrey1 = new Rectangle(176, 303, WIDTH2, HEIGHT);
    Rectangle ChelseaToGramercyPark = new Rectangle(208, 340, WIDTH2, HEIGHT);
    Rectangle GramercyParkToGreenwichVillageBlack = new Rectangle(267, 393, WIDTH2, HEIGHT);
    Rectangle GramercyParkToGreenwichVillagePink = new Rectangle(287, 397, WIDTH2, HEIGHT);
    Rectangle GramercyParkToEastVillage = new Rectangle(353, 390, WIDTH2, HEIGHT);
    Rectangle GreenwichVillageToEastVillage = new Rectangle(332, 459, WIDTH2, HEIGHT);
    Rectangle GreenwichVillageToSoho = new Rectangle(215, 530, WIDTH2, HEIGHT);
    Rectangle GreenwichVillageToChinatownGrey0 = new Rectangle(272, 538, WIDTH2, HEIGHT);
    Rectangle GreenwichVillageToChinatownGrey1 = new Rectangle(290, 533, WIDTH2, HEIGHT);
    Rectangle GreenwichVillageToLowerEastSide = new Rectangle(332, 507, WIDTH2, HEIGHT);
    Rectangle SohoToWallStreet = new Rectangle(210, 653, WIDTH2, HEIGHT);

    //List of All two block routes
    Rectangle[] twoBlockRoutes = {
            LincolnCenterToMidtownWest, LincolnCenterToTimesSquareGreen,
            LincolnCenterToTimesSquareBlue, LincolnCenterToCentralPark, CentralParkToTimesSquareBlack,
            CentralParkToTimesSquareRed, TimesSquareToUnitedNations, MidtownWestToChelsea,
            MidtownWestToEmpireStateBuilding, EmpireStateBuildingToUnitedNations,
            ChelseaToEmpireStateBuildingGrey0, ChelseaToEmpireStateBuildingGrey1, ChelseaToGramercyPark,
            GramercyParkToGreenwichVillageBlack, GramercyParkToGreenwichVillagePink, GramercyParkToEastVillage,
            GreenwichVillageToEastVillage, GreenwichVillageToSoho, GreenwichVillageToChinatownGrey0,
            GreenwichVillageToChinatownGrey1, GreenwichVillageToLowerEastSide, SohoToWallStreet
    };

    //Three block routes
    Rectangle CentralParkToUnitedNations = new Rectangle(285, 80, WIDTH3, HEIGHT);
    Rectangle UnitedNationsToGramercyPark = new Rectangle(315, 250, WIDTH3, HEIGHT);
    Rectangle ChelseaToGreenwichVillageGreen = new Rectangle(148, 415, WIDTH3, HEIGHT);
    Rectangle ChelseaToGreenwichVillageRed = new Rectangle(161, 399, WIDTH3, HEIGHT);
    Rectangle LowerEastSideToBrooklyn = new Rectangle(407, 630, WIDTH3, HEIGHT);
    Rectangle ChinatownToBrooklynRed = new Rectangle(347, 666, WIDTH3, HEIGHT);
    Rectangle ChinatownToBrooklynOrange = new Rectangle(359, 650, WIDTH3, HEIGHT);
    Rectangle WallStreetToBrooklynBlue = new Rectangle(325, 720, WIDTH3, HEIGHT);
    Rectangle WallStreetToBrooklynBlack = new Rectangle(323, 740, WIDTH3, HEIGHT);

    //List of All three block routes
    Rectangle[] threeBlockRoutes = {CentralParkToUnitedNations, UnitedNationsToGramercyPark,
            ChelseaToGreenwichVillageGreen, ChelseaToGreenwichVillageRed, LowerEastSideToBrooklyn,
            ChinatownToBrooklynRed, ChinatownToBrooklynOrange, WallStreetToBrooklynBlue, WallStreetToBrooklynBlack};

    //Four block routes
    Rectangle ChelseaToSoho = new Rectangle(83, 470, WIDTH4, HEIGHT);

    //All four block routes
    Rectangle[] fourBlockRoutes = {ChelseaToSoho};

    //List of all the routes combined
    Rectangle[] allRectangles = {
            MidtownWestToTimesSquare, TimesSquareToEmpireStateBuildingOrange,
            TimesSquareToEmpireStateBuildingPink, EmpireStateBuildingToGramercyParkRed,
            EmpireStateBuildingToGramercyParkBlue, EastVillageToLowerEastSide, ChinatownToLowerEastSide,
            ChinatownToWallStreetGreen, ChinatownToWallStreetPink, LincolnCenterToMidtownWest,
            LincolnCenterToTimesSquareGreen, LincolnCenterToTimesSquareBlue, LincolnCenterToCentralPark,
            CentralParkToTimesSquareBlack, CentralParkToTimesSquareRed, TimesSquareToUnitedNations,
            MidtownWestToChelsea, MidtownWestToEmpireStateBuilding, EmpireStateBuildingToUnitedNations,
            ChelseaToEmpireStateBuildingGrey0, ChelseaToEmpireStateBuildingGrey1, ChelseaToGramercyPark,
            GramercyParkToGreenwichVillageBlack, GramercyParkToGreenwichVillagePink, GramercyParkToEastVillage,
            GreenwichVillageToEastVillage, GreenwichVillageToSoho, GreenwichVillageToChinatownGrey0,
            GreenwichVillageToChinatownGrey1, GreenwichVillageToLowerEastSide, SohoToWallStreet,
            CentralParkToUnitedNations, UnitedNationsToGramercyPark, ChelseaToGreenwichVillageGreen,
            ChelseaToGreenwichVillageRed, LowerEastSideToBrooklyn, ChinatownToBrooklynRed,
            ChinatownToBrooklynOrange, WallStreetToBrooklynBlue, WallStreetToBrooklynBlack, ChelseaToSoho
    };

    /*
    //Sets up a hashmap of all the one block blue routes
    public Map<Rectangle, int> oneBlockBlueRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the one block green routes
    public Map<Rectangle, int> oneBlockGreenRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the one block black routes
    public Map<Rectangle, int> oneBlockBlackRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the one block pink routes
    public Map<Rectangle, int> oneBlockPinkRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the one block red routes
    public Map<Rectangle, int> oneBlockRedRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the one block orange routes
    public Map<Rectangle, int> oneBlockOrangeRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the one block taxi (white) routes
    public Map<Rectangle, int> oneBlockWhiteRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the two block blue routes
    public Map<Rectangle, int> twoBlockBlueRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the two block green routes
    public Map<Rectangle, int> twoBlockGreenRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the two block black routes
    public Map<Rectangle, int> twoBlockBlackRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the two block pink routes
    public Map<Rectangle, int> twoBlockPinkRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the two block red routes
    public Map<Rectangle, int> twoBlockRedRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the two block orange routes
    public Map<Rectangle, int> twoBlockOrangeRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the two block taxi (white) routes
    public Map<Rectangle, int> twoBlockWhiteRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the three block blue routes
    public Map<Rectangle, int> threeBlockBlueRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the three block green routes
    public Map<Rectangle, int> threeBlockGreenRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the three block black routes
    public Map<Rectangle, int> threeBlockBlackRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the three block pink routes
    public Map<Rectangle, int> threeBlockPinkRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the three block red routes
    public Map<Rectangle, int> threeBlockRedRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the three block orange routes
    public Map<Rectangle, int> threeBlockOrangeRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the three block taxi (white) routes
    public Map<Rectangle, int> threeBlockWhiteRoutes = new LinkedHashMap<Rectangle, int>();
    //Sets up a hashmap of all the four block blue routes (only one, pink)
    public Map<Rectangle, int> fourBlockPinkRoutes = new LinkedHashMap<Rectangle, int>();

    private Player currentPlayer;
    private Map<Color, Map<Rectangle, Integer>> colorRoutesMap;


    public static final String[] CARDIMAGEPATHS = {BLUECARD, GREENCARD, BLACKCARD, PINKCARD, REDCARD, ORANGECARD, TAXICARD};

    //Puts the rectangles into their respective hashmaps

    public void SetUpRectangleMaps()
    {
        //Gets the current player
        Player currentPlayer = new Player();
        //Gets the current player's hand
        Map<Color, Integer> playerHandMap = currentPlayer.getPlayerHandMap();

        //displays the blue routes based on if the player's hand has enough blue cards
        for (Map.Entry<Color, Integer> entry : playerHandMap.entrySet())
        {
            //If the player has enough blue cards, then display the blue routes
            if (entry.getKey() == Color.BLUE && entry.getValue() >= 1)
            {
                //Displays the blue routes
                for (Map.Entry<Rectangle, int> entry2 : oneBlockBlueRoutes.entrySet())
                {
                    //Displays the one block blue routes
                    entry2.getKey().setVisible(true);
                }
                for (Map.Entry<Rectangle, int> entry2 : twoBlockBlueRoutes.entrySet())
                {
                    //Displays the two block blue routes
                    entry2.getKey().setVisible(true);
                }
                for (Map.Entry<Rectangle, int> entry2 : threeBlockBlueRoutes.entrySet())
                {
                    //Displays the three block blue routes
                    entry2.getKey().setVisible(true);
                }
            }
            //If the player does not have enough blue cards, then don't display the blue routes
            else
            {
                //Don't display the blue routes
                for (Map.Entry<Rectangle, int> entry2 : oneBlockBlueRoutes.entrySet())
                {
                    //Don't display the one block blue routes
                    entry2.getKey().setVisible(false);
                }
                for (Map.Entry<Rectangle, int> entry2 : twoBlockBlueRoutes.entrySet())
                {
                    //Don't display the two block blue routes
                    entry2.getKey().setVisible(false);
                }
                for (Map.Entry<Rectangle, int> entry2 : threeBlockBlueRoutes.entrySet())
                {
                    //Don't display the three block blue routes
                    entry2.getKey().setVisible(false);
                }
            }
        }

        //One block blue routes
        oneBlockBlueRoutes.put(ChinatownToLowerEastSide, 1);
        oneBlockBlueRoutes.put(EmpireStateBuildingToGramercyParkBlue, 1);

        //Displays the one block blue routes if the player has enough blue cards
        for (Map.Entry<Rectangle, int> entry : oneBlockBlueRoutes.entrySet())
        {
            //If the player has enough blue cards, then display the one block blue routes
            if (entry.getValue() == 1)
            {
                //Displays the one block blue routes
                entry.getKey().setVisible(true);
            }
            //If the player does not have enough blue cards, then don't display the one block blue routes
            else
            {
                //Don't display the one block blue routes
                entry.getKey().setVisible(false);
            }
        }

        //One block green routes
        oneBlockGreenRoutes.put(ChinatownToWallStreetGreen, 1);

        //Displays the one block green routes if the current player has enough green cards
        for (Map.Entry<Rectangle, int> entry : oneBlockGreenRoutes.entrySet())
        {
            //If the player has enough green cards, then display the one block green routes
            if (entry.getValue() == 1)
            {
                //Displays the one block green routes
                entry.getKey().setVisible(true);
            }
            //If the player does not have enough green cards, then don't display the one block green routes
            else
            {
                //Don't display the one block green routes
                entry.getKey().setVisible(false);
            }
        }

        //One block black routes
        oneBlockBlackRoutes.put(EastVillageToLowerEastSide, 1);

        //Displays the one block black routes if the current player has enough black cards
        for (Map.Entry<Rectangle, int> entry : oneBlockBlackRoutes.entrySet())
        {
            //If the player has enough black cards, then display the one block black routes
            if (entry.getValue() == 1)
            {
                //Displays the one block black routes
                entry.getKey().setVisible(true);
            }
            //If the player does not have enough black cards, then don't display the one block black routes
            else
            {
                //Don't display the one block black routes
                entry.getKey().setVisible(false);
            }
        }

        //One block pink routes
        oneBlockPinkRoutes.put(ChinatownToWallStreetPink, 1);
        oneBlockPinkRoutes.put(TimesSquareToEmpireStateBuildingPink, 1);

        //One block red routes
        oneBlockRedRoutes.put(EmpireStateBuildingToGramercyParkRed, 1);

        //One block orange routes
        oneBlockOrangeRoutes.put(TimesSquareToEmpireStateBuildingOrange, 1);

        //One block taxi (white) routes
        oneBlockWhiteRoutes.put(MidtownWestToTimesSquare, 1);

        //Two block blue routes
        twoBlockBlueRoutes.put(GreenwichVillageToEastVillage, 2);
        twoBlockBlueRoutes.put(LincolnCenterToTimesSquareBlue, 2);
        twoBlockBlueRoutes.put(MidtownWestToChelsea, 2);

        //Two block green routes
        twoBlockGreenRoutes.put(LincolnCenterToTimesSquareGreen, 2);
        twoBlockGreenRoutes.put(MidtownWestToEmpireStateBuilding, 2);

        //Two block black routes
        twoBlockBlackRoutes.put(CentralParkToTimesSquareBlack, 2);
        twoBlockBlackRoutes.put(EmpireStateBuildingToUnitedNations, 2);
        twoBlockBlackRoutes.put(GramercyParkToGreenwichVillageBlack, 2);

        //Two block pink routes
        twoBlockPinkRoutes.put(GramercyParkToGreenwichVillagePink, 2);

        //Two block red routes
        twoBlockRedRoutes.put(CentralParkToTimesSquareRed, 2);
        twoBlockRedRoutes.put(LincolnCenterToMidtownWest, 2);

        //Two block orange routes
        twoBlockOrangeRoutes.put(ChelseaToGramercyPark, 2);
        twoBlockOrangeRoutes.put(GreenwichVillageToSoho, 2);
        twoBlockOrangeRoutes.put(LincolnCenterToCentralPark, 2);

        //Two block taxi (white) routes
        twoBlockWhiteRoutes.put(ChelseaToEmpireStateBuildingGrey0, 2);
        twoBlockWhiteRoutes.put(ChelseaToEmpireStateBuildingGrey1, 2);
        twoBlockWhiteRoutes.put(GramercyParkToEastVillage, 2);
        twoBlockWhiteRoutes.put(GreenwichVillageToChinatownGrey0, 2);
        twoBlockWhiteRoutes.put(GreenwichVillageToChinatownGrey1, 2);
        twoBlockWhiteRoutes.put(GreenwichVillageToLowerEastSide, 2);
        twoBlockWhiteRoutes.put(SohoToWallStreet, 2);
        twoBlockWhiteRoutes.put(TimesSquareToUnitedNations, 2);

        //Three block blue routes
        threeBlockBlueRoutes.put(WallStreetToBrooklynBlue, 3);

        //Three block green routes
        threeBlockGreenRoutes.put(ChelseaToGreenwichVillageGreen, 3);
        threeBlockGreenRoutes.put(UnitedNationsToGramercyPark, 3);

        //Three block black routes
        threeBlockBlackRoutes.put(WallStreetToBrooklynBlack, 3);

        //Three block pink routes
        threeBlockPinkRoutes.put(CentralParkToUnitedNations, 3);

        //Three block red routes
        threeBlockRedRoutes.put(ChelseaToGreenwichVillageRed, 3);
        threeBlockRedRoutes.put(ChinatownToBrooklynRed, 3);

        //Three block orange routes
        threeBlockOrangeRoutes.put(ChinatownToBrooklynOrange, 3);

        //Three block taxi (white) routes
        threeBlockWhiteRoutes.put(LowerEastSideToBrooklyn, 3);

        //Four block blue routes (only one, pink)
        fourBlockPinkRoutes.put(ChelseaToSoho, 4);
    }

    public void updateRoutesVisibility()
    {
        for (Map.Entry<Color, Map<Rectangle, Integer>> entry : colorRoutesMap.entrySet())
        {
            Color color = entry.getKey();
            Map<Rectangle, Integer> routes = entry.getValue();

            boolean hasEnoughCards = currentPlayer.getPlayerHandMap().getOrDefault(color, 0) >= 1;

            for (Map.Entry<Rectangle, Integer> routeEntry : routes.entrySet()) {
                Rectangle route = routeEntry.getKey();
                int requiredCards = routeEntry.getValue();

                // Set visibility based on the player's hand
                route.setVisible(hasEnoughCards && currentPlayer.getPlayerHandMap().getOrDefault(color, 0) >= requiredCards);
            }
        }
    }
     */

    //--------------------------- Display ----------------------------------\\
    public Pane highlightRectangles(Pane overlay)
    {
        try
        {
            //Initializes a new board object
            Board board = new Board();

            //Loads the image
            ImageView ticketToRideNYMap = board.getTicketToRideImage();

            // Create an overlay pane
            Pane overlayPane = new Pane();

            //Adds the image to the overlay pane
            overlayPane.getChildren().add(ticketToRideNYMap);
            //Creates a glow effect for the rectangles
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

            //Rotation positioning for all one block routes
            int[] oneBlockRectangleRotations = {-11, 55, 55, 55, 55, 97, -33, 110, 110};
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

            //Rotation positioning for all three block routes
            int[] threeBlockRectangleRotations = {46, 110, 43, 43, 66, 38, 38, 7, 7};
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

            //Rotation positioning for all four block routes
            int[] fourBlockRectangleRotations = {70};
            //Four block route rotations
            ChelseaToSoho.setRotate(70);

            //Rotation positioning for all two block routes
            int[] twoBlockRectangleRotations = {90, 62, 62, 1, -70, -70, -2, 75, 26, -32, -36, -36, -4, -78, -78, 51, 0, -60, 75, 75, 38, 61};

            //Gets the current player
            Player currentPlayer = new Player();
            //Gets the current player's hand
            Map<Color, Integer> playerHandMap = currentPlayer.getPlayerHandMap();

            //Gets the number of blue cards in the player's hand
            int blueCards = playerHandMap.getOrDefault(Color.BLUE, 0);

            //Gets the number of green cards in the player's hand
            int greenCards = playerHandMap.getOrDefault(Color.GREEN, 0);

            //Gets the number of black cards in the player's hand
            int blackCards = playerHandMap.getOrDefault(Color.BLACK, 0);

            //Gets the number of pink cards in the player's hand
            int pinkCards = playerHandMap.getOrDefault(Color.PINK, 0);

            //Gets the number of red cards in the player's hand
            int redCards = playerHandMap.getOrDefault(Color.RED, 0);

            //Gets the number of orange cards in the player's hand
            int orangeCards = playerHandMap.getOrDefault(Color.ORANGE, 0);

            //Gets the number of white (taxi) cards in the player's hand
            int whiteCards = playerHandMap.getOrDefault(Color.WHITE, 0);

            //for loop to display the one block routes based on the number of cards in the player's hand
            for (Rectangle oneBlockRoute : oneBlockRoutes) {
                //If the player has enough blue cards, then display the blue routes
                //Displays the blue routes
                //If the player does not have enough blue cards, then don't display the blue routes
                //Don't display the blue routes
                oneBlockRoute.setVisible(blueCards >= 1);
            }

            //for loop to display the two block routes based on the number of cards in the player's hand
            for (Rectangle twoBlockRoute : twoBlockRoutes) {
                //If the player has enough blue cards, then display the blue routes
                //Displays the blue routes
                //If the player does not have enough blue cards, then don't display the blue routes
                //Don't display the blue routes
                twoBlockRoute.setVisible(blueCards >= 2);
            }

            //for loop to display the three block routes based on the number of cards in the player's hand
            for (Rectangle threeBlockRoute : threeBlockRoutes) {
                //If the player has enough blue cards, then display the blue routes
                //Displays the blue routes
                //If the player does not have enough blue cards, then don't display the blue routes
                //Don't display the blue routes
                threeBlockRoute.setVisible(blueCards >= 3);
            }

            //for loop to display the four block routes based on the number of cards in the player's hand
            for (Rectangle fourBlockRoute : fourBlockRoutes) {
                //If the player has enough blue cards, then display the blue routes
                //Displays the blue routes
                //If the player does not have enough blue cards, then don't display the blue routes
                //Don't display the blue routes
                fourBlockRoute.setVisible(blueCards >= 4);
            }

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

            initializeClickableRectangles(allRectangles, timeline);

            return overlayPane;
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    //--------- Method to set the initial fill and effects for each rectangle ------------\\
    private void setRectangleFillAndEffects(Rectangle[] twoBlockRoutes, Glow glow, ColorAdjust colorAdjust)
    {
        for (Rectangle rectangle : twoBlockRoutes)
        {
            //Sets the rectangle fill to yellow
            rectangle.setFill(Color.YELLOW);
            rectangle.setEffect(glow);
            rectangle.setEffect(colorAdjust);
        }
    }

    /*
    //gets the map of the players hand
    public Map<Color, Integer> getPlayerHandMap()
    {
        return playerHandMap;
    }

    //Change count values of the respective players cards
    public void incrementPlayerHandValue(Color color, int value)
    {
        int currentValue = playerHandMap.getOrDefault(color, 0);
        //prints out the current value of the card
        //System.out.println("The current value of the card is: " + currentValue);
        int newValue = currentValue + value;
        playerHandMap.put(color, newValue);

        //prints out what was put in the map
        //System.out.println("The value of the card put in the map is: " + playerHandMap.get(color));
    }
     */

    /*
    //Method to display the specific rectangles
    //based on the player's current number of transportation cards of a specific color
    public void DisplaySpecificRectangles()
    {
        //Creates a new player object
        Player currentPlayer = new Player();
        //Gets the current player's hand
        Map<Color, Integer> playerHandMap = currentPlayer.getPlayerHandMap();

    }
     */

    //Method to create keyframes to animate the rectangles and play the animation
    private void routeAnimationKeyFrames(ColorAdjust colorAdjust, Timeline timeline)
    {
        //For each rectangle in the array of all rectangles
        for (Rectangle allRectangle : allRectangles)
        {
            //Defines the increase brightness Animation
            KeyFrame increaseBrightness = new KeyFrame(
                    Duration.seconds(2),
                    new KeyValue(colorAdjust.brightnessProperty(), 0.5)
            );

            //Defines the decrease brightness Animation
            KeyFrame decreaseBrightness = new KeyFrame(
                    Duration.seconds(2),
                    new KeyValue(colorAdjust.brightnessProperty(), -0.5)
            );

            //Defines the increase opacity Animation
            KeyFrame increaseOpacity = new KeyFrame(
                    Duration.seconds(2),
                    new KeyValue(allRectangle.fillProperty(), Color.rgb(255, 255, 0, 1.0)) // Set alpha to 1.0
            );

            //Defines the set transparent Animation
            KeyFrame setTransparent = new KeyFrame(
                    Duration.seconds(2),
                    new KeyValue(allRectangle.fillProperty(), Color.TRANSPARENT)
            );

            //Create keyframes with interpolator to smoothly pulse between visible and invisible
            KeyFrame startFrame = new KeyFrame(Duration.ZERO, new KeyValue(
                    allRectangle.opacityProperty(), 1.0, Interpolator.EASE_BOTH));
            KeyFrame endFrame = new KeyFrame(Duration.seconds(2), new KeyValue(
                    allRectangle.opacityProperty(), 0.0, Interpolator.EASE_BOTH));

            //Adds the keyframes to the timeline
            timeline.getKeyFrames().addAll(increaseBrightness, decreaseBrightness, increaseOpacity,
                    setTransparent, startFrame, endFrame);
        }

        //Sets the timeline to play forwards and backwards
        timeline.setAutoReverse(true);
        //Sets the timeline to repeat indefinitely
        timeline.setCycleCount(Animation.INDEFINITE);

        //Plays the timeline
        timeline.play();
    }

    //Method to allow the rectangles to be clickable
    private void initializeClickableRectangles(Rectangle[] rectangles, Timeline timeline)
    {
        for (Rectangle rectangle : rectangles)
        {
            rectangle.setOnMouseClicked(event ->
            {
                //Handle click event for the rectangle
                System.out.println("Clicked on a rectangle");
                System.out.println("Rectangle X: " + rectangle.getX());
                System.out.println("Rectangle Y: " + rectangle.getY());
                System.out.println("Rotation angle: " + rectangle.getRotate());
                //prints out the color of the rectangle
                System.out.println("Rectangle Color: " + rectangle.getFill());
                //Sets the fill color of the specifically clicked rectangle to the player's color
                rectangle.setFill(Color.RED);
                //Stops the timeline playing the animation for the specifically clicked rectangle
                timeline.stop();

            });
        }
    }

    //Gets which rectangle the user clicked on, outputting that rectangle to the console
    public Rectangle getSelectedRectangle()
    {
        for (Rectangle rectangle : allRectangles)
        {
            rectangle.setOnMouseClicked(event ->
            {
                //Handle click event for the rectangle
                System.out.println("Clicked on a rectangle");
                System.out.println("Rectangle X: " + rectangle.getX());
                System.out.println("Rectangle Y: " + rectangle.getY());
                System.out.println("Rotation angle: " + rectangle.getRotate());
                //prints out the color of the rectangle
                System.out.println("Rectangle Color: " + rectangle.getFill());
                //Sets the fill color of the specifically clicked rectangle to the player's color
                rectangle.setFill(Color.RED);
            });
        }
        return null;
    }
}