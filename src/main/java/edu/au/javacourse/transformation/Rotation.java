package edu.au.javacourse.transformation;


public class Rotation extends AffineTransformation {
    private static Matrix createRotationMatrix(double alpha){
        double[][] rotationProtoMatrix = {
                {Math.cos(alpha), Math.sin(alpha), 0},
                {-Math.sin(alpha), Math.cos(alpha), 0},
                {0, 0, 1}
        };
        return new Matrix(rotationProtoMatrix);
    }
    public Rotation(double alpha) {
        super(createRotationMatrix(alpha));
    }
}
