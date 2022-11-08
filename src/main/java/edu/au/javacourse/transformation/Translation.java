package edu.au.javacourse.transformation;

public class Translation extends AffineTransformation{
    public Translation(double dx, double dy){
        double[][] translationProtoMatrix = {
                {1, 0, 0},
                {0, 1, 0},
                {dx, dy, 1}
        };
        this.matrix = new Matrix(translationProtoMatrix);
    }
}
