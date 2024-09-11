package Fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		java.util.Scanner entrada = new Scanner(System.in); 
		System.out.print("Informe a sua idade:");
		String idade = entrada.nextLine();
		System.out.println("\nSua idade é = " + idade);
		
	}

}
