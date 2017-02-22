/**
 * Created by davidshinabarger on 2/22/17.
 * I know this isn't correct but I can't figure it out without googling it. I thought I had examples to use on my computer but, I don't.
 */
public class FourSidedShape extends Square {
    private double s1;
    private double s2;
    private double s3;
    private double s4;

    public FourSidedShape(double s1, double s2, double s3, double s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    public static double getPerimeter(double s1, double s2, double s3, double s4) {
        double perimeter = s1 + s2 + s3 + s4;
        return perimeter;
    }

    public double getS1() {
        return s1;
    }
    public void setS1(double s1) {
        this.s1 = s1;
    }
    public double getS2() {
        return s2;
    }
    public void setS2(double s2) {
        this.s2 = s2;
    }
    public double getS3() {
        return s3;
    }
    public void setS3(double s3) {
        this.s3 = s3;
    }
    public double getS4() {
        return s4;
    }
    public void setS4(double s4) {
        this.s4 = s4;
    }

}
