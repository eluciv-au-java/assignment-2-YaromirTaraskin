package edu.au.javacourse.transformation;

public class Scaling extends AffineTransformation {
    private static Matrix createScaling(double kx, double ky){
        double[][] scalingProtoMatrix = {
                {kx, 0, 0},
                {0, ky, 0},
                {0, 0, 1}
        };
        return new Matrix(scalingProtoMatrix);
    }
    public Scaling(double kx, double ky) {
        super(createScaling(kx, ky));
    }

}
