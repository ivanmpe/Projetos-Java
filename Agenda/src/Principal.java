import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Principal agenda = new Principal();

		Contato[] contatos = new Contato[10];

		menu(contatos);

	}

	public static void menu(Contato[] contatos) {
		Contato c = new Contato();
		Funcoes f = new Funcoes();

		int escolha = Integer
				.parseInt(JOptionPane
						.showInputDialog(
								null,
								"\t Escolha \n 1 - Adicionar \n 2 - Remover \n 3 - Buscar \n 4 - Lista de Contatos",
								"Agenda", JOptionPane.QUESTION_MESSAGE));

		switch (escolha) {
		case 1:
			c.nome = JOptionPane.showInputDialog(null, "Nome: ");
			c.telefone = JOptionPane.showInputDialog(null, "Telefone: ");
			f.adiciona(c, contatos);
			menu(contatos);
			break;
		case 2:
			String nome_remove = JOptionPane.showInputDialog(null, "Nome: ");
			f.remove(nome_remove, contatos);
			menu(contatos);
			break;

		case 3:
			String nome_busca = JOptionPane.showInputDialog(null, "Nome: ");
			f.busca(nome_busca, contatos);
			menu(contatos);
			break;
		case 4:
			f.lista(contatos);
			menu(contatos);
		default:
			JOptionPane.showMessageDialog(null, "Opção Invalida");
			break;
		}

	}

}
