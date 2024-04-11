// Instrução Switch

package defaultpackage;

public class Switch {

	public static void main(String[] args) {
		// Declarando e inicializando a variável
		int numero = 1;
		
		/* 
		 * A instrução switch diminui bastante o código 
		 * e deixa ele mais limpo
		*/
		switch (numero) {
		// Caso o número seja 1, ele cai nesta instrução
		case 1:
			System.out.println("O número é 1");
			/* 
			* O break para a verificação após uma instrução 
			* for verdadeira
			*/
			break;
		// Caso o número seja 2, ele cai nesta instrução
		case 2:
			System.out.println("O número é 2");
			break;
		// Caso o número seja 3, ele cai nesta instrução
		case 3:
			System.out.println("O número é 3");
			break;
		// Senão cair em nenhuma instrução acima, ele cai nesta
		default:
			System.out.println("O número é " + numero);
			break;
		}
	}

}
