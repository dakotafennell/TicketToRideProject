package com.example.tickettoride;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
    Creates the deck of Transportation cards from the TransportationCard class
    Handles logic/issues if there are not enough cards in the deck
    Shuffles the deck
 */
public class TransportationDeck
{
    private static List<TransportationCard> transportationCards;

    public static List<TransportationCard> drawTransportationCards(int numCards)
    {
        if (transportationCards.size() < numCards)
        {
            // Handle the case where there are not enough cards in the deck
            System.out.println("Not enough transportation cards in the deck!");
            return Collections.emptyList();
        }

        List<TransportationCard> drawnCards = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            TransportationCard drawnCard = transportationCards.remove(0); // Assuming cards are drawn from the top of the deck
            drawnCards.add(drawnCard);
        }

        return drawnCards;
    }

    public void shuffle()
    {
        Collections.shuffle(transportationCards);
    }
}
