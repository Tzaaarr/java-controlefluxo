import java.util.Scanner;

public class Contador {
	public static void main (String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Aplicado Iniciado");
		System.out.print("Digite o primeiro numero:");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo numero:");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm,parametroDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println("Segundo parametro deve ser maior que o primeiro!");
		}
		
		terminal.close();
		
	}
	
	static void contar (int parametroUm, int parametroDois)throws ParametrosInvalidosException {
		
		if (parametroDois > parametroUm) {
			
			int numFinal = parametroDois - parametroUm;
			int contador = 1;
			while (contador <= numFinal) {
				if (contador == numFinal) {
					System.out.print(contador);
				} else {
					System.out.print(contador + ",");
				}
				contador++;
			}
			
		} else {
			throw new ParametrosInvalidosException();
		}
		
		
		
	}
}
