package com.example.tickettoride;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;
/*
    Keeps count of all the routes
    Keeps count of the length of the routes
    Tracks the required color of the routes
 */
public class Route
{
    public static final int TOTAL_ALL_ROUTES = 41;

    public static final int TOTAL_ROUTES = 30;
    public static final int TOTAL_DOUBLE_ROUTES = 22;

    public static int totalBlueRoutes = 0;
    public static int totalGreenRoutes = 0;
    public static int totalBlackRoutes = 0;
    public static int totalPinkRoutes = 0;
    public static int totalRedRoutes = 0;
    public static int totalOrangeRoutes = 0;
    public static int totalTaxiRoutes = 0;

    // Map to hold values for each route
    private Map<Color, Integer> colorLengthOfRoutes = new HashMap<>();

    //Length of each route
    public int lengthOfCentralParkToTimesSquareBlack = 2;
    public int lengthOfCentralParkToTimesSquareRed = 2;
    public int lengthOfCentralParkToUnitedNations = 3;
    public int lengthOfChelseaToEmpireStateBuildingGrey0 = 2;
    public int lengthOfChelseaToEmpireStateBuildingGrey1 = 2;
    public int lengthOfChelseaToGramercyPark = 2;
    public int lengthOfChelseaToGreenwichVillageGreen = 3;
    public int lengthOfChelseaToGreenwichVillageRed = 3;
    public int lengthOfChelseaToSoho = 4;
    public int lengthOfChinatownToBrooklynOrange = 3;
    public int lengthOfChinatownToBrooklynRed = 3;
    public int lengthOfChinatownToLowerEastSide = 1;
    public int lengthOfChinatownToWallStreetGreen = 1;
    public int lengthOfChinatownToWallStreetPink = 1;
    public int lengthOfEastVillageToLowerEastSide = 1;
    public int lengthOfEmpireStateBuildingToGramercyParkBlue = 1;
    public int lengthOfEmpireStateBuildingToGramercyParkRed = 1;
    public int lengthOfEmpireStateBuildingToUnitedNations = 2;
    public int lengthOfGramercyParkToEastVillage = 2;
    public int lengthOfGramercyParkToGreenwichVillageBlack = 2;
    public int lengthOfGramercyParkToGreenwichVillagePink = 2;
    public int lengthOfGreenwichVillageToChinatownGrey0 = 2;
    public int lengthOfGreenwichVillageToChinatownGrey1 = 2;
    public int lengthOfGreenwichVillageToEastVillage = 2;
    public int lengthOfGreenwichVillageToLowerEastSide = 2;
    public int lengthOfGreenwichVillageToSoho = 2;
    public int lengthOfLincolnCenterToCentralPark = 2;
    public int lengthOfLincolnCenterToMidtownWest = 2;
    public int lengthOfLincolnCenterToTimesSquareBlue = 2;
    public int lengthOfLincolnCenterToTimesSquareGreen = 2;
    public int lengthOfLowerEastSideToBrooklyn = 3;
    public int lengthOfMidtownWestToChelsea = 2;
    public int lengthOfMidtownWestToEmpireStateBuilding = 2;
    public int lengthOfMidtownWestToTimesSquare = 1;
    public int lengthOfSohoToWallStreet = 2;
    public int lengthOfTimesSquareToEmpireStateBuildingOrange = 1;
    public int lengthOfTimesSquareToEmpireStateBuildingPink = 1;
    public int lengthOfTimesSquareToUnitedNations = 2;
    public int lengthOfUnitedNationsToGramercyPark = 3;
    public int lengthOfWallStreetToBrooklynBlack = 3;
    public int lengthOfWallStreetToBrooklynBlue = 3;

