import javax.swing.JOptionPane;



public class Moedas {
	Reais reais = new Reais();
	Euros euro = new Euros();
	Dolar dolar = new Dolar();
	
	public void selecionarMoeda() {
		String opcao = JOptionPane.showInputDialog(null, "Selecione sua moeda", "Moeda inicial", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[]{"Reais", "Dolares", "Euros"}, "Escolha").toString();
		switch (opcao) {
		case "Reais":
			converterReais();
			break;
		case "Euros":
			converterEuros();
			break;
		case "Dolares":
			converterDolares();
			break;
		}
	}
	
	public void converterReais() {
		String opcao = JOptionPane.showInputDialog(null, "Selecione sua moeda", "Moeda Final", JOptionPane.PLAIN_MESSAGE, null, 
			new Object[]{"Dolares", "Euros", "Libras Esterlinas", "Pesos Argentinos", "Pesos Chilenos"}, "Escolha").toString();
		String input = JOptionPane.showInputDialog("Insira um valor");
		double valorRecebido = Double.parseDouble(input);
	
		switch (opcao) {
		case "Euros":
			reais.converterEuro(valorRecebido);
			break;
		case "Dolares":
			reais.converterDolar(valorRecebido);
			break;
		case "Libras Esterlinas":
			reais.converterLibra(valorRecebido);
			break;
		case "Pesos Argentinos":
			reais.converterPesoA(valorRecebido);
			break;
		case "Pesos Chilenos":
			reais.converterPesoC(valorRecebido);
			break;
		}
	}
	
	public void converterEuros() {
		String opcao = JOptionPane.showInputDialog(null, "Selecione sua moeda", "Moeda Final", JOptionPane.PLAIN_MESSAGE, null, 
			new Object[]{"Dolares", "Reais"}, "Escolha").toString();
		String input = JOptionPane.showInputDialog("Insira um valor");
		double valorRecebido = Double.parseDouble(input);
	
		switch (opcao) {
		case "Dolares":
			euro.converterDolar(valorRecebido);
			break;
		case "Reais":
			euro.converterReal(valorRecebido);
			break;
		}
	};

	public void converterDolares() {
		String opcao = JOptionPane.showInputDialog(null, "Selecione sua moeda", "Moeda Final", JOptionPane.PLAIN_MESSAGE, null, 
			new Object[]{"Euros", "Reais", "Libras Esterlinas", "Pesos Argentinos", "Pesos Chilenos"}, "Escolha").toString();
		String input = JOptionPane.showInputDialog("Insira um valor");
		double valorRecebido = Double.parseDouble(input);
	
		switch (opcao) {
		case "Euros":
			dolar.converterEuro(valorRecebido);
			break;
		case "Reais":
			dolar.converterReal(valorRecebido);
			break;
		case "Libras Esterlinas":
			dolar.converterLibra(valorRecebido);
			break;
		case "Pesos Argentinos":
			dolar.converterPesoA(valorRecebido);
			break;
		case "Pesos Chilenos":
			dolar.converterPesoC(valorRecebido);
			break;
		}	
	};

}
