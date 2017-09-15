package lab4_Joaquim_Patrick;

public class Funcionario {
	
	private static int cont = 1;
	
	private String nome;
	private int numero;

	public Funcionario(String nome) {
		this.nome = nome;
		this.numero = cont;
		cont++;
	}

	public String getFilmografia() {
		Filmografia f = new Filmografia();
		StringBuilder sb = new StringBuilder();
		sb.append("Filmografia de ");
		sb.append(toString());
		sb.append(":\n");
		sb.append(f.getFilmes(this));
		
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(nome);
		builder.append(" [");
		builder.append(numero);
		builder.append("]");
		
		return builder.toString();
	}

	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
}
