package edu.au.javacourse.transformation;
import java.lang.Math;

public class Rotation extends AffineTransformation{
    public Rotation(double alpha){
        double[][] rotationProtoMatrix = {
                {Math.cos(alpha), Math.sin(alpha), 0},
                {-Math.sin(alpha),Math.cos(alpha),  0},
                {0, 0, 1}
        };
        this.matrix = new Matrix(rotationProtoMatrix);
    }
}
