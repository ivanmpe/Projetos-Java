import javax.swing.JOptionPane;

public class Funcoes {

	public void escolha(int dificuldade, String resposta) {

		int chances = 5;
		int venceu = 0;
		int tamanhoPalavra = resposta.length();
		int cont = 0;

		System.out.println("\tA palavra tem " + tamanhoPalavra + " Letras.");
		String resultado[] = new String[tamanhoPalavra];
		esconde_palavra(tamanhoPalavra, resultado);

		while (chances != 0) {

			String palavra[] = resposta.split("");
			status_atual(resultado);
			System.out.print("\nVoce tem " + chances + " chance(s).\n");
			String letra = JOptionPane.showInputDialog(null,
					"\nEntre com uma letra : ");

			for (int j = 0; j < resultado.length; j++) {
				if (palavra[j].toString().equals(letra.toString())) {
					resultado[j] = letra;
					cont++;
					venceu++;
				}

			}

			/*
			 *  testar caso se a letra nao esteja na palavra as chances
			deverão ser diminuidas.*/

			if (cont > 0) {
				cont = 0;

			} else {
				chances--;
			}

			// caso o usuario tenha acertado
			if (chances < 0) {
				JOptionPane.showMessageDialog(null, "Você perdeu!");
				System.exit(0);
				break;
			} else if (venceu == tamanhoPalavra) {
				status_atual(resultado);
				JOptionPane.showMessageDialog(null, "Voce venceu!");
				System.exit(0);
				break;

			}

		}

	}

	/* Metodo de criação da mascara da palavra */
	public void esconde_palavra(int tamanhoPalavra, String mascara[]) {
		for (int j = 0; j < tamanhoPalavra; j++) {
			mascara[j] = " _ ";
		}

	}

	/* metodo para ver o status do jogador! */
	public void status_atual(String mascara[]) {
		for (int i = 0; i < mascara.length; i++) {
			System.out.print(mascara[i]);
		}

	}

}