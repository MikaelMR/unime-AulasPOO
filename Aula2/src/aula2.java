import java.util.Scanner;

public class aula2 {

	public static void main (String[] args) {
		int idade;
		double altura;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = teclado.nextInt();
		System.out.print("Digite sua altura em metros: ");
		altura = teclado.nextDouble();
		System.out.println("Sua idade é: " + idade + " anos de idade.");
		System.out.println("Próximo ano você terá: " + (++idade) + " anos de idade.");
		System.out.println("Sua idade é: " + altura + "m de altura.\n");
		
		double num1, num2;
		System.out.print("Insira o 1º número: ");
		num1 = teclado.nextDouble();
		System.out.print("Insira o 2º número: ");
		num2 = teclado.nextDouble();
		
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Subtração: " + (num1 - num2));
		System.out.println("Multiplacação: " + (num1 * num2));
		System.out.println("Divisão: " + (num1 / num2));
		System.out.println("Resto de divisão: " + (num1 % num2));
		System.out.println("Potência: " + Math.pow(num1, num2));
		System.out.println("Raiz quadrada: " + Math.sqrt(num1));
		System.out.println("Raiz cúbica: " + Math.cbrt(num1));
		System.out.println("Radiciação: " + Math.pow(num1, 1.0/num2)); //cont no 6.txt
		
	}
	
}
