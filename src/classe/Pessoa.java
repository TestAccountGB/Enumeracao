package classe;

import enumeracao.Enum;
public class Pessoa {
	
	private String nome;
	private int idade;
	private Endereco endereco; //Criamos outra classe "Endereco", para ficar mais organizado
	private Enum tipo;
	
	@Override
	public String toString() {
		return "Pessoa [nome: " + nome + ", idade: " + idade + ", estado: " + endereco.getEstado() + ", cidade: " + 
	endereco.getCidade() + ", tipo: " + tipo.getNome() +  ", numero_Id: " + tipo.getNumero() + "]";
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Enum getTipo() {
		return tipo;
	}

	public void setTipo(Enum tipo) {
		this.tipo = tipo;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public int getTipoNumero() {
		return tipo.getNumero();
	}
	
	public String getTipoNome() {
		return tipo.getNome();
	}
	
	//Nao precisamos de getEndereco, pois os getters estão na classe endereco
}