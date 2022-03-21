package Lanches;

import java.util.Scanner;

/**
 * 
 * @author Eduardo
 * @see Lanche
 *
 */

public abstract class Salgado extends Lanche {

	/**
	 * Construtor
	 */
	public Salgado() {

	}

	/**
	 * M�todo onde o usu�rio poder� escolher seu tipo de salgado , sendo assado ou
	 * frito , ap�s isso ele ter� op��es de escolher entre ou assado ou frito , e
	 * dentro de assado ou frito ter� 4 op��es referidas a cada um deles. Ap�s
	 * concluir a escolha , ser� passado ao usu�rio o pre�o do salgado , o tempo de
	 * entrega e uma mensagem de agradecimento.
	 * 
	 */
	public static void escolherSalgado() {
		int escolhaTipoSalgado, escolherTipoFrito, escolherTipoAssado;
		double distancia;
		Scanner ler4 = new Scanner(System.in);
		Scanner ler5 = new Scanner(System.in);
		Scanner ler6 = new Scanner(System.in);
		Scanner ler7 = new Scanner(System.in);

		System.out.println(
				"__________________________________Tipos de Salgado a escolher______________________________________________");
		Lanche.pularLinhas(1);
		System.out.println("                                  [ 1 ] - Frito ...... R$ 7,00");
		System.out.println("                                  [ 2 ] - Assado ........... R$ 5,00");

		escolhaTipoSalgado = ler4.nextInt();

		switch (escolhaTipoSalgado) {

		case 1:
			Frito f1 = new Frito();
			f1.setPreco(7.0);
			System.out.println("                                  [ 1 ] - Pastel");
			System.out.println("                                  [ 2 ] - Coxinha");
			System.out.println("                                  [ 3 ] - Enroladinho");
			System.out.println("                                  [ 4 ] - Bolinho de queijo");

			escolherTipoFrito = ler5.nextInt();

			switch (escolherTipoFrito) {
			case 1:
				System.out.println(" Voc� escolheu - Pastel");
				break;

			case 2:
				System.out.println(" Voc� escolheu - Coxinha");
				break;
			case 3:
				System.out.println(" Voc� escolheu - Enroladinho");
				break;
			case 4:
				System.out.println(" Voc� escolheu - Bolinho de queijo");
				break;

			default:
				System.out.println("N�mero inv�lido");
				break;

			}

			if (escolherTipoFrito < 4 && escolherTipoFrito > 0) {

				Lanche.mensagemTempoDeEntrega();
				distancia = ler7.nextInt();
				f1.fecharPedido();
				f1.calcularTempo(distancia);
			}
			break;

		case 2:
			Assado s1 = new Assado();
			s1.setPreco(5.0);

			System.out.println("                                  [ 1 ] - Pastel de Forno");
			System.out.println("                                  [ 2 ] - P�o Pizza");
			System.out.println("                                  [ 3 ] - Quibe");
			System.out.println("                                  [ 4 ] - Risole");

			escolherTipoAssado = ler6.nextInt();

			switch (escolherTipoAssado) {
			case 1:
				System.out.println(" Voc� escolheu - Pastel de Forno");
				break;
			case 2:
				System.out.println(" Voc� escolheu - P�o Pizza");
				break;
			case 3:
				System.out.println(" Voc� escolheu - Quibe");
				break;
			case 4:
				System.out.println(" Voc� escolheu - Risole");
				break;

			default:
				System.out.println("N�mero inv�lido");
				break;
			}

			if (escolherTipoAssado < 4 && escolherTipoAssado > 0) {

				Lanche.mensagemTempoDeEntrega();
				distancia = ler7.nextInt();
				s1.fecharPedido();
				s1.calcularTempo(distancia);
			}

			break;

		}

	}
}
