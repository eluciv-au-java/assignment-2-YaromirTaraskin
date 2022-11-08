package edu.au.javacourse.transformation;

public class AffineTransformation implements Transformation{
    private Matrix matrix;

    public AffineTransformation(){
        this.matrix = new Matrix(new double[3][3]);
    }

    public AffineTransformation(Matrix matrix){
        this.matrix = matrix;
    }

    @Override
    public Point apply(Point p) {
        Matrix newPointVector = p.asVector().multiply(this.matrix);
        return null;
    }

    AffineTransformation thenDo(AffineTransformation next){
        Matrix newTransformationMatrix = this.matrix.multiply(next.matrix);
        return new AffineTransformation(newTransformationMatrix);
    }
}