    //---------------- Sets up the color to be assigned to the routes -----------------------\\
    public void createRouteColorLength()
    {
        colorLengthOfRoutes.put(Color.BLACK, lengthOfCentralParkToTimesSquareBlack);
        colorLengthOfRoutes.put(Color.RED, lengthOfCentralParkToTimesSquareRed);
        colorLengthOfRoutes.put(Color.PINK, lengthOfCentralParkToUnitedNations);
        colorLengthOfRoutes.put(Color.GREY, lengthOfChelseaToEmpireStateBuildingGrey0);
        colorLengthOfRoutes.put(Color.GREY, lengthOfChelseaToEmpireStateBuildingGrey1);
        colorLengthOfRoutes.put(Color.ORANGE, lengthOfChelseaToGramercyPark);
        colorLengthOfRoutes.put(Color.GREEN, lengthOfChelseaToGreenwichVillageGreen);
        colorLengthOfRoutes.put(Color.RED, lengthOfChelseaToGreenwichVillageRed);
        colorLengthOfRoutes.put(Color.PINK, lengthOfChelseaToSoho);
        colorLengthOfRoutes.put(Color.ORANGE, lengthOfChinatownToBrooklynOrange);
        colorLengthOfRoutes.put(Color.RED, lengthOfChinatownToBrooklynRed);
        colorLengthOfRoutes.put(Color.BLACK, lengthOfChinatownToLowerEastSide);
        colorLengthOfRoutes.put(Color.GREEN, lengthOfChinatownToWallStreetGreen);
        colorLengthOfRoutes.put(Color.PINK, lengthOfChinatownToWallStreetPink);
        colorLengthOfRoutes.put(Color.BLACK, lengthOfEastVillageToLowerEastSide);
        colorLengthOfRoutes.put(Color.BLUE, lengthOfEmpireStateBuildingToGramercyParkBlue);
        colorLengthOfRoutes.put(Color.RED, lengthOfEmpireStateBuildingToGramercyParkRed);
        colorLengthOfRoutes.put(Color.BLACK, lengthOfEmpireStateBuildingToUnitedNations);
        colorLengthOfRoutes.put(Color.GREY, lengthOfGramercyParkToEastVillage);
        colorLengthOfRoutes.put(Color.BLACK, lengthOfGramercyParkToGreenwichVillageBlack);
        colorLengthOfRoutes.put(Color.PINK, lengthOfGramercyParkToGreenwichVillagePink);
        colorLengthOfRoutes.put(Color.GREY, lengthOfGreenwichVillageToChinatownGrey0);
        colorLengthOfRoutes.put(Color.GREY, lengthOfGreenwichVillageToChinatownGrey1);
        colorLengthOfRoutes.put(Color.BLUE, lengthOfGreenwichVillageToEastVillage);
        colorLengthOfRoutes.put(Color.GREY, lengthOfGreenwichVillageToLowerEastSide);
        colorLengthOfRoutes.put(Color.ORANGE, lengthOfGreenwichVillageToSoho);
        colorLengthOfRoutes.put(Color.ORANGE, lengthOfLincolnCenterToCentralPark);
        colorLengthOfRoutes.put(Color.RED, lengthOfLincolnCenterToMidtownWest);
        colorLengthOfRoutes.put(Color.BLUE, lengthOfLincolnCenterToTimesSquareBlue);
        colorLengthOfRoutes.put(Color.GREEN, lengthOfLincolnCenterToTimesSquareGreen);
        colorLengthOfRoutes.put(Color.GREY, lengthOfLowerEastSideToBrooklyn);
        colorLengthOfRoutes.put(Color.BLUE, lengthOfMidtownWestToChelsea);
        colorLengthOfRoutes.put(Color.GREEN, lengthOfMidtownWestToEmpireStateBuilding);
        colorLengthOfRoutes.put(Color.GREY, lengthOfMidtownWestToTimesSquare);
        colorLengthOfRoutes.put(Color.GREY, lengthOfSohoToWallStreet);
        colorLengthOfRoutes.put(Color.ORANGE, lengthOfTimesSquareToEmpireStateBuildingOrange);
        colorLengthOfRoutes.put(Color.PINK, lengthOfTimesSquareToEmpireStateBuildingPink);
        colorLengthOfRoutes.put(Color.GREY, lengthOfTimesSquareToUnitedNations);
        colorLengthOfRoutes.put(Color.GREEN, lengthOfUnitedNationsToGramercyPark);
        colorLengthOfRoutes.put(Color.BLACK, lengthOfWallStreetToBrooklynBlack);
        colorLengthOfRoutes.put(Color.BLUE, lengthOfWallStreetToBrooklynBlue);
    }


    public int getLengthOfRoute(Color color)
    {
        return colorLengthOfRoutes.getOrDefault(color, 0);
    }

    //Constructor
    public Route()
    {
        totalBlueRoutes = 0;
        totalGreenRoutes = 0;
        totalBlackRoutes = 0;
        totalPinkRoutes = 0;
        totalRedRoutes = 0;
        totalOrangeRoutes = 0;
        totalTaxiRoutes = 0;
    }

    //Constructor with parameters
    public Route(int blueRoute, int greenRoute, int blackRoute, int pinkRoute, int redRoute, int orangeRoute, int taxiRoute)
    {
        totalBlueRoutes = blueRoute;
        totalGreenRoutes = greenRoute;
        totalBlackRoutes = blackRoute;
        totalPinkRoutes = pinkRoute;
        totalRedRoutes = redRoute;
        totalOrangeRoutes = orangeRoute;
        totalTaxiRoutes = taxiRoute;
    }

    //Getters

}