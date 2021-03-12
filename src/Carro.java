
public class Carro {
	/**
	 * 
	 * A seguinte classe carro contem as fun��es de meter combustivel, de andar com o veiculo e de saber a autonomia do mesmo.
	 * 
	 * @author jo�o
	 * 
	 */
	static private final double consumo=5.5; // litros por 100 klm
	
	private double quantidadeCombustivel;
	private double capacidadeDeposito;
	
	// Construtor por defeito 
	public Carro() {
		super();
	
		quantidadeCombustivel = 0;
		capacidadeDeposito = 40.0;
	}
	
	// Acessores 
	/**
	 * 
	 * obteno o valor do consumo.
	 * 
	 * @return retorna o consumo
	 */

	public static double getConsumo() {
		return consumo;
	}
	/**
	 * 
	 * obtem o valor da quantidade de combostivel.
	 * 
	 * @return retorna a quantidade de combustivel
	 */

	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	/**
	 * 
	 * obtem a capacidade do deposito
	 * 
	 * @return retorna a capacidade do deposito
	 */

	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}
	
	// M�todos 
	/**
	 * 
	 * a��o de meter combustivel no carro.
	 * n�o retorna os litros metidos.
	 * 
	 * @param quantidade
	 */
	public void meterCombustivel( double quantidade) { 		
		
		// Devia testar se Transborda o dep�sito
		// Podia retornar os Litros Metidos 
		quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		
	}
	/**
	 * 
	 * a��o de atestar o deposito.
	 * 
	 * @return retorna a quantidade de litros do metidos
	 */
	// atestar o dep�sito
	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	/**
	 * 
	 * a��o de andar e para do carro.
	 * 
	 * @param distancia
	 * @return retorna se o carro esta a andar ou parado
	 */
	// distancia em klm
	public boolean andar( double distancia ) {
		
		// Verificar se tem combustivel para a distancia que se pretende andar 
		if( distancia < obterAutonomia() ) {
			
			quantidadeCombustivel -= getConsumo() * (distancia / 100); 
			return true;
		}
		else {
			
			// Aqui ou simplesmente n�o percorre qualquer distancia 
			// ou anda at� parar porque fica sem combust�vel 
			return false;
		}
			
			
	}
	
	public boolean parar() {
		
		// se estiver a andar p�ra 
		// falta a flag que indica se o carro est� em andamento
		return true;
	}
	/**
	 * 
	 * calculo da autonomia do carro. 
	 * 
	 * @return autonomia do veiculo
	 */
	// kmCombustivel( )    
	public double obterAutonomia() {
		
		return ( quantidadeCombustivel / getConsumo() ) * 100;
		
	}

}
