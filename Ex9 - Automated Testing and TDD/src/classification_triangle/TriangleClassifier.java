package classification_triangle;

public class TriangleClassifier {
    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;

    public TriangleClassifier() {}

    public TriangleClassifier(double firstEdge, double secondEdge, double thirdEdge) {
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.thirdEdge = thirdEdge;
    }

    public double getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }

    public double getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }

    public double getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }
    public boolean isTriangle() {
        return getFirstEdge() + getSecondEdge() > getThirdEdge()
                && getFirstEdge() + getThirdEdge() > getSecondEdge()
                && getSecondEdge() + getThirdEdge() > getFirstEdge()
                && getFirstEdge() > 0 && getSecondEdge() > 0 && getThirdEdge() > 0;
    }
    public String classifier() {
        if (isTriangle()) {
            if ( getFirstEdge() == getSecondEdge()
                    && getFirstEdge() == getThirdEdge()
                    && getSecondEdge() == getThirdEdge()) {
                return "Equilateral triangle";
            } else if ( getFirstEdge() == getSecondEdge()
                    || getFirstEdge() == getThirdEdge()
                    || getSecondEdge() == getThirdEdge()) {
                return "Isosceles triangle";
            } else {
                return "Normal triangle";
            }
        } else {
            return "Not a triangle";
        }
    }
}
