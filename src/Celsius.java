import javax.swing.JOptionPane;

public class Celsius {
	
	public void celsiusKelvin(double graus) {
		double kelvin = graus + 273.15; 
		JOptionPane.showMessageDialog(null, graus + " graus Celsius, são equivalentes a " + kelvin + " graus Kelvin");
	}
	
	public void celsiusFahrenheit(double graus) {
		double fahrenheit = (graus * 1.8) + 32; 
		JOptionPane.showMessageDialog(null, graus + " graus Celsius, são equivalentes a " + fahrenheit + " graus Fahrenheit");
	}
}
