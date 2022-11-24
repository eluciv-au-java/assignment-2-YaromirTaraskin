package edu.au.javacourse.transformation;

public class AffineTransformation implements Transformation {
    private Matrix matrix;

    public AffineTransformation() {
        double[][] protoMatrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            protoMatrix[i][i] = 1;
        }
        this.matrix = new Matrix(protoMatrix);
    }

    public AffineTransformation(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public Point apply(Point p) {
        Matrix newPointVector = p.asVector().multiply(this.matrix);
        return new Point(newPointVector);
    }

    public AffineTransformation thenDo(AffineTransformation next) {
        Matrix newTransformationMatrix = this.matrix.multiply(next.matrix);
        return new AffineTransformation(newTransformationMatrix);
    }
}
