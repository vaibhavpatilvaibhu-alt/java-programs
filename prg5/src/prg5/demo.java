package prg5;

public class demo {

	    void area() {
	        double r = 5;
	        double a = Math.PI * r * r;

	        System.out.println("Area of Circle = " + a);
	    }

	    public static void main(String[] args) {
	        demo d = new demo();
	        d.area();
	    }
	}