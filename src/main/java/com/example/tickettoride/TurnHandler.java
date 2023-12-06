package com.example.tickettoride;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;
/*
    Class that handles the turn logic
    -Creates list of the current players and implements turns
     through use of the list
 */
public class TurnHandler
{
    public static final int DRAW_TRANSPORTATION_CARDS = 0;
    public static final int DRAW_DESTINATION_CARDS = 1;
    public static final int PLACE_ROUTE = 2;
    private int turn;
    private int numPlayers;
    private Player[] players;
    //Gets the current players
    ObservableList<Player> currentPlayers = FXCollections.observableArrayList();

    public TurnHandler(int numPlayers, ObservableList<Player> players)
    {
        this.turn = 0;
        this.numPlayers = numPlayers;
        this.players = new Player[numPlayers];
    }

    public static void handlePlayerTurn(Player player)
    {
        switch (player.getTurnPhase()) {
            case DRAW_TRANSPORTATION_CARDS:
                drawTransportationCards(player, 2);
                break;

            case DRAW_DESTINATION_CARDS:
                drawDestinationCards(player, 2);
                break;

            case PLACE_ROUTE:
                placeRoute(player);
                break;

            default:
                //Handles an unexpected turn phase
                break;
        }
    }

    //----------------- Sets up the Drawing of the cards per turn -------------------\\
    private static void drawTransportationCards(Player player, int numCards)
    {
        //gets the player's hand
        List<TransportationCard> drawnCards = TransportationDeck.drawTransportationCards(numCards);

        if (!drawnCards.isEmpty())
        {
            player.addTranspoCardsToHand((ArrayList<TransportationCard>) drawnCards);
            //Prints out the player's name and what cards they drew
            //System.out.println(player.getName() + " drew " + numCards + " transportation cards.");
        }
    }

    private static void drawDestinationCards(Player player, int numCards) {
        List<DestinationCard> drawnCards = DestinationCard.drawDestinationCards(numCards);

        if (!drawnCards.isEmpty())
        {
            //Adds the drawn cards to the player's hand
            player.addDestToHand((ArrayList<DestinationCard>) drawnCards);
            //System.out.println(player.getName() + " drew " + numCards + " destination cards.");
        }
    }

    //Method for handling placing routes
    private static void placeRoute(Player player)
    {
        //Gets the current players
        ObservableList<Player> currentPlayers = FXCollections.observableArrayList();
        //For each player, check if they have enough cards to place a route
        //If they do, then they can place a route
        for (int i = 0; i < currentPlayers.size(); i++)
        {
            //Checks which routes are available to the player to place
            if (!currentPlayers.get(i).getTransportationCards().isEmpty())
            {
                //If the player has enough cards, then they can place a route
                currentPlayers.get(i).setTurnPhase(TurnHandler.PLACE_ROUTE);
                //If the player has one card, displays the one block highlight rectangles
                if (currentPlayers.get(i).getTransportationCards().size() == 1)
                {
                    //Displays the one block highlight rectangles
                }
            }
        }
    }

    //---------------- Checks if the game is over ----------------------\\
    protected boolean endGame()
    {
        for (int i = 0; i < numPlayers; i++)
        {
            if (players[i].getNumGamePieces() <= 2)
            {
                return true;
            }
        }
        return false;
    }

    public void nextTurn()
    {
        if (turn == numPlayers - 1)
        {
            turn = 0;
        }
        else
        {
            turn++;
        }
    }

    public int getTurn()
    {
        return turn;
    }

    public Player getCurrentPlayer()
    {
        return players[turn];
    }

    public void setCurrentPlayer(Player player)
    {
        players[turn] = player;
    }

    public void setTurn(int turn)
    {
        this.turn = turn;
    }

    //method to end the current player's turn
    public void endTurn()
    {
        //Gets the current players
        ObservableList<Player> currentPlayers = FXCollections.observableArrayList();
        //For each player, check if they have enough cards to place a route
        //If they do, then they can place a route
        for (int i = 0; i < currentPlayers.size(); i++)
        {
            //Checks which routes are available to the player to place
            if (!currentPlayers.get(i).getTransportationCards().isEmpty())
            {
                //If the player has enough cards, then they can place a route
                currentPlayers.get(i).setTurnPhase(TurnHandler.PLACE_ROUTE);
            }
        }
    }
}