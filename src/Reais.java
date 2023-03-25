import javax.swing.JOptionPane;

public class Reais {
	private double dolarCotacao = 5.2463;
	private double euroCotacao = 5.6445;
	private double libraCotacao = 6.4162;
	private double pesoACotacao = 0.0255;
	private double pesoCCotacao = 0.00647;
	
	public void converterDolar(double valor) {
		double dolar = valor / dolarCotacao;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + dolar + "dólares");
	};
	
	public void converterEuro(double valor) {
		double euro = valor / euroCotacao;
		euro = (double) Math.round(euro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + euro + "euros");
	};
	
	public void converterLibra(double valor) {
		double libra = valor / libraCotacao;
		libra = (double) Math.round(libra * 100d) / 100;
		JOptionPane.showMessageDialog(null,"Você tem $" + libra + "Libras Esterlinas");
	}
	
	public void converterPesoA(double valor) {
		double pesoA = valor / pesoACotacao;
		pesoA = (double) Math.round(pesoA * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + pesoA + "Pesos Argentinos");
	}
	
	public void converterPesoC(double valor) {
		double pesoC = valor / pesoCCotacao;
		pesoC = (double) Math.round(pesoC * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + pesoC + "Pesos Chilenos");
	}
}


