package aula12;
import java.util.Scanner;

public class LeituraDeDadosDoTeclado {


	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		/*String linha = scan.nextLine();
		System.out.println(linha);
		*/
		
		int i;
		System.out.println("digite um inteiro, um nome e um double: ");
		i = scan.nextInt();
		String n = scan.next();
		double d = scan.nextDouble();
		System.out.println(i + n + d);
		
		scan.close();
	}

}
