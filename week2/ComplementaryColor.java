

public class ComplementaryColor {
	
	/* This main method receives two arguments: language and color.
	   Thus, you need to provide them when you're going to execute it.
	   For instance, if you run it on command line, you
	   could simply run: "java ComplementaryColor pt vermelho"
	  
	   If you're running on Eclipse, you need to set the arguments
	   in "Run/Run configurations/Arguments/Program arguments"
	   otherwise you'll just get a runtime exception and nothing will happen
	   Needing help with that don't hesitate on contacting me
	 */	
	/**
	 * 
	 * @param args[0] language (Ex: pt)
	 * @param args[1] color (Ex: vermelho)		
	 */
	public static void main(String[] args) {
		// Portuguese		
		if (args[0].equals("pt")) {
			String datos[] = portuguese(args[0], args[1]);

			System.out.print("Legal, você escolheu \"" + args[1] );
			System.out.println("\", cor de " + datos[0] + ".");
			System.out.println("Sua cor complementar é: " + datos[1] + "!");

			//	System.out.print(data[0]);
			//	System.out.print(data[1]);
		}


		// English
		if (args[0].equals("en")) {
			String data[] = english(args[0], args[1]);

			System.out.print("Great, you chose \"" + args[1] );
			System.out.println("\", color of " + data[0] + ".");
			System.out.println("Its complementary color is: " + data[1] + "!");
		}



	/* Method for English language*/
	public static String[] english( String langus, String color ) {
		String[] data = new String[2];
		String representation = "";
		String cColor = "";

		if ("red".equals(color)) {
			representation = "tomato";
			cColor = "green";
		}
		else if ("purple".equals(color)) {
			representation = "eggplant";
			cColor = "yellow";
		}
		else if ("blue".equals(color)) {
			representation = "blueberry";
			cColor = "orange";
		}
		else if ("green".equals(color)) {
			representation = "lettuce";
			cColor = "red";
		}
		else if ("yellow".equals(color)) {
			representation = "melon";
			cColor = "purple";
		}
		else if ("orange".equals(color)) {
			representation = "tangerine";
			cColor = "blue";
		}

		data[0] = representation;
		data[1] = cColor;	

		return data;

	}

	/* Method for Portuguese language*/
	public static String[] portuguese( String langu, String colores ) {
		String[] datos = new String[2];
		String representation = "";
		String cColor = "";		

		String color = colores;

		if ("vermelho".equals(color)) {
			representation = "tomate";
			cColor = "verde";
		}
		else if ("roxo".equals(color)) {
			representation = "berinjela";
			cColor = "amarelo";
		}
		else if ("azul".equals(color)) {
			representation = "mirtilo";
			cColor = "laranja";
		}
		else if ("verde".equals(color)) {
			representation = "alface";
			cColor = "vermelho";
		}
		else if ("amarelo".equals(color)) {
			representation = "melão";
			cColor = "roxo";
		}
		else if ("laranja".equals(color)) {
			representation = "tangerina";
			cColor = "azul";
		}

		datos[0] = representation;
		datos[1] = cColor;

		return datos;

	}
}
