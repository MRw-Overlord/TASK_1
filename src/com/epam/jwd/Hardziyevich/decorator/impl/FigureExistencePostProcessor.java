package com.epam.jwd.Hardziyevich.decorator.impl;

import com.epam.jwd.Hardziyevich.exception.FigureException;
import com.epam.jwd.Hardziyevich.factory.api.Figure;
import com.epam.jwd.Hardziyevich.decorator.api.FigurePostProcessor;
import com.epam.jwd.Hardziyevich.services.impl.ChooseFigureExistencePostProcessor;
import com.epam.jwd.Hardziyevich.services.impl.LineExistencePostProcessor;
import com.epam.jwd.Hardziyevich.services.impl.MultiAngleFigureExistencePostProcessor;
import com.epam.jwd.Hardziyevich.services.impl.SquareExistencePostProcessor;
import com.epam.jwd.Hardziyevich.services.impl.TriangleExistancePostProcessor;

public class FigureExistencePostProcessor implements FigurePostProcessor {
    @Override
    public Figure process(Figure figure) throws FigureException {
        exists(figure);
        return figure;
    }

    private void exists(Figure figure) throws FigureException {
        ChooseFigureExistencePostProcessor postProcessor = new ChooseFigureExistencePostProcessor();
        switch (figure.getFigureType()) {
            case LINE:
                postProcessor.setFigurePostProcessor(LineExistencePostProcessor.getInstance());
                postProcessor.executeFigureExistencePostProcessor(figure);
                break;
            case TRIANGLE:
                postProcessor.setFigurePostProcessor(TriangleExistancePostProcessor.getInstance());
                postProcessor.executeFigureExistencePostProcessor(figure);
                break;
            case SQUARE:
                postProcessor.setFigurePostProcessor(SquareExistencePostProcessor.getInstance());
                postProcessor.executeFigureExistencePostProcessor(figure);
                break;
            case MULTI_ANGLE:
                postProcessor.setFigurePostProcessor(MultiAngleFigureExistencePostProcessor.getInstance());
                postProcessor.executeFigureExistencePostProcessor(figure);
                break;
            default:
                break;
        }
    }
}
