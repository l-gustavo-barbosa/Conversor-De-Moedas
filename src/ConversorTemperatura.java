import javax.swing.JOptionPane;

public class ConversorTemperatura {
	Celsius celsius = new Celsius();
	Fahrenheit fahrenheit = new Fahrenheit();
	Kelvin kelvin = new Kelvin();
	
	public void selecionarUnidade() {
		String opcao = JOptionPane.showInputDialog(null, "Selecione sua unidade", "Unidade inicial", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[]{"Celsius", "Kelvin", "Fahrenheit"}, "Escolha").toString();
		switch(opcao) {
		case "Celsius":
			converterCelsius();
			break;
		case "Fahrenheit":
			converterFahrenheit();
			break;
		case "Kelvin":
			converterKelvin();
			break;
		}
	}

	private void converterCelsius() {
		String opcao = JOptionPane.showInputDialog(null, "Selecione sua unidade", "Unidade final", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[]{"Kelvin", "Fahrenheit"}, "Escolha").toString();
		String input = JOptionPane.showInputDialog("Insira um valor");
		double graus = Double.parseDouble(input);
		
		switch (opcao) {
		case "Kelvin": 
			celsius.celsiusKelvin(graus);
			break;
		case "Fahrenheit":
			celsius.celsiusFahrenheit(graus);
			break;	
		}
	}

	private void converterFahrenheit() {
		String opcao = JOptionPane.showInputDialog(null, "Selecione sua unidade", "Unidade final", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[]{"Celsius", "Kelvin"}, "Escolha").toString();
		String input = JOptionPane.showInputDialog("Insira um valor");
		double graus = Double.parseDouble(input);
		
		switch (opcao) {
		case "Celsius": 
			fahrenheit.fahrenheitCelsius(graus);
			break;
		case "Kelvin":
			fahrenheit.fahrenheitKelvin(graus);
			break;
		}
	}
	
	private void converterKelvin() {
		String opcao = JOptionPane.showInputDialog(null, "Selecione sua unidade", "Unidade final", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[]{"Celsius", "Fahrenheit"}, "Escolha").toString();
		String input = JOptionPane.showInputDialog("Insira um valor");
		double graus = Double.parseDouble(input);
		
		switch (opcao) {
		case "Celsius": 
			kelvin.kelvinCelsius(graus);
			break;
		case "Fahrenheit":
			kelvin.kelvinFahrenheit(graus);
			break;
		}
	}
	}
