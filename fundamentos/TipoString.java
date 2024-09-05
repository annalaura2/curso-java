package fundamentos;

public class TipoString {
	
	public static void main(String args[]) {
		
		System.out.println("olá pessoal".charAt(2));
		
		//Funcionalidades da String 
		String s = "boa tarde";
		System.out.println(s.concat("!!!!!"));
		System.out.println(s + "!!!!!!");
		
		// Informa se a string começa ou não com "boa": 
		System.out.println(s.startsWith("boa"));
	}

}
