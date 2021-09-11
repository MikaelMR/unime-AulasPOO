
public class aula1 {
	
	public static void main(String[] args ) {
		System.out.println("Test 1 (println"); // Exemplo 1 de output usando .out.println, pula uma linha após executar o texto.
		//System.err.println("Test 2 (err.println)"); // Exemplo 2 de output usando .err.println, é usado como mensagem caso aconteça algum erro.
		System.out.print("Test 3 (print)\n\n"); // Exemplo 3 de output usando .out.print, apenas faz a saída do texto, sem pular linha.
		//System.err.print("Test 4 (err.print)\n\n"); // Exemplo 4 de output usando .err.print, mesma coisa de err.println, porém sem pular linha.
		
		System.out.println("Test" + 5 + "!");
		System.out.println("Test" + "5");
		System.out.println("Soma: 1+1 = " + 1 + 1);
		System.out.println("Soma: 1+1 = " + (1 + 1) + "\n");
		
		int inteiro = 15;
		float decimal = (float) 1.5;
		double doubledecimal = 1.50;
		char character = 15;
		String nome = "Nome String";
		boolean truefalse; // Use Tabela Verdade.
		truefalse = false;
		truefalse = true;
		System.out.println("Inteiro: " + inteiro);
		System.out.println("Float: " + decimal);
		System.out.println("Double: " + doubledecimal);
		System.out.println("Char: " + character);
		System.out.println("String: " + nome);
		System.out.println("Boolean: " + truefalse);
		
	}
}
