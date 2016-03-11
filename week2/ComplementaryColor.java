

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
		if (args[0].equals("pt")) {
			String color = args[1];
			System.out.print("Legal, você escolheu \"" + color);
			String representation = "";
			String cColor = "";
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
			};
			System.out.println("\", cor de " + representation + ".");

			System.out.println("Sua cor complementar é: " + cColor + "!");
		}
	}
}
