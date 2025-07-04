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
			
			//Switch do menu principal
			switch(opcao) {
			case 1: //Visualizar conta
				int opcao2;
				opcao2 = Integer.parseInt(JOptionPane.showInputDialog(menuConta));
				if (opcao2 == 1) {	//Exibir conta
					cliente.Exibir();
				}else if (opcao2 == 2) { //pergunta se quer fazer deposito, se sim, realiza o método
					int resposta = JOptionPane.showConfirmDialog(null, "Saldo atual: R$" + cliente.saldo + "\nVocê deseja realizar um depósito?");
					if(resposta == 0) {
						cliente.fazerDep();
					}else { //Sai caso selecione não ou cancelar
						break;
					}
				}
				break;
				
			case 2:
				int rest = 0;
				rest = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do restaurante que deseja fazer o pedido: \n" + menuRest));
				String restString = "";
				int pedido = 0;
				double valorP = 0;
				switch(rest) {		//Mostra as opções de acordo com o restaurante selecionado
				case 1:
					pedido = Integer.parseInt(JOptionPane.showInputDialog(r1.exibirOpc()));
					restString = "r1";	//Define uma String com o objeto restaurante correto
					break;
				case 2:
					pedido = Integer.parseInt(JOptionPane.showInputDialog(r2.exibirOpc()));
					restString = "r2";
					break;
				case 3:
					pedido = Integer.parseInt(JOptionPane.showInputDialog(r3.exibirOpc()));
					restString = "r3";
					break;
				default:
					JOptionPane.showMessageDialog(null, "Você digitou um restaurante inválido", "Erro", JOptionPane.ERROR_MESSAGE);
					break;
				}
				
				switch (pedido) {
				case 1:
					if (restString.equals("r1")) {	//Utiliza a String restaurante para selecionar o valor do pedido
						valorP = r1.valor1;
					}
					else if(restString.equals("r2")) {
						valorP = r2.valor1;
					}
					else if (restString.equals("r3")) {
						valorP = r3.valor1;
					}
					break;
				case 2:
					if (restString.equals("r1")) {
						valorP = r1.valor2;
					}
					else if(restString.equals("r2")) {
						valorP = r2.valor2;
					}
					else if (restString.equals("r3")) {
						valorP = r3.valor2;
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "Você digitou um pedido inválido", "Erro", JOptionPane.ERROR_MESSAGE);
					break;
				}
				
				int confirmar = JOptionPane.showConfirmDialog(null, "Deseja confirmar o seu pedido no valor de R$" + valorP + "?");
				if(confirmar != 0) {
					break;
				}
				
				if (cliente.saldo >= valorP) {	//Verifica se o saldo é suficiente
					cliente.saldo -= valorP;
					JOptionPane.showMessageDialog(null, "Pedido no valor de R$" + valorP + "realizado com sucesso!\nSeu lanche já está sendo preparado.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Seu pedido já foi enviado para o CEP " + cliente.cep, "À caminho", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Saldo insuficiente. \nNão foi possível realizar o pedido.", "Erro", JOptionPane.ERROR_MESSAGE);
				}
				break;
				
				
			}
		}
		System.exit(0);
		
	}
}
