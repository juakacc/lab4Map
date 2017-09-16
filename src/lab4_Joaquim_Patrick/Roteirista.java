package lab4_Joaquim_Patrick;

public class Roteirista {

	private Funcionario f;
	
	// Outras características do roteirista

	public Roteirista(Funcionario f) {
		this.f = f;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Roteirista other = (Roteirista) obj;
		Funcionario func = other.getF();

		if (!f.equals(func))
			return false;

		return true;
	}

	public Funcionario getF() {
		return f;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(f);
		return builder.toString();
	}

}
