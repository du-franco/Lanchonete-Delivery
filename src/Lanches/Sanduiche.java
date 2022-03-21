package Lanches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Eduardo
 * @see Lanches
 * @see TempoInterface
 */

public class Sanduiche extends Lanche implements TempoInterface {
	/**
	 * Construtor
	 */
	public Sanduiche() {

	}

	/**
	 * Lista de Arrays contendo os ingredientes que o usu�rio pode adicionar
	 */
	List<String> ingredientes = new ArrayList<>();

	/**
	 *
	 * M�todos GET e SET
	 */
	public void setIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente);

	}

	public void getIngrediente() {
		System.out.println("  Voc� escolheu os ingredientes: " + this.ingredientes);

	}

	/**
	 * M�todo onde o usu�rio escolhe os ingredientes
	 */
	public static void escolherIngrediente() {
		int escolhaDoIngrediente = 11, contador = 0;
		double distancia, quantIngrediente = -1;
		Sanduiche lanche1 = new Sanduiche();

		Scanner lerDados = new Scanner(System.in);

		System.out.println(
				"__________________________________________________________________________________________________________________");
		System.out.println(
				"                            1 - queijo        2 - presunto       3 - bacon          4 - alface ");
		System.out.println(
				"                            5 - tomate        6 - catupiry       7 - maionese       8 - abacaxi ");
		System.out.println(
				"                            9 - batata Palha  10 - mostarda      0 - para encerrar a escollha");
		Lanche.pularLinhas(1);
		System.out.println("                            Voc� pode escolher at� 10 ingredientes: ");
		System.out.println(
				"__________________________________________________________________________________________________________________");

		while ((contador < 11) && escolhaDoIngrediente != 0) {

			System.out
					.println("                        Digite o n�mero do ingrediente ou [0] para encerrar a escolha ");

			escolhaDoIngrediente = lerDados.nextInt();

			switch (escolhaDoIngrediente) {
			case 1:
				lanche1.setIngrediente("queijo");
				break;
			case 2:
				lanche1.setIngrediente("presunto");
				break;
			case 3:
				lanche1.setIngrediente("bacon");
				break;
			case 4:
				lanche1.setIngrediente("alface");
				break;
			case 5:
				lanche1.setIngrediente("tomate");
				break;
			case 6:
				lanche1.setIngrediente("catupiry");
				break;
			case 7:
				lanche1.setIngrediente("maionese");
				break;
			case 8:
				lanche1.setIngrediente("ketchup");
				break;
			case 9:
				lanche1.setIngrediente("batata pallha");
				break;
			case 10:
				lanche1.setIngrediente("mostarda");
				break;
			case 0:
				break;
			default:
				System.out.println("N�mero inv�lido");
			}
			contador++;
			quantIngrediente++;
			System.out.println(
					" ----------------------------------------------------------------------------------------------------------- ");
			lanche1.getIngrediente();
			System.out.println(
					" ----------------------------------------------------------------------------------------------------------- ");
			System.out.println(" ");

		}
		if (lanche1.ingredientes.size() == 10) {
			lanche1.setPreco((10 + 2) + quantIngrediente * 2);

		} else {
			lanche1.setPreco(10 + quantIngrediente * 2);
		}

		mensagemTempoDeEntrega();
		distancia = lerDados.nextInt();
		lanche1.fecharPedido();
		lanche1.calcularTempo(distancia);

	}

}
