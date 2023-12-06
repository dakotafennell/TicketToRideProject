package com.example.tickettoride;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Destinations class
 * This class will contain logic for the destinations and/or the destination cards
 */
public class DestinationCard
{
    //-------------  Destination Card Image Paths -----------------\\
    //Card Images
    private static final String CentralPark_Chelsea = "/com/example/tickettoride/DestinationCards/CentralParkToChelsea.png";
    private static final String CentralPark_Chinatown = "/com/example/tickettoride/DestinationCards/CentralParkToChinatown.png";
    private static final String CentralPark_Gramercy = "/com/example/tickettoride/DestinationCards/CentralParkToGramercyPark.png";
    private static final String CentralPark_Midtown = "/com/example/tickettoride/DestinationCards/CentralParkToMidtownWest.png";
    private static final String Chelsea_Brooklyn = "/com/example/tickettoride/DestinationCards/ChelseaToBrooklyn.png";
    private static final String Chelsea_WallStreet = "/com/example/tickettoride/DestinationCards/ChelseaToWallStreet.png";
    private static final String EastVillage_Soho = "/com/example/tickettoride/DestinationCards/EastVillageToSoho.png";
    private static final String EmpireState_Brooklyn = "/com/example/tickettoride/DestinationCards/EmpireStateBuildingToBrooklyn.png";
    private static final String EmpireState_Greenwich = "/com/example/tickettoride/DestinationCards/EmpireStateBuildingToGreenwichVillage.png";
    private static final String Gramercy_ChinaTown = "/com/example/tickettoride/DestinationCards/GramercyParkToChinatown.png";
    private static final String LincolnCenter_EmpireState = "/com/example/tickettoride/DestinationCards/LincolnCenterToEmpireStateBuilding.png";
    private static final String LincolnCenter_Greenwich = "/com/example/tickettoride/DestinationCards/LincolnCenterToGreenwichVillage.png";
    private static final String LowerEastSide_WallStreet = "/com/example/tickettoride/DestinationCards/LowerEastSideToWallStreet.png";
    private static final String TimesSquare_Brooklyn = "/com/example/tickettoride/DestinationCards/TimesSquareToBrooklyn.png";
    private static final String TimesSquare_EastVillage = "/com/example/tickettoride/DestinationCards/TimesSquareToEastVillage.png";
    private static final String TimesSquare_Soho = "/com/example/tickettoride/DestinationCards/TimesSquareToSoho.png";
    private static final String UN_Midtown = "/com/example/tickettoride/DestinationCards/UnitedNationsToMidtownWest.png";
    private static final String UN_WallStreet = "/com/example/tickettoride/DestinationCards/UnitedNationsToWallStreet.png";

    //-------------------  array of card images ---------------------\\
    public static final String[] CardImagePath = {
            CentralPark_Chelsea, CentralPark_Chinatown, CentralPark_Gramercy, CentralPark_Midtown,
            Chelsea_Brooklyn, Chelsea_WallStreet, EastVillage_Soho, EmpireState_Brooklyn,
            EmpireState_Greenwich, Gramercy_ChinaTown, LincolnCenter_EmpireState, LincolnCenter_Greenwich,
            LowerEastSide_WallStreet, TimesSquare_Brooklyn, TimesSquare_EastVillage, TimesSquare_Soho,
            UN_Midtown, UN_WallStreet
    };
    private final String CITY1;
    private final String CITY2;
    private final int POINTS;
    ArrayList<DestinationCard> card;

    public DestinationCard()
    {
        CITY1 = "Lincoln Center";
        CITY2 = "Central Park";
        POINTS = 2;
        card = new ArrayList<>();
    }

    public DestinationCard(String city1, String city2, int points)
    {
        this.CITY1 = city1;
        this.CITY2 = city2;
        this.POINTS = points;
        card = new ArrayList<>();
    }

    public static List<DestinationCard> drawDestinationCards(int numCards)
    {
        if (DestinationCard.CardImagePath.length < numCards)
        {
            // Handle the case where there are not enough cards in the deck
            System.out.println("Not enough destination cards in the deck!");
            return Collections.emptyList();
        }

        return new ArrayList<>();
    }

    public DestinationCard getCities()
    {
        return null;
    }

    public String getCITY1()
    {
        return CITY1;
    }

    public String getCITY2()
    {
        return CITY2;
    }

    public void testingMethod()
    {
        System.out.println("This is a test" + getCITY1() + getCITY2());
    }

    public int getPoints()
    {
        return POINTS;
    }

    //string that displays the two destinations on the card as well as value of the route
    public String toString()
    {
        return CITY1 + " to " + CITY2 + " for " + POINTS + " points";
    }

    public void removeCardFromDeck()
    {

    }
}
