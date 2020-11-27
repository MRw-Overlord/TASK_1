package com.epam.jwd.model;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TriangleFactory implements AbstractFigureFactory {
    private static final Logger LOGGER = LogManager.getLogger(TriangleFactory.class);
    @Override
    public Figure createFigure(Point[] points) {
        Figure triangle = new Triangle(points[0], points[1], points[2]);
        LOGGER.info(" Triangle was created by TriangleFactory ");
        return triangle;
    }

}