package com.example.tickettoride;

import javafx.scene.paint.Color;

import java.util.*;

/**
 * Player class
 * This class will contain logic for the player and/or the player's hand
 * Includes:
 * - name
 * - player color
 * - score
 * - taxi counts
 * - hand(s)
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
    RandomImages randomImages = new RandomImages();
    private List<TransportationCard> transportationCards;
    public static String[][] cards = {
            {"Color.BLUE", "0"},
            {"Color.GREEN", "0"},
            {"Color.BLACK", "0"},
            {"Color.PINK", "0"},
            {"Color.RED", "0"},
            {"Color.ORANGE", "0"},
            {"Color.WHITE", "0"}
    };

    private List<DestinationCard> destinationCards;
    private Color playerColor;

    private Map<Color, Integer> playerHandMap = new LinkedHashMap<>();

    //-----------------------------------------------------------------\\
    public Player()
    {
        this.name = "Billy Bob";
        this.score = 0;
        this.numTransportationCards = 0;
        this.numDestinationCards = 0;
        this.numGamePieces = 0;
        this.transportationCards = new ArrayList<TransportationCard>();
        this.destinationCards = new ArrayList<DestinationCard>();
        this.playerColor = Color.WHITE;
        playerHandMap.put(Color.BLUE, 0);
        playerHandMap.put(Color.GREEN, 0);
        playerHandMap.put(Color.BLACK, 0);
        playerHandMap.put(Color.PINK, 0);
        playerHandMap.put(Color.RED, 0);
        playerHandMap.put(Color.ORANGE, 0);
        playerHandMap.put(Color.WHITE, 0);
    }

    /*
    blueCardImageViewP1,
    greenCardImageViewP1,
    blackCardImageViewP1,
    pinkCardImageViewP1,
    redCardImageViewP1,
    orangeCardImageViewP1,
    rainbowCardImageViewP1
     */

    public Player(String name, int score, int numTransportationCards, int numDestinationCards,
                  List<TransportationCard> transportationCards, List<DestinationCard> destinationCards,
                  int numGamePieces, Color playerColor)
    {
        this.name = name;
        this.score = score;
        this.numTransportationCards = numTransportationCards;
        this.numDestinationCards = numDestinationCards;
        this.numGamePieces = numGamePieces;
        this.transportationCards = new ArrayList<TransportationCard>();
        this.destinationCards = new ArrayList<DestinationCard>();
        this.playerColor = playerColor;
        playerHandMap.put(Color.BLUE, 0);
        playerHandMap.put(Color.GREEN, 0);
        playerHandMap.put(Color.BLACK, 0);
        playerHandMap.put(Color.PINK, 0);
        playerHandMap.put(Color.RED, 0);
        playerHandMap.put(Color.ORANGE, 0);
        playerHandMap.put(Color.WHITE, 0);
    }

    protected void setNumPlayers(int numPlayers)
    {
        if (numPlayers >= 2 && numPlayers <= 5)
        {
            this.numPlayers = numPlayers;
        }
    }

    public Map<Color, Integer> getPlayerHandMap()
    {
        return playerHandMap;
    }
    public void setPlayerCardAmount(Color color, int value) {
        playerHandMap.put(color, value);
    }

    //Change count values of the respective players cards
    public void incrementPlayerHandValue(Color color, int value) {
        int currentValue = playerHandMap.getOrDefault(color, 0);
        //prints out the current value of the card
        System.out.println("The current value of the card is: " + currentValue);
        int newValue = currentValue + value;
        playerHandMap.put(color, newValue);

        //prints out what was put in the map
        System.out.println("The value of the card put in the map is: " + playerHandMap.get(color));
    }

//------------------------------ Get/Sets -----------------------------\\
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

    //Sets up the name
    public void setName(String name)
    {
        if (name != null)
        {
            this.name = name;
        }
    }

    //Sets up the scoring
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

    public Color getPlayerColor()
    {
        return playerColor;
    }

    public void setPlayerColor(Color playerColor)
    {
        this.playerColor = playerColor;
    }

    public void setNameAndColor(String name, Color color)
    {
        setName(name);
        setPlayerColor(color);
    }

    public void addTransportationCard(TransportationCard card)
    {
        transportationCards.add(card);
    }

    public void addDestinationCard(DestinationCard card)
    {
        destinationCards.add(card);
    }

    public void removeTransportationCard(TransportationCard card)
    {
        transportationCards.remove(card);
    }

    public void removeDestinationCard(DestinationCard card)
    {
        destinationCards.remove(card);
    }

    public List<TransportationCard> getTransportationCards()
    {
        return transportationCards;
    }

    public List<DestinationCard> getDestinationCards()
    {
        return destinationCards;
    }

    public void setTransportationCards(List<TransportationCard> transportationCards)
    {
        this.transportationCards = transportationCards;
    }

    public void setDestinationCards(List<DestinationCard> destinationCards)
    {
        this.destinationCards = destinationCards;
    }

    public void incrementScore(int score)
    {
        this.score += score;
    }

    public void decrementScore(int score)
    {
        this.score -= score;
    }

    public void incrementNumTransportationCards(int numTransportationCards)
    {
        this.numTransportationCards += numTransportationCards;
    }

    public void decrementNumTransportationCards(int numTransportationCards)
    {
        this.numTransportationCards -= numTransportationCards;
    }

    public void incrementNumDestinationCards(int numDestinationCards)
    {
        this.numDestinationCards += numDestinationCards;
    }

    public void decrementNumDestinationCards(int numDestinationCards)
    {
        this.numDestinationCards -= numDestinationCards;
    }


    public void decrementNumGamePieces(int numGamePieces)
    {
        this.numGamePieces -= numGamePieces;
    }

    public int getTurnPhase()
    {
        return 0;
    }

    public int setTurnPhase(int phase)
    {
        return 0;
    }

    // This method will be called when the player draws transportation cards
    public void addTranspoCardsToHand(ArrayList<TransportationCard> drawnCards)
    {
        for (TransportationCard card : drawnCards)
        {
            //Gets the color of the drawn card from the deck
            Color cardColor = randomImages.selectRandomTransportationCardColor();
            //prints out the color of the card
            System.out.println("The color of the card is: " + cardColor);
            incrementPlayerHandValue(cardColor, 1);
        }
    }

    public void addDestToHand(ArrayList<DestinationCard> drawnCards)
    {
        for (DestinationCard card : drawnCards)
        {
            DestinationCard destCities = card.getCities();
            int destPoints = card.getPoints();
        }
    }
}
