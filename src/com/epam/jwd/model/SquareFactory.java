package com.epam.jwd.model;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class SquareFactory implements AbstractFigureFactory{
    private static final Logger LOGGER = LogManager.getLogger(SquareFactory.class);
    private static SquareFactory instance;

    private SquareFactory() {

    }

    public static SquareFactory getInstance() {
        if (instance == null) {
            instance = new SquareFactory();
        }
        return instance;
    }
    @Override
    public Figure createFigure(Point[] points) {
        Figure square = new Square(points[0], points[1],points[2], points[3]);
        LOGGER.info(" Square was created by SquareFactory ");
        return square;
    }
}
