package com.epam.jwd.model;

public interface Figure {
    boolean isItAFigure();
    int getNumberOfSide();
    Line getSide(int i);
    int getNumberOfVertices();
    Point getP(int i);
    Point[] getPoint();
    String toString();

}