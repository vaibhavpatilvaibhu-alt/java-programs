package prg1;

public class demo {
	void add(){
		int a=5;
		int b=27;
		System.out.println("addition="+(a+b));	}
	void sub() {
		float a=7;
		float b=5;
		System.out.println("substraction="+(a-b));
	}
	void mul() {
		int a=10;
		int b=27;
		System.out.println("multiplication="+(a*b));
	}
	void div() {
		int a=35;
		int b=2;
		System.out.println("division="+(a/b));
	}
public static void main(String[]args) {
	demo d=new demo();
	d.add();
	d.sub();
	d.mul();
	d.div();
	
}
}
