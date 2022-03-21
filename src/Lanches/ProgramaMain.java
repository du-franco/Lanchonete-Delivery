package Lanches;

import java.util.Scanner;

/**
 * 
 * 
 * @author Eduardo
 * @version 1.0.1 
 * @since 1.0.0
 * @see Lanche
 * @see Massa
 * @see Sandu�che
 * @see Bolo
 * @see Salgado
 */

/**
 * 
 * Na main (principal) , ser� executado o c�digo onde ir� iniciar uma esp�cie de
 * card�pio para o usu�rio.
 *
 */

public class ProgramaMain {
	public static void main(String[] args) {

		int escolhaDoTipoLanche;

		Scanner ler = new Scanner(System.in);

		System.out
				.println("--------------------------Bem vindos do Delivery do Java Express---------------------------");
		Lanche.pularLinhas(1);
		System.out
				.println("-----------------------------------Menu de op��es------------------------------------------");
		System.out.println("				[ 1 ] - Sandu�ches ..... R$ 10,00 + 2,00 por ingrediente escolhido");
		System.out.println("				[ 2 ] - Massas ......... R$ (depende do sabor escolhido)");
		System.out.println("				[ 3 ] - Bolos .......... R$ 40,90");
		System.out.println("				[ 4 ] - Salgados .......... R$ (depende do tipo escolhido)");
		System.out.println("Escolha a op��o desejada:");

		escolhaDoTipoLanche = ler.nextInt();

		switch (escolhaDoTipoLanche) {
		case 1:
			System.out.println(
					"                              Para o sandu�che precisa escolher os ingredientes                            ");
			System.out.println(
					"__________________________________________________________________________________________________________________ ");
			Lanche.pularLinhas(1);
			Sanduiche.escolherIngrediente();
			break;
		case 2:
			System.out.println(
					"                      Voc� escolheu Massa. Dentre as massas, voc� pode escolher entre:                      ");
			System.out.println(
					"___________________________________________________________________________________________________________ ");
			Lanche.pularLinhas(1);
			Massa.escolherTipoDeMassa();
			break;

		case 3:
			System.out
					.println("                    Voc� escolheu Bolo. Digite as op��es de Massa, Recheio e Cobertura");
			System.out.println(
					"___________________________________________________________________________________________________________ ");
			Bolo.escolherBolo();

			break;

		case 4:
			System.out
					.println("                    Voc� escolheu Salgado. Dentre os salgados, voc� pode escolher entre");
			System.out.println(
					"___________________________________________________________________________________________________________ ");
			Salgado.escolherSalgado();

			break;

		default:
			System.out.println("N�mero inv�lido");
		}
		Lanche.agradecimento();

	}

}
