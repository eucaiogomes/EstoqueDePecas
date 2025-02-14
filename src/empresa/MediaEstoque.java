package empresa;

public class MediaEstoque {
	private int estoqueMedio;
	private int quantiMinima;
	private int quantiMaxima;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoqueMedio() {
		return estoqueMedio;
	}

	public void setEstoqueMedio(int estoqueMedio) {
		this.estoqueMedio = estoqueMedio;
	}

	public int getQuantiMinima() {
		return quantiMinima;
	}

	public void setQuantiMinima(int quantiMinima) {
		if(quantiMinima>0) {
		this.quantiMinima = quantiMinima;
		}
		else {
			System.out.println("Quantidade minima invalida!");
			return;
		}
	}

	public int getQuantiMaxima() {
		return quantiMaxima;
	}

	public void setQuantiMaxima(int quantiMaxima) {
		if(quantiMaxima>0) {
			this.quantiMaxima = quantiMaxima;
		}
		else{
			System.out.println("Quantidade Maxima invalida!");
			return;
		}
	}

	public void calculaEstoque()
	{
		this.estoqueMedio = (quantiMinima + quantiMaxima) / 2; 
	}
	
	void info() {
		System.out.println("O estoque medio = "+ estoqueMedio);
		
	} 
	 public void exibirProdutos() {
	        System.out.println("Nome do produto: " + nome + ", Estoque Medio: " + estoqueMedio);
	    }
	

}
