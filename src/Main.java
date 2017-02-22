public class Main {

    public static void main(String[] args) {
	// write your code here

        double s1 = 2.0;
        double s2 = 3.0;
        double s3 = 2.0;
        double s4 = 3.0;

        double area = Square.getArea(s1, s2);
        double perimeter = FourSidedShape.getPerimeter(s1, s2, s3, s4);
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);


    }
}
