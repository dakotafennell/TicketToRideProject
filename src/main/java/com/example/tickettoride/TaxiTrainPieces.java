package com.example.tickettoride;

/**
 * TaxiTrainPieces class
 * This class will contain logic for displaying and/or updating the taxi and train pieces of the game
 * and the general piece logic
 */
public class TaxiTrainPieces
{

    //Contains the maximum number of train pieces per player
    private int maxNumTrainPieces = 45;
    private int minNumTrainPieces = 3;

    //Contains the maximum number of taxi pieces per player
    private int maxNumTaxiPieces = 15;
    private int minNumTaxiPieces = 2;

    //Variable will be used to determine which type of piece
    private String vehicleType;
    //Variable to contain the piece's color
    private String color;
}
