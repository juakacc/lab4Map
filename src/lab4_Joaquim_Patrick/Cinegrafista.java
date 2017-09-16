package lab4_Joaquim_Patrick;

public class Cinegrafista {

	private Funcionario f;
	
	// Características do cinegrafista

	public Cinegrafista(Funcionario f) {
		this.f = f;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Cinegrafista other = (Cinegrafista) obj;
		Funcionario func = other.getF();

		if (!f.equals(func))
			return false;

		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(f);
		return builder.toString();
	}

	public Funcionario getF() {
		return f;
	}
}
