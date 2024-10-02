package exercicio_modulo_9;

public class Wrappers {

	public static void main(String[] args) {
		
		byte num1 = 10;
		long num2 = num1;
		System.out.println(num1);
		
		//deixei esse apresentar um erro
		int numA = 11111111;
		short numB = (short) numA;
		System.out.println(numB);
		
	}

}
