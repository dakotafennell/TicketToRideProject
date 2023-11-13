package com.example.tickettoride;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Player class
 * This class will contain logic for the player and/or the player's hand
 */
public class Player
{
    // Player attributes
    private int numPlayers;
    private String name;
    private int score;
    private int numTransportationCards;
    private int numDestinationCards;
    private int numGamePieces;
    private List<TransportationCard> transportationCards;
    private List<DestinationCard> destinationCards;
    private Color color;

    public Player(String name)
    {
        this.name = name;
        this.score = 0;
        this.numTransportationCards = 0;
        this.numDestinationCards = 0;
        this.numGamePieces = 0;
        this.transportationCards = new ArrayList<TransportationCard>();
        this.destinationCards = new ArrayList<DestinationCard>();
        this.color = color;
    }

    public Player(String name, int score, int numTransportationCards, int numDestinationCards, List<TransportationCard> transportationCards, List<DestinationCard> destinationCards, int numGamePieces, Color color)
    {
        this.name = name;
        this.score = score;
        this.numTransportationCards = numTransportationCards;
        this.numDestinationCards = numDestinationCards;
        this.numGamePieces = numGamePieces;
        this.transportationCards = new ArrayList<TransportationCard>();
        this.destinationCards = new ArrayList<DestinationCard>();
        this.color = color;
    }

    protected void setNumPlayers(int numPlayers)
    {
        if (numPlayers >= 2 && numPlayers <= 5)
        {
            this.numPlayers = numPlayers;
        }
    }

    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    public int getNumPlayers()
    {
        return numPlayers;
    }

    public int getNumTransportationCards()
    {
        return numTransportationCards;
    }

    public int getNumDestinationCards()
    {
        return numDestinationCards;
    }

    public int getNumGamePieces()
    {
        return numGamePieces;
    }

    public void setName(String name)
    {
        if (name != null)
        {
            this.name = name;
        }
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public void setNumTransportationCards(int numTransportationCards)
    {
        if (numTransportationCards >= 0)
        {
            this.numTransportationCards = numTransportationCards;
        }
    }

    public void setNumDestinationCards(int numDestinationCards)
    {
        if (numDestinationCards >= 0)
        {
            this.numDestinationCards = numDestinationCards;
        }
    }

    public void setNumGamePieces(int numGamePieces)
    {
        if (numGamePieces >= 0)
        {
            this.numGamePieces = numGamePieces;
        }
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public void setNameAndColor(String name, Color color)
    {
        setName(name);
        setColor(color);
    }

    //Method to draw cards from the deck
    public void drawCard()
    {
        //Draws a card from the deck
    }

    //Method to place cards in the discard pile
    public void discardCard()
    {
        //Places a card in the discard pile
    }
}
