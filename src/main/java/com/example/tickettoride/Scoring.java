package com.example.tickettoride;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Scoring class
 * This class will contain logic for the scoring and/or the scoring system
 */
public class Scoring {
    // Map to hold values for each route
    private Map<String, Integer> valuesOfRoutes = new HashMap<>();

    public Scoring() {
        createRouteValues();
    }

    private void createRouteValues() {
        //Value of each route
        valuesOfRoutes.put("valueOfCentralParkToTimesSquareBlack", 2);
        valuesOfRoutes.put("valueOfCentralParkToTimesSquareRed", 2);
        valuesOfRoutes.put("valueOfCentralParkToUnitedNations", 4);
        valuesOfRoutes.put("valueOfChelseaToEmpireStateBuildingGrey0", 2);
        valuesOfRoutes.put("valueOfChelseaToEmpireStateBuildingGrey1", 2);
        valuesOfRoutes.put("valueOfChelseaToGramercyPark", 2);
        valuesOfRoutes.put("valueOfChelseaToGreenwichVillageGreen", 4);
        valuesOfRoutes.put("valueOfChelseaToGreenwichVillageRed", 4);
        valuesOfRoutes.put("valueOfChelseaToSoho", 7);
        valuesOfRoutes.put("valueOfChinatownToBrooklynOrange", 4);
        valuesOfRoutes.put("valueOfChinatownToBrooklynRed", 4);
        valuesOfRoutes.put("valueOfChinatownToLowerEastSide", 1);
        valuesOfRoutes.put("valueOfChinatownToWallStreetGreen", 1);
        valuesOfRoutes.put("valueOfChinatownToWallStreetPink", 1);
        valuesOfRoutes.put("valueOfEastVillageToLowerEastSide", 1);
        valuesOfRoutes.put("valueOfEmpireStateBuildingToGramercyParkBlue", 1);
        valuesOfRoutes.put("valueOfEmpireStateBuildingToGramercyParkRed", 1);
        valuesOfRoutes.put("valueOfEmpireStateBuildingToUnitedNations", 2);
        valuesOfRoutes.put("valueOfGramercyParkToEastVillage", 2);
        valuesOfRoutes.put("valueOfGramercyParkToGreenwichVillageBlack", 2);
        valuesOfRoutes.put("valueOfGramercyParkToGreenwichVillagePink", 2);
        valuesOfRoutes.put("valueOfGreenwichVillageToChinatownGrey0", 2);
        valuesOfRoutes.put("valueOfGreenwichVillageToChinatownGrey1", 2);
        valuesOfRoutes.put("valueOfGreenwichVillageToEastVillage", 2);
        valuesOfRoutes.put("valueOfGreenwichVillageToLowerEastSide", 2);
        valuesOfRoutes.put("valueOfGreenwichVillageToSoho", 2);
        valuesOfRoutes.put("valueOfLincolnCenterToCentralPark", 2);
        valuesOfRoutes.put("valueOfLincolnCenterToMidtownWest", 2);
        valuesOfRoutes.put("valueOfLincolnCenterToTimesSquareBlue", 2);
        valuesOfRoutes.put("valueOfLincolnCenterToTimesSquareGreen", 2);
        valuesOfRoutes.put("valueOfLowerEastSideToBrooklyn", 4);
        valuesOfRoutes.put("valueOfMidtownWestToChelsea", 2);
        valuesOfRoutes.put("valueOfMidtownWestToEmpireStateBuilding", 2);
        valuesOfRoutes.put("valueOfMidtownWestToTimesSquare", 1);
        valuesOfRoutes.put("valueOfSohoToWallStreet", 2);
        valuesOfRoutes.put("valueOfTimesSquareToEmpireStateBuildingOrange", 1);
        valuesOfRoutes.put("valueOfTimesSquareToEmpireStateBuildingPink", 1);
        valuesOfRoutes.put("valueOfTimesSquareToUnitedNations", 2);
        valuesOfRoutes.put("valueOfUnitedNationsToGramercyPark", 4);
        valuesOfRoutes.put("valueOfWallStreetToBrooklynBlack", 2);
        valuesOfRoutes.put("valueOfWallStreetToBrooklynBlue", 4);
    }

    public int calcRouteScore(String route) {
        return valuesOfRoutes.getOrDefault(route, 0);
    }

    // Calculate total score of player
    public void calculatePlayerScore(Player player, List<String> routeComp) {
        int totalScore = 0;
        for (String route : routeComp) {
            totalScore += calcRouteScore(route);
        }
        player.setScore(player.getScore() + totalScore);
    }

}
