package edu.au.javacourse.transformation;

public class Scaling extends AffineTransformation {
    public Scaling(double kx, double ky, double kz) {
        double[][] scalingProtoMatrix = {
                {kx, 0, 0},
                {0, ky, 0},
                {0, 0, kz}
        };
        this.matrix = new Matrix(scalingProtoMatrix);
    }
    public Scaling(double kx, double ky) {
        this(kx, ky, 1);
    }
}
