package com.example.tickettoride;

/**
 * Player class
 * This class will contain logic for the player and/or the player's hand
 */
public class Player
{
    //Player attributes
    //The Number of players
    private int numPlayers;
    //Players name
    private String name;
    //Players score
    private int score;
    //The number of Transportation cards in the player's hand
    private int numTransportationCards;
    //The number of Destination tickets in the player's hand
    private int numDestinationCards;
    //Number of Taxi or Train pieces
    private int numGamePieces;



    //Player constructor
    public Player(String name, int numPlayers)
    {
        this.name = name;
        this.score = 0;
        this.numTransportationCards = 0;
        this.numDestinationCards = 0;
        this.numGamePieces = 0;
        this.numPlayers = numPlayers;
    }

    //Player getters and setters
    //Getters
    public String getName()
    {
        return this.name;
    }

    public int getScore()
    {
        return this.score;
    }

    public int getNumPlayers()
    {
        return this.numPlayers;
    }

    public int getNumTransportationCards()
    {
        return this.numTransportationCards;
    }

    public int getNumDestinationCards()
    {
        return this.numDestinationCards;
    }

    public int getNumGamePieces()
    {
        return this.numGamePieces;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public void setNumTransportationCards(int numTransportationCards)
    {
        this.numTransportationCards = numTransportationCards;
    }

    public void setNumDestinationCards(int numDestinationCards)
    {
        this.numDestinationCards = numDestinationCards;
    }

    public void setNumGamePieces(int numGamePieces)
    {
        this.numGamePieces = numGamePieces;
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
