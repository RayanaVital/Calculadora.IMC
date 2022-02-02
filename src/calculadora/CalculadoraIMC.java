package calculadora;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		double peso = 0;
		double altura = 0;
		Scanner sc  = new Scanner (System.in);
		System.out.println("Digite o peso" );
		peso = sc.nextDouble();
		System.out.println("Digite a altura");
		altura = sc.nextDouble();
		double IMC = peso/(altura*altura);
		if (IMC >= 18.5 && IMC <= 25) {
			System.out.println("Peso Ideal");
		}
		else {
			System.out.println("Fora do Peso");
		}


	}

}
