package foodTruck;
import javax.swing.JOptionPane;
public class Cliente {
	String nome;
	String cep;
	String senha;
	double saldo;
	
	public void Cadastrar() {
		nome = JOptionPane.showInputDialog("Digite seu nome");
		cep = JOptionPane.showInputDialog("Digite seu cep");
		senha = JOptionPane.showInputDialog("Sua senha");
		saldo = 0.00;
		JOptionPane.showInternalMessageDialog(null, "Cadastrado com sucesso");
		
	}
	
	public void Exibir() {
		JOptionPane.showInternalMessageDialog(null, "Nome: " + nome + "\nCep: " + cep + "\nSaldo: " + saldo,"", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void exibirSaldo() {
		JOptionPane.showInternalMessageDialog(null, "Saldo atual: " + saldo);
	}
	
	public void fazerDep() {
		double valor = 0;
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar:"));
		saldo += valor;
		JOptionPane.showMessageDialog(null, "O valor de R$" + valor + " foi depositado com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
