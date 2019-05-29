import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraIMC {

	        public static void main(String[] args) {
			double altura,peso,imc;
			System.out.println("Cálculo IMC");
			// criando uma objeto para entrada de dados
			Scanner leia = new Scanner(System.in);
			System.out.println("Digitte sua altura : ");
			altura = leia.nextDouble();
			
			System.out.println("Digitte seu peso : ");
			peso = leia.nextDouble();
			
			imc = peso / (altura * altura);
			
			// criando um objeto para formatar o resultado 
			DecimalFormat formatador = new DecimalFormat("0.00");
			System.out.println("IMC :" + formatador.format(imc));
			
			if (imc < 18.5) {
				System.out.println(" abaixo do peso ");
			} else if (imc >= 18.5 && imc < 25) { 
				System.out.println(" peso normal ");
			} else if (imc >= 25 && imc < 30) { 
				System.out.println(" acima do peso ");
			} else { 
				System.out.println(" obeso ");
			}
			
			leia.close();
		
	}

}
