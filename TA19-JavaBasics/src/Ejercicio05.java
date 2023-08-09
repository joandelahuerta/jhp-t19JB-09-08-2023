
public class Ejercicio05 {

	public static void main(String[] args) {
		int B = 2;
		int C = 10;
		int A = 14;
		int D = 17;
		System.out.println("Variable B: " + B + " / Variable C: " + C);
		System.out.println("Variable A: " + A + " / Variable D: " + D);
	    B = C;
	    System.out.println("B toma el valor de C: " + B);
	    C = A;
	    System.out.println("C toma el valor de A: " + C);
	    A = D;
	    System.out.println("A toma el valor de D: " + A);
	    D = B;
	    System.out.println("D toma el valor de B: " + D);
	}
}