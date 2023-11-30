package com.example.tickettoride;

import javafx.scene.paint.Color;

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

    //Value of each route
    public int valueOfCentralParkToTimesSquareBlack = 2;
    public int valueOfCentralParkToTimesSquareRed = 2;
    public int valueOfCentralParkToUnitedNations = 4;
    public int valueOfChelseaToEmpireStateBuildingGrey0 = 2;
    public int valueOfChelseaToEmpireStateBuildingGrey1 = 2;
    public int valueOfChelseaToGramercyPark = 2;
    public int valueOfChelseaToGreenwichVillageGreen = 4;
    public int valueOfChelseaToGreenwichVillageRed = 4;
    public int valueOfChelseaToSoho = 7;
    public int valueOfChinatownToBrooklynOrange = 4;
    public int valueOfChinatownToBrooklynRed = 4;
    public int valueOfChinatownToLowerEastSide = 1;
    public int valueOfChinatownToWallStreetGreen = 1;
    public int valueOfChinatownToWallStreetPink = 1;
    public int valueOfEastVillageToLowerEastSide = 1;
    public int valueOfEmpireStateBuildingToGramercyParkBlue = 1;
    public int valueOfEmpireStateBuildingToGramercyParkRed = 1;
    public int valueOfEmpireStateBuildingToUnitedNations = 2;
    public int valueOfGramercyParkToEastVillage = 2;
    public int valueOfGramercyParkToGreenwichVillageBlack = 2;
    public int valueOfGramercyParkToGreenwichVillagePink = 2;
    public int valueOfGreenwichVillageToChinatownGrey0 = 2;
    public int valueOfGreenwichVillageToChinatownGrey1 = 2;
    public int valueOfGreenwichVillageToEastVillage = 2;
    public int valueOfGreenwichVillageToLowerEastSide = 2;
    public int valueOfGreenwichVillageToSoho = 2;
    public int valueOfLincolnCenterToCentralPark = 2;
    public int valueOfLincolnCenterToMidtownWest = 2;
    public int valueOfLincolnCenterToTimesSquareBlue = 2;
    public int valueOfLincolnCenterToTimesSquareGreen = 2;
    public int valueOfLowerEastSideToBrooklyn = 4;
    public int valueOfMidtownWestToChelsea = 2;
    public int valueOfMidtownWestToEmpireStateBuilding = 2;
    public int valueOfMidtownWestToTimesSquare = 1;
    public int valueOfSohoToWallStreet = 2;
    public int valueOfTimesSquareToEmpireStateBuildingOrange = 1;
    public int valueOfTimesSquareToEmpireStateBuildingPink = 1;
    public int valueOfTimesSquareToUnitedNations = 2;
    public int valueOfUnitedNationsToGramercyPark = 4;
    public int valueOfWallStreetToBrooklynBlack = 4;
    public int valueOfWallStreetToBrooklynBlue = 4;

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