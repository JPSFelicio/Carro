
public class Carro {
	/**
	 * 
	 * A seguinte classe carro contem as funções de meter combustivel, de andar com o veiculo e de saber a autonomia do mesmo.
	 * 
	 * @author joão
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
	
	// Métodos 
	/**
	 * 
	 * ação de meter combustivel no carro.
	 * não retorna os litros metidos.
	 * 
	 * @param quantidade
	 */
	public void meterCombustivel( double quantidade) { 		
		
		// Devia testar se Transborda o depósito
		// Podia retornar os Litros Metidos 
		quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		
	}
	/**
	 * 
	 * ação de atestar o deposito.
	 * 
	 * @return retorna a quantidade de litros do metidos
	 */
	// atestar o depósito
	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	/**
	 * 
	 * ação de andar e para do carro.
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
			
			// Aqui ou simplesmente não percorre qualquer distancia 
			// ou anda até parar porque fica sem combustível 
			return false;
		}
			
			
	}
	
	public boolean parar() {
		
		// se estiver a andar pára 
		// falta a flag que indica se o carro está em andamento
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
