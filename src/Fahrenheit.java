import javax.swing.JOptionPane;

public class Fahrenheit {
	public void fahrenheitCelsius(double graus) {
		double celsius = (graus - 32) / 1.8;
		JOptionPane.showMessageDialog(null, graus + " graus Fahrenheit, são equivalentes a " + celsius + " graus Celsius");
	}
	
	public void fahrenheitKelvin(double graus) {
		double kelvin = (graus * 459.67) * 0.55555555555555555555555555555556;
		JOptionPane.showMessageDialog(null, graus + " graus Fahrenheit, são equivalentes a " + kelvin + " graus Kelvin");
	}
}
