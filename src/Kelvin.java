import javax.swing.JOptionPane;

public class Kelvin {
	public void kelvinCelsius(double graus) {
		double celsius = graus - 273.15;
		JOptionPane.showMessageDialog(null, graus + " graus Kelvin, são equivalentes a " + celsius + " graus Celsius");
	}
	
	public void kelvinFahrenheit(double graus) {
		double fahrenheit = (graus - 273.15) * 1.8 + 32;
		JOptionPane.showMessageDialog(null, graus + " graus Kelvin, são equivalentes a " + fahrenheit + " graus Fahrenheit");
	}
}
