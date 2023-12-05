package com.example.tickettoride;

import java.util.List;

public class TurnHandler
{
    public static final int PLACE_ROUTE = 0;
    private static final int DRAW_DESTINATION_CARDS = 2;
    private static final int DRAW_TRANSPORTATION_CARDS = 3;
    private int turn;
    private int numPlayers;
    private Player[] players;

    public TurnHandler(int numPlayers, Player[] players)
    {
        this.turn = 0;
        this.numPlayers = numPlayers;
        this.players = players;
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

    private static void drawTransportationCards(Player player, int numCards) {
        List<TransportationCard> drawnCards = TransportationDeck.drawTransportationCards(numCards);

        if (!drawnCards.isEmpty())
        {
            player.addToHand(drawnCards);
            // You might want to update UI or perform other actions based on the drawn cards
            System.out.println(player.getName() + " drew " + numCards + " transportation cards.");
        }
    }


    private static void drawDestinationCards(Player player, int numCards) {
        //Implement logic for drawing destination cards
        //List<DestinationCard> drawnCards = .drawDestinationCards(numCards);
        //player.addToHand(drawnCards);
        //You might want to update UI or perform other actions based on the drawn cards
    }

    private static void placeRoute(Player player) {
        // Implement logic for placing a route
        // Check if the player has the required cards and select a route to place
        // Update the player's hand and other game state accordingly
    }

    //Checks if the game is over
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
}

/*
    public static void handlePlayerTurn(Player player)
    {
        switch (player.getTurnPhase())
        {
            case DRAW_TRANSPORTATION_CARDS:
                // Implement logic for drawing transportation cards
                break;

            case DRAW_DESTINATION_CARDS:
                // Implement logic for drawing destination cards
                break;

            case PLACE_ROUTE:
                // Implement logic for placing a route
                break;

            default:
                // Handle unexpected turn phase
                break;
        }
    }
    */