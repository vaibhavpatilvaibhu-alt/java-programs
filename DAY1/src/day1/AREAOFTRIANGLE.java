package day1;
public class AREAOFTRIANGLE {
  void area() {
        double base = 10;
        double height = 5;
        double a = 0.5 * base * height;
        System.out.println("Area of Triangle = " + a);
    }
    public static void main(String[] args) {
    	AREAOFTRIANGLE d = new AREAOFTRIANGLE();
        d.area();
    }
}