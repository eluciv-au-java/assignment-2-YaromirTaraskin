package edu.au.javacourse.transformation;

public class Translation extends AffineTransformation {
    private static Matrix createTranslation(double dx, double dy) {
        double[][] translationProtoMatrix = {
                {1, 0, 0},
                {0, 1, 0},
                {dx, dy, 1}
        };
        return new Matrix(translationProtoMatrix);
    }
    public Translation(double dx, double dy) {
        super(createTranslation(dx, dy));
    }
}
