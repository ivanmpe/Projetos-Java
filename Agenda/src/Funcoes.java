import javax.swing.JOptionPane;

public class Funcoes {

	int contador = 0;

	public void adiciona(Contato c, Contato[] contatos) {

		for (int i = 0; i < 10; i++) {
			if (contatos[i] == null) {
				contatos[i] = c;
				contador++;
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				break;
			}

		}

		if (contador == 0) {
			JOptionPane.showMessageDialog(null, "Agenda Cheia!");
		}

	}

	public void remove(String nome, Contato[] contatos) {

		int contador = 0;
		for (int j = 0; j < contatos.length-1; j++) {

			if (contatos[j] == null){
				break;
			}else{
					if((contatos[j].nome.toString()).equals(nome.toString())) {
			
					contador++;

				int reposta = JOptionPane.showConfirmDialog(null,
						"Realmente deseja excluir:\n  Contato: "
								+ contatos[j].nome + "\n Telefone: "
								+ contatos[j].telefone, nome,
						JOptionPane.YES_NO_OPTION);

						if (reposta == JOptionPane.YES_NO_OPTION) {
							contatos[j] = null;
							JOptionPane.showMessageDialog(null,
									" Excluido com Sucesso.");

						} else {
							JOptionPane.showMessageDialog(null,
									" Contato não excluido ", "Contato",
									JOptionPane.INFORMATION_MESSAGE);
						}
				 }
			}
		}
			
		if (contador == 0) {
			JOptionPane.showMessageDialog(null, " Contato Inexistente ",
					"Contato", JOptionPane.ERROR_MESSAGE);

		}

	}

	public Contato busca(String nome, Contato[] contatos) {
		int contador = 0;
		for (int i = 0; i < 10; i++) {

			if ((contatos[i].nome).toString().equals(nome.toString())) {
				JOptionPane.showMessageDialog(null, "Nome: " + contatos[i].nome
						+ "\nTelefone :" + contatos[i].telefone, "Contato",
						JOptionPane.INFORMATION_MESSAGE);
				contador++;
				break;
			}

		}

		if (contador == 0) {
			JOptionPane.showMessageDialog(null, "Contato Inexistente");
		}
		return null;
	}

	public Contato lista(Contato[] contatos) {

		for (int i = 0; i < 10; i++) {
			if (contatos[i] == null) {
				break;
			} else {
				JOptionPane
						.showMessageDialog(null, " Nome: " + contatos[i].nome
								+ " Numero: " + contatos[i].telefone);
			}

		}

		return null;
	}

}
