import javax.swing.JOptionPane;

public class Dolar {
	private double euroCotacao = 1.0759;
	private double realCotacao = 0.1906;
	private double libraCotacao = 1.2230;
	private double pesoACotacao = 0.004859; 
	private double pesoCCotacao = 0.001233;
	
	public void converterEuro(double valor) {
		double euro = valor / euroCotacao;
		euro = (double) Math.round(euro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + euro + " euros");
	};
	
	public void converterReal(double valor) {
		double real = valor / realCotacao;
		real = (double) Math.round(real * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + real + " reais");
	};
	
	public void converterLibra(double valor) {
		double libra = valor / libraCotacao;
		libra = (double) Math.round(libra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + libra + " libras");
	};
	
	public void converterPesoA(double valor) {
		double pesoA = valor / pesoACotacao;
		pesoA = (double) Math.round(pesoA * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + pesoA + " pesos Argentinos");
	};
	
	public void converterPesoC(double valor) {
		double pesoC = valor / pesoCCotacao;
		pesoC = (double) Math.round(pesoC * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + pesoC + " pesos Chilenos");
	};
}
