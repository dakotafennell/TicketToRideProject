package com.example.tickettoride;

import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Glow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HighlightSimplificationRectangles {

    // Rectangle sizes
    public static final double HEIGHT = 15;
    public static final double WIDTH = 50;
    public static final double WIDTH2 = 100;
    public static final double WIDTH3 = 150;
    public static final double WIDTH4 = 200;

    // Number of routes
    private static final int TWO_WIDE_ROUTES = 22;
    private static final int THREE_WIDE_ROUTES = 9;
    private static final int FOUR_WIDE_ROUTES = 1;

    // Arrays to store rectangles and their properties
    private Rectangle[] rectangles;
    private double[][] positions;
    private double[] rotations;

    public HighlightSimplificationRectangles() {
        // Initialize arrays
        rectangles = new Rectangle[TWO_WIDE_ROUTES + THREE_WIDE_ROUTES + FOUR_WIDE_ROUTES];
        positions = new double[TWO_WIDE_ROUTES + THREE_WIDE_ROUTES + FOUR_WIDE_ROUTES][2];
        rotations = new double[TWO_WIDE_ROUTES + THREE_WIDE_ROUTES + FOUR_WIDE_ROUTES];

        // Create rectangles
        createRectangles();

        // Set positions and rotations
        setPositions();
        setRotations();
    }

    private void createRectangles() {
        // Create rectangles based on the number of routes
        for (int i = 0; i < TWO_WIDE_ROUTES; i++) {
            rectangles[i] = new Rectangle(WIDTH, HEIGHT);
        }
        for (int i = TWO_WIDE_ROUTES; i < TWO_WIDE_ROUTES + THREE_WIDE_ROUTES; i++) {
            rectangles[i] = new Rectangle(WIDTH2, HEIGHT);
        }
        for (int i = TWO_WIDE_ROUTES + THREE_WIDE_ROUTES; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(WIDTH3, HEIGHT);
        }
    }

    private void setPositions()
    {
        // Set positions based on the route type
        int index = 0;
        for (int i = 0; i < TWO_WIDE_ROUTES; i++)
        {
            positions[index][0] = 210;
            positions[index][1] = 653;
            index++;
        }
        for (int i = 0; i < THREE_WIDE_ROUTES; i++)
        {
            positions[index][0] = 325;
            positions[index][1] = 720;
            index++;
        }
        for (int i = 0; i < FOUR_WIDE_ROUTES; i++)
        {
            positions[index][0] = 83;
            positions[index][1] = 470;
            index++;
        }
    }

    private void setRotations()
    {
        // Set rotations based on the route type
        int index = 0;
        for (int i = 0; i < TWO_WIDE_ROUTES; i++)
        {
            rotations[index] = 70;
            index++;
        }
        for (int i = 0; i < THREE_WIDE_ROUTES; i++)
        {
            rotations[index] = 7;
            index++;
        }
        for (int i = 0; i < FOUR_WIDE_ROUTES; i++)
        {
            rotations[index] = 110;
            index++;
        }
    }

    public Rectangle[] getRectangles() {
        return rectangles;
    }

    public double[][] getPositions() {
        return positions;
    }

    public double[] getRotations() {
        return rotations;
    }
}
