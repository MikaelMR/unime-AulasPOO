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
		System.out.println("Sua idade �: " + idade + " anos de idade.");
		System.out.println("Pr�ximo ano voc� ter�: " + (++idade) + " anos de idade.");
		System.out.println("Sua idade �: " + altura + "m de altura.\n");
		
		double num1, num2;
		System.out.print("Insira o 1� n�mero: ");
		num1 = teclado.nextDouble();
		System.out.print("Insira o 2� n�mero: ");
		num2 = teclado.nextDouble();
		
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Subtra��o: " + (num1 - num2));
		System.out.println("Multiplaca��o: " + (num1 * num2));
		System.out.println("Divis�o: " + (num1 / num2));
		System.out.println("Resto de divis�o: " + (num1 % num2));
		System.out.println("Pot�ncia: " + Math.pow(num1, num2));
		System.out.println("Raiz quadrada: " + Math.sqrt(num1));
		System.out.println("Raiz c�bica: " + Math.cbrt(num1));
		System.out.println("Radicia��o: " + Math.pow(num1, 1.0/num2)); //cont no 6.txt
		
	}
	
}
