package Lanches;

abstract class Lanche implements TempoInterface {
	protected double preco;
	protected double distancia;
	protected double tempoTotal;

	/**
	 * @author Eduardo
	 * @version 1.0.1
	 * @since 1.0.0
	 * @see TempoInterface
	 */

	/**
	 * Construtor
	 */
	public Lanche() {

	}

	/**
	 * 
	 * Métodos GET e SET
	 */
	public double getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(double tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	/**
	 * Método utilizado para calcular tempo de entrega
	 * 
	 * @param distancia - o usuário irá digitar a distância até sua residência , e
	 *                  será calculado automaticamente o tempo de envio.
	 */
	public void calcularTempo(double distancia) {
		double inteira, resto;
		this.tempoTotal = (distancia * 10) + 30;

		inteira = tempoTotal / 60;

		resto = tempoTotal % 60;

		System.out.println(
				"------------------------------------------------------------------------------------------------------------------ ");
		System.out.println("  Tempo total para entrega: " + (int) inteira + " hora e " + resto + " minutos");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------ ");

	}

	/**
	 * Método que reúne as informações finais do pedido
	 */
	public void fecharPedido() {
		System.out.println(
				"---------------------Seu pedido foi realizado com sucesso--------------------------------------------------------- ");
		System.out.println("  Seu pedido ficou em: R$ " + getPreco());
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------");

	}

	/**
	 * Método onde será enviado uma mensagem de agradecimento por utilizar o serviço
	 */

	public static void agradecimento() {
		System.out.println(
				" _______________________________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println("                Agradecemos a sua preferência e desejamos bom apetite!!!");
		System.out.println(" ");

	}

	/**
	 * Método onde após calculado o tempo de entrega , será enviado uma mensagem
	 * sobre o tempo de envio.
	 */
	public static void mensagemTempoDeEntrega() {
		pularLinhas(1);
		System.out.println(
				" _______________________________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println(
				"                Para cálculo do tempo de entrega, precisamos saber a distãncia até sua casa! ");
		System.out.println(" ");
		System.out.println(" Qual a distância da sua casa? (em km) ");
	}

	/**
	 * Método para melhor organização no System.out
	 * 
	 * @param quantLinhas
	 */
	public static void pularLinhas(int quantLinhas) {
		for (int i = 0; i < quantLinhas; i++)
			System.out.println("");
	}

}
