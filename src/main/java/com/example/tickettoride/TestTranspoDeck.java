package com.example.tickettoride;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestTranspoDeck
{
    ArrayList<TestTranspoCard> deck = new ArrayList<TestTranspoCard>();
    Random r = new Random();

    //Card images
    private static final String BLUECARD = "/com/example/tickettoride/TransportCards/BlueCard.png";
    private static final String GREENCARD = "/com/example/tickettoride/TransportCards/GreenCard.png";
    private static final String BLACKCARD = "/com/example/tickettoride/TransportCards/BlackCard.png";
    private static final String PINKCARD = "/com/example/tickettoride/TransportCards/PinkCard.png";
    private static final String REDCARD = "/com/example/tickettoride/TransportCards/RedCard.png";
    private static final String YELLOWCARD = "/com/example/tickettoride/TransportCards/OrangeCard.png";
    private static final String TAXICARD = "/com/example/tickettoride/TransportCards/RainbowCard.png";

    public TestTranspoDeck()
    {
        int i = 0;

        while (i < 12)
        {
            deck.add(new TestTranspoCard(new Image
                    (BLUECARD), Color.BLUE));
            deck.add(new TestTranspoCard(new Image
                    (GREENCARD), Color.GREEN));
            deck.add(new TestTranspoCard(new Image
                    (BLACKCARD), Color.BLACK));
            deck.add(new TestTranspoCard(new Image
                    (PINKCARD), Color.PINK));
            deck.add(new TestTranspoCard(new Image
                    (REDCARD), Color.RED));
            deck.add(new TestTranspoCard(new Image
                    (YELLOWCARD), Color.YELLOW));
            i++;
        }
        deck.add(new TestTranspoCard(new Image
                (TAXICARD), Color.WHITE));
        deck.add(new TestTranspoCard(new Image
                (TAXICARD), Color.WHITE));

        shuffle();
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    public TestTranspoCard getCard()
    {
        return deck.remove(0);
    }

    public void add(TestTranspoCard card)
    {
        deck.add(card);
    }
}
