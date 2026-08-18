package day1;
public class DEMO {
	int a=69;
	static int c=99;
	void m1() {
		int a=10;
		System.out.println("number"+a);
	}
	public DEMO() {
		int b = 10;
		System.out.println("NUM" + b);
	}
	public static void main(String[] args) {
		DEMO test = new DEMO();
		test.m1();
		System.out.println("thank you"+test.a);
		System.out.println(c);
		System.out.println(DEMO.c);

	}
}