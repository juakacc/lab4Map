package lab4_Joaquim_Patrick;

public class Musica {

	private String nome;
	
	public Musica(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
