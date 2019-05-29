import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author kayke.esantos
 *
 */
public class CalculoMedia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double nota1, nota2, media;
		System.out.println("Cálculo da média");
		// criando uma objeto para entrada de dados
		Scanner leia = new Scanner(System.in);
		System.out.println("Digitte a nota 1 : ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digitte a nota 2 : ");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota2) /2;
		System.out.println("Media:" + media);
		
		// criando um objeto para formatar o resultado 
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("Media:" + formatador.format(media));
		
		if (media < 5) {
			System.out.println("REPROVADO");
		} else { 
			System.out.println("REPROVADO");
		}
		
		leia.close();
	}

}
