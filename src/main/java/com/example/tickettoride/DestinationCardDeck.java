package com.example.tickettoride;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
    This creates a deck from the DestinationCard class
 */
public class DestinationCardDeck
{
    //List creation for the Destination Card Deck
    private static List<DestinationCard> destinationCards;

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
    private static final String Back = "/com/example/tickettoride/DestinationCards/BackOfTransportationCard.png";

    /*
        Logic for the destination deck:
        -prevents issue of not having enough cards in draw deck
        -removes the card once its pulled
     */
    public static List<DestinationCard> drawDestinationCards(int numCards)
    {
        if (destinationCards.size() < numCards)
        {
            // Handle the case where there are not enough cards in the deck
            System.out.println("Not enough destination cards in the deck!");
            return Collections.emptyList();
        }

        List<DestinationCard> drawnCards = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            DestinationCard drawnCard = destinationCards.remove(0); // Assuming cards are drawn from the top of the deck
            drawnCards.add(drawnCard);
        }

        return drawnCards;
    }

    //Shuffles the deck
    public void shuffle()
    {
        Collections.shuffle(destinationCards);
    }
}
