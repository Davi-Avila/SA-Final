package foodTruck;
import java.util.*;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Restaurante r1 = new Restaurante("Hamburguer Hamilton", "X-Burguer", "X-Bacon", 25, 20);
		Restaurante r2 = new Restaurante("Prensadãozão", "Prensado simples", "Prensado ESPECIAL", 20, 30);
		Restaurante r3 = new Restaurante("Garden food", "X-Salada simples", "Salada de frutas", 15, 20);
		String menuMain = "1 - Conta\n2 - Fazer pedido\n3 - Sair";
		String menuConta = "1 - Informações pessoais\n2 - Carteira";
		String menuRest = "1 - " + r1.nome + "\n2 - " + r2.nome + "\n3 - " + r3.nome;
		
		int opcao = 0;
		

		cliente.Cadastrar();
		while (opcao != 3) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menuMain));
			
			switch(opcao) {
			case 1:
				int opcao2;
				opcao2 = Integer.parseInt(JOptionPane.showInputDialog(menuMain));
				if (opcao2 == 1) {
					cliente.Exibir();
				}else if (opcao2 == 2) {
					int resposta = JOptionPane.showConfirmDialog(null, "Deseja depositar dinheiro?");
					if(resposta == 0) {
						cliente.fazerDep();
					}
				}
				break;
				
			case 2:
				int rest = 0;
				rest = Integer.parseInt(JOptionPane.showInputDialog(menuRest));
				switch(rest) {
				case 1:
					
				}
			}
		}
		
		
	}
}
