package com.example.tickettoride;

public class Route
{
    public static final int TOTAL_ALL_ROUTES = 41;

    public static final int TOTAL_ROUTES = 30;
    public static final int TOTAL_DOUBLE_ROUTES = 22;

    public static int totalBlueRoutes = 0;
    public static int totalGreenRoutes = 0;
    public static int totalBlackRoutes = 0;
    public static int totalPinkRoutes = 0;
    public static int totalRedRoutes = 0;
    public static int totalOrangeRoutes = 0;
    public static int totalTaxiRoutes = 0;

    //Constructor
    public Route()
    {
        totalBlueRoutes = 0;
        totalGreenRoutes = 0;
        totalBlackRoutes = 0;
        totalPinkRoutes = 0;
        totalRedRoutes = 0;
        totalOrangeRoutes = 0;
        totalTaxiRoutes = 0;
    }

    //Constructor with parameters
    public Route(int blueRoute, int greenRoute, int blackRoute, int pinkRoute, int redRoute, int orangeRoute, int taxiRoute)
    {
        totalBlueRoutes = blueRoute;
        totalGreenRoutes = greenRoute;
        totalBlackRoutes = blackRoute;
        totalPinkRoutes = pinkRoute;
        totalRedRoutes = redRoute;
        totalOrangeRoutes = orangeRoute;
        totalTaxiRoutes = taxiRoute;
    }

    //Getters

}