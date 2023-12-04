package com.example.tickettoride;

public class TurnHandler
{
    private int turn;
    private int numPlayers;
    private Player[] players;

    public TurnHandler(int numPlayers, Player[] players)
    {
        this.turn = 0;
        this.numPlayers = numPlayers;
        this.players = players;
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