package foodTruck;

public class Restaurante {

	String nome;
	String comida1;
	String comida2;
	double valor1;
	double valor2;
	
	
	public Restaurante(String nome, String comida, String comida2, double valor, double valor2) {
		this.nome = nome;
		this.comida1 = comida;
		this.comida2 = comida2;
		this.valor1 = valor;
		this.valor2 = valor2;
	}
	
	public String exibirOpc() {
		return "1 - " + comida1 + " - " + valor1 + "\n2 - " + comida2 + " - " + valor2;
	}
}
