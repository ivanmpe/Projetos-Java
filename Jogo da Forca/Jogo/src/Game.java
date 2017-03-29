import javax.swing.JOptionPane;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Funcoes m = new Funcoes();
		menu(m);
	}

	public static void menu(Funcoes m) {

		String facil = "ceara";
		String medio = "fortaleza";
		String dificil = "ruby";
		int dificuldade = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Escolha Level: \n 1 - Facil\n 2 - Medio \n 3 - Dificil "));
		switch (dificuldade) {
		case 1:
			System.out.println("\tDica: Estado Brasileiro. ");
			m.escolha(dificuldade, facil);
			menu(m);
			break;
		case 2:
			System.out.println("\tDica:  Capital do estado do Ceará. ");
			m.escolha(dificuldade, medio);
			menu(m);
			break;
		case 3:
			System.out.println("\tDica: Linguagem de programação. ");
			m.escolha(dificuldade, dificil);
			menu(m);
			break;
		default:
			JOptionPane.showMessageDialog(null,
					"Opção Invalida! \n Finalizando...");
		}

	}
}