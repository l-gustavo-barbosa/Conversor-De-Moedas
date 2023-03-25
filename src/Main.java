import javax.swing.JOptionPane;

public class Main {


	public static void main(String [] args){
		
		String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moeda","Conversor de Temperatura"}, "Escolha").toString();
		switch (opcoes) {
		case"Conversor de Moeda":
			Moedas moedas = new Moedas();
			moedas.selecionarMoeda();
			finalizar();
			break;
		case"Conversor de Temperatura":
			ConversorTemperatura temperatura = new ConversorTemperatura();
			temperatura.selecionarUnidade();
			finalizar();
			break;
		}
	}

	public static void finalizar() {
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		if(resposta == JOptionPane.OK_OPTION) {
			main( new String[0]);
		} else {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
	};
}
