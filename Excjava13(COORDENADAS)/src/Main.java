import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Descubra suas coordenadas no seguinte plano\n");
		System.out.println("       Y\n       |\n       |\n    q2 | q1\n-------|------- X\n    q3 | q4\n       |\n       |");
	
		double X, Y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nPor favor, digite uma coordenada real para o eixo X: ");
		X = sc.nextDouble();
		
		System.out.println("Por favor, digite uma coordenada real para o eixo Y: ");
		Y = sc.nextDouble();
		
		if (X == 0 && Y == 0) {
			System.out.println("Origem");
		}
		
		else if (X == 0) {
			System.out.println("Eixo Y");
		}
		
		else if (Y == 0) {
			System.out.println("Eixo X");
		}
		
		else if (X > Y && Y < 0) {
		    System.out.printf("\nOs valores:\n%.1f para X e %.1f para Y se localizam no quadrante 4", X, Y);
		}

		else if (X < 0 && Y < 0) {
			System.out.printf("\nOs valores:\n%.1f para X e %.1f para Y se localizam no quadrante 3", X, Y);
		}
		
		else if (X < 0 && Y > 0) {
			System.out.printf("\nOs valores:\n%.1f para X e %.1f para Y se localizam no quadrante 2", X, Y);
		}
		
		else {
			System.out.printf("\nOs valores:\n%.1f para X e %.1f para Y se localizam no quadrante 1", X, Y);
		}
		
		
		
		sc.close();
	}

}
