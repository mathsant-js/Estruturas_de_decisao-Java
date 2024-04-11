//if, else, else if
package defaultpackage;

public class Programa01 {

	public static void main(String[] args) {
		// Declarando e inicializando variáveis
		// Teste com os outros números também
		int numero = 9;
		// numero = 3;
		// numero = 5;
		
		/*
		 * se (numero > 5) então {
		 * 		escreva("Sim, o número " + numero + " é maior que 5");
		 * }
		 * */
		
		if (numero > 5) {
			System.out.println("Sim, o número " + numero + " é maior que 5");		
		}
		else if (numero < 5) {
			System.out.println("Não, o número " + numero + " é menor que 5.");
		}
		else {
			System.out.println("O número " + numero + " é igual a 5.");
		}
	}

}
