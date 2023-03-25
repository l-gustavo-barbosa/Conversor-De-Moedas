import javax.swing.JOptionPane;

public class Euros {
	private double dolarCotacao = 0.93;
	private double realCotacao = 0.18;
	
	public void converterDolar(double valor) {
		double dolar = valor / dolarCotacao;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + dolar + "dólares");
	};
	
	public void converterReal(double valor) {
		double euro = valor / realCotacao;
		euro = (double) Math.round(euro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + euro + "reais");
	};
}
