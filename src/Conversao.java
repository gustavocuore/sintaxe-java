
public class Conversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		
		float pontoFlutuante = 3.14f;
		
		int valor = (int) salario;
		System.out.println(valor);
		
		/*
		long numeroGrande = 20000000000l;
		short valorPequeno = 2131;
		byte b = 127;
		*/
		
		//um truque que explica por que não usar double para salários
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
