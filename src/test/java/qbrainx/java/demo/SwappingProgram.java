package qbrainx.java.demo;

public class SwappingProgram {
public static void main(String[] args) {
	int a = 10, b =20;
	System.out.println("Before swapping the value of a is " +a);
	System.out.println("Before swapping the value of b is " +b);
	System.out.println();
	
	a = a+b; // a = 30
	b = a-b; // 30-20 = 10
	a = a-b; // 30-10 = 20

	System.out.println("After swapping the value of a is " +a);
	System.out.println("After swapping the value of b is " +b);

}
}
