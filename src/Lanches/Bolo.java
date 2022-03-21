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
	 * M�todos GET e SET
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
	 * M�todo onde o usu�rio poder� escolher a massa , recheio e cobertura do bolo ,
	 * ap�s suas escolhas , ser� retornado o pre�o do bolo , o tempo de entrega
	 * dependendo da dist�ncia da resid�ncia do usu�rio e uma mensagem de
	 * agradecimento.
	 */
	public static void escolherBolo() {
		String tipoMassa, recheio, cobertura;
		Scanner ler3 = new Scanner(System.in);
		double distancia;

		System.out.println(
				"-----------------------------------Qual o tipo de massa voc� quer?-----------------------------------------");
		tipoMassa = ler3.nextLine();

		System.out.println(
				"-----------------------------------Qual o tipo de recheio voc� quer?---------------------------------------");
		recheio = ler3.nextLine();

		System.out.println(
				"-----------------------------------Qual o tipo de cobertura voc� quer?-------------------------------------");
		cobertura = ler3.nextLine();

		Bolo bolo1 = new Bolo(40.90);
		bolo1.setMassa(tipoMassa);
		bolo1.setRecheio(recheio);
		bolo1.setCobertura(cobertura);

		System.out.println("");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------- ");
		System.out.println("Voc� escolheu um bolo com massa de: " + bolo1.getMassa() + " com recheio de: "
				+ bolo1.getRecheio() + " e cobertura de:" + bolo1.getCobertura());
		System.out.println(
				"----------------------------------------------------------------------------------------------------------- ");

		Lanche.mensagemTempoDeEntrega();
		distancia = ler3.nextInt();
		bolo1.fecharPedido();
		bolo1.calcularTempo(distancia);
	}

}