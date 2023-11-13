package com.example.tickettoride;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PlayerTest
{
    // Player attributes
    private String name;
    private int score;
    private List<TransportationCard> transportationCards;
    private List<DestinationCard> destinationCards;
    private int numGamePieces;
    private Color color;

    public PlayerTest()
    {
        this.name = name;
        this.score = 0;
        this.transportationCards = new ArrayList<>();
        this.destinationCards = new ArrayList<>();
        this.numGamePieces = 0;
        this.color = color;
    }

    public PlayerTest(String name, int score, List<TransportationCard> transportationCards, List<DestinationCard> destinationCards, int numGamePieces, Color color)
    {
        this.name = name;
        this.score = score;
        this.transportationCards = transportationCards;
        this.destinationCards = destinationCards;
        this.numGamePieces = numGamePieces;
        this.color = color;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        if (name != null) {
            this.name = name;
        }
    }

    public int getScore()
    {
        return score;
    }
    public void setScore(int score)
    {
        this.score = score;
    }

    public List<TransportationCard> getTransportationCards()
    {
        return transportationCards;
    }
    public void addTransportationCard(TransportationCard card)
    {
        transportationCards.add(card);
    }

    public List<DestinationCard> getDestinationCards()
    {
        return destinationCards;
    }
    public void addDestinationCard(DestinationCard card)
    {
        destinationCards.add(card);
    }

    public int getNumGamePieces()
    {
        return numGamePieces;
    }
    public void setNumGamePieces(int numGamePieces)
    {
        if (numGamePieces >= 0) {
            this.numGamePieces = numGamePieces;
        }
    }

    public void drawTransportationCard(TransportationCard card)
    {
        // Add the drawn card to the player's hand.
        addTransportationCard(card);
    }

    public void drawDestinationCard(DestinationCard card)
    {
        // Add the drawn card to the player's hand.
        addDestinationCard(card);
    }

    public void placeTrainPieces(int numPieces)
    {
        if (numPieces >= 0) {
            this.numGamePieces += numPieces;
        }
    }

    // Method to draw cards from the deck
    public void drawCard()
    {
        // Implement this method based on your game's card drawing logic.
    }

    // Method to place cards in the discard pile
    public void discardCard()
    {
        // Implement this method based on your game's card discarding logic.
    }
}