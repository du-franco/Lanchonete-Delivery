package Lanches;

import java.util.Scanner;

/**
 * @author Eduardo
 * @see Lanche
 */

public class Bolo extends Lanche {

	private String massa;
	private String recheio;
	private String cobertura;

	/**
	 * 
	 * Construtor
	 */
	public Bolo(double preco) {
		super();
		this.preco = preco;

	}

	/**
	 * 
	 * Métodos GET e SET
	 */
	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	/**
	 * Método onde o usuário poderá escolher a massa , recheio e cobertura do bolo ,
	 * após suas escolhas , será retornado o preço do bolo , o tempo de entrega
	 * dependendo da distância da residência do usuário e uma mensagem de
	 * agradecimento.
	 */
	public static void escolherBolo() {
		String tipoMassa, recheio, cobertura;
		Scanner ler3 = new Scanner(System.in);
		double distancia;

		System.out.println(
				"-----------------------------------Qual o tipo de massa você quer?-----------------------------------------");
		tipoMassa = ler3.nextLine();

		System.out.println(
				"-----------------------------------Qual o tipo de recheio você quer?---------------------------------------");
		recheio = ler3.nextLine();

		System.out.println(
				"-----------------------------------Qual o tipo de cobertura você quer?-------------------------------------");
		cobertura = ler3.nextLine();

		Bolo bolo1 = new Bolo(40.90);
		bolo1.setMassa(tipoMassa);
		bolo1.setRecheio(recheio);
		bolo1.setCobertura(cobertura);

		System.out.println("");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------- ");
		System.out.println("Você escolheu um bolo com massa de: " + bolo1.getMassa() + " com recheio de: "
				+ bolo1.getRecheio() + " e cobertura de:" + bolo1.getCobertura());
		System.out.println(
				"----------------------------------------------------------------------------------------------------------- ");

		Lanche.mensagemTempoDeEntrega();
		distancia = ler3.nextInt();
		bolo1.fecharPedido();
		bolo1.calcularTempo(distancia);
	}

}