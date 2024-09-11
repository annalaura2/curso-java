package Fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		java.util.Scanner a = new Scanner(System.in); 
		java.util.Scanner b = new Scanner(System.in);
		
		
		System.out.print("Informe a sua idade: ");
		int idade = a.nextInt();
		System.out.print("Informe seu nome: ");
		String nome = b.nextLine();
		
		
		System.out.println("\n\nSua idade é = " + idade);
		System.out.println("Seu nome é = " + nome);
		
	}

}
