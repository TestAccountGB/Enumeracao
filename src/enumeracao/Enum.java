package enumeracao;

public enum Enum {
	//Enumerações são constantes, por isso são escritas com letras maisculas e espacadas por underline
	PESSOA_JURIDICA (1, "Pessoa Juridica"){
		@Override
		public String getComentario() {
			return "CNPJ";
		}
	},
	PESSOA_FISICA (2, "Pessoa Fisica");

	private String nome;
	private int numero;
	
	Enum(int numero, String nome) { //Precisamos criar um construtor, porque enumeracoes sao constantes e devem ser
		//Inicializado desde o comeco do codigo
		
		this.nome = nome;
		this.numero = numero;
	}
	
	//So criamos getters aqui, porque o construtor ja vai setar o valor
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	} 
	
	public String getComentario() {
		return "CPF";
	}
}