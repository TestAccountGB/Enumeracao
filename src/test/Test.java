//Usamos enumeração apenas pela qualidade e segurança do codigo, da para criar o codigo de boa sem enumeração,
//Mas fica mais dificil e podem entrar diferentes valores, a enumeracao limita isso.

package test;

import java.util.Scanner;
import classe.Endereco;
import enumeracao.Enum;
import classe.Pessoa;
public class Test {
	
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		
		System.out.println("Nome: ");
		pessoa.setNome(scan.next());
		
		System.out.println("Idade: ");
		pessoa.setIdade(scan.nextInt());
		
		System.out.println("Estado: ");
		endereco.setEstado(scan.next());
		
		System.out.println("Cidade: ");
		endereco.setCidade(scan.next());
		pessoa.setEndereco(endereco);
		
		boolean loop = true;
		
		while(loop == true) {
			
			System.out.println("Juridica (1) ou Fisica (2):");
			String escolha = scan.next();
			
			switch(escolha) {
			case "1":
				pessoa.setTipo(Enum.PESSOA_JURIDICA);
				loop = false;
				break;
			case "2":
				pessoa.setTipo(Enum.PESSOA_FISICA);
				loop = false;
				break;
			default:
				break;
			}
		}
		
		System.out.println(pessoa);
		System.out.println(pessoa.getTipo());
		System.out.println("==============");
		System.out.println(pessoa.getTipoNome());
		System.out.println(pessoa.getTipoNumero());
		System.out.println("==============");
		System.out.println("Pessoa Fisica: "+Enum.PESSOA_FISICA.getComentario());
		System.out.println("Pessoa Juridica: "+Enum.PESSOA_JURIDICA.getComentario());
	}
}