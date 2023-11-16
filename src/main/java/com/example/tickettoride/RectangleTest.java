package com.example.tickettoride;

import javafx.scene.paint.Color;

public class RectangleTest
{
    private Color rectangleColor;
    private double width;
    private double height = 15;
    private double rotationAngle;

    //Constructor for the highlightRectangle class
    public RectangleTest(double width, double HEIGHT, double rotationAngle, Color rectangleColor)
    {
        this.width = width;
        this.height = HEIGHT;
        this.rotationAngle = rotationAngle;
        this.rectangleColor = rectangleColor;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHEIGHT()
    {
        return height;
    }

    public double getRotationAngle()
    {
        return rotationAngle;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setHEIGHT(double HEIGHT)
    {
        this.height = height;
    }

    public void setRotationAngle(double rotationAngle)
    {
        this.rotationAngle = rotationAngle;
    }

    public Color getRectangleColor()
    {
        return rectangleColor;
    }

    public void setRectangleColor(Color rectangleColor)
    {
        this.rectangleColor = rectangleColor;
    }
}